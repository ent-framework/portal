package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceTypePermission;
import com.liferay.portal.service.ResourceTypePermissionLocalServiceUtil;

/**
 * The extended model base implementation for the ResourceTypePermission service. Represents a row in the &quot;ResourceTypePermission&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ResourceTypePermissionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResourceTypePermissionImpl
 * @see com.liferay.portal.model.ResourceTypePermission
 * @generated
 */
public abstract class ResourceTypePermissionBaseImpl
    extends ResourceTypePermissionModelImpl implements ResourceTypePermission {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a resource type permission model instance should use the {@link ResourceTypePermission} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ResourceTypePermissionLocalServiceUtil.addResourceTypePermission(this);
        } else {
            ResourceTypePermissionLocalServiceUtil.updateResourceTypePermission(this);
        }
    }
}
