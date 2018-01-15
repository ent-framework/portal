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

<%@ include file="/html/portlet/designer/init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

KaleoDraftDefinition kaleoDraftDefinition = (KaleoDraftDefinition)row.getObject();
%>

<liferay-ui:icon-menu>
	<c:if test="<%= KaleoDraftDefinitionPermission.contains(permissionChecker, kaleoDraftDefinition, ActionKeys.UPDATE) %>">
		<portlet:renderURL var="editURL">
			<portlet:param name="mvcPath" value='<%= "/designer/edit_kaleo_draft_definition.jsp" %>' />
			<portlet:param name="name" value="<%= kaleoDraftDefinition.getName() %>" />
			<portlet:param name="version" value="<%= String.valueOf(kaleoDraftDefinition.getVersion()) %>" />
			<portlet:param name="draftVersion" value="<%= String.valueOf(kaleoDraftDefinition.getDraftVersion()) %>" />
			<portlet:param name="backURL" value="<%= currentURL %>" />
		</portlet:renderURL>

		<liferay-ui:icon
			image="edit"
			method="get"
			url="<%= editURL %>"
		/>
	</c:if>

	<c:if test="<%= KaleoDraftDefinitionPermission.contains(permissionChecker, kaleoDraftDefinition, ActionKeys.PERMISSIONS) %>">
		<liferay-security:permissionsURL
			modelResource="<%= KaleoDraftDefinition.class.getName() %>"
			modelResourceDescription="<%= kaleoDraftDefinition.getName() %>"
			resourcePrimKey="<%= String.valueOf(kaleoDraftDefinition.getKaleoDraftDefinitionId()) %>"
			var="permissionsURL"
			windowState="<%= LiferayWindowState.POP_UP.toString() %>"
		/>

		<liferay-ui:icon
			image="permissions"
			method="get"
			url="<%= permissionsURL %>"
			useDialog="<%= true %>"
		/>
	</c:if>
</liferay-ui:icon-menu>