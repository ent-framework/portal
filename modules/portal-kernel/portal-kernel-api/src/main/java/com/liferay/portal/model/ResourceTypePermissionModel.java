package com.liferay.portal.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ResourceTypePermission service. Represents a row in the &quot;ResourceTypePermission&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.model.impl.ResourceTypePermissionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.model.impl.ResourceTypePermissionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ResourceTypePermission
 * @see com.liferay.portal.model.impl.ResourceTypePermissionImpl
 * @see com.liferay.portal.model.impl.ResourceTypePermissionModelImpl
 * @generated
 */
@ProviderType
public interface ResourceTypePermissionModel extends BaseModel<ResourceTypePermission> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a resource type permission model instance should use the {@link ResourceTypePermission} interface instead.
     */

    /**
     * Returns the primary key of this resource type permission.
     *
     * @return the primary key of this resource type permission
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this resource type permission.
     *
     * @param primaryKey the primary key of this resource type permission
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the resource type permission ID of this resource type permission.
     *
     * @return the resource type permission ID of this resource type permission
     */
    public long getResourceTypePermissionId();

    /**
     * Sets the resource type permission ID of this resource type permission.
     *
     * @param resourceTypePermissionId the resource type permission ID of this resource type permission
     */
    public void setResourceTypePermissionId(Long resourceTypePermissionId);

    /**
     * Returns the company ID of this resource type permission.
     *
     * @return the company ID of this resource type permission
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this resource type permission.
     *
     * @param companyId the company ID of this resource type permission
     */
    public void setCompanyId(Long companyId);

    /**
     * Returns the group ID of this resource type permission.
     *
     * @return the group ID of this resource type permission
     */
    public long getGroupId();

    /**
     * Sets the group ID of this resource type permission.
     *
     * @param groupId the group ID of this resource type permission
     */
    public void setGroupId(Long groupId);

    /**
     * Returns the name of this resource type permission.
     *
     * @return the name of this resource type permission
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this resource type permission.
     *
     * @param name the name of this resource type permission
     */
    public void setName(String name);

    /**
     * Returns the role ID of this resource type permission.
     *
     * @return the role ID of this resource type permission
     */
    public long getRoleId();

    /**
     * Sets the role ID of this resource type permission.
     *
     * @param roleId the role ID of this resource type permission
     */
    public void setRoleId(Long roleId);

    /**
     * Returns the action IDs of this resource type permission.
     *
     * @return the action IDs of this resource type permission
     */
    public long getActionIds();

    /**
     * Sets the action IDs of this resource type permission.
     *
     * @param actionIds the action IDs of this resource type permission
     */
    public void setActionIds(Long actionIds);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        com.liferay.portal.model.ResourceTypePermission resourceTypePermission);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.liferay.portal.model.ResourceTypePermission> toCacheModel();

    @Override
    public com.liferay.portal.model.ResourceTypePermission toEscapedModel();

    @Override
    public com.liferay.portal.model.ResourceTypePermission toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
