package com.liferay.portal.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Address service. Represents a row in the &quot;Address&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AddressModel
 * @see com.liferay.portal.model.impl.AddressImpl
 * @see com.liferay.portal.model.impl.AddressModelImpl
 * @generated
 */
public interface Address extends AddressModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.AddressImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.model.Country getCountry();

    public com.liferay.portal.model.Region getRegion();

    public com.liferay.portal.model.ListType getType();
}
