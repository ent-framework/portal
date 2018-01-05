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

package com.liferay.portlet.usersadmin.search;

import com.liferay.portal.kernel.dao.search.RowChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.Organization;
import com.liferay.portal.service.OrganizationLocalServiceUtil;

import javax.portlet.RenderResponse;

/**
 * @author Charles May
 */
public class OrganizationGroupChecker extends RowChecker {

	public OrganizationGroupChecker(
		RenderResponse renderResponse, Group group) {

		super(renderResponse);

		_group = group;
	}

	@Override
	public boolean isChecked(Object obj) {
		Organization organization = (Organization)obj;

		try {
			if (OrganizationLocalServiceUtil.hasGroupOrganization(
					_group.getGroupId(), organization.getOrganizationId()) ||
				(_group.getOrganizationId() ==
					organization.getOrganizationId())) {

				return true;
			}
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}

		return false;
	}

	@Override
	public boolean isDisabled(Object obj) {
		Organization organization = (Organization)obj;

		if (_group.getOrganizationId() == organization.getOrganizationId()) {
			return true;
		}
		else {
			return false;
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(
		OrganizationGroupChecker.class);

	private Group _group;

}