package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class PasswordPolicyFinderUtil {
    private static PasswordPolicyFinder _finder;

    public static int countByC_N(long companyId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByC_N(companyId, name);
    }

    public static java.util.List<com.liferay.portal.model.PasswordPolicy> findByC_N(
        long companyId, java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByC_N(companyId, name, start, end, obc);
    }

    public static PasswordPolicyFinder getFinder() {
        if (_finder == null) {
            _finder = (PasswordPolicyFinder) PortalBeanLocatorUtil.locate(PasswordPolicyFinder.class.getName());

            ReferenceRegistry.registerReference(PasswordPolicyFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(PasswordPolicyFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(PasswordPolicyFinderUtil.class,
            "_finder");
    }
}
