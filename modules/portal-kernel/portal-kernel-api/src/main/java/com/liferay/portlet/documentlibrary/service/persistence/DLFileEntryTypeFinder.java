package com.liferay.portlet.documentlibrary.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface DLFileEntryTypeFinder {
    public int countByKeywords(long companyId, long[] groupIds,
        java.lang.String keywords, boolean includeBasicFileEntryType)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountByKeywords(long companyId, long[] groupIds,
        java.lang.String keywords, boolean includeBasicFileEntryType)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType> filterFindByKeywords(
        long companyId, long[] groupIds, java.lang.String keywords,
        boolean includeBasicFileEntryType, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntryType> findByKeywords(
        long companyId, long[] groupIds, java.lang.String keywords,
        boolean includeBasicFileEntryType, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;
}
