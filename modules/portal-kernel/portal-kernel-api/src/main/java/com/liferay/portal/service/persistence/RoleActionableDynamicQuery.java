package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Role;
import com.liferay.portal.service.RoleLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RoleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RoleActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RoleLocalServiceUtil.getService());
        setClass(Role.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("roleId");
    }
}
