package com.liferay.portlet.mobiledevicerules.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the MDRAction service. Represents a row in the &quot;MDRAction&quot; database table, with each column mapped to a property of this class.
 *
 * @author Edward C. Han
 * @see MDRActionModel
 * @see com.liferay.portlet.mobiledevicerules.model.impl.MDRActionImpl
 * @see com.liferay.portlet.mobiledevicerules.model.impl.MDRActionModelImpl
 * @generated
 */
@ProviderType
public interface MDRAction extends MDRActionModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.mobiledevicerules.model.impl.MDRActionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.kernel.util.UnicodeProperties getTypeSettingsProperties();

    public void setTypeSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties typeSettingsProperties);
}
