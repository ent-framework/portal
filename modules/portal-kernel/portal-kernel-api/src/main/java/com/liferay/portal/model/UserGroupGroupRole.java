package com.liferay.portal.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the UserGroupGroupRole service. Represents a row in the &quot;UserGroupGroupRole&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see UserGroupGroupRoleModel
 * @see com.liferay.portal.model.impl.UserGroupGroupRoleImpl
 * @see com.liferay.portal.model.impl.UserGroupGroupRoleModelImpl
 * @generated
 */
public interface UserGroupGroupRole extends UserGroupGroupRoleModel,
    PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.UserGroupGroupRoleImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.liferay.portal.model.Group getGroup()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.Role getRole()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.UserGroup getUserGroup()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
