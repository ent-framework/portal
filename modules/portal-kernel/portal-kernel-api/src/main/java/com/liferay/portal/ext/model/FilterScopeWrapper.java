package com.liferay.portal.ext.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FilterScope}.
 * </p>
 *
 * @author Jeff Qian
 * @see FilterScope
 * @generated
 */
public class FilterScopeWrapper implements FilterScope,
    ModelWrapper<FilterScope> {
    private FilterScope _filterScope;

    public FilterScopeWrapper(FilterScope filterScope) {
        _filterScope = filterScope;
    }

    @Override
    public Class<?> getModelClass() {
        return FilterScope.class;
    }

    @Override
    public String getModelClassName() {
        return FilterScope.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("filterScopeId", getFilterScopeId());
        attributes.put("filterName", getFilterName());
        attributes.put("className", getClassName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long filterScopeId = (Long) attributes.get("filterScopeId");

        if (filterScopeId != null) {
            setFilterScopeId(filterScopeId);
        }

        String filterName = (String) attributes.get("filterName");

        if (filterName != null) {
            setFilterName(filterName);
        }

        String className = (String) attributes.get("className");

        if (className != null) {
            setClassName(className);
        }
    }

    /**
    * Returns the primary key of this filter scope.
    *
    * @return the primary key of this filter scope
    */
    @Override
    public long getPrimaryKey() {
        return _filterScope.getPrimaryKey();
    }

    /**
    * Sets the primary key of this filter scope.
    *
    * @param primaryKey the primary key of this filter scope
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _filterScope.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the filter scope ID of this filter scope.
    *
    * @return the filter scope ID of this filter scope
    */
    @Override
    public long getFilterScopeId() {
        return _filterScope.getFilterScopeId();
    }

    /**
    * Sets the filter scope ID of this filter scope.
    *
    * @param filterScopeId the filter scope ID of this filter scope
    */
    @Override
    public void setFilterScopeId(java.lang.Long filterScopeId) {
        _filterScope.setFilterScopeId(filterScopeId);
    }

    /**
    * Returns the filter name of this filter scope.
    *
    * @return the filter name of this filter scope
    */
    @Override
    public java.lang.String getFilterName() {
        return _filterScope.getFilterName();
    }

    /**
    * Sets the filter name of this filter scope.
    *
    * @param filterName the filter name of this filter scope
    */
    @Override
    public void setFilterName(java.lang.String filterName) {
        _filterScope.setFilterName(filterName);
    }

    /**
    * Returns the class name of this filter scope.
    *
    * @return the class name of this filter scope
    */
    @Override
    public java.lang.String getClassName() {
        return _filterScope.getClassName();
    }

    /**
    * Sets the class name of this filter scope.
    *
    * @param className the class name of this filter scope
    */
    @Override
    public void setClassName(java.lang.String className) {
        _filterScope.setClassName(className);
    }

    @Override
    public boolean isNew() {
        return _filterScope.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _filterScope.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _filterScope.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _filterScope.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _filterScope.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _filterScope.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _filterScope.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _filterScope.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _filterScope.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _filterScope.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _filterScope.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FilterScopeWrapper((FilterScope) _filterScope.clone());
    }

    @Override
    public int compareTo(com.liferay.portal.ext.model.FilterScope filterScope) {
        return _filterScope.compareTo(filterScope);
    }

    @Override
    public int hashCode() {
        return _filterScope.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.portal.ext.model.FilterScope> toCacheModel() {
        return _filterScope.toCacheModel();
    }

    @Override
    public com.liferay.portal.ext.model.FilterScope toEscapedModel() {
        return new FilterScopeWrapper(_filterScope.toEscapedModel());
    }

    @Override
    public com.liferay.portal.ext.model.FilterScope toUnescapedModel() {
        return new FilterScopeWrapper(_filterScope.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _filterScope.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _filterScope.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _filterScope.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FilterScopeWrapper)) {
            return false;
        }

        FilterScopeWrapper filterScopeWrapper = (FilterScopeWrapper) obj;

        if (Validator.equals(_filterScope, filterScopeWrapper._filterScope)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public FilterScope getWrappedFilterScope() {
        return _filterScope;
    }

    @Override
    public FilterScope getWrappedModel() {
        return _filterScope;
    }

    @Override
    public void resetOriginalValues() {
        _filterScope.resetOriginalValues();
    }
}
