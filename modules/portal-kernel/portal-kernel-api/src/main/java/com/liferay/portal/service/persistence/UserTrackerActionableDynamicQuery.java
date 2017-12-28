package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.UserTracker;
import com.liferay.portal.service.UserTrackerLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UserTrackerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserTrackerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserTrackerLocalServiceUtil.getService());
        setClass(UserTracker.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("userTrackerId");
    }
}
