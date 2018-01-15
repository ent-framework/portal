package com.liferay.portlet.bookmarks.model;

import com.liferay.portal.model.PermissionedModel;
import com.liferay.portal.model.TreeModel;

/**
 * The extended model interface for the BookmarksFolder service. Represents a row in the &quot;BookmarksFolder&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see BookmarksFolderModel
 * @see com.liferay.portlet.bookmarks.model.impl.BookmarksFolderImpl
 * @see com.liferay.portlet.bookmarks.model.impl.BookmarksFolderModelImpl
 * @generated
 */
public interface BookmarksFolder extends BookmarksFolderModel, PermissionedModel,
    TreeModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.bookmarks.model.impl.BookmarksFolderImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.util.List<java.lang.Long> getAncestorFolderIds()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.bookmarks.model.BookmarksFolder> getAncestors()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.bookmarks.model.BookmarksFolder getParentFolder()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public boolean isInTrashExplicitly()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isRoot();
}
