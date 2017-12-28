package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.ResourcePermission;
import com.liferay.portal.service.ResourcePermissionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ResourcePermissionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ResourcePermissionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ResourcePermissionLocalServiceUtil.getService());
        setClass(ResourcePermission.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("resourcePermissionId");
    }
}
