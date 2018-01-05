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

package com.liferay.portal.events;

import com.liferay.portal.kernel.events.SimpleAction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.notifications.ChannelHubManagerUtil;
import com.liferay.portal.kernel.util.GetterUtil;

/**
 * @author Edward Han
 * @author Brian Wing Shun Chan
 */
public class ChannelHubAppShutdownAction extends SimpleAction {

	@Override
	public void run(String[] ids) {
		try {
			long companyId = GetterUtil.getLong(ids[0]);

			if (_log.isDebugEnabled()) {
				_log.debug("Destroying channel hub " + companyId);
			}

			ChannelHubManagerUtil.destroyChannelHub(companyId);
		}
		catch (Exception e) {
			_log.error(e.getMessage(), e);
		}
	}

	private static final Logger _log = LoggerFactory.getLogger(
		ChannelHubAppShutdownAction.class);

}