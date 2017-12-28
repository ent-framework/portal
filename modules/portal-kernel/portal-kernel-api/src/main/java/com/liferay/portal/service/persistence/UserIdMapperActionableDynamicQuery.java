package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.UserIdMapper;
import com.liferay.portal.service.UserIdMapperLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UserIdMapperActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UserIdMapperActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UserIdMapperLocalServiceUtil.getService());
        setClass(UserIdMapper.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("userIdMapperId");
    }
}
