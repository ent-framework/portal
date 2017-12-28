package com.liferay.portlet.shopping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.shopping.model.ShoppingItemField;
import com.liferay.portlet.shopping.service.ShoppingItemFieldLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ShoppingItemFieldActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ShoppingItemFieldActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ShoppingItemFieldLocalServiceUtil.getService());
        setClass(ShoppingItemField.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("itemFieldId");
    }
}
