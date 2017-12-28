package com.liferay.portlet.trash.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.trash.model.TrashEntry;
import com.liferay.portlet.trash.service.TrashEntryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class TrashEntryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TrashEntryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TrashEntryLocalServiceUtil.getService());
        setClass(TrashEntry.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("entryId");
    }
}
