package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.ServiceComponent;
import com.liferay.portal.service.ServiceComponentLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ServiceComponentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ServiceComponentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ServiceComponentLocalServiceUtil.getService());
        setClass(ServiceComponent.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("serviceComponentId");
    }
}
