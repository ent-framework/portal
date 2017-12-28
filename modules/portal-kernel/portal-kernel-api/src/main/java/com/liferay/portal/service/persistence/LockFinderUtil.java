package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class LockFinderUtil {
    private static LockFinder _finder;

    public static com.liferay.portal.model.Lock fetchByC_K(
        java.lang.String className, java.lang.String key,
        com.liferay.portal.kernel.dao.orm.LockMode lockMode)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().fetchByC_K(className, key, lockMode);
    }

    public static LockFinder getFinder() {
        if (_finder == null) {
            _finder = (LockFinder) PortalBeanLocatorUtil.locate(LockFinder.class.getName());

            ReferenceRegistry.registerReference(LockFinderUtil.class, "_finder");
        }

        return _finder;
    }

    public void setFinder(LockFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(LockFinderUtil.class, "_finder");
    }
}
