package com.liferay.portlet.expando.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.expando.model.ExpandoColumn;
import com.liferay.portlet.expando.service.ExpandoColumnLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ExpandoColumnActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ExpandoColumnActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ExpandoColumnLocalServiceUtil.getService());
        setClass(ExpandoColumn.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("columnId");
    }
}
