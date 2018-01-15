package com.liferay.mail.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CyrusVirtual}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CyrusVirtual
 * @generated
 */
public class CyrusVirtualWrapper implements CyrusVirtual,
    ModelWrapper<CyrusVirtual> {
    private CyrusVirtual _cyrusVirtual;

    public CyrusVirtualWrapper(CyrusVirtual cyrusVirtual) {
        _cyrusVirtual = cyrusVirtual;
    }

    @Override
    public Class<?> getModelClass() {
        return CyrusVirtual.class;
    }

    @Override
    public String getModelClassName() {
        return CyrusVirtual.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("emailAddress", getEmailAddress());
        attributes.put("userId", getUserId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String emailAddress = (String) attributes.get("emailAddress");

        if (emailAddress != null) {
            setEmailAddress(emailAddress);
        }

        String userId = (String) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }
    }

    /**
    * Returns the primary key of this cyrus virtual.
    *
    * @return the primary key of this cyrus virtual
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _cyrusVirtual.getPrimaryKey();
    }

    /**
    * Sets the primary key of this cyrus virtual.
    *
    * @param primaryKey the primary key of this cyrus virtual
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _cyrusVirtual.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the email address of this cyrus virtual.
    *
    * @return the email address of this cyrus virtual
    */
    @Override
    public java.lang.String getEmailAddress() {
        return _cyrusVirtual.getEmailAddress();
    }

    /**
    * Sets the email address of this cyrus virtual.
    *
    * @param emailAddress the email address of this cyrus virtual
    */
    @Override
    public void setEmailAddress(java.lang.String emailAddress) {
        _cyrusVirtual.setEmailAddress(emailAddress);
    }

    /**
    * Returns the user ID of this cyrus virtual.
    *
    * @return the user ID of this cyrus virtual
    */
    @Override
    public java.lang.String getUserId() {
        return _cyrusVirtual.getUserId();
    }

    /**
    * Sets the user ID of this cyrus virtual.
    *
    * @param userId the user ID of this cyrus virtual
    */
    @Override
    public void setUserId(java.lang.String userId) {
        _cyrusVirtual.setUserId(userId);
    }

    @Override
    public boolean isNew() {
        return _cyrusVirtual.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _cyrusVirtual.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _cyrusVirtual.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _cyrusVirtual.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _cyrusVirtual.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _cyrusVirtual.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _cyrusVirtual.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _cyrusVirtual.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _cyrusVirtual.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _cyrusVirtual.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _cyrusVirtual.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CyrusVirtualWrapper((CyrusVirtual) _cyrusVirtual.clone());
    }

    @Override
    public int compareTo(com.liferay.mail.model.CyrusVirtual cyrusVirtual) {
        return _cyrusVirtual.compareTo(cyrusVirtual);
    }

    @Override
    public int hashCode() {
        return _cyrusVirtual.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.mail.model.CyrusVirtual> toCacheModel() {
        return _cyrusVirtual.toCacheModel();
    }

    @Override
    public com.liferay.mail.model.CyrusVirtual toEscapedModel() {
        return new CyrusVirtualWrapper(_cyrusVirtual.toEscapedModel());
    }

    @Override
    public com.liferay.mail.model.CyrusVirtual toUnescapedModel() {
        return new CyrusVirtualWrapper(_cyrusVirtual.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _cyrusVirtual.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _cyrusVirtual.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _cyrusVirtual.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CyrusVirtualWrapper)) {
            return false;
        }

        CyrusVirtualWrapper cyrusVirtualWrapper = (CyrusVirtualWrapper) obj;

        if (Validator.equals(_cyrusVirtual, cyrusVirtualWrapper._cyrusVirtual)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public CyrusVirtual getWrappedCyrusVirtual() {
        return _cyrusVirtual;
    }

    @Override
    public CyrusVirtual getWrappedModel() {
        return _cyrusVirtual;
    }

    @Override
    public void resetOriginalValues() {
        _cyrusVirtual.resetOriginalValues();
    }
}
