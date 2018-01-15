package com.liferay.portlet.expando.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ExpandoColumn service. Represents a row in the &quot;ExpandoColumn&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ExpandoColumnModel
 * @see com.liferay.portlet.expando.model.impl.ExpandoColumnImpl
 * @see com.liferay.portlet.expando.model.impl.ExpandoColumnModelImpl
 * @generated
 */
public interface ExpandoColumn extends ExpandoColumnModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.expando.model.impl.ExpandoColumnImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.io.Serializable getDefaultValue();

    public java.lang.String getDisplayName(java.util.Locale locale);

    public com.liferay.portal.kernel.util.UnicodeProperties getTypeSettingsProperties();

    public void setTypeSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties typeSettingsProperties);
}
