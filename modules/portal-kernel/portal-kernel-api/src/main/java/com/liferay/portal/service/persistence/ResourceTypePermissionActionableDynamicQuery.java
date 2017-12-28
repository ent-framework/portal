package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.ResourceTypePermission;
import com.liferay.portal.service.ResourceTypePermissionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ResourceTypePermissionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ResourceTypePermissionActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(ResourceTypePermissionLocalServiceUtil.getService());
        setClass(ResourceTypePermission.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("resourceTypePermissionId");
    }
}
