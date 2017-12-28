package com.liferay.portlet.journal.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface JournalFeedFinder {
    public int countByKeywords(long companyId, long groupId,
        java.lang.String keywords)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_G_F_N_D(long companyId, long groupId,
        java.lang.String feedId, java.lang.String name,
        java.lang.String description, boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_G_F_N_D(long companyId, long groupId,
        java.lang.String[] feedIds, java.lang.String[] names,
        java.lang.String[] descriptions, boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.journal.model.JournalFeed> findByKeywords(
        long companyId, long groupId, java.lang.String keywords, int start,
        int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.journal.model.JournalFeed> findByC_G_F_N_D(
        long companyId, long groupId, java.lang.String feedId,
        java.lang.String name, java.lang.String description,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.journal.model.JournalFeed> findByC_G_F_N_D(
        long companyId, long groupId, java.lang.String[] feedIds,
        java.lang.String[] names, java.lang.String[] descriptions,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;
}
