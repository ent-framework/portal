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

package com.liferay.portal.util;

import com.liferay.portal.cache.CacheRegistryImpl;
import com.liferay.portal.configuration.ConfigurationFactoryImpl;
import com.liferay.portal.dao.db.DBFactoryImpl;
import com.liferay.portal.dao.jdbc.DataSourceFactoryImpl;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.configuration.ConfigurationFactoryUtil;
import com.liferay.portal.kernel.dao.db.DBFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.DataSourceFactoryUtil;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.*;
import com.liferay.portal.security.lang.DoPrivilegedUtil;
import com.liferay.portal.security.lang.SecurityManagerUtil;
import com.liferay.portal.spring.util.SpringUtil;
import com.sun.syndication.io.XmlReader;
import org.apache.commons.lang.time.StopWatch;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class InitUtil {

	public static synchronized void init() {
		if (_initialized) {
			return;
		}

		StopWatch stopWatch = new StopWatch();

		stopWatch.start();

		// Set the default locale used by Liferay. This locale is no longer set
		// at the VM level. See LEP-2584.

		String userLanguage = SystemProperties.get("user.language");
		String userCountry = SystemProperties.get("user.country");
		String userVariant = SystemProperties.get("user.variant");

		LocaleUtil.setDefault(userLanguage, userCountry, userVariant);

		// Set the default time zone used by Liferay. This time zone is no
		// longer set at the VM level. See LEP-2584.

		String userTimeZone = SystemProperties.get("user.timezone");

		TimeZoneUtil.setDefault(userTimeZone);

		// Shared class loader

		try {
			PortalClassLoaderUtil.setClassLoader(ClassLoaderUtil.getContextClassLoader());
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		// Properties

		com.liferay.portal.kernel.util.PropsUtil.setProps(new PropsImpl());

		// Java properties

		JavaDetector.isJDK5();

		// Security manager

		SecurityManagerUtil.init();

		// Cache registry

		CacheRegistryUtil.setCacheRegistry(DoPrivilegedUtil.wrap(new CacheRegistryImpl()));

		// Configuration factory

		ConfigurationFactoryUtil.setConfigurationFactory(DoPrivilegedUtil.wrap(new ConfigurationFactoryImpl()));

		// Data source factory

		DataSourceFactoryUtil.setDataSourceFactory(DoPrivilegedUtil.wrap(new DataSourceFactoryImpl()));

		// DB factory

		DBFactoryUtil.setDBFactory(DoPrivilegedUtil.wrap(new DBFactoryImpl()));

		// ROME
		XmlReader.setDefaultEncoding(StringPool.UTF8);

		if (_PRINT_TIME) {
			System.out.println(
				"InitAction takes " + stopWatch.getTime() + " ms");
		}

		_initialized = true;
	}

	public synchronized static void initWithSpring() {
		initWithSpring(false, null);
	}

	public synchronized static void initWithSpring(boolean force) {
		initWithSpring(force, null);
	}

	public synchronized static void initWithSpring(
		boolean force, List<String> extraConfigLocations) {

		if (force) {
			_initialized = false;
		}

		if (_initialized) {
			return;
		}

		if (!_neverInitialized) {
			PropsUtil.reload();
		}
		else {
			_neverInitialized = false;
		}

		init();

		SpringUtil.loadContext(extraConfigLocations);

		_initialized = true;
	}

	public synchronized static void initWithSpring(
		List<String> extraConfigLocations) {

		initWithSpring(false, extraConfigLocations);
	}

	private static final boolean _PRINT_TIME = false;

	private static boolean _initialized;
	private static boolean _neverInitialized = true;

}