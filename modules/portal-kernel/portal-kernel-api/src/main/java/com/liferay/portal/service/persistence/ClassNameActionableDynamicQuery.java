package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.ClassName;
import com.liferay.portal.service.ClassNameLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ClassNameActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ClassNameActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ClassNameLocalServiceUtil.getService());
        setClass(ClassName.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("classNameId");
    }
}
