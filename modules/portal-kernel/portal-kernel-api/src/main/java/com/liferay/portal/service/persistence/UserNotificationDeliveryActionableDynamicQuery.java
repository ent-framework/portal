package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.UserNotificationDelivery;
import com.liferay.portal.service.UserNotificationDeliveryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UserNotificationDeliveryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserNotificationDeliveryActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(UserNotificationDeliveryLocalServiceUtil.getService());
        setClass(UserNotificationDelivery.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("userNotificationDeliveryId");
    }
}
