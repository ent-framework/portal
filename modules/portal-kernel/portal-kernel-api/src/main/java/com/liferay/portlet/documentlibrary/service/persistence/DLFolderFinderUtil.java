package com.liferay.portlet.documentlibrary.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class DLFolderFinderUtil {
    private static DLFolderFinder _finder;

    public static int countF_FE_FS_ByG_F_M_M(long groupId, long folderId,
        java.lang.String[] mimeTypes, boolean includeMountFolders,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countF_FE_FS_ByG_F_M_M(groupId, folderId, mimeTypes,
            includeMountFolders, queryDefinition);
    }

    public static int countFE_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countFE_ByG_F(groupId, folderId, queryDefinition);
    }

    public static int countFE_FS_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countFE_FS_ByG_F(groupId, folderId, queryDefinition);
    }

    public static int filterCountF_FE_FS_ByG_F_M_M(long groupId, long folderId,
        java.lang.String[] mimeTypes, boolean includeMountFolders,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterCountF_FE_FS_ByG_F_M_M(groupId, folderId, mimeTypes,
            includeMountFolders, queryDefinition);
    }

    public static int filterCountFE_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterCountFE_ByG_F(groupId, folderId, queryDefinition);
    }

    public static int filterCountFE_FS_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterCountFE_FS_ByG_F(groupId, folderId, queryDefinition);
    }

    public static int filterCountFE_FS_ByG_F_M(long groupId, long folderId,
        java.lang.String[] mimeTypes,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterCountFE_FS_ByG_F_M(groupId, folderId, mimeTypes,
            queryDefinition);
    }

    public static java.util.List<java.lang.Object> filterFindF_FE_FS_ByG_F_M_M(
        long groupId, long folderId, java.lang.String[] mimeTypes,
        boolean includeMountFolders,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterFindF_FE_FS_ByG_F_M_M(groupId, folderId, mimeTypes,
            includeMountFolders, queryDefinition);
    }

    public static java.util.List<java.lang.Object> filterFindFE_FS_ByG_F(
        long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterFindFE_FS_ByG_F(groupId, folderId, queryDefinition);
    }

    public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFolder> findF_ByNoAssets()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findF_ByNoAssets();
    }

    public static java.util.List<java.lang.Object> findF_FE_FS_ByG_F_M_M(
        long groupId, long folderId, java.lang.String[] mimeTypes,
        boolean includeMountFolders,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findF_FE_FS_ByG_F_M_M(groupId, folderId, mimeTypes,
            includeMountFolders, queryDefinition);
    }

    public static java.util.List<java.lang.Object> findFE_FS_ByG_F(
        long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findFE_FS_ByG_F(groupId, folderId, queryDefinition);
    }

    public static DLFolderFinder getFinder() {
        if (_finder == null) {
            _finder = (DLFolderFinder) PortalBeanLocatorUtil.locate(DLFolderFinder.class.getName());

            ReferenceRegistry.registerReference(DLFolderFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(DLFolderFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(DLFolderFinderUtil.class, "_finder");
    }
}
