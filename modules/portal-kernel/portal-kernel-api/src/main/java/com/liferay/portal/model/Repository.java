package com.liferay.portal.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Repository service. Represents a row in the &quot;Repository&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RepositoryModel
 * @see com.liferay.portal.model.impl.RepositoryImpl
 * @see com.liferay.portal.model.impl.RepositoryModelImpl
 * @generated
 */
public interface Repository extends RepositoryModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.RepositoryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.kernel.util.UnicodeProperties getTypeSettingsProperties();

    public void setTypeSettingsProperties(
        com.liferay.portal.kernel.util.UnicodeProperties typeSettingsProperties);
}
