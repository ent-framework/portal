package com.liferay.portlet.documentlibrary.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface DLFolderFinder {
    public int countF_FE_FS_ByG_F_M_M(long groupId, long folderId,
        java.lang.String[] mimeTypes, boolean includeMountFolders,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countFE_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countFE_FS_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountF_FE_FS_ByG_F_M_M(long groupId, long folderId,
        java.lang.String[] mimeTypes, boolean includeMountFolders,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountFE_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountFE_FS_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountFE_FS_ByG_F_M(long groupId, long folderId,
        java.lang.String[] mimeTypes,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Object> filterFindF_FE_FS_ByG_F_M_M(
        long groupId, long folderId, java.lang.String[] mimeTypes,
        boolean includeMountFolders,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Object> filterFindFE_FS_ByG_F(
        long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFolder> findF_ByNoAssets()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Object> findF_FE_FS_ByG_F_M_M(
        long groupId, long folderId, java.lang.String[] mimeTypes,
        boolean includeMountFolders,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Object> findFE_FS_ByG_F(long groupId,
        long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException;
}
