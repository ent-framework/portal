package com.liferay.portlet.documentlibrary.model;

import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.TreeModel;

/**
 * The extended model interface for the DLFileShortcut service. Represents a row in the &quot;DLFileShortcut&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DLFileShortcutModel
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileShortcutImpl
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileShortcutModelImpl
 * @generated
 */
public interface DLFileShortcut extends DLFileShortcutModel, PersistedModel,
    TreeModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.documentlibrary.model.impl.DLFileShortcutImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    @Override
    public java.lang.String buildTreePath()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.documentlibrary.model.DLFolder getDLFolder()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.repository.model.Folder getFolder()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getToTitle();

    public boolean isInHiddenFolder();

    public boolean isInTrashExplicitly()
        throws com.liferay.portal.kernel.exception.SystemException;
}
