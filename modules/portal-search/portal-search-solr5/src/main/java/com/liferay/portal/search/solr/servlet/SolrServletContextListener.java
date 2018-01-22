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

package com.liferay.portal.search.solr.servlet;

import com.liferay.portal.kernel.concurrent.ConcurrentHashSet;
import com.liferay.portal.kernel.util.BasePortalLifecycle;
import com.liferay.portal.search.solr.server.LiveServerChecker;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Set;

/**
 * @author Zsigmond Rab
 */
public class SolrServletContextListener
        extends BasePortalLifecycle implements ServletContextListener {

    public static void registerLiveServerChecker(
            LiveServerChecker liveServerChecker) {

        _liveServerCheckers.add(liveServerChecker);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        portalDestroy();
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        registerPortalLifecycle();
    }

    @Override
    protected void doPortalDestroy() throws Exception {
        for (LiveServerChecker liveServerChecker : _liveServerCheckers) {
            liveServerChecker.shutdown();

            _liveServerCheckers.remove(liveServerChecker);
        }
    }

    @Override
    protected void doPortalInit() {
    }

    private static Set<LiveServerChecker> _liveServerCheckers =
            new ConcurrentHashSet<LiveServerChecker>();

}