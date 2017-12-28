package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the LayoutSetPrototype service. Represents a row in the &quot;LayoutSetPrototype&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see LayoutSetPrototypeModel
 * @see com.liferay.portal.model.impl.LayoutSetPrototypeImpl
 * @see com.liferay.portal.model.impl.LayoutSetPrototypeModelImpl
 * @generated
 */
@ProviderType
public interface LayoutSetPrototype extends LayoutSetPrototypeModel,
    PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.LayoutSetPrototypeImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.model.Group getGroup()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public long getGroupId()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.LayoutSet getLayoutSet()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.util.UnicodeProperties getSettingsProperties();

    public java.lang.String getSettingsProperty(java.lang.String key);

    public void setSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties settingsProperties);
}
