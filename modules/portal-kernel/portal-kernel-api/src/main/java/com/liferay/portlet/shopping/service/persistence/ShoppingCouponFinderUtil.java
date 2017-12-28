package com.liferay.portlet.shopping.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class ShoppingCouponFinderUtil {
    private static ShoppingCouponFinder _finder;

    public static int countByG_C_C_A_DT(long groupId, long companyId,
        java.lang.String code, boolean active, java.lang.String discountType,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByG_C_C_A_DT(groupId, companyId, code, active,
            discountType, andOperator);
    }

    public static java.util.List<com.liferay.portlet.shopping.model.ShoppingCoupon> findByG_C_C_A_DT(
        long groupId, long companyId, java.lang.String code, boolean active,
        java.lang.String discountType, boolean andOperator, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByG_C_C_A_DT(groupId, companyId, code, active,
            discountType, andOperator, start, end);
    }

    public static ShoppingCouponFinder getFinder() {
        if (_finder == null) {
            _finder = (ShoppingCouponFinder) PortalBeanLocatorUtil.locate(ShoppingCouponFinder.class.getName());

            ReferenceRegistry.registerReference(ShoppingCouponFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(ShoppingCouponFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(ShoppingCouponFinderUtil.class,
            "_finder");
    }
}
