package com.liferay.portlet.documentlibrary.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.documentlibrary.model.DLFileEntryMetadata;
import com.liferay.portlet.documentlibrary.service.DLFileEntryMetadataLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DLFileEntryMetadataActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DLFileEntryMetadataActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(DLFileEntryMetadataLocalServiceUtil.getService());
        setClass(DLFileEntryMetadata.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("fileEntryMetadataId");
    }
}
