package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.UserTrackerPath;
import com.liferay.portal.service.UserTrackerPathLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UserTrackerPathActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserTrackerPathActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserTrackerPathLocalServiceUtil.getService());
        setClass(UserTrackerPath.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("userTrackerPathId");
    }
}
