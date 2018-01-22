/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.portal.search.solr.server;

import com.liferay.portal.kernel.util.ClassUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.search.solr.http.BasicAuthPoolingHttpClientFactory;
import com.liferay.portal.search.solr.http.HttpClientFactory;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @author Bruno Farache
 * @author László Csontos
 * @author André de Oliveira
 */
@Deprecated
public class BasicAuthSolrServer extends BaseHttpSolrServer {

    public static final String PROP_SOLR_SERVER_URL = "solr.server.url";
    public static final String PROP_SOLR_USER_NAME = "solr.server.username";
    public static final String PROP_SOLR_PASSWORD = "solr.server.password";

    public void afterPropertiesSet() throws Exception {
        if (_log.isWarnEnabled()) {
            _log.warn(
                    ClassUtil.getClassName(this) + " is deprecated in favor of " +
                            com.liferay.portal.search.solr.server.HttpSolrServer.class.
                                    getName());
        }

        if (StringUtils.isEmpty(_username)) {
            _username = PropsUtil.get(PROP_SOLR_USER_NAME);
        }

        if (StringUtils.isEmpty(_url)) {
            _url = PropsUtil.get(PROP_SOLR_SERVER_URL);
        }

        if (StringUtils.isEmpty(_password)) {
            _password = PropsUtil.get(PROP_SOLR_PASSWORD);
        }


        BasicAuthPoolingHttpClientFactory basicAuthPoolingHttpClientFactory =
                new BasicAuthPoolingHttpClientFactory();

        basicAuthPoolingHttpClientFactory.setAuthScope(_authScope);
        basicAuthPoolingHttpClientFactory.setDefaultMaxConnectionsPerRoute(
                _defaultMaxConnectionsPerRoute);
        basicAuthPoolingHttpClientFactory.setHttpRequestInterceptors(
                _httpRequestInterceptors);
        basicAuthPoolingHttpClientFactory.setMaxTotalConnections(
                _maxTotalConnections);
        basicAuthPoolingHttpClientFactory.setPassword(_password);
        basicAuthPoolingHttpClientFactory.setUsername(_username);

        _httpClientFactory = basicAuthPoolingHttpClientFactory;

        initHttpSolrServer(basicAuthPoolingHttpClientFactory.createInstance());
    }

    public void setAuthScope(AuthScope authScope) {
        _authScope = authScope;
    }

    public void setDefaultMaxConnectionsPerRoute(
            int defaultMaxConnectionsPerRoute) {

        _defaultMaxConnectionsPerRoute = defaultMaxConnectionsPerRoute;

        HttpSolrServer httpSolrServer = getHttpSolrServer();

        if (httpSolrServer != null) {
            httpSolrServer.setDefaultMaxConnectionsPerHost(
                    defaultMaxConnectionsPerRoute);
        }
    }

    public void setHttpRequestInterceptors(
            List<HttpRequestInterceptor> httpRequestInterceptors) {

        _httpRequestInterceptors = httpRequestInterceptors;
    }

    public void setMaxTotalConnections(int maxTotalConnections) {
        _maxTotalConnections = maxTotalConnections;

        HttpSolrServer httpSolrServer = getHttpSolrServer();

        if (httpSolrServer != null) {
            httpSolrServer.setMaxTotalConnections(maxTotalConnections);
        }
    }

    public void setPassword(String password) {
        _password = password;
    }

    public void setUsername(String username) {
        _username = username;
    }

    @Override
    public void shutdown() {
        super.shutdown();

        _httpClientFactory.shutdown();
    }

    private static Logger _log = LoggerFactory.getLogger(BasicAuthSolrServer.class);

    private AuthScope _authScope;
    private Integer _defaultMaxConnectionsPerRoute;
    private HttpClientFactory _httpClientFactory;
    private List<HttpRequestInterceptor> _httpRequestInterceptors;
    private Integer _maxTotalConnections;
    private String _password;
    private String _username;
    private String _url;

}