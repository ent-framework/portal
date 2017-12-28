package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.UserNotificationEvent;
import com.liferay.portal.service.UserNotificationEventLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UserNotificationEventActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserNotificationEventActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(UserNotificationEventLocalServiceUtil.getService());
        setClass(UserNotificationEvent.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("userNotificationEventId");
    }
}
