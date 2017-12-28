package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.UserGroup;
import com.liferay.portal.service.UserGroupLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UserGroupActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserGroupActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserGroupLocalServiceUtil.getService());
        setClass(UserGroup.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("userGroupId");
    }
}
