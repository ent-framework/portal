package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.VirtualHost;
import com.liferay.portal.service.VirtualHostLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class VirtualHostActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public VirtualHostActionableDynamicQuery() throws SystemException {
        setBaseLocalService(VirtualHostLocalServiceUtil.getService());
        setClass(VirtualHost.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("virtualHostId");
    }
}
