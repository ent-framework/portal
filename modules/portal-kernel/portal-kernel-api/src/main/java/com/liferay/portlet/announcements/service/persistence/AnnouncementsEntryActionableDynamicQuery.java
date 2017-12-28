package com.liferay.portlet.announcements.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.announcements.model.AnnouncementsEntry;
import com.liferay.portlet.announcements.service.AnnouncementsEntryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AnnouncementsEntryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AnnouncementsEntryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AnnouncementsEntryLocalServiceUtil.getService());
        setClass(AnnouncementsEntry.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("entryId");
    }
}
