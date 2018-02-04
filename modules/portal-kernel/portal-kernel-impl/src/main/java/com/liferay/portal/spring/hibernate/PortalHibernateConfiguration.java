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

package com.liferay.portal.spring.hibernate;

import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBFactoryUtil;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.resiliency.spi.SPIUtil;
import com.liferay.portal.util.ClassLoaderUtil;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portal.util.PropsValues;

import java.io.IOException;
import java.io.InputStream;

import java.net.URL;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;

import javax.sql.DataSource;

import javassist.util.proxy.ProxyFactory;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.dialect.Dialect;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

/**
 * @author Brian Wing Shun Chan
 * @author Marcellus Tavares
 * @author Shuyang Zhou
 * @author Tomas Polesovsky
 */
public class PortalHibernateConfiguration extends LocalSessionFactoryBean {

	private LocalSessionFactoryBuilder builder;
	
	private DataSource dataSource;
	
	public void initBuilder(DataSource ds) {
		this.dataSource = ds;
		this.builder = new LocalSessionFactoryBuilder(ds, getConfigurationClassLoader());
		
	}


	public SessionFactory buildSessionFactory() throws Exception {
		this.loadConfiguration();
		return super.buildSessionFactory(builder);
	}

	@Override
	public void destroy() throws HibernateException {
		super.destroy();
	}

	public void setHibernateConfigurationConverter(
		Converter<String> hibernateConfigurationConverter) {

		_hibernateConfigurationConverter = hibernateConfigurationConverter;
	}

	protected static Map<String, Class<?>> getPreloadClassLoaderClasses() {
		try {
			Map<String, Class<?>> classes = new HashMap<String, Class<?>>();

			for (String className : _PRELOAD_CLASS_NAMES) {
				ClassLoader portalClassLoader = ClassLoaderUtil.getPortalClassLoader();

				Class<?> clazz = portalClassLoader.loadClass(className);

				classes.put(className, clazz);
			}

			return classes;
		}
		catch (ClassNotFoundException cnfe) {
			throw new RuntimeException(cnfe);
		}
	}

	protected Dialect determineDialect() {
		return DialectDetector.getDialect(this.dataSource);
	}

	protected ClassLoader getConfigurationClassLoader() {
//		Class<?> clazz = getClass();
//		return clazz.getClassLoader();
		return PortalClassLoaderUtil.getClassLoader();
	}

	protected String[] getConfigurationResources() {
		return PropsUtil.getArray(PropsKeys.HIBERNATE_CONFIGS);
	}

	@Override
	public void afterPropertiesSet() throws IOException {
		this.loadConfiguration();
		super.afterPropertiesSet();
	}

	//@Override
	protected void loadConfiguration() {

		Properties hibernateProperties = getHibernateProperties();
		
		try {
			String[] resources = getConfigurationResources();

			for (String resource : resources) {
				try {
					readResource(resource);
				}
				catch (Exception e2) {
					if (_log.isWarnEnabled()) {
						_log.warn(e2.getMessage(), e2);
					}
				}
			}

			Properties properties = PropsUtil.getProperties("hibernate", false);

			if (SPIUtil.isSPI()) {
				properties.put(
					"hibernate.cache.use_query_cache",
					Boolean.FALSE.toString());
				properties.put(
					"hibernate.cache.use_second_level_cache",
					Boolean.FALSE.toString());
			}

			//configuration.setProperties(properties);
			hibernateProperties.putAll(properties);

			if (Validator.isNull(PropsValues.HIBERNATE_DIALECT)) {
				Dialect dialect = determineDialect();

				setDB(dialect);

				Class<?> clazz = dialect.getClass();

				//configuration.setProperty("hibernate.dialect", clazz.getName());
				hibernateProperties.put("hibernate.dialect", clazz.getName());
			}

			DB db = DBFactoryUtil.getDB();

			String dbType = db.getType();

			if (dbType.equals(DB.TYPE_HYPERSONIC)) {
				//configuration.setProperty("hibernate.jdbc.batch_size", "0");
			}
		}
		catch (Exception e1) {
			_log.error(e1.getMessage(), e1);
		}
	}

	protected void readResource(InputStream inputStream)
		throws Exception {

		if (inputStream == null) {
			return;
		}

		if (_hibernateConfigurationConverter != null) {
			String configurationString = StringUtil.read(inputStream);

			configurationString = _hibernateConfigurationConverter.convert(
				configurationString);

			inputStream = new UnsyncByteArrayInputStream(
				configurationString.getBytes());
			
		}
		this.getMetadataSources().addInputStream(inputStream);
		//configuration = configuration.addInputStream(inputStream);

		inputStream.close();
	}

	protected void readResource(String resource)
		throws Exception {

		ClassLoader classLoader = getConfigurationClassLoader();

		if (resource.startsWith("classpath*:")) {
			String name = resource.substring("classpath*:".length());

			Enumeration<URL> enu = classLoader.getResources(name);

			if (_log.isDebugEnabled() && !enu.hasMoreElements()) {
				_log.debug("No resources found for " + name);
			}

			while (enu.hasMoreElements()) {
				URL url = enu.nextElement();

				InputStream inputStream = url.openStream();

				readResource(inputStream);
			}
		}
		else {
			InputStream inputStream = classLoader.getResourceAsStream(resource);
			readResource(inputStream);
		}
	}

	protected void setDB(Dialect dialect) {
		DBFactoryUtil.setDB(dialect);
	}

	private static final String[] _PRELOAD_CLASS_NAMES = PropsValues.SPRING_HIBERNATE_CONFIGURATION_PROXY_FACTORY_PRELOAD_CLASSLOADER_CLASSES;

	private static final Logger _log = LoggerFactory.getLogger(PortalHibernateConfiguration.class);

	private static Map<ProxyFactory, ClassLoader> _proxyFactoryClassLoaders = new WeakHashMap<ProxyFactory, ClassLoader>();

	static {
		ProxyFactory.classLoaderProvider =
			new ProxyFactory.ClassLoaderProvider() {

				@Override
				public ClassLoader get(ProxyFactory proxyFactory) {
					synchronized (_proxyFactoryClassLoaders) {
						ClassLoader classLoader = _proxyFactoryClassLoaders.get(proxyFactory);

						if (classLoader != null) {
							return classLoader;
						}

						classLoader = ClassLoaderUtil.getPortalClassLoader();

						ClassLoader contextClassLoader = ClassLoaderUtil.getContextClassLoader();

						if (classLoader != contextClassLoader) {
							classLoader = new PreloadClassLoader(contextClassLoader, getPreloadClassLoaderClasses());
						}

						_proxyFactoryClassLoaders.put(
							proxyFactory, classLoader);

						return classLoader;
					}
				}

			};
	}

	private Converter<String> _hibernateConfigurationConverter;

}