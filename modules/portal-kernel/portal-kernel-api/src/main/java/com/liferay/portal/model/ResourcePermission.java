package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ResourcePermission service. Represents a row in the &quot;ResourcePermission&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ResourcePermissionModel
 * @see com.liferay.portal.model.impl.ResourcePermissionImpl
 * @see com.liferay.portal.model.impl.ResourcePermissionModelImpl
 * @generated
 */
@ProviderType
public interface ResourcePermission extends ResourcePermissionModel,
    PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.ResourcePermissionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public void addResourceAction(java.lang.String actionId)
        throws com.liferay.portal.kernel.exception.PortalException;

    public boolean hasActionId(java.lang.String actionId);

    public void removeResourceAction(java.lang.String actionId)
        throws com.liferay.portal.kernel.exception.PortalException;
}
