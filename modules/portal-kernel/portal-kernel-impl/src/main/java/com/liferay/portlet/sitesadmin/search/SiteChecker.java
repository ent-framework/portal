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

package com.liferay.portlet.sitesadmin.search;

import com.liferay.portal.kernel.dao.search.RowChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.model.Group;
import com.liferay.portal.util.PortalUtil;

import javax.portlet.PortletResponse;

/**
 * @author Jorge Ferrer
 */
public class SiteChecker extends RowChecker {

	public SiteChecker(PortletResponse portletResponse) {
		super(portletResponse);
	}

	@Override
	public boolean isDisabled(Object obj) {
		Group group = (Group)obj;

		try {
			if (group.isCompany() ||
				PortalUtil.isSystemGroup(group.getName())) {

				return true;
			}
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}

		return super.isDisabled(obj);
	}

	private static final Logger _log = LoggerFactory.getLogger(SiteChecker.class);

}