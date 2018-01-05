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

package com.liferay.portal.security.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.AutoResetThreadLocal;
import com.liferay.portal.kernel.util.GetterUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class PrincipalThreadLocal {

	public static String getName() {
		String name = _name.get();

		if (_log.isDebugEnabled()) {
			_log.debug("getName " + name);
		}

		return name;
	}

	public static String getPassword() {
		return _password.get();
	}

	public static long getUserId() {
		return GetterUtil.getLong(getName());
	}

	public static void setName(long name) {
		setName(String.valueOf(name));
	}

	public static void setName(String name) {
		if (_log.isDebugEnabled()) {
			_log.debug("setName " + name);
		}

		_name.set(name);
	}

	public static void setPassword(String password) {
		_password.set(password);
	}

	private static final Logger _log = LoggerFactory.getLogger(PrincipalThreadLocal.class);

	private static ThreadLocal<String> _name = new AutoResetThreadLocal<String>(
		PrincipalThreadLocal.class + "._name");
	private static ThreadLocal<String> _password =
		new AutoResetThreadLocal<String>(
			PrincipalThreadLocal.class + "._password");

}