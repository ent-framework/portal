package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.ResourceBlock;
import com.liferay.portal.service.ResourceBlockLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ResourceBlockActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ResourceBlockActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ResourceBlockLocalServiceUtil.getService());
        setClass(ResourceBlock.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("resourceBlockId");
    }
}
