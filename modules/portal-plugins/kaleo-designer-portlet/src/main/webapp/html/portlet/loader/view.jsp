<%--
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */
--%>

<%@ include file="/html/portlet/loader/init.jsp" %>

<aui:script>
	Liferay.provide(
		Liferay.Util,
		'openKaleoDesignerPortlet',
		function(config) {
			var A = AUI();

			var kaleoURL = Liferay.PortletURL.createURL('<%= PortletURLFactoryUtil.create(request, "2_WAR_kaleodesignerportlet", themeDisplay.getPlid(), PortletRequest.RENDER_PHASE) %>');

			kaleoURL.setParameter('mvcPath', '/designer/edit_kaleo_draft_definition.jsp');
			kaleoURL.setParameter('availableFields', config.availableFields);
			kaleoURL.setParameter('availablePropertyModels', config.availablePropertyModels);
			kaleoURL.setParameter('ddmStructureId', config.ddmStructureId);
			kaleoURL.setParameter('draftVersion', config.draftVersion);
			kaleoURL.setParameter('kaleoProcessId', config.kaleoProcessId);
			kaleoURL.setParameter('name', config.name);
			kaleoURL.setParameter('openerWindowName', config.openerWindowName);
			kaleoURL.setParameter('portletResourceNamespace', config.portletResourceNamespace);
			kaleoURL.setParameter('propertiesSaveCallback', config.propertiesSaveCallback);
			kaleoURL.setParameter('refreshOpenerOnClose', config.refreshOpenerOnClose);
			kaleoURL.setParameter('saveCallback', config.saveCallback);
			kaleoURL.setParameter('uiScope', config.uiScope);
			kaleoURL.setParameter('version', config.version);
			kaleoURL.setWindowState('pop_up');

			config.uri = kaleoURL.toString();

			var dialogConfig = config.dialog;

			if (!dialogConfig) {
				var region = A.one(Liferay.Util.getOpener()).get('region');

				dialogConfig = {
					destroyOnHide: true
				};

				config.dialog = dialogConfig;
			}

			if (!('align' in dialogConfig)) {
				dialogConfig.align = Liferay.Util.Window.ALIGN_CENTER;
			}

			var dialogIframeConfig = config.dialogIframe;

			if (!dialogIframeConfig) {
				dialogIframeConfig = {
					closeOnEscape: false
				};

				config.dialogIframe = dialogIframeConfig;
			}

			Liferay.Util.openWindow(config);
		},
		['liferay-portlet-url']
	);
</aui:script>