package com.liferay.portlet.softwarecatalog.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the SCProductEntry service. Represents a row in the &quot;SCProductEntry&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SCProductEntryModel
 * @see com.liferay.portlet.softwarecatalog.model.impl.SCProductEntryImpl
 * @see com.liferay.portlet.softwarecatalog.model.impl.SCProductEntryModelImpl
 * @generated
 */
@ProviderType
public interface SCProductEntry extends SCProductEntryModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.softwarecatalog.model.impl.SCProductEntryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portlet.softwarecatalog.model.SCProductVersion getLatestVersion()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.softwarecatalog.model.SCLicense> getLicenses()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.softwarecatalog.model.SCProductScreenshot> getScreenshots()
        throws com.liferay.portal.kernel.exception.SystemException;
}
