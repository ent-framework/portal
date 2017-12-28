package com.liferay.portlet.dynamicdatamapping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink;
import com.liferay.portlet.dynamicdatamapping.service.DDMStorageLinkLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DDMStorageLinkActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DDMStorageLinkActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DDMStorageLinkLocalServiceUtil.getService());
        setClass(DDMStorageLink.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("storageLinkId");
    }
}
