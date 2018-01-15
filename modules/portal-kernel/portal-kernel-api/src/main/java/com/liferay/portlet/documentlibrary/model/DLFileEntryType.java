package com.liferay.portlet.documentlibrary.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the DLFileEntryType service. Represents a row in the &quot;DLFileEntryType&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see DLFileEntryTypeModel
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileEntryTypeImpl
 * @see com.liferay.portlet.documentlibrary.model.impl.DLFileEntryTypeModelImpl
 * @generated
 */
public interface DLFileEntryType extends DLFileEntryTypeModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.documentlibrary.model.impl.DLFileEntryTypeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMStructure> getDDMStructures()
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean isExportable();
}
