package com.liferay.portlet.documentlibrary.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class DLFileEntryTypeFinderUtil {
    private static DLFileEntryTypeFinder _finder;

    public static int countByKeywords(long companyId, long[] groupIds,
        java.lang.String keywords, boolean includeBasicFileEntryType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByKeywords(companyId, groupIds, keywords,
            includeBasicFileEntryType);
    }

    public static int filterCountByKeywords(long companyId, long[] groupIds,
        java.lang.String keywords, boolean includeBasicFileEntryType)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterCountByKeywords(companyId, groupIds, keywords,
            includeBasicFileEntryType);
    }

    public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType> filterFindByKeywords(
        long companyId, long[] groupIds, java.lang.String keywords,
        boolean includeBasicFileEntryType, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterFindByKeywords(companyId, groupIds, keywords,
            includeBasicFileEntryType, start, end, orderByComparator);
    }

    public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType> findByKeywords(
        long companyId, long[] groupIds, java.lang.String keywords,
        boolean includeBasicFileEntryType, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByKeywords(companyId, groupIds, keywords,
            includeBasicFileEntryType, start, end, orderByComparator);
    }

    public static DLFileEntryTypeFinder getFinder() {
        if (_finder == null) {
            _finder = (DLFileEntryTypeFinder) PortalBeanLocatorUtil.locate(DLFileEntryTypeFinder.class.getName());

            ReferenceRegistry.registerReference(DLFileEntryTypeFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(DLFileEntryTypeFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(DLFileEntryTypeFinderUtil.class,
            "_finder");
    }
}
