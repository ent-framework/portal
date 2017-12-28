package com.liferay.portlet.bookmarks.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.bookmarks.model.BookmarksFolder;
import com.liferay.portlet.bookmarks.service.BookmarksFolderLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BookmarksFolderActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BookmarksFolderActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BookmarksFolderLocalServiceUtil.getService());
        setClass(BookmarksFolder.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("folderId");
    }
}
