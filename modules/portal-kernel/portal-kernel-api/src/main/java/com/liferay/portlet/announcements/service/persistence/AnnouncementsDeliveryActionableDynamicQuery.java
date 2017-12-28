package com.liferay.portlet.announcements.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.announcements.model.AnnouncementsDelivery;
import com.liferay.portlet.announcements.service.AnnouncementsDeliveryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AnnouncementsDeliveryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AnnouncementsDeliveryActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(AnnouncementsDeliveryLocalServiceUtil.getService());
        setClass(AnnouncementsDelivery.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("deliveryId");
    }
}
