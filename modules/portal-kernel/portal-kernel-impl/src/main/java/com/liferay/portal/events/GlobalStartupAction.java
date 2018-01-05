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

package com.liferay.portal.events;

//import com.liferay.portal.jcr.JCRFactoryUtil;

import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.kernel.javadoc.JavadocManagerUtil;
import com.liferay.portal.kernel.jsonwebservice.JSONWebServiceActionsManagerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.*;
import com.liferay.portal.pop.POPServerUtil;
import com.liferay.portal.spring.context.PortalContextLoaderListener;
import com.liferay.portal.struts.AuthPublicPathRegistry;
import com.liferay.portal.util.BrowserLauncher;
import com.liferay.portal.util.ClassLoaderUtil;
import com.liferay.portal.util.PropsValues;

/**
 * @author Brian Wing Shun Chan
 */
public class GlobalStartupAction extends SimpleAction {

    @Override
    public void run(String[] ids) {

        // Authentication
        AuthPublicPathRegistry.register(PropsValues.AUTH_PUBLIC_PATHS);

        // JAMWiki

        try {
            String tmpDir = SystemProperties.get(SystemProperties.TMP_DIR);

            // Environment.setValue(Environment.PROP_BASE_FILE_DIR, tmpDir);
        } catch (Throwable t) {
            _log.error(t.getMessage());
        }

        // Javadoc

        ClassLoader contextClassLoader = ClassLoaderUtil.getContextClassLoader();

        JavadocManagerUtil.load(StringPool.BLANK, contextClassLoader);

        // JNDI

        try {
            InfrastructureUtil.getDataSource();
        } catch (Exception e) {
            _log.error(e.getMessage(), e);
        }

        try {
            if (!ServerDetector.isJOnAS()) {
                InfrastructureUtil.getMailSession();
            }
        } catch (Exception e) {
            if (_log.isWarnEnabled()) {
                _log.warn(e.getMessage());
            }
        }

        // JSON web service

        JSONWebServiceActionsManagerUtil.registerServletContext(PortalContextLoaderListener.getPortalServletContextPath());

        // POP server

        if (PropsValues.POP_SERVER_NOTIFICATIONS_ENABLED) {
            POPServerUtil.start();
        }

        // Launch browser

        if (Validator.isNotNull(PropsValues.BROWSER_LAUNCHER_URL)) {
            Thread browserLauncherThread = new Thread(new BrowserLauncher());

            browserLauncherThread.start();
        }
    }

    private static final Logger _log = LoggerFactory.getLogger(GlobalStartupAction.class);

}