package com.liferay.portlet.documentlibrary.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.documentlibrary.model.DLFileEntryType;
import com.liferay.portlet.documentlibrary.service.DLFileEntryTypeLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DLFileEntryTypeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DLFileEntryTypeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DLFileEntryTypeLocalServiceUtil.getService());
        setClass(DLFileEntryType.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("fileEntryTypeId");
    }
}
