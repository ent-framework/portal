package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.SystemEvent;
import com.liferay.portal.service.SystemEventLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SystemEventActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SystemEventActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SystemEventLocalServiceUtil.getService());
        setClass(SystemEvent.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("systemEventId");
    }
}
