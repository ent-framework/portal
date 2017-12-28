package com.liferay.portlet.shopping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.shopping.model.ShoppingOrder;
import com.liferay.portlet.shopping.service.ShoppingOrderLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ShoppingOrderActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ShoppingOrderActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ShoppingOrderLocalServiceUtil.getService());
        setClass(ShoppingOrder.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("orderId");
    }
}
