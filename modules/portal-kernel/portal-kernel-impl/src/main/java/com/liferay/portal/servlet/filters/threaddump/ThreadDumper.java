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

package com.liferay.portal.servlet.filters.threaddump;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.ThreadUtil;

/**
 * @author Shuyang Zhou
 * @author Brian Wing Shun Chan
 */
public class ThreadDumper implements Runnable {

	public boolean isExecuted() {
		return _executed;
	}

	@Override
	public void run() {
//		if (_log.isInfoEnabled()) {
//			Log log = SanitizerLogWrapper.allowCRLF(_log);
//
//			log.info(ThreadUtil.threadDump());
//		}
//		else {
//			Class<?> clazz = getClass();
//
//			_log.error(
//				"Thread dumps require the log level to be at least INFO for " +
//					clazz.getName());
//		}
//
//		_executed = true;
	}

	private static final Logger _log = LoggerFactory.getLogger(ThreadDumper.class);

	private boolean _executed;

}