/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 * <p>
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.dao.jdbc;

import com.liferay.portal.dao.jdbc.util.DataSourceWrapper;
import com.liferay.portal.kernel.dao.jdbc.DataSourceFactory;
import com.liferay.portal.kernel.jndi.JNDIUtil;
import com.liferay.portal.kernel.security.pacl.DoPrivileged;
import com.liferay.portal.kernel.util.*;
import com.liferay.portal.util.PropsUtil;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @author Brian Wing Shun Chan
 * @author Shuyang Zhou
 */
@DoPrivileged
public class DataSourceFactoryImpl implements DataSourceFactory {

    @Override
    public void destroyDataSource(DataSource dataSource) throws Exception {
        while (dataSource instanceof DataSourceWrapper) {
            DataSourceWrapper dataSourceWrapper = (DataSourceWrapper) dataSource;
            dataSource = dataSourceWrapper.getWrappedDataSource();
        }

        if (dataSource instanceof HikariDataSource) {
            HikariDataSource hikariDataSource = (HikariDataSource) dataSource;
            hikariDataSource.close();
        }
    }

    @Override
    public DataSource initDataSource(Properties properties) throws Exception {
        Properties defaultProperties = PropsUtil.getProperties("jdbc.default.", true);

        PropertiesUtil.merge(defaultProperties, properties);

        properties = defaultProperties;

        String jndiName = properties.getProperty("jndi.name");

        if (Validator.isNotNull(jndiName)) {
            try {
                Properties jndiEnvironmentProperties = PropsUtil.getProperties(PropsKeys.JNDI_ENVIRONMENT, true);

                Context context = new InitialContext(jndiEnvironmentProperties);

                return (DataSource) JNDIUtil.lookup(context, jndiName);
            } catch (Exception e) {
                _log.error("Unable to lookup " + jndiName, e);
            }
        }

        if (_log.isDebugEnabled()) {
            _log.debug("Data source properties:\n");

            SortedProperties sortedProperties = new SortedProperties(
                    properties);

            _log.debug(PropertiesUtil.toString(sortedProperties));
        }

        DataSource dataSource = initDataSourceHikariCP(properties);

        if (_log.isDebugEnabled()) {
            _log.debug("Created data source " + dataSource.getClass());
        }

        return _pacl.getDataSource(dataSource);
    }

    @Override
    public DataSource initDataSource(
            String driverClassName, String url, String userName,
            String password, String jndiName)
            throws Exception {

        Properties properties = new Properties();

        properties.setProperty("driverClassName", driverClassName);
        properties.setProperty("url", url);
        properties.setProperty("username", userName);
        properties.setProperty("password", password);
        properties.setProperty("jndi.name", jndiName);

        return initDataSource(properties);
    }

    public static interface PACL {

        public DataSource getDataSource(DataSource dataSource);

    }

    protected DataSource initDataSourceHikariCP(Properties properties)
            throws Exception {

        String identityToken = StringUtil.randomString();


        Properties hikariProperties = new Properties();

        Enumeration<String> enu = (Enumeration<String>) properties.propertyNames();

        while (enu.hasMoreElements()) {
            String key = enu.nextElement();
            String value = properties.getProperty(key);

            if (isPropertyHikariCP(key)) {
                hikariProperties.setProperty(key, value);
            }
        }

        HikariConfig config = new HikariConfig(hikariProperties);
        HikariDataSource ds = new HikariDataSource(config);
        ds.setPoolName(identityToken);
        return ds;
    }

    private boolean isPropertyHikariCP(String key) {


        if (StringUtils.startsWithIgnoreCase(key, "dataSource.")) {
            return true;
        }

        if (StringUtils.equals(key, "catalog") ||
                StringUtils.equals(key, "connectionInitSql") ||
                StringUtils.equals(key, "connectionTestQuery") ||
                StringUtils.equals(key, "dataSourceClassName") ||
                StringUtils.equals(key, "dataSourceJNDI") ||
                StringUtils.equals(key, "driverClassName") ||
                StringUtils.equals(key, "jdbcUrl") ||
                StringUtils.equals(key, "password") ||
                StringUtils.equals(key, "poolName") ||
                StringUtils.equals(key, "transactionIsolation") ||
                StringUtils.equals(key, "username") ||
                StringUtils.equals(key, "autoCommit") ||
                StringUtils.equals(key, "readOnly") ||
                StringUtils.equals(key, "initializationFailFast") ||
                StringUtils.equals(key, "isolateInternalQueries") ||
                StringUtils.equals(key, "registerMbeans") ||
                StringUtils.equals(key, "allowPoolSuspension") ||
                StringUtils.equals(key, "minimumIdle") ||
                StringUtils.equals(key, "maximumPoolSize") ||
                StringUtils.equals(key, "maxLifetime") ||
                StringUtils.equals(key, "leakDetectionThreshold") ||
                StringUtils.equals(key, "idleTimeout") ||
                StringUtils.equals(key, "validationTimeout") ||
                StringUtils.equals(key, "connectionTimeout")
                ) {
            return true;
        }

        return false;


    }

    private static final Logger _log = LoggerFactory.getLogger(DataSourceFactoryImpl.class);

    private static PACL _pacl = new NoPACL();

    private static class NoPACL implements PACL {

        @Override
        public DataSource getDataSource(DataSource dataSource) {
            return dataSource;
        }

    }

}