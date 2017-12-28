package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.BrowserTracker;
import com.liferay.portal.service.BrowserTrackerLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BrowserTrackerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BrowserTrackerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BrowserTrackerLocalServiceUtil.getService());
        setClass(BrowserTracker.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("browserTrackerId");
    }
}
