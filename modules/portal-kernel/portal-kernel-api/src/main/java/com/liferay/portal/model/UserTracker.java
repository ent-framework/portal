package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the UserTracker service. Represents a row in the &quot;UserTracker&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see UserTrackerModel
 * @see com.liferay.portal.model.impl.UserTrackerImpl
 * @see com.liferay.portal.model.impl.UserTrackerModelImpl
 * @generated
 */
@ProviderType
public interface UserTracker extends UserTrackerModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.UserTrackerImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public void addPath(com.liferay.portal.model.UserTrackerPath path);

    public java.lang.String getEmailAddress();

    public java.lang.String getFullName();

    public int getHits();

    public java.util.List<com.liferay.portal.model.UserTrackerPath> getPaths();
}
