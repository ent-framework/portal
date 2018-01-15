package com.liferay.portal.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the ResourceTypePermission service. Represents a row in the &quot;ResourceTypePermission&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ResourceTypePermissionModel
 * @see com.liferay.portal.model.impl.ResourceTypePermissionImpl
 * @see com.liferay.portal.model.impl.ResourceTypePermissionModelImpl
 * @generated
 */
public interface ResourceTypePermission extends ResourceTypePermissionModel,
    PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.liferay.portal.model.impl.ResourceTypePermissionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public boolean isCompanyScope();

    public boolean isGroupScope();
}
