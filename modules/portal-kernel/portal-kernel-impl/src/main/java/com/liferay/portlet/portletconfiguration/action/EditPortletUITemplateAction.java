/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.portletconfiguration.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ValidatorException;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Portlet;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.service.PermissionServiceUtil;
import com.liferay.portal.service.PortletLocalServiceUtil;
import com.liferay.portal.struts.PortletAction;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.util.WebKeys;
import com.liferay.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portlet.StrictPortletPreferencesImpl;
import com.liferay.portlet.portletconfiguration.util.ConfigurationActionRequest;
import com.liferay.portlet.portletconfiguration.util.ConfigurationRenderRequest;

/**
 * @author Brian Wing Shun Chan
 * @author Connor McKay
 */
public class EditPortletUITemplateAction extends PortletAction {

	@Override
	public void processAction(
			ActionMapping actionMapping, ActionForm actionForm,
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse)
		throws Exception {

		try {
			
			String portletResource = ParamUtil.getString(actionRequest, "portletResource");
			
			PortletPreferences	portletPreferences = PortletPreferencesFactoryUtil.getPortletSetup(PortalUtil.getHttpServletRequest(actionRequest), portletResource);

			actionRequest = new ConfigurationActionRequest(actionRequest, new StrictPortletPreferencesImpl());
			
			String cmd = ParamUtil.getString(actionRequest, Constants.CMD, "");
			String preferenceName = ParamUtil.getString(actionRequest, "preferenceName", "");

			if ("reset_template".equals(cmd)) {
				portletPreferences.setValue(preferenceName, StringPool.BLANK);
				
			} else if ("update_template".equals(cmd)) {
				String scriptContent = ParamUtil.getString(actionRequest, "scriptContent", "");
				portletPreferences.setValue(preferenceName, scriptContent);
			}
			
			if (SessionErrors.isEmpty(actionRequest)) {
				try {
					portletPreferences.store();
				}
				catch (ValidatorException ve) {
					SessionErrors.add(
						actionRequest, ValidatorException.class.getName(), ve);

					return;
				}

				SessionMessages.add(
					actionRequest,
					PortalUtil.getPortletId(actionRequest) +
						SessionMessages.KEY_SUFFIX_REFRESH_PORTLET,
					portletResource);

				SessionMessages.add(
					actionRequest,
					PortalUtil.getPortletId(actionRequest) +
						SessionMessages.KEY_SUFFIX_UPDATED_CONFIGURATION);

				String redirect = PortalUtil.escapeRedirect(
					ParamUtil.getString(actionRequest, "redirect"));

				if (Validator.isNotNull(redirect)) {
					actionResponse.sendRedirect(redirect);
				}
			}
		}
		catch (Exception e) {
			if (e instanceof PrincipalException) {
				SessionErrors.add(actionRequest, e.getClass());

				setForward(
					actionRequest, "portlet.portlet_configuration.error");
			}
			else {
				throw e;
			}
		}
	}

	@Override
	public ActionForward render(
			ActionMapping actionMapping, ActionForm actionForm,
			PortletConfig portletConfig, RenderRequest renderRequest,
			RenderResponse renderResponse)
		throws Exception {

		renderRequest = new ConfigurationRenderRequest(
			renderRequest, new StrictPortletPreferencesImpl());

		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		long groupId = ParamUtil.getLong(
			renderRequest, "resourceGroupId", themeDisplay.getScopeGroupId());

		String portletResource = ParamUtil.getString(
			renderRequest, "portletResource");
		String modelResource = ParamUtil.getString(
			renderRequest, "modelResource");
		String resourcePrimKey = ParamUtil.getString(
			renderRequest, "resourcePrimKey");

		String selResource = portletResource;

		if (Validator.isNotNull(modelResource)) {
			selResource = modelResource;
		}

		try {
			PermissionServiceUtil.checkPermission(
				groupId, selResource, resourcePrimKey);
		}
		catch (PrincipalException pe) {
			SessionErrors.add(
				renderRequest, PrincipalException.class.getName());

			return actionMapping.findForward(
				"portlet.portlet_configuration.error");
		}

		Portlet portlet = PortletLocalServiceUtil.getPortletById(
			themeDisplay.getCompanyId(), portletResource);

		if (portlet != null) {
			renderResponse.setTitle(
				ActionUtil.getTitle(portlet, renderRequest));
		}

		return actionMapping.findForward(
			getForward(
				renderRequest,
				"portlet.portlet_configuration.edit_portlet_ui_template"));
	}
}