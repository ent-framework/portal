package com.liferay.portlet.dynamicdatamapping.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the DDMStorageLink service. Represents a row in the &quot;DDMStorageLink&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DDMStorageLinkModel
 * @see com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkImpl
 * @see com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl
 * @generated
 */
public interface DDMStorageLink extends DDMStorageLinkModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.String getStorageType()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.dynamicdatamapping.model.DDMStructure getStructure()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
