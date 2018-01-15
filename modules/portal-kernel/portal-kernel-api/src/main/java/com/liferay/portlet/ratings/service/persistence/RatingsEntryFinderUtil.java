package com.liferay.portlet.ratings.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class RatingsEntryFinderUtil {
    private static RatingsEntryFinder _finder;

    public static java.util.List<com.liferay.portlet.ratings.model.RatingsEntry> findByU_C_C(
        long userId, long classNameId, java.util.List<java.lang.Long> classPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByU_C_C(userId, classNameId, classPKs);
    }

    public static RatingsEntryFinder getFinder() {
        if (_finder == null) {
            _finder = (RatingsEntryFinder) PortalBeanLocatorUtil.locate(RatingsEntryFinder.class.getName());

            ReferenceRegistry.registerReference(RatingsEntryFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(RatingsEntryFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(RatingsEntryFinderUtil.class,
            "_finder");
    }
}
