package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.ResourceAction;
import com.liferay.portal.service.ResourceActionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ResourceActionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ResourceActionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ResourceActionLocalServiceUtil.getService());
        setClass(ResourceAction.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("resourceActionId");
    }
}
