package com.liferay.portlet.documentlibrary.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DLFileEntryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DLFileEntryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DLFileEntryLocalServiceUtil.getService());
        setClass(DLFileEntry.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("fileEntryId");
    }
}
