package com.liferay.portal.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the EmailAddress service. Represents a row in the &quot;EmailAddress&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see EmailAddressModel
 * @see com.liferay.portal.model.impl.EmailAddressImpl
 * @see com.liferay.portal.model.impl.EmailAddressModelImpl
 * @generated
 */
public interface EmailAddress extends EmailAddressModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.EmailAddressImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.model.ListType getType()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
