package com.liferay.portlet.dynamicdatamapping.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the DDMStructureLink service. Represents a row in the &quot;DDMStructureLink&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DDMStructureLinkModel
 * @see com.liferay.portlet.dynamicdatamapping.model.impl.DDMStructureLinkImpl
 * @see com.liferay.portlet.dynamicdatamapping.model.impl.DDMStructureLinkModelImpl
 * @generated
 */
@ProviderType
public interface DDMStructureLink extends DDMStructureLinkModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStructureLinkImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portlet.dynamicdatamapping.model.DDMStructure getStructure()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
