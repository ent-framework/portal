package com.liferay.portlet.shopping.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface ShoppingCouponFinder {
    public int countByG_C_C_A_DT(long groupId, long companyId,
        java.lang.String code, boolean active, java.lang.String discountType,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.shopping.model.ShoppingCoupon> findByG_C_C_A_DT(
        long groupId, long companyId, java.lang.String code, boolean active,
        java.lang.String discountType, boolean andOperator, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
