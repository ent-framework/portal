package com.liferay.portlet.shopping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.shopping.model.ShoppingOrderItem;
import com.liferay.portlet.shopping.service.ShoppingOrderItemLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ShoppingOrderItemActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ShoppingOrderItemActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ShoppingOrderItemLocalServiceUtil.getService());
        setClass(ShoppingOrderItem.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("orderItemId");
    }
}
