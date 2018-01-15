package com.liferay.portal.model;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Role service. Represents a row in the &quot;Role_&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RoleModel
 * @see com.liferay.portal.model.impl.RoleImpl
 * @see com.liferay.portal.model.impl.RoleModelImpl
 * @generated
 */
public interface Role extends RoleModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.RoleImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public static final Accessor<Role, Long> ROLE_ID_ACCESSOR = new Accessor<Role, Long>() {
            @Override
            public Long get(Role role) {
                return role.getRoleId();
            }
        };

    public static final Accessor<Role, String> NAME_ACCESSOR = new Accessor<Role, String>() {
            @Override
            public String get(Role role) {
                return role.getName();
            }
        };

    public java.lang.String getDescriptiveName()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getTypeLabel();

    public boolean isTeam();
}
