package com.liferay.portlet.shopping.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class ShoppingOrderFinderUtil {
    private static ShoppingOrderFinder _finder;

    public static int countByG_C_U_N_PPPS(long groupId, long companyId,
        long userId, java.lang.String number,
        java.lang.String billingFirstName, java.lang.String billingLastName,
        java.lang.String billingEmailAddress,
        java.lang.String shippingFirstName, java.lang.String shippingLastName,
        java.lang.String shippingEmailAddress,
        java.lang.String ppPaymentStatus, boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByG_C_U_N_PPPS(groupId, companyId, userId, number,
            billingFirstName, billingLastName, billingEmailAddress,
            shippingFirstName, shippingLastName, shippingEmailAddress,
            ppPaymentStatus, andOperator);
    }

    public static java.util.List<com.liferay.portlet.shopping.model.ShoppingOrder> findByG_C_U_N_PPPS(
        long groupId, long companyId, long userId, java.lang.String number,
        java.lang.String billingFirstName, java.lang.String billingLastName,
        java.lang.String billingEmailAddress,
        java.lang.String shippingFirstName, java.lang.String shippingLastName,
        java.lang.String shippingEmailAddress,
        java.lang.String ppPaymentStatus, boolean andOperator, int start,
        int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByG_C_U_N_PPPS(groupId, companyId, userId, number,
            billingFirstName, billingLastName, billingEmailAddress,
            shippingFirstName, shippingLastName, shippingEmailAddress,
            ppPaymentStatus, andOperator, start, end, obc);
    }

    public static ShoppingOrderFinder getFinder() {
        if (_finder == null) {
            _finder = (ShoppingOrderFinder) PortalBeanLocatorUtil.locate(ShoppingOrderFinder.class.getName());

            ReferenceRegistry.registerReference(ShoppingOrderFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(ShoppingOrderFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(ShoppingOrderFinderUtil.class,
            "_finder");
    }
}
