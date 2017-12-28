package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Subscription;
import com.liferay.portal.service.SubscriptionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SubscriptionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SubscriptionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SubscriptionLocalServiceUtil.getService());
        setClass(Subscription.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("subscriptionId");
    }
}
