package com.liferay.portlet.documentlibrary.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class DLFileRankFinderUtil {
    private static DLFileRankFinder _finder;

    public static java.util.List<java.lang.Object[]> findByStaleRanks(int count)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByStaleRanks(count);
    }

    public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileRank> findByFolderId(
        long folderId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByFolderId(folderId);
    }

    public static DLFileRankFinder getFinder() {
        if (_finder == null) {
            _finder = (DLFileRankFinder) PortalBeanLocatorUtil.locate(DLFileRankFinder.class.getName());

            ReferenceRegistry.registerReference(DLFileRankFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(DLFileRankFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(DLFileRankFinderUtil.class,
            "_finder");
    }
}
