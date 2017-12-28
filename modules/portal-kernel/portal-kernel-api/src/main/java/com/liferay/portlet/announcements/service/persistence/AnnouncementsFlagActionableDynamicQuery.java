package com.liferay.portlet.announcements.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.announcements.model.AnnouncementsFlag;
import com.liferay.portlet.announcements.service.AnnouncementsFlagLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AnnouncementsFlagActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AnnouncementsFlagActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AnnouncementsFlagLocalServiceUtil.getService());
        setClass(AnnouncementsFlag.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("flagId");
    }
}
