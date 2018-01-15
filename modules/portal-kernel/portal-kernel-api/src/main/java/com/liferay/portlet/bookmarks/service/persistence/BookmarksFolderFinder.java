package com.liferay.portlet.bookmarks.service.persistence;

public interface BookmarksFolderFinder {
    public int countF_E_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountF_E_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Object> filterFindBF_E_ByG_F(long groupId,
        long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.bookmarks.model.BookmarksFolder> findByNoAssets()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Object> findF_E_ByG_F(long groupId,
        long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;
}
