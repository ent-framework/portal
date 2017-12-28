package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.ResourceBlockPermission;
import com.liferay.portal.service.ResourceBlockPermissionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ResourceBlockPermissionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ResourceBlockPermissionActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(ResourceBlockPermissionLocalServiceUtil.getService());
        setClass(ResourceBlockPermission.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("resourceBlockPermissionId");
    }
}
