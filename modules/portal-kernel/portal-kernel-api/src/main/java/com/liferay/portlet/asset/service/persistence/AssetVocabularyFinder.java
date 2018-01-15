package com.liferay.portlet.asset.service.persistence;

public interface AssetVocabularyFinder {
    public int countByG_N(long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountByG_N(long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetVocabulary> filterFindByG_N(
        long groupId, java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetVocabulary> findByG_N(
        long groupId, java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;
}
