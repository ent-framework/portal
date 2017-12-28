package com.liferay.portlet.trash.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.trash.model.TrashVersion;
import com.liferay.portlet.trash.service.TrashVersionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class TrashVersionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public TrashVersionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(TrashVersionLocalServiceUtil.getService());
        setClass(TrashVersion.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("versionId");
    }
}
