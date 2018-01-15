package com.liferay.portlet.bookmarks.model;

import com.liferay.portal.model.PermissionedModel;
import com.liferay.portal.model.TreeModel;

/**
 * The extended model interface for the BookmarksEntry service. Represents a row in the &quot;BookmarksEntry&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see BookmarksEntryModel
 * @see com.liferay.portlet.bookmarks.model.impl.BookmarksEntryImpl
 * @see com.liferay.portlet.bookmarks.model.impl.BookmarksEntryModelImpl
 * @generated
 */
public interface BookmarksEntry extends BookmarksEntryModel, PermissionedModel,
    TreeModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.bookmarks.model.impl.BookmarksEntryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    @Override
    public java.lang.String buildTreePath()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.bookmarks.model.BookmarksFolder getFolder()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public boolean isInTrashExplicitly()
        throws com.liferay.portal.kernel.exception.SystemException;
}
