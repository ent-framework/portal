package com.liferay.portlet.ratings.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class RatingsStatsFinderUtil {
    private static RatingsStatsFinder _finder;

    public static java.util.List<com.liferay.portlet.ratings.model.RatingsStats> findByC_C(
        long classNameId, java.util.List<java.lang.Long> classPKs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByC_C(classNameId, classPKs);
    }

    public static RatingsStatsFinder getFinder() {
        if (_finder == null) {
            _finder = (RatingsStatsFinder) PortalBeanLocatorUtil.locate(RatingsStatsFinder.class.getName());

            ReferenceRegistry.registerReference(RatingsStatsFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(RatingsStatsFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(RatingsStatsFinderUtil.class,
            "_finder");
    }
}
