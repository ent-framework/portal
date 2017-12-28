package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.LayoutPrototype;
import com.liferay.portal.service.LayoutPrototypeLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LayoutPrototypeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LayoutPrototypeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LayoutPrototypeLocalServiceUtil.getService());
        setClass(LayoutPrototype.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("layoutPrototypeId");
    }
}
