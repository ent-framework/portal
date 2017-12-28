package com.liferay.portlet.shopping.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface ShoppingOrderFinder {
    public int countByG_C_U_N_PPPS(long groupId, long companyId, long userId,
        java.lang.String number, java.lang.String billingFirstName,
        java.lang.String billingLastName, java.lang.String billingEmailAddress,
        java.lang.String shippingFirstName, java.lang.String shippingLastName,
        java.lang.String shippingEmailAddress,
        java.lang.String ppPaymentStatus, boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> findByG_C_U_N_PPPS(
        long groupId, long companyId, long userId, java.lang.String number,
        java.lang.String billingFirstName, java.lang.String billingLastName,
        java.lang.String billingEmailAddress,
        java.lang.String shippingFirstName, java.lang.String shippingLastName,
        java.lang.String shippingEmailAddress,
        java.lang.String ppPaymentStatus, boolean andOperator, int start,
        int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;
}
