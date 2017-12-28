package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ResourceBlockPermission;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ResourceBlockPermission in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ResourceBlockPermission
 * @generated
 */
public class ResourceBlockPermissionCacheModel implements CacheModel<ResourceBlockPermission>,
    Externalizable {
    public long resourceBlockPermissionId;
    public long resourceBlockId;
    public long roleId;
    public long actionIds;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{resourceBlockPermissionId=");
        sb.append(resourceBlockPermissionId);
        sb.append(", resourceBlockId=");
        sb.append(resourceBlockId);
        sb.append(", roleId=");
        sb.append(roleId);
        sb.append(", actionIds=");
        sb.append(actionIds);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public ResourceBlockPermission toEntityModel() {
        ResourceBlockPermissionImpl resourceBlockPermissionImpl = new ResourceBlockPermissionImpl();

        resourceBlockPermissionImpl.setResourceBlockPermissionId(resourceBlockPermissionId);
        resourceBlockPermissionImpl.setResourceBlockId(resourceBlockId);
        resourceBlockPermissionImpl.setRoleId(roleId);
        resourceBlockPermissionImpl.setActionIds(actionIds);

        resourceBlockPermissionImpl.resetOriginalValues();

        return resourceBlockPermissionImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        resourceBlockPermissionId = objectInput.readLong();
        resourceBlockId = objectInput.readLong();
        roleId = objectInput.readLong();
        actionIds = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(resourceBlockPermissionId);
        objectOutput.writeLong(resourceBlockId);
        objectOutput.writeLong(roleId);
        objectOutput.writeLong(actionIds);
    }
}
