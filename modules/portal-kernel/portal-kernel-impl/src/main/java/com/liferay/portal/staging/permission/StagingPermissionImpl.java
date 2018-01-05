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

package com.liferay.portal.staging.permission;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.security.pacl.DoPrivileged;
import com.liferay.portal.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.Group;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.GroupLocalServiceUtil;

/**
 * @author Jorge Ferrer
 */
@DoPrivileged
public class StagingPermissionImpl implements StagingPermission {

	@Override
	public Boolean hasPermission(
		PermissionChecker permissionChecker, Group group, String className,
		long classPK, String portletId, String actionId) {

		try {
			return doHasPermission(
				permissionChecker, group, className, classPK, portletId,
				actionId);
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}

		return null;
	}

	@Override
	public Boolean hasPermission(
		PermissionChecker permissionChecker, long groupId, String className,
		long classPK, String portletId, String actionId) {

		try {
			Group group = GroupLocalServiceUtil.getGroup(groupId);

			return doHasPermission(
				permissionChecker, group, className, classPK, portletId,
				actionId);
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}

		return null;
	}

	protected Boolean doHasPermission(
			PermissionChecker permissionChecker, Group group, String className,
			long classPK, String portletId, String actionId)
		throws Exception {

		if (!actionId.equals(ActionKeys.ADD_TO_PAGE) &&
			!actionId.equals(ActionKeys.CONFIGURATION) &&
			!actionId.equals(ActionKeys.CUSTOMIZE) &&
			!actionId.equals(ActionKeys.DELETE) &&
			!actionId.equals(ActionKeys.VIEW) &&
			group.hasLocalOrRemoteStagingGroup() &&
			(Validator.isNull(portletId) || group.isStagedPortlet(portletId))) {

			return false;
		}
		else {
			return null;
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(
		StagingPermissionImpl.class);

}