package com.liferay.portlet.ext;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

import com.liferay.portal.ext.portlet.ScriptTemplateResource;
import com.liferay.portal.ext.portlet.TemplatablePortletRuntime;
import com.liferay.portal.kernel.io.unsync.UnsyncStringWriter;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.mobile.device.Device;
import com.liferay.portal.kernel.mobile.device.UnknownDevice;
import com.liferay.portal.kernel.servlet.GenericServletWrapper;
import com.liferay.portal.kernel.servlet.PipingServletResponse;
import com.liferay.portal.kernel.template.Template;
import com.liferay.portal.kernel.template.TemplateConstants;
import com.liferay.portal.kernel.template.TemplateManagerUtil;
import com.liferay.portal.kernel.template.TemplateResource;
import com.liferay.portal.kernel.template.URLTemplateResource;
import com.liferay.portal.kernel.templateparser.TransformException;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.xml.DocumentException;
import com.liferay.portal.model.Company;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portlet.PortletURLUtil;
import com.liferay.portlet.portletdisplaytemplate.util.PortletDisplayTemplateConstants;
import com.liferay.taglib.util.VelocityTaglib;
import com.liferay.taglib.util.VelocityTaglibImpl;
import com.liferay.util.freemarker.FreeMarkerTaglibFactoryUtil;

import freemarker.ext.servlet.HttpRequestHashModel;
import freemarker.ext.servlet.ServletContextHashModel;
import freemarker.template.ObjectWrapper;
import freemarker.template.TemplateHashModel;

public class TemplatablePortletRuntimeImpl implements TemplatablePortletRuntime {

	public String transform(PageContext pageContext, String viewMode, String languageId,
			String script, String langType) throws Exception {

		// Setup listeners

		if (_log.isDebugEnabled()) {
			_log.debug("Language " + languageId);
		}

		if (Validator.isNull(viewMode)) {
			viewMode = Constants.VIEW;
		}

		String output = null;

		if (Validator.isNull(langType)) {
			output = LocalizationUtil.getLocalization(script, languageId);
		} else {
			long companyId = 0;
			long scopeGroupId = 0;
			long siteGroupId = 0;

			UnsyncStringWriter unsyncStringWriter = new UnsyncStringWriter();
			
			Map<String, Object> contextObjects = new HashMap<String, Object>();
			
			HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();

			HttpServletResponse response = (HttpServletResponse) pageContext.getResponse();
			
			Template template = getTemplate(languageId, script, langType);
			
			contextObjects.put(PortletDisplayTemplateConstants.LOCALE, request.getLocale());

			contextObjects.put(PortletDisplayTemplateConstants.REQUEST, request);

			RenderRequest renderRequest = (RenderRequest) request.getAttribute(JavaConstants.JAVAX_PORTLET_REQUEST);

			contextObjects.put(PortletDisplayTemplateConstants.RENDER_REQUEST, renderRequest);

			RenderResponse renderResponse = (RenderResponse) request.getAttribute(JavaConstants.JAVAX_PORTLET_RESPONSE);

			contextObjects.put(PortletDisplayTemplateConstants.RENDER_RESPONSE, renderResponse);

			PortletURL currentURL = PortletURLUtil.getCurrent(renderRequest, renderResponse);

			contextObjects.put(PortletDisplayTemplateConstants.CURRENT_URL, currentURL.toString());

			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

			contextObjects.put(PortletDisplayTemplateConstants.THEME_DISPLAY, themeDisplay);

			
			if (themeDisplay != null) {
				companyId = themeDisplay.getCompanyId();
				scopeGroupId = themeDisplay.getScopeGroupId();
				siteGroupId = themeDisplay.getSiteGroupId();
			}
			
			if (langType.equals(TemplateConstants.LANG_TYPE_FTL)) {
				_addTaglibSupportFTL(contextObjects, pageContext);
			} else if (langType.equals(TemplateConstants.LANG_TYPE_VM)) {
				_addTaglibSupportVM(contextObjects, pageContext);
			}

			contextObjects.putAll(_getPortletPreferences(renderRequest));

			try {

				for (String key : contextObjects.keySet()) {
					template.put(key, contextObjects.get(key));
				}
				
				template.put("request", request);
				template.put("response", response);


				template.put("company", getCompany(themeDisplay, companyId));
				template.put("companyId", companyId);
				template.put("device", getDevice(themeDisplay));

				/*
				 * String templatesPath = getTemplatesPath( companyId,
				 * articleGroupId, classNameId);
				 * 
				 * template.put("journalTemplatesPath", templatesPath);
				 */

				Locale locale = LocaleUtil.fromLanguageId(languageId);

				template.put("locale", locale);

				template.put("permissionChecker", PermissionThreadLocal.getPermissionChecker());
				template.put("randomNamespace", StringUtil.randomId() + StringPool.UNDERLINE);
				template.put("scopeGroupId", scopeGroupId);
				template.put("siteGroupId", siteGroupId);
				// template.put("templatesPath", templatesPath);
				template.put("viewMode", viewMode);

				mergeTemplate(template, unsyncStringWriter);
			} catch (Exception e) {
				if (e instanceof DocumentException) {
					throw new TransformException("Unable to read XML document", e);
				} else if (e instanceof IOException) {
					throw new TransformException("Error reading template", e);
				} else if (e instanceof TransformException) {
					throw (TransformException) e;
				} else {
					throw new TransformException("Unhandled exception", e);
				}
			}

			output = unsyncStringWriter.toString();
		}

		return output;
	}

	private void _addTaglibSupportFTL(Map<String, Object> contextObjects, PageContext pageContext) throws Exception {

		// FreeMarker servlet application

		final Servlet servlet = (Servlet) pageContext.getPage();

		GenericServlet genericServlet = null;

		if (servlet instanceof GenericServlet) {
			genericServlet = (GenericServlet) servlet;
		} else {
			genericServlet = new GenericServletWrapper(servlet);

			genericServlet.init(pageContext.getServletConfig());
		}

		ServletContextHashModel servletContextHashModel = new ServletContextHashModel(genericServlet,
				ObjectWrapper.DEFAULT_WRAPPER);

		contextObjects.put(PortletDisplayTemplateConstants.FREEMARKER_SERVLET_APPLICATION, servletContextHashModel);

		// FreeMarker servlet request

		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		HttpServletResponse response = (HttpServletResponse) pageContext.getResponse();

		HttpRequestHashModel requestHashModel = new HttpRequestHashModel(request, response,
				ObjectWrapper.DEFAULT_WRAPPER);

		contextObjects.put(PortletDisplayTemplateConstants.FREEMARKER_SERVLET_REQUEST, requestHashModel);

		// Taglib Liferay hash

		TemplateHashModel taglibLiferayHash = FreeMarkerTaglibFactoryUtil.createTaglibFactory(pageContext
				.getServletContext());

		contextObjects.put(PortletDisplayTemplateConstants.TAGLIB_LIFERAY_HASH, taglibLiferayHash);
	}

	private void _addTaglibSupportVM(Map<String, Object> contextObjects, PageContext pageContext) {

		contextObjects.put(PortletDisplayTemplateConstants.TAGLIB_LIFERAY, _getVelocityTaglib(pageContext));
	}

	private VelocityTaglib _getVelocityTaglib(PageContext pageContext) {
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();

		HttpSession session = request.getSession();

		ServletContext servletContext = session.getServletContext();

		HttpServletResponse response = (HttpServletResponse) pageContext.getResponse();

		VelocityTaglib velocityTaglib = new VelocityTaglibImpl(servletContext, request, new PipingServletResponse(
				response, pageContext.getOut()), pageContext, null);

		return velocityTaglib;
	}

	private Map<String, Object> _getPortletPreferences(RenderRequest renderRequest) {

		Map<String, Object> contextObjects = new HashMap<String, Object>();

		PortletPreferences portletPreferences = renderRequest.getPreferences();

		Map<String, String[]> map = portletPreferences.getMap();

		contextObjects.put(PortletDisplayTemplateConstants.PORTLET_PREFERENCES, map);

		for (Map.Entry<String, String[]> entry : map.entrySet()) {
			String[] values = entry.getValue();

			if (ArrayUtil.isEmpty(values)) {
				continue;
			}

			String value = values[0];

			if (value == null) {
				continue;
			}

			contextObjects.put(entry.getKey(), value);
		}

		return contextObjects;
	}

	protected void mergeTemplate(Template template, UnsyncStringWriter unsyncStringWriter) throws Exception {

		VelocityTaglib velocityTaglib = (VelocityTaglib) template.get(PortletDisplayTemplateConstants.TAGLIB_LIFERAY);

		if (velocityTaglib != null) {
			velocityTaglib.setTemplate(template);
		}

		template.processTemplate(unsyncStringWriter);
	}

	protected Company getCompany(ThemeDisplay themeDisplay, long companyId) throws Exception {

		if (themeDisplay != null) {
			return themeDisplay.getCompany();
		}

		return CompanyLocalServiceUtil.getCompany(companyId);
	}

	protected Device getDevice(ThemeDisplay themeDisplay) {
		if (themeDisplay != null) {
			return themeDisplay.getDevice();
		}

		return UnknownDevice.getInstance();
	}

	protected Template getTemplate(String script, String langType) throws Exception {

		ScriptTemplateResource templateResource = new ScriptTemplateResource(script);

		TemplateResource errorTemplateResource = getErrorTemplateResource(langType);

		return TemplateManagerUtil.getTemplate(langType, templateResource, errorTemplateResource, _restricted);
	}

	protected Template getTemplate(String languageId, String script,
			String langType) throws Exception {

		ScriptTemplateResource templateResource = new ScriptTemplateResource(script);

		TemplateResource errorTemplateResource = getErrorTemplateResource(langType);

		return TemplateManagerUtil.getTemplate(langType, templateResource, errorTemplateResource, _restricted);
	}

	protected TemplateResource getErrorTemplateResource(String langType) {
		try {
			Class<?> clazz = getClass();

			ClassLoader classLoader = clazz.getClassLoader();

			String errorTemplateId = _errorTemplateIds.get(langType);

			URL url = classLoader.getResource(errorTemplateId);

			return new URLTemplateResource(errorTemplateId, url);
		} catch (Exception e) {
		}

		return null;
	}

	private static Log _log = LogFactoryUtil.getLog(TemplatablePortletRuntimeImpl.class);

	private Map<String, String> _errorTemplateIds = new HashMap<String, String>();
	private boolean _restricted;
}
