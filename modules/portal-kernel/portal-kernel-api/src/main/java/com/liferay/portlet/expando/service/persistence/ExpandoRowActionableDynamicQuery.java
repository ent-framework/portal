package com.liferay.portlet.expando.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.expando.model.ExpandoRow;
import com.liferay.portlet.expando.service.ExpandoRowLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ExpandoRowActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ExpandoRowActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ExpandoRowLocalServiceUtil.getService());
        setClass(ExpandoRow.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("rowId");
    }
}
