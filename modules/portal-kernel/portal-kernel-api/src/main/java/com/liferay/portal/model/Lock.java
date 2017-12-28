package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Lock service. Represents a row in the &quot;Lock_&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see LockModel
 * @see com.liferay.portal.model.impl.LockImpl
 * @see com.liferay.portal.model.impl.LockModelImpl
 * @generated
 */
@ProviderType
public interface Lock extends LockModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.LockImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public long getExpirationTime();

    public boolean isExpired();

    public boolean isNeverExpires();
}
