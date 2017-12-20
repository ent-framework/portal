package com.liferay.portal.ext.srvdef;

import javax.portlet.PortletRequest;

import com.liferay.portal.ext.model.ServicePublishDef;
import com.liferay.portal.ext.model.ServiceRemoteDef;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONObject;

public class ServiceManageUtil {

	public static JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef, PortletRequest request)
			throws PortalException, SystemException {
		return getServiceManage().runRemoteService(serviceRemoteDef, request, false);
	}

	public static JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef, PortletRequest request, boolean isDebug)
			throws PortalException, SystemException {
		return getServiceManage().runRemoteService(serviceRemoteDef, request, isDebug);
	}

	public static JSONObject runRemoteService(String code, PortletRequest request, boolean isDebug)
			throws PortalException, SystemException {
		return getServiceManage().runRemoteService(code, request, isDebug);
	}

	public static JSONObject runRemoteService(String code, PortletRequest request) throws PortalException,
			SystemException {
		return getServiceManage().runRemoteService(code, request);
	}

	public static JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef) throws PortalException,
			SystemException {
		return getServiceManage().runRemoteService(serviceRemoteDef);
	}

	public static JSONObject runRemoteService(ServiceRemoteDef serviceRemoteDef, boolean isDebug)
			throws PortalException, SystemException {
		return getServiceManage().runRemoteService(serviceRemoteDef, isDebug);
	}

	public static JSONObject runPublishService(ServicePublishDef servicePublishDef, boolean isDebug)
			throws PortalException, SystemException {
		return getServiceManage().runPublishService(servicePublishDef, isDebug);
	}

	public static JSONObject runPublishService(ServicePublishDef servicePublishDef) throws PortalException,
			SystemException {
		return getServiceManage().runPublishService(servicePublishDef);
	}

	public static JSONObject runPublishService(ServicePublishDef servicePublishDef, PortletRequest request)
			throws PortalException, SystemException {
		return getServiceManage().runPublishService(servicePublishDef, request, false);
	}

	public static JSONObject runPublishService(ServicePublishDef servicePublishDef, PortletRequest request,
			boolean isDebug) throws PortalException, SystemException {
		return getServiceManage().runPublishService(servicePublishDef, request, isDebug);
	}

	public static JSONObject runPublishService(String path, PortletRequest request, boolean isDebug)
			throws PortalException, SystemException {
		return getServiceManage().runPublishService(path, request, isDebug);
	}

	public static JSONObject runPublishService(String path, PortletRequest request) throws PortalException,
			SystemException {
		return getServiceManage().runPublishService(path, request, false);
	}

	public static ServiceManage getServiceManage() {
		return _serviceManage;
	}

	public void setServiceManage(ServiceManage serviceManage) {
		_serviceManage = serviceManage;
	}

	private static ServiceManage _serviceManage;
}
