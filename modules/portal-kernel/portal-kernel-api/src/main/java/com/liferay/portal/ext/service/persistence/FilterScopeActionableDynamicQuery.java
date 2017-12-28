package com.liferay.portal.ext.service.persistence;

import com.liferay.portal.ext.model.FilterScope;
import com.liferay.portal.ext.service.FilterScopeLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

/**
 * @author Jeff Qian
 * @generated
 */
public abstract class FilterScopeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FilterScopeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FilterScopeLocalServiceUtil.getService());
        setClass(FilterScope.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("filterScopeId");
    }
}
