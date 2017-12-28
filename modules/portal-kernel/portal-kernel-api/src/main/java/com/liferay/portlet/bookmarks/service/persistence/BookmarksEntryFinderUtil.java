package com.liferay.portlet.bookmarks.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class BookmarksEntryFinderUtil {
    private static BookmarksEntryFinder _finder;

    public static java.util.List<com.liferay.portlet.bookmarks.model.BookmarksEntry> findByNoAssets()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByNoAssets();
    }

    public static BookmarksEntryFinder getFinder() {
        if (_finder == null) {
            _finder = (BookmarksEntryFinder) PortalBeanLocatorUtil.locate(BookmarksEntryFinder.class.getName());

            ReferenceRegistry.registerReference(BookmarksEntryFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(BookmarksEntryFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(BookmarksEntryFinderUtil.class,
            "_finder");
    }
}
