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

import com.liferay.portal.configuration.ConfigurationImpl;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.configuration.Filter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.*;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.model.CompanyConstants;
import com.liferay.portal.security.auth.CompanyThreadLocal;

import java.util.*;

/**
 * @author Brian Wing Shun Chan
 */
public class PropsUtil {

	public static void addProperties(Properties properties) {
		_instance._addProperties(properties);
	}

	public static void addProperties(UnicodeProperties unicodeProperties) {
		_instance._addProperties(unicodeProperties);
	}

	public static boolean contains(String key) {
		return _instance._contains(key);
	}

	public static String get(String key) {
		return _instance._get(key);
	}

	public static String get(String key, Filter filter) {
		return _instance._get(key, filter);
	}

	public static String[] getArray(String key) {
		return _instance._getArray(key);
	}

	public static String[] getArray(String key, Filter filter) {
		return _instance._getArray(key, filter);
	}

	public static Properties getProperties() {
		return _instance._getProperties();
	}

	public static Properties getProperties(
		String prefix, boolean removePrefix) {

		return _instance._getProperties(prefix, removePrefix);
	}

	public static void reload() {
		_instance = new PropsUtil();
	}

	public static void removeProperties(Properties properties) {
		_instance._removeProperties(properties);
	}

	public static void set(String key, String value) {
		_instance._set(key, value);
	}

	private PropsUtil() {
		try {

			// Liferay home directory
			_configuration = new ConfigurationImpl(PropsUtil.class.getClassLoader(), PropsFiles.PORTAL);

			_log.info("Load all plugin.properties");
			Configuration portalExtraConfiguration = new ConfigurationImpl(PropsUtil.class.getClassLoader(), PropsFiles.PLUGIN);

			merge(portalExtraConfiguration, _configuration);

			String liferayHome = _get(PropsKeys.LIFERAY_HOME);

			if (_log.isDebugEnabled()) {
				_log.debug("Configured Liferay home " + liferayHome);
			}

			SystemProperties.set(PropsKeys.LIFERAY_HOME, liferayHome);

			// Ehcache disk directory

			SystemProperties.set(
				"ehcache.disk.store.dir", liferayHome + "/data/ehcache");

			if (GetterUtil.getBoolean(SystemProperties.get("company-id-properties"))) {
				_configurations = new HashMap<Long, Configuration>();
			}
		}
		catch (Exception e) {
			if (_log.isErrorEnabled()) {
				_log.error("Unable to initialize PropsUtil", e);
			}
		}
	}

	private void _addProperties(Properties properties) {
		_getConfiguration().addProperties(properties);
	}

	private void _addProperties(UnicodeProperties unicodeProperties) {
		Properties properties = new Properties();

		properties.putAll(unicodeProperties);

		_addProperties(properties);
	}

	private boolean _contains(String key) {
		return _getConfiguration().contains(key);
	}

	private String _get(String key) {
		return _getConfiguration().get(key);
	}

	private String _get(String key, Filter filter) {
		return _getConfiguration().get(key, filter);
	}

	private String[] _getArray(String key) {
		return _getConfiguration().getArray(key);
	}

	private String[] _getArray(String key, Filter filter) {
		return _getConfiguration().getArray(key, filter);
	}

	private Configuration _getConfiguration() {
		if (_configurations == null) {
			return _configuration;
		}

		Long companyId = CompanyThreadLocal.getCompanyId();

		if (companyId > CompanyConstants.SYSTEM) {
			Configuration configuration = _configurations.get(companyId);

			if (configuration == null) {
				configuration = new ConfigurationImpl(
					PropsUtil.class.getClassLoader(), PropsFiles.PORTAL,
					companyId);

				_configurations.put(companyId, configuration);
			}

			return configuration;
		}
		else {
			return _configuration;
		}
	}

	private String _getLibDir(Class<?> clazz) {
		String path = ClassUtil.getParentPath(clazz.getClassLoader(), clazz.getName());

		int pos = path.lastIndexOf(".jar!");

		if (pos == -1) {
			pos = path.lastIndexOf(".jar/");
		}

		pos = path.lastIndexOf(CharPool.SLASH, pos);

		path = path.substring(0, pos + 1);

		return path;
	}

	private static void merge(Configuration source, Configuration target) {
		if (source.getProperties()!=null) {
			_log.info("start merge");
			Set<String> propertyNames = source.getProperties().stringPropertyNames();
			for( String name : propertyNames) {
				if (target.contains(name)) {
                    //TODO meger existing values
				} else {
					target.set(name, source.get(name));
					_log.info("add new property to source , name : " + name + ", value: " + source.get(name));
				}
			}
		}
	}

	private Properties _getProperties() {
		return _getConfiguration().getProperties();
	}

	private Properties _getProperties(String prefix, boolean removePrefix) {
		return _getConfiguration().getProperties(prefix, removePrefix);
	}

	private void _removeProperties(Properties properties) {
		_getConfiguration().removeProperties(properties);
	}

	private void _set(String key, String value) {
		_getConfiguration().set(key, value);
	}

	private static final Logger _log = LoggerFactory.getLogger(PropsUtil.class);

	private static PropsUtil _instance = new PropsUtil();

	private Configuration _configuration;
	private Map<Long, Configuration> _configurations;

}