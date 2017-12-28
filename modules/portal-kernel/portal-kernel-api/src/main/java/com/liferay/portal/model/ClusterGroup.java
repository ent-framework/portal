package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ClusterGroup service. Represents a row in the &quot;ClusterGroup&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ClusterGroupModel
 * @see com.liferay.portal.model.impl.ClusterGroupImpl
 * @see com.liferay.portal.model.impl.ClusterGroupModelImpl
 * @generated
 */
@ProviderType
public interface ClusterGroup extends ClusterGroupModel, PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.ClusterGroupImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public java.lang.String[] getClusterNodeIdsArray();
}
