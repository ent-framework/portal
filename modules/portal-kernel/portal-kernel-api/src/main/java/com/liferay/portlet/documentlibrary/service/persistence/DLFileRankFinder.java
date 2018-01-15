package com.liferay.portlet.documentlibrary.service.persistence;

public interface DLFileRankFinder {
    public java.util.List<java.lang.Object[]> findByStaleRanks(int count)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileRank> findByFolderId(
        long folderId)
        throws com.liferay.portal.kernel.exception.SystemException;
}
