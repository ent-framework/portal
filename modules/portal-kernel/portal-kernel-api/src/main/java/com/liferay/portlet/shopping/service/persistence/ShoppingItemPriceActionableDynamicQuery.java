package com.liferay.portlet.shopping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.shopping.model.ShoppingItemPrice;
import com.liferay.portlet.shopping.service.ShoppingItemPriceLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ShoppingItemPriceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ShoppingItemPriceActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ShoppingItemPriceLocalServiceUtil.getService());
        setClass(ShoppingItemPrice.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("itemPriceId");
    }
}
