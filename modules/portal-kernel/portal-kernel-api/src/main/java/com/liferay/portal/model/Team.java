package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.Accessor;
import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the Team service. Represents a row in the &quot;Team&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TeamModel
 * @see com.liferay.portal.model.impl.TeamImpl
 * @see com.liferay.portal.model.impl.TeamModelImpl
 * @generated
 */
@ProviderType
public interface Team extends TeamModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.TeamImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public static final Accessor<Team, Long> TEAM_ID_ACCESSOR = new Accessor<Team, Long>() {
            @Override
            public Long get(Team team) {
                return team.getTeamId();
            }
        };

    public com.liferay.portal.model.Role getRole()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
