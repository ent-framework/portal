package com.liferay.portlet.journal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.model.TreeModel;

/**
 * The extended model interface for the JournalFolder service. Represents a row in the &quot;JournalFolder&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JournalFolderModel
 * @see com.liferay.portlet.journal.model.impl.JournalFolderImpl
 * @see com.liferay.portlet.journal.model.impl.JournalFolderModelImpl
 * @generated
 */
@ProviderType
public interface JournalFolder extends JournalFolderModel, PersistedModel,
    TreeModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.journal.model.impl.JournalFolderImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public static final Accessor<JournalFolder, Long> FOLDER_ID_ACCESSOR = new Accessor<JournalFolder, Long>() {
            @Override
            public Long get(JournalFolder journalFolder) {
                return journalFolder.getFolderId();
            }
        };

    public java.util.List<java.lang.Long> getAncestorFolderIds()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.journal.model.JournalFolder> getAncestors()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.journal.model.JournalFolder getParentFolder()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public boolean isInTrashExplicitly()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isRoot();
}
