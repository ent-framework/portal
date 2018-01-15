package com.liferay.portlet.journal.service.persistence;

public interface JournalFolderFinder {
    public int countF_A_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountF_A_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Object> filterFindF_A_ByG_F(long groupId,
        long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.journal.model.JournalFolder> findF_ByNoAssets()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Object> findF_A_ByG_F(long groupId,
        long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;
}
