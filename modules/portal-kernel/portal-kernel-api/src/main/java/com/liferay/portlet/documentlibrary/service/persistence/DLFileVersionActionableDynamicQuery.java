package com.liferay.portlet.documentlibrary.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.documentlibrary.model.DLFileVersion;
import com.liferay.portlet.documentlibrary.service.DLFileVersionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DLFileVersionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DLFileVersionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DLFileVersionLocalServiceUtil.getService());
        setClass(DLFileVersion.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("fileVersionId");
    }
}
