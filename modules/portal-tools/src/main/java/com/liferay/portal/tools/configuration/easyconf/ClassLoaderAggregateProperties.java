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

package com.liferay.portal.tools.configuration.easyconf;

import com.germinus.easyconf.*;
import com.germinus.easyconf.ConfigurationException;
import com.liferay.portal.kernel.util.ArrayUtil;
import org.apache.commons.configuration.*;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Raymond Augé
 */
public class ClassLoaderAggregateProperties extends AggregatedProperties {

	public ClassLoaderAggregateProperties(
		ClassLoader classLoader, String companyId, String componentName) {

		super(companyId, componentName);

		_classLoader = classLoader;
		_companyId = companyId;
		_componentName = componentName;

		_prefixedSystemConfiguration = new SubsetConfiguration(
			_systemConfiguration, _getPrefix(), null);
	}

	@Override
	public void addBaseFileName(String fileName) {
		URL url = _classLoader.getResource(fileName);

		Configuration configuration = _addPropertiesSource(
			fileName, url, _baseCompositeConfiguration);

		if ((configuration != null) && !configuration.isEmpty()) {
			_baseConfigurationLoaded = true;
		}
	}

	@Override
	public void addGlobalFileName(String fileName) {
		URL url = _classLoader.getResource(fileName);

		_addPropertiesSource(fileName, url, _globalCompositeConfiguration);
	}

	public CompositeConfiguration getBaseConfiguration() {
		return _baseCompositeConfiguration;
	}

	@Override
	public String getComponentName() {
		return _componentName;
	}

	@Override
	public Object getProperty(String key) {
		Object value = null;

		if (value == null) {
			value = System.getProperty(_getPrefix().concat(key));
		}

		if (value == null) {
			value = _globalCompositeConfiguration.getProperty(
				_getPrefix().concat(key));
		}

		if (value == null) {
			value = _globalCompositeConfiguration.getProperty(key);
		}

		if (value == null) {
			value = _baseCompositeConfiguration.getProperty(key);
		}

		if (value == null) {
			value = super.getProperty(key);
		}

		if (value == null) {
			value = System.getProperty(key);
		}

		if ((value == null) && key.equals(Conventions.COMPANY_ID_PROPERTY)) {
			value = _companyId;
		}

		if ((value == null) &&
			key.equals(Conventions.COMPONENT_NAME_PROPERTY)) {

			value = _componentName;
		}

		return value;
	}

	@Override
	public boolean hasBaseConfiguration() {
		return _baseConfigurationLoaded;
	}

	@Override
	public List<String> loadedSources() {
		return _loadedSources;
	}

	private Configuration _addDatasourceProperties(String datasourcePath) {
		DatasourceURL datasourceURL = new DatasourceURL(
			datasourcePath, _companyId, _componentName,
			DatasourceURL.PROPERTIES_TABLE);

		return datasourceURL.getConfiguration();
	}

	private Configuration _addFileProperties(
			String fileName,
			CompositeConfiguration loadedCompositeConfiguration)
		throws ConfigurationException {

		try {
			FileConfiguration newFileConfiguration =
				new PropertiesConfiguration(fileName);

			URL url = newFileConfiguration.getURL();

			if (_log.isDebugEnabled()) {
				_log.debug("Adding file " + url);
			}

			Long delay = _getReloadDelay(
				loadedCompositeConfiguration, newFileConfiguration);

			if (delay != null) {
				FileChangedReloadingStrategy fileChangedReloadingStrategy =
					new FileConfigurationChangedReloadingStrategy();

				if (_log.isDebugEnabled()) {
					_log.debug(
						"File " + url + " will be reloaded every " +
							delay + " seconds");
				}

				long milliseconds = delay.longValue() * 1000;

				fileChangedReloadingStrategy.setRefreshDelay(milliseconds);

				newFileConfiguration.setReloadingStrategy(
					fileChangedReloadingStrategy);
			}

			_addIncludedPropertiesSources(
				newFileConfiguration, loadedCompositeConfiguration);

			return newFileConfiguration;
		}
		catch (org.apache.commons.configuration.ConfigurationException ce) {
			if (_log.isDebugEnabled()) {
				_log.debug("Configuration source " + fileName + " ignored");
			}

			return null;
		}
	}

	private void _addIncludedPropertiesSources(
		Configuration newConfiguration,
		CompositeConfiguration loadedCompositeConfiguration) {

		CompositeConfiguration tempCompositeConfiguration =
			new CompositeConfiguration();

		tempCompositeConfiguration.addConfiguration(
			_prefixedSystemConfiguration);
		tempCompositeConfiguration.addConfiguration(newConfiguration);
		tempCompositeConfiguration.addConfiguration(_systemConfiguration);
		tempCompositeConfiguration.addProperty(
			Conventions.COMPANY_ID_PROPERTY, _companyId);
		tempCompositeConfiguration.addProperty(
			Conventions.COMPONENT_NAME_PROPERTY, _componentName);

		String[] fileNames = tempCompositeConfiguration.getStringArray(
			Conventions.INCLUDE_PROPERTY);

		ArrayUtil.reverse(fileNames);

		for (String fileName : fileNames) {
			URL url = null;

			try {
				url = _classLoader.getResource(fileName);
			}
			catch (RuntimeException re) {
				if (fileName.startsWith("file:/")) {
					throw re;
				}

				fileName = "file:/".concat(fileName);

				url = _classLoader.getResource(fileName);
			}

			_addPropertiesSource(fileName, url, loadedCompositeConfiguration);
		}
	}

	private Configuration _addJNDIProperties(String sourcePath) {
		JndiURL jndiURL = new JndiURL(sourcePath, _companyId, _componentName);

		return jndiURL.getConfiguration();
	}

	private Configuration _addPropertiesSource(
		String sourceName, URL url,
		CompositeConfiguration loadedCompositeConfiguration) {

		try {
			Configuration newConfiguration = null;

			if (DatasourceURL.isDatasource(sourceName)) {
				newConfiguration = _addDatasourceProperties(sourceName);
			}
			else if (JndiURL.isJndi(sourceName)) {
				newConfiguration = _addJNDIProperties(sourceName);
			}
			else if (url != null) {
				newConfiguration = _addURLProperties(
					url, loadedCompositeConfiguration);
			}
			else {
				newConfiguration = _addFileProperties(
					sourceName, loadedCompositeConfiguration);
			}

			if (newConfiguration == null) {
				return newConfiguration;
			}

			loadedCompositeConfiguration.addConfiguration(newConfiguration);

			super.addConfiguration(newConfiguration);

			if (newConfiguration instanceof AbstractFileConfiguration) {
				AbstractFileConfiguration abstractFileConfiguration =
					(AbstractFileConfiguration)newConfiguration;

				URL abstractFileConfigurationURL =
					abstractFileConfiguration.getURL();

				_loadedSources.add(abstractFileConfigurationURL.toString());
			}
			else {
				_loadedSources.add(sourceName);
			}

			return newConfiguration;
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(
					"Configuration source " + sourceName + " ignored: " +
						e.getMessage());
			}

			return null;
		}
	}

	private Configuration _addURLProperties(
			URL url, CompositeConfiguration loadedCompositeConfiguration)
		throws ConfigurationException {

		try {
			FileConfiguration newFileConfiguration =
				new PropertiesConfiguration(url);

			if (_log.isDebugEnabled()) {
				_log.debug("Adding resource " + url);
			}

			Long delay = _getReloadDelay(
				loadedCompositeConfiguration, newFileConfiguration);

			if (delay != null) {
				FileChangedReloadingStrategy fileChangedReloadingStrategy =
					new FileConfigurationChangedReloadingStrategy();

				if (_log.isDebugEnabled()) {
					_log.debug(
						"Resource " + url + " will be reloaded every " +
							delay + " seconds");
				}

				long milliseconds = delay.longValue() * 1000;

				fileChangedReloadingStrategy.setRefreshDelay(milliseconds);

				newFileConfiguration.setReloadingStrategy(
					fileChangedReloadingStrategy);
			}

			_addIncludedPropertiesSources(
				newFileConfiguration, loadedCompositeConfiguration);

			return newFileConfiguration;
		}
		catch (org.apache.commons.configuration.ConfigurationException ce) {
			if (_log.isDebugEnabled()) {
				_log.debug("Configuration source " + url + " ignored");
			}

			return null;
		}
	}

	private String _getPrefix() {
		return _componentName.concat(Conventions.PREFIX_SEPARATOR);
	}

	private Long _getReloadDelay(
		CompositeConfiguration loadedCompositeConfiguration,
		FileConfiguration newFileConfiguration) {

		Long delay = newFileConfiguration.getLong(
			Conventions.RELOAD_DELAY_PROPERTY, null);

		if (delay == null) {
			delay = loadedCompositeConfiguration.getLong(
				Conventions.RELOAD_DELAY_PROPERTY, null);
		}

		return delay;
	}

	private static final Logger _log = LoggerFactory.getLogger(
		ClassLoaderAggregateProperties.class);

	private CompositeConfiguration _baseCompositeConfiguration =
		new CompositeConfiguration();
	private boolean _baseConfigurationLoaded;
	private ClassLoader _classLoader;
	private String _companyId;
	private String _componentName;
	private CompositeConfiguration _globalCompositeConfiguration =
		new CompositeConfiguration();
	private List<String> _loadedSources = new ArrayList<String>();
	private Configuration _prefixedSystemConfiguration;
	private SystemConfiguration _systemConfiguration =
		new SystemConfiguration();

}