package com.liferay.portlet.mobiledevicerules.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the MDRRule service. Represents a row in the &quot;MDRRule&quot; database table, with each column mapped to a property of this class.
 *
 * @author Edward C. Han
 * @see MDRRuleModel
 * @see com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleImpl
 * @see com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleModelImpl
 * @generated
 */
public interface MDRRule extends MDRRuleModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.mobiledevicerules.model.impl.MDRRuleImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.kernel.util.UnicodeProperties getTypeSettingsProperties();

    public void setTypeSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties typeSettingsProperties);
}
