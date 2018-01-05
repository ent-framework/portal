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

package com.liferay.portlet.sites.search;

import com.liferay.portal.kernel.dao.search.RowChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.UserGroup;
import com.liferay.portal.service.UserGroupGroupRoleLocalServiceUtil;

import javax.portlet.RenderResponse;

/**
 * @author Brett Swaim
 */
public class UserGroupGroupRoleUserGroupChecker extends RowChecker {

	public UserGroupGroupRoleUserGroupChecker(
		RenderResponse renderResponse, Group group, Role role) {

		super(renderResponse);

		_group = group;
		_role = role;
	}

	@Override
	public boolean isChecked(Object obj) {
		UserGroup userGroup = (UserGroup)obj;

		try {
			return UserGroupGroupRoleLocalServiceUtil.hasUserGroupGroupRole(
				userGroup.getUserGroupId(), _group.getGroupId(),
				_role.getRoleId());
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);

			return false;
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(
		UserGroupGroupRoleUserGroupChecker.class);

	private Group _group;
	private Role _role;

}