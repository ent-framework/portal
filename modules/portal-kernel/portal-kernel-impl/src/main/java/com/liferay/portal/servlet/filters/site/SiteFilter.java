package com.liferay.portal.servlet.filters.site;

import java.util.Set;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.LayoutFriendlyURLException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.struts.LastPath;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.LayoutSet;
import com.liferay.portal.model.impl.LayoutImpl;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.LayoutSetLocalServiceUtil;
import com.liferay.portal.servlet.I18nServlet;
import com.liferay.portal.servlet.filters.BasePortalFilter;
import com.liferay.portal.servlet.filters.virtualhost.VirtualHostFilter;
import com.liferay.portal.util.PortalInstances;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.PropsValues;
import com.liferay.portal.util.WebKeys;

public class SiteFilter extends BasePortalFilter {

	
	protected boolean isValidSiteURL(String friendlyURL) {
		friendlyURL = StringUtil.toLowerCase(friendlyURL);

		if (
			friendlyURL.startsWith(_PRIVATE_GROUP_SERVLET_MAPPING_SLASH) ||
			friendlyURL.startsWith(_PUBLIC_GROUP_SERVLET_MAPPING_SLASH)) {
			return true;
		}

		if (LayoutImpl.hasFriendlyURLKeyword(friendlyURL)) {
			return false;
		}

		int code = LayoutImpl.validateFriendlyURL(friendlyURL, false);

		if ((code > -1) &&
			(code != LayoutFriendlyURLException.ENDS_WITH_SLASH)) {

			return false;
		}

		return false;
	}
	
	
	
	@Override
	protected void processFilter(
			HttpServletRequest request, HttpServletResponse response,
			FilterChain filterChain)
		throws Exception {

		long companyId = PortalInstances.getCompanyId(request);

		String contextPath = PortalUtil.getPathContext();

		String originalFriendlyURL = request.getRequestURI();

		String friendlyURL = originalFriendlyURL;

		//BUG FIX
		if (Validator.isNotNull(contextPath) &&
			friendlyURL.startsWith(contextPath)) {

			friendlyURL = friendlyURL.substring(contextPath.length());
		}

		int pos = friendlyURL.indexOf(StringPool.SEMICOLON);

		if (pos != -1) {
			friendlyURL = friendlyURL.substring(0, pos);
		}

		friendlyURL = StringUtil.replace(
			friendlyURL, StringPool.DOUBLE_SLASH, StringPool.SLASH);

		String i18nLanguageId = null;

		Set<String> languageIds = I18nServlet.getLanguageIds();

		for (String languageId : languageIds) {
			if (StringUtil.startsWith(friendlyURL, languageId)) {
				pos = friendlyURL.indexOf(CharPool.SLASH, 1);

				if (((pos != -1) && (pos != languageId.length())) ||
					((pos == -1) &&
					 !StringUtil.equalsIgnoreCase(friendlyURL, languageId))) {

					continue;
				}

				if (pos == -1) {
					i18nLanguageId = languageId;
					friendlyURL = StringPool.SLASH;
				}
				else {
					i18nLanguageId = languageId.substring(0, pos);
					friendlyURL = friendlyURL.substring(pos);
				}

				break;
			}
		}

		friendlyURL = StringUtil.replace(
			friendlyURL, PropsValues.WIDGET_SERVLET_MAPPING, StringPool.BLANK);

		if (_log.isDebugEnabled()) {
			_log.debug("Friendly URL " + friendlyURL);
		}

		if (!isValidSiteURL(friendlyURL)) {

			_log.debug("Friendly URL is not valid");

			processFilter(
				SiteFilter.class, request, response, filterChain);

			return;
		}

		Group siteGroup = (Group)request.getAttribute(WebKeys.REQ_SITE);
		
		if (_log.isDebugEnabled()) {
			_log.debug("Site group " + siteGroup);
		}

		if (siteGroup != null) {
			processFilter(
					SiteFilter.class, request, response, filterChain);
			return;
		}

		try {
			
			String site = null;
			String friendlyURLLowercase = friendlyURL.toLowerCase();
			
			if (friendlyURLLowercase.startsWith(_PRIVATE_GROUP_SERVLET_MAPPING_SLASH)) {
				site = friendlyURL.substring(_PRIVATE_GROUP_SERVLET_MAPPING_SLASH.length());
				
			}
			
			if (friendlyURLLowercase.startsWith(_PUBLIC_GROUP_SERVLET_MAPPING_SLASH)) {
				site = friendlyURL.substring(_PUBLIC_GROUP_SERVLET_MAPPING_SLASH.length());
			}
			
			if (site.indexOf("/")>0) {
				site = StringUtil.extractFirst(site, "/");
			}
			
			if (Validator.isNull(site) || site.length()==0) {
				site =  PropsValues.VIRTUAL_HOSTS_DEFAULT_SITE_NAME;
			}
			
			Group group = GroupLocalServiceUtil.getFriendlyURLGroup(companyId, "/" + site.toLowerCase());

			request.setAttribute(WebKeys.REQ_SITE, group);
			
		}
		catch (Exception e) {
			_log.error(e, e);
		}
		
		processFilter(
				SiteFilter.class, request, response, filterChain);
		
	}
	
	private static Log _log = LogFactoryUtil.getLog(SiteFilter.class);
	
	private static final String _PRIVATE_GROUP_SERVLET_MAPPING =
			PropsValues.LAYOUT_FRIENDLY_URL_PRIVATE_GROUP_SERVLET_MAPPING;

		private static final String _PRIVATE_GROUP_SERVLET_MAPPING_SLASH =
			_PRIVATE_GROUP_SERVLET_MAPPING + StringPool.SLASH;

		private static final String _PUBLIC_GROUP_SERVLET_MAPPING =
			PropsValues.LAYOUT_FRIENDLY_URL_PUBLIC_SERVLET_MAPPING;

		private static final String _PUBLIC_GROUP_SERVLET_MAPPING_SLASH =
			_PUBLIC_GROUP_SERVLET_MAPPING + StringPool.SLASH;
}
