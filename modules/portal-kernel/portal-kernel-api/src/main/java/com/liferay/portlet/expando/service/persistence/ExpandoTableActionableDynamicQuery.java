package com.liferay.portlet.expando.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.expando.model.ExpandoTable;
import com.liferay.portlet.expando.service.ExpandoTableLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ExpandoTableActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ExpandoTableActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ExpandoTableLocalServiceUtil.getService());
        setClass(ExpandoTable.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("tableId");
    }
}
