package com.liferay.portlet.shopping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.shopping.model.ShoppingItem;
import com.liferay.portlet.shopping.service.ShoppingItemLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ShoppingItemActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ShoppingItemActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ShoppingItemLocalServiceUtil.getService());
        setClass(ShoppingItem.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("itemId");
    }
}
