package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.BackgroundTask;
import com.liferay.portal.service.BackgroundTaskLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BackgroundTaskActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BackgroundTaskActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BackgroundTaskLocalServiceUtil.getService());
        setClass(BackgroundTask.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("backgroundTaskId");
    }
}
