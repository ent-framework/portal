package com.liferay.portlet.documentlibrary.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the DLFileEntryMetadata service. Represents a row in the &quot;DLFileEntryMetadata&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DLFileEntryMetadataModel
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileEntryMetadataImpl
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileEntryMetadataModelImpl
 * @generated
 */
@ProviderType
public interface DLFileEntryMetadata extends DLFileEntryMetadataModel,
    PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.documentlibrary.model.impl.DLFileEntryMetadataImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portlet.dynamicdatamapping.model.DDMStructure getDDMStructure()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.documentlibrary.model.DLFileEntryType getFileEntryType()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.documentlibrary.model.DLFileVersion getFileVersion()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
