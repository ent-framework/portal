package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.LayoutSetPrototype;
import com.liferay.portal.service.LayoutSetPrototypeLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LayoutSetPrototypeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LayoutSetPrototypeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LayoutSetPrototypeLocalServiceUtil.getService());
        setClass(LayoutSetPrototype.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("layoutSetPrototypeId");
    }
}
