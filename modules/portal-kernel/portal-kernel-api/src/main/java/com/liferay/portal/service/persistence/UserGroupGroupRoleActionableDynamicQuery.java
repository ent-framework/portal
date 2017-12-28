package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.UserGroupGroupRole;
import com.liferay.portal.service.UserGroupGroupRoleLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UserGroupGroupRoleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserGroupGroupRoleActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserGroupGroupRoleLocalServiceUtil.getService());
        setClass(UserGroupGroupRole.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.userGroupId");

        setGroupIdPropertyName("primaryKey.groupId");
    }
}
