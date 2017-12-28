package com.liferay.portlet.expando.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.expando.model.ExpandoValue;
import com.liferay.portlet.expando.service.ExpandoValueLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ExpandoValueActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ExpandoValueActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ExpandoValueLocalServiceUtil.getService());
        setClass(ExpandoValue.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("valueId");
    }
}
