package com.liferay.portal.ext.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FilterGroup}.
 * </p>
 *
 * @author Jeff Qian
 * @see FilterGroup
 * @generated
 */
@ProviderType
public class FilterGroupWrapper implements FilterGroup,
    ModelWrapper<FilterGroup> {
    private FilterGroup _filterGroup;

    public FilterGroupWrapper(FilterGroup filterGroup) {
        _filterGroup = filterGroup;
    }

    @Override
    public Class<?> getModelClass() {
        return FilterGroup.class;
    }

    @Override
    public String getModelClassName() {
        return FilterGroup.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("filterGroupId", getFilterGroupId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("groupId", getGroupId());
        attributes.put("filterScopeId", getFilterScopeId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long filterGroupId = (Long) attributes.get("filterGroupId");

        if (filterGroupId != null) {
            setFilterGroupId(filterGroupId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long filterScopeId = (Long) attributes.get("filterScopeId");

        if (filterScopeId != null) {
            setFilterScopeId(filterScopeId);
        }
    }

    /**
    * Returns the primary key of this filter group.
    *
    * @return the primary key of this filter group
    */
    @Override
    public long getPrimaryKey() {
        return _filterGroup.getPrimaryKey();
    }

    /**
    * Sets the primary key of this filter group.
    *
    * @param primaryKey the primary key of this filter group
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _filterGroup.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this filter group.
    *
    * @return the uuid of this filter group
    */
    @Override
    public java.lang.String getUuid() {
        return _filterGroup.getUuid();
    }

    /**
    * Sets the uuid of this filter group.
    *
    * @param uuid the uuid of this filter group
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _filterGroup.setUuid(uuid);
    }

    /**
    * Returns the filter group ID of this filter group.
    *
    * @return the filter group ID of this filter group
    */
    @Override
    public long getFilterGroupId() {
        return _filterGroup.getFilterGroupId();
    }

    /**
    * Sets the filter group ID of this filter group.
    *
    * @param filterGroupId the filter group ID of this filter group
    */
    @Override
    public void setFilterGroupId(long filterGroupId) {
        _filterGroup.setFilterGroupId(filterGroupId);
    }

    /**
    * Returns the user ID of this filter group.
    *
    * @return the user ID of this filter group
    */
    @Override
    public long getUserId() {
        return _filterGroup.getUserId();
    }

    /**
    * Sets the user ID of this filter group.
    *
    * @param userId the user ID of this filter group
    */
    @Override
    public void setUserId(long userId) {
        _filterGroup.setUserId(userId);
    }

    /**
    * Returns the user uuid of this filter group.
    *
    * @return the user uuid of this filter group
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _filterGroup.getUserUuid();
    }

    /**
    * Sets the user uuid of this filter group.
    *
    * @param userUuid the user uuid of this filter group
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _filterGroup.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this filter group.
    *
    * @return the user name of this filter group
    */
    @Override
    public java.lang.String getUserName() {
        return _filterGroup.getUserName();
    }

    /**
    * Sets the user name of this filter group.
    *
    * @param userName the user name of this filter group
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _filterGroup.setUserName(userName);
    }

    /**
    * Returns the create date of this filter group.
    *
    * @return the create date of this filter group
    */
    @Override
    public java.util.Date getCreateDate() {
        return _filterGroup.getCreateDate();
    }

    /**
    * Sets the create date of this filter group.
    *
    * @param createDate the create date of this filter group
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _filterGroup.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this filter group.
    *
    * @return the modified date of this filter group
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _filterGroup.getModifiedDate();
    }

    /**
    * Sets the modified date of this filter group.
    *
    * @param modifiedDate the modified date of this filter group
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _filterGroup.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the group ID of this filter group.
    *
    * @return the group ID of this filter group
    */
    @Override
    public long getGroupId() {
        return _filterGroup.getGroupId();
    }

    /**
    * Sets the group ID of this filter group.
    *
    * @param groupId the group ID of this filter group
    */
    @Override
    public void setGroupId(long groupId) {
        _filterGroup.setGroupId(groupId);
    }

    /**
    * Returns the filter scope ID of this filter group.
    *
    * @return the filter scope ID of this filter group
    */
    @Override
    public long getFilterScopeId() {
        return _filterGroup.getFilterScopeId();
    }

    /**
    * Sets the filter scope ID of this filter group.
    *
    * @param filterScopeId the filter scope ID of this filter group
    */
    @Override
    public void setFilterScopeId(long filterScopeId) {
        _filterGroup.setFilterScopeId(filterScopeId);
    }

    @Override
    public boolean isNew() {
        return _filterGroup.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _filterGroup.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _filterGroup.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _filterGroup.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _filterGroup.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _filterGroup.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _filterGroup.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _filterGroup.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _filterGroup.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _filterGroup.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _filterGroup.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FilterGroupWrapper((FilterGroup) _filterGroup.clone());
    }

    @Override
    public int compareTo(com.liferay.portal.ext.model.FilterGroup filterGroup) {
        return _filterGroup.compareTo(filterGroup);
    }

    @Override
    public int hashCode() {
        return _filterGroup.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.portal.ext.model.FilterGroup> toCacheModel() {
        return _filterGroup.toCacheModel();
    }

    @Override
    public com.liferay.portal.ext.model.FilterGroup toEscapedModel() {
        return new FilterGroupWrapper(_filterGroup.toEscapedModel());
    }

    @Override
    public com.liferay.portal.ext.model.FilterGroup toUnescapedModel() {
        return new FilterGroupWrapper(_filterGroup.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _filterGroup.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _filterGroup.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _filterGroup.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FilterGroupWrapper)) {
            return false;
        }

        FilterGroupWrapper filterGroupWrapper = (FilterGroupWrapper) obj;

        if (Validator.equals(_filterGroup, filterGroupWrapper._filterGroup)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public FilterGroup getWrappedFilterGroup() {
        return _filterGroup;
    }

    @Override
    public FilterGroup getWrappedModel() {
        return _filterGroup;
    }

    @Override
    public void resetOriginalValues() {
        _filterGroup.resetOriginalValues();
    }
}
