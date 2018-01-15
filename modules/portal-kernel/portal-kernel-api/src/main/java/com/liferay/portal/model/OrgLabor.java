package com.liferay.portal.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the OrgLabor service. Represents a row in the &quot;OrgLabor&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OrgLaborModel
 * @see com.liferay.portal.model.impl.OrgLaborImpl
 * @see com.liferay.portal.model.impl.OrgLaborModelImpl
 * @generated
 */
public interface OrgLabor extends OrgLaborModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.OrgLaborImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.model.ListType getType()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
