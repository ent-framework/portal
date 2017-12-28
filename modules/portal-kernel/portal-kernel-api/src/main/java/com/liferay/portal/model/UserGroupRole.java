package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the UserGroupRole service. Represents a row in the &quot;UserGroupRole&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see UserGroupRoleModel
 * @see com.liferay.portal.model.impl.UserGroupRoleImpl
 * @see com.liferay.portal.model.impl.UserGroupRoleModelImpl
 * @generated
 */
@ProviderType
public interface UserGroupRole extends UserGroupRoleModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.UserGroupRoleImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public static final Accessor<UserGroupRole, Long> GROUP_ID_ACCESSOR = new Accessor<UserGroupRole, Long>() {
            @Override
            public Long get(UserGroupRole userGroupRole) {
                return userGroupRole.getGroupId();
            }
        };

    public static final Accessor<UserGroupRole, Long> ROLE_ID_ACCESSOR = new Accessor<UserGroupRole, Long>() {
            @Override
            public Long get(UserGroupRole userGroupRole) {
                return userGroupRole.getRoleId();
            }
        };

    public com.liferay.portal.model.Group getGroup()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.Role getRole()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.User getUser()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
