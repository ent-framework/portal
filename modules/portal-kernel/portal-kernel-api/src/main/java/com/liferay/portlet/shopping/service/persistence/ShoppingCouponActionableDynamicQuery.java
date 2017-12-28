package com.liferay.portlet.shopping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.shopping.model.ShoppingCoupon;
import com.liferay.portlet.shopping.service.ShoppingCouponLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ShoppingCouponActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ShoppingCouponActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ShoppingCouponLocalServiceUtil.getService());
        setClass(ShoppingCoupon.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("couponId");
    }
}
