package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.UserGroupRole;
import com.liferay.portal.service.UserGroupRoleLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UserGroupRoleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserGroupRoleActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserGroupRoleLocalServiceUtil.getService());
        setClass(UserGroupRole.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.userId");

        setGroupIdPropertyName("primaryKey.groupId");
    }
}
