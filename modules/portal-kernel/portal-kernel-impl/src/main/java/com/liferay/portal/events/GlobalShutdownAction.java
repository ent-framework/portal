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

import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.DataAccess;
import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.kernel.executor.PortalExecutorManagerUtil;
import com.liferay.portal.kernel.javadoc.JavadocManagerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.resiliency.mpi.MPIHelperUtil;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelperUtil;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.template.TemplateManagerUtil;
import com.liferay.portal.kernel.template.TemplateResourceLoaderUtil;
import com.liferay.portal.kernel.util.CentralizedThreadLocal;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portlet.documentlibrary.util.DocumentConversionUtil;
import com.liferay.util.ThirdPartyThreadLocalRegistry;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author Brian Wing Shun Chan
 */
public class GlobalShutdownAction extends SimpleAction {

    @Override
    public void run(String[] ids) {

        // Portal Resiliency

        MPIHelperUtil.shutdown();

        // Javadoc
        JavadocManagerUtil.unload(StringPool.BLANK);

        // Lucene
        //LuceneHelperUtil.shutdown();
        SearchEngineUtil.shutdown();

        // OpenOffice
        DocumentConversionUtil.disconnect();

        // Thread local registry

        ThirdPartyThreadLocalRegistry.resetThreadLocals();
        CentralizedThreadLocal.clearShortLivedThreadLocals();

        // Hypersonic

        DB db = DBFactoryUtil.getDB();

        String dbType = db.getType();

        if (dbType.equals(DB.TYPE_HYPERSONIC)) {
            Connection connection = null;
            Statement statement = null;

            try {
                connection = DataAccess.getConnection();

                statement = connection.createStatement();

                statement.executeUpdate("SHUTDOWN");
            } catch (Exception e) {
                _log.error(e.getMessage(), e);
            } finally {
                DataAccess.cleanUp(connection, statement);
            }
        }

        // Scheduler engine
        try {
            SchedulerEngineHelperUtil.shutdown();
        } catch (Exception e) {
        }

        // Wait 1 second so Quartz threads can cleanly shutdown

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Template manager

        try {
            TemplateManagerUtil.destroy();
        } catch (Exception e) {
        }

        // Template resource loader

        try {
            TemplateResourceLoaderUtil.destroy();
        } catch (Exception e) {
        }

        // Portal executors

        PortalExecutorManagerUtil.shutdown(true);

        // Programmatically exit

        if (GetterUtil.getBoolean(
                PropsUtil.get(PropsKeys.SHUTDOWN_PROGRAMMATICALLY_EXIT))) {

            Thread currentThread = Thread.currentThread();

            ThreadGroup threadGroup = getThreadGroup();

            Thread[] threads = getThreads(threadGroup);

            for (Thread thread : threads) {
                if ((thread == null) || (thread == currentThread)) {
                    continue;
                }

                try {
                    thread.interrupt();
                } catch (Exception e) {
                }
            }

            threadGroup.destroy();
        }
    }

    protected ThreadGroup getThreadGroup() {
        Thread currentThread = Thread.currentThread();

        ThreadGroup threadGroup = currentThread.getThreadGroup();

        for (int i = 0; i < 10; i++) {
            if (threadGroup.getParent() == null) {
                break;
            } else {
                threadGroup = threadGroup.getParent();
            }
        }

        return threadGroup;
    }

    protected Thread[] getThreads(ThreadGroup threadGroup) {
        Thread[] threads = new Thread[threadGroup.activeCount() * 2];

        threadGroup.enumerate(threads);

        return threads;
    }

    private static final Logger _log = LoggerFactory.getLogger(GlobalShutdownAction.class);

}