package com.liferay.portlet.bookmarks.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.bookmarks.model.BookmarksEntry;
import com.liferay.portlet.bookmarks.service.BookmarksEntryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BookmarksEntryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BookmarksEntryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BookmarksEntryLocalServiceUtil.getService());
        setClass(BookmarksEntry.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("entryId");
    }
}
