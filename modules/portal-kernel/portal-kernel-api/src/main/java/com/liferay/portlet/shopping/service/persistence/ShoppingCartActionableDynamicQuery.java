package com.liferay.portlet.shopping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.shopping.model.ShoppingCart;
import com.liferay.portlet.shopping.service.ShoppingCartLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ShoppingCartActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ShoppingCartActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ShoppingCartLocalServiceUtil.getService());
        setClass(ShoppingCart.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("cartId");
    }
}
