package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.PasswordTracker;
import com.liferay.portal.service.PasswordTrackerLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PasswordTrackerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PasswordTrackerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PasswordTrackerLocalServiceUtil.getService());
        setClass(PasswordTracker.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("passwordTrackerId");
    }
}
