package com.liferay.portal.ext.srvdef;

import java.io.OutputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.HttpHeaders;
import com.liferay.portal.kernel.servlet.ServletContextPool;
import com.liferay.portal.kernel.util.ClassUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.security.ac.AccessControlUtil;
import com.liferay.portal.security.auth.PortalSessionAuthVerifier;
import com.liferay.portal.servlet.SharedSessionServletRequest;
import com.liferay.portal.struts.JSONAction;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.WebKeys;

public abstract class JSONObjectAction extends Action {
	
	
	public ActionForward execute(
			ActionMapping actionMapping, ActionForm actionForm,
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		if (rerouteExecute(request, response)) {
			return null;
		}

		JSONObject json = null;

		try {
			checkAuthToken(request);

			json = getJSON(actionMapping, actionForm, request, response);

		}
		catch (SecurityException se) {
			if (_log.isWarnEnabled()) {
				_log.warn(se.getMessage());
			}

			json = JSONFactoryUtil.createJSONObject();
		}
		catch (Exception e) {
			_log.error(e, e);

			PortalUtil.sendError(
				HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e, request,
				response);

			return null;
		}

		if (Validator.isNotNull(json)) {
			response.setCharacterEncoding(StringPool.UTF8);
			response.setContentType(ContentTypes.APPLICATION_JSON);
			response.setHeader(
				HttpHeaders.CACHE_CONTROL,
				HttpHeaders.CACHE_CONTROL_NO_CACHE_VALUE);

			OutputStream outputStream = response.getOutputStream();

			byte[] bytes = json.toString().getBytes(StringPool.UTF8);

			outputStream.write(bytes);

			outputStream.close();
		}

		return null;
	}	
	
	public abstract JSONObject getJSON(ActionMapping actionMapping, ActionForm actionForm, HttpServletRequest request,
			HttpServletResponse response) throws Exception;
	
	public void setServletContext(ServletContext servletContext) {
		_servletContext = servletContext;
	}

	protected void checkAuthToken(HttpServletRequest request)
		throws PortalException {

		String authType = GetterUtil.getString(request.getAuthType());

		// Support for the legacy JSON API at /c/portal/json_service

		if (AccessControlUtil.getAccessControlContext() == null) {
			if (authType.equals(HttpServletRequest.BASIC_AUTH) ||
				authType.equals(HttpServletRequest.DIGEST_AUTH)) {

				return;
			}
		}
		else {

			// The new web service should only check auth tokens when the user
			// is authenticated using portal session cookies

			if (!authType.equals(PortalSessionAuthVerifier.AUTH_TYPE)) {
				return;
			}
		}
	}

	protected String getCSRFOrigin(HttpServletRequest request) {
		return ClassUtil.getClassName(this);
	}

	protected String getReroutePath() {
		return null;
	}

	protected boolean rerouteExecute(
			HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		String reroutePath = getReroutePath();

		if (Validator.isNull(reroutePath)) {
			return false;
		}

		String requestServletContextName = ParamUtil.getString(
			request, "servletContextName");

		if (Validator.isNull(requestServletContextName)) {
			return false;
		}

		ServletContext servletContext = _servletContext;

		if (servletContext == null) {
			servletContext = (ServletContext)request.getAttribute(WebKeys.CTX);
		}

		String servletContextName = GetterUtil.getString(
			servletContext.getServletContextName());

		if (servletContextName.equals(requestServletContextName)) {
			return false;
		}

		ServletContext requestServletContext = ServletContextPool.get(
			requestServletContextName);

		if (requestServletContext == null) {
			return false;
		}

		RequestDispatcher requestDispatcher =
			requestServletContext.getRequestDispatcher(reroutePath);

		if (requestDispatcher == null) {
			return false;
		}

		requestDispatcher.forward(
			new SharedSessionServletRequest(request, true), response);

		return true;
	}

	private static Log _log = LogFactoryUtil.getLog(JSONAction.class);

	private ServletContext _servletContext;	
}
