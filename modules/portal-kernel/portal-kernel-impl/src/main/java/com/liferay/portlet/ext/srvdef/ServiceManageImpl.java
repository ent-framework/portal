package com.liferay.portlet.ext.srvdef;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.servlet.http.Cookie;

import org.apache.commons.lang.StringUtils;

import com.liferay.portal.ext.model.ServiceHost;
import com.liferay.portal.ext.model.ServiceParam;
import com.liferay.portal.ext.model.ServicePublishDef;
import com.liferay.portal.ext.model.ServiceRemoteDef;
import com.liferay.portal.ext.service.ServiceHostLocalServiceUtil;
import com.liferay.portal.ext.service.ServiceParamLocalServiceUtil;
import com.liferay.portal.ext.service.ServicePublishDefLocalServiceUtil;
import com.liferay.portal.ext.service.ServiceRemoteDefLocalServiceUtil;
import com.liferay.portal.ext.srvdef.ServiceHttpClient;
import com.liferay.portal.ext.srvdef.ServiceManage;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ClassNameLocalServiceUtil;

public class ServiceManageImpl implements ServiceManage {

	public JSONObject runRemoteService(String code, PortletRequest request, boolean isDebug) throws PortalException, SystemException {
		ServiceRemoteDef serviceRemoteDef = ServiceRemoteDefLocalServiceUtil.findByCode(code);
		return runRemoteService(serviceRemoteDef, request, isDebug);
		
	}
	
	public JSONObject runRemoteService(String code, PortletRequest request) throws PortalException, SystemException {
		return runRemoteService(code, request, false);
	}
	
	
	public JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef, PortletRequest request) throws PortalException, SystemException {
		return runRemoteService(serviceRemoteDef, request, false);
	}

	public JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef, PortletRequest request, boolean isDebug) throws PortalException, SystemException {
		ServiceHost host = null;
		
		if (serviceRemoteDef.getHost()>0) {
			host = ServiceHostLocalServiceUtil.getServiceHost(serviceRemoteDef.getHost());
		}
		
		ServiceHttpClient sHttpClient = new ServiceHttpClient(host);
		
		Http.Options options = new Http.Options();
		options.setLocation(getLocation(host , serviceRemoteDef.getPath()));

		long classNameId = ClassNameLocalServiceUtil.getClassNameId(ServiceRemoteDef.class);
		long classPK = serviceRemoteDef.getRemoteId();

			
		if ("POST".equals(serviceRemoteDef.getHttpMethod())) {
			options.setPost(true);
			
			List<ServiceParam> queryParams = ServiceParamLocalServiceUtil.findByC_C_P(classNameId, classPK, "form");
			Map<String, String> queryParamMap = eval(queryParams);			
			options.setParts(queryParamMap);
			
		} else if ("GET".equals(serviceRemoteDef.getHttpMethod())) {	
			options.setPost(false);
			
			List<ServiceParam> queryParams = ServiceParamLocalServiceUtil.findByC_C_P(classNameId, classPK, "query");
			Map<String, String> queryParamMap = eval(queryParams);			
			options.setParts(queryParamMap);
			
		}

		if (serviceRemoteDef.isSendWithCookies() && request!=null) {
			Cookie[] cookies = request.getCookies();
			List<Cookie> sendCookies = new ArrayList<Cookie>();
			for (Cookie c : cookies) {
				Cookie s = new Cookie(c.getName(), c.getValue());
				s.setDomain(GetterUtil.getString(serviceRemoteDef.getCookieDomain(), request.getServerName()));
				s.setPath(GetterUtil.getString(serviceRemoteDef.getCookiePath(), StringPool.SLASH));
				s.setMaxAge(c.getMaxAge());
				sendCookies.add(s);
			}
			options.setCookies(sendCookies.toArray(new Cookie[0]));
		}
		
		String result = null;
		try {
			result =  sHttpClient.URLtoString(options);
		} catch (IOException e) {
			_log.error(e.getMessage());
		}
		
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		if (Validator.isNotNull(result)) {
			jsonObject.put("result", "1");
			if (StringUtils.trim(result).startsWith("[")) {
				jsonObject.put("data", JSONFactoryUtil.createJSONArray(result));
			} else {
				jsonObject.put("data", JSONFactoryUtil.createJSONObject(result));
			}
			
		} else {
			jsonObject.put("result", "0");
		}
		
		if (isDebug) {
			jsonObject.put("headers", JSONFactoryUtil.createJSONObject(JSONFactoryUtil.serialize(options.getResponse().getHeaders())));
			JSONArray headers = JSONFactoryUtil.createJSONArray();
			if (options.getResponse().getHeaders()!=null) {
				for (Map.Entry<String, String> header : options.getResponse().getHeaders().entrySet()) {
					JSONObject hJson = JSONFactoryUtil.createJSONObject();
					hJson.put("name", header.getKey());
					hJson.put("value", header.getValue());
					headers.put(hJson);
				}
			}
			jsonObject.put("headers", headers);
			jsonObject.put("responseCode", options.getResponse().getResponseCode());
		}
		
		return jsonObject;		
	}
	
	public JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef) throws PortalException, SystemException {
		return runRemoteService(serviceRemoteDef, null, false);
	}
	@Override
	public JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef, boolean isDebug) throws PortalException, SystemException {
		return runRemoteService(serviceRemoteDef, null, isDebug);
	}

	
	private Map<String, String> eval(List<ServiceParam> params) {
		Map<String, String> result = new HashMap<String,String>();
		for (ServiceParam param : params) {
			result.put(param.getParamName(), param.getParamValue());
		}
		return result;
	}


	private String getLocation(ServiceHost host, String path) {
		
		String location = host.getAddress();
		
		if (!location.startsWith(Http.HTTP_WITH_SLASH) && !location.startsWith(Http.HTTPS_WITH_SLASH)) {

			if (("http").equals(host.getProtocol())) {
				location = Http.HTTP_WITH_SLASH + location;
			} else {
				location = Http.HTTPS_WITH_SLASH + location;
			}
		}
		
		if (host.getPort()>0) {
			location = location + ":" + host.getPort();
		}
		
		if (!path.startsWith(StringPool.SLASH)) {
			path = StringPool.SLASH + path;
		}
		
		return location + path;
	}

	
	public JSONObject runPublishService(ServicePublishDef servicePublishDef, boolean isDebug) throws PortalException, SystemException {
		return runPublishService(servicePublishDef, null, isDebug);
	}
	
	public JSONObject runPublishService(ServicePublishDef servicePublishDef) throws PortalException, SystemException {
		return runPublishService(servicePublishDef, null, false);
	}
	
	public JSONObject runPublishService(ServicePublishDef servicePublishDef, PortletRequest request) throws PortalException, SystemException {
		return runPublishService(servicePublishDef,request, false);
	}

	public JSONObject runPublishService(ServicePublishDef servicePublishDef, PortletRequest request, boolean isDebug) throws PortalException, SystemException {

		
		long classNameId = ClassNameLocalServiceUtil.getClassNameId(ServiceRemoteDef.class);
		long classPK = servicePublishDef.getPublishId();

			
		if ("POST".equals(servicePublishDef.getHttpMethod())) {

			List<ServiceParam> queryParams = ServiceParamLocalServiceUtil.findByC_C_P(classNameId, classPK, "form");
			Map<String, String> queryParamMap = eval(queryParams);			

			
		} else if ("GET".equals(servicePublishDef.getHttpMethod())) {	

			List<ServiceParam> queryParams = ServiceParamLocalServiceUtil.findByC_C_P(classNameId, classPK, "query");
			Map<String, String> queryParamMap = eval(queryParams);			

			
		}

		String result = servicePublishDef.getScriptResponse();

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		if (Validator.isNotNull(result)) {
			jsonObject.put("result", "1");
			if (StringUtils.trim(result).startsWith("[")) {
				jsonObject.put("data", JSONFactoryUtil.createJSONArray(result));
			} else {
				jsonObject.put("data", JSONFactoryUtil.createJSONObject(result));
			}
			
		} else {
			jsonObject.put("result", "0");
		}
		
		if (isDebug) {

		}
		
		return jsonObject;			
	}

	public JSONObject runPublishService(String path, PortletRequest request, boolean isDebug) throws PortalException, SystemException {
		ServicePublishDef servicePublishDef = ServicePublishDefLocalServiceUtil.findByPath(path);
		return runPublishService(servicePublishDef, request, isDebug);
	}
	
	public JSONObject runPublishService(String path, PortletRequest request) throws PortalException, SystemException {
		return runPublishService(path, request, false);
	}
	
	
	private static Log _log = LogFactoryUtil.getLog(ServiceManageImpl.class);	
}
