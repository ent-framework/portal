package com.liferay.portlet.bookmarks.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class BookmarksFolderFinderUtil {
    private static BookmarksFolderFinder _finder;

    public static int countF_E_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countF_E_ByG_F(groupId, folderId, queryDefinition);
    }

    public static int filterCountF_E_ByG_F(long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterCountF_E_ByG_F(groupId, folderId, queryDefinition);
    }

    public static java.util.List<java.lang.Object> filterFindBF_E_ByG_F(
        long groupId, long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .filterFindBF_E_ByG_F(groupId, folderId, queryDefinition);
    }

    public static java.util.List<com.liferay.portlet.bookmarks.model.BookmarksFolder> findByNoAssets()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByNoAssets();
    }

    public static java.util.List<java.lang.Object> findF_E_ByG_F(long groupId,
        long folderId,
        com.liferay.portal.kernel.dao.orm.QueryDefinition queryDefinition)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findF_E_ByG_F(groupId, folderId, queryDefinition);
    }

    public static BookmarksFolderFinder getFinder() {
        if (_finder == null) {
            _finder = (BookmarksFolderFinder) PortalBeanLocatorUtil.locate(BookmarksFolderFinder.class.getName());

            ReferenceRegistry.registerReference(BookmarksFolderFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(BookmarksFolderFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(BookmarksFolderFinderUtil.class,
            "_finder");
    }
}
