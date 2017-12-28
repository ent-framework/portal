package com.liferay.portal.ext.service.persistence;

import com.liferay.portal.ext.model.FilterGroup;
import com.liferay.portal.ext.service.FilterGroupLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

/**
 * @author Jeff Qian
 * @generated
 */
public abstract class FilterGroupActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FilterGroupActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FilterGroupLocalServiceUtil.getService());
        setClass(FilterGroup.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("filterGroupId");
    }
}
