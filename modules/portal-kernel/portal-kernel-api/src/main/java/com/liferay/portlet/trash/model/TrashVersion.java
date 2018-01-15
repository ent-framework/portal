package com.liferay.portlet.trash.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the TrashVersion service. Represents a row in the &quot;TrashVersion&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TrashVersionModel
 * @see com.liferay.portlet.trash.model.impl.TrashVersionImpl
 * @see com.liferay.portlet.trash.model.impl.TrashVersionModelImpl
 * @generated
 */
public interface TrashVersion extends TrashVersionModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portlet.trash.model.impl.TrashVersionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.kernel.util.UnicodeProperties getTypeSettingsProperties();

    public java.lang.String getTypeSettingsProperty(java.lang.String key);

    public java.lang.String getTypeSettingsProperty(java.lang.String key,
        java.lang.String defaultValue);

    public void setTypeSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties typeSettingsProperties);
}
