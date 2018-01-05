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

package com.liferay.portal.kernel.cluster;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Michael C. Han
 */
public abstract class BaseClusterMasterTokenTransitionListener
	implements ClusterMasterTokenTransitionListener {

	@Override
	public void masterTokenAcquired() {
		try {
			doMasterTokenAcquired();
		}
		catch (Exception e) {
			if (_log.isWarnEnabled()) {
				_log.warn("Unable to process the token acquired event", e);
			}
		}
	}

	@Override
	public void masterTokenReleased() {
		try {
			doMasterTokenReleased();
		}
		catch (Exception e) {
			if (_log.isWarnEnabled()) {
				_log.warn("Unable to process the token released event", e);
			}
		}
	}

	protected abstract void doMasterTokenAcquired() throws Exception;

	protected abstract void doMasterTokenReleased() throws Exception;

	private static final Logger _log = LoggerFactory.getLogger(
		BaseClusterMasterTokenTransitionListener.class);

}