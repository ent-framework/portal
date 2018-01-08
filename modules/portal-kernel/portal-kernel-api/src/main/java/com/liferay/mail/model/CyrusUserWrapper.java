package com.liferay.mail.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CyrusUser}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CyrusUser
 * @generated
 */
@ProviderType
public class CyrusUserWrapper implements CyrusUser, ModelWrapper<CyrusUser> {
    private CyrusUser _cyrusUser;

    public CyrusUserWrapper(CyrusUser cyrusUser) {
        _cyrusUser = cyrusUser;
    }

    @Override
    public Class<?> getModelClass() {
        return CyrusUser.class;
    }

    @Override
    public String getModelClassName() {
        return CyrusUser.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("userId", getUserId());
        attributes.put("password", getPassword());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String userId = (String) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String password = (String) attributes.get("password");

        if (password != null) {
            setPassword(password);
        }
    }

    /**
    * Returns the primary key of this cyrus user.
    *
    * @return the primary key of this cyrus user
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _cyrusUser.getPrimaryKey();
    }

    /**
    * Sets the primary key of this cyrus user.
    *
    * @param primaryKey the primary key of this cyrus user
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _cyrusUser.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the user ID of this cyrus user.
    *
    * @return the user ID of this cyrus user
    */
    @Override
    public java.lang.String getUserId() {
        return _cyrusUser.getUserId();
    }

    /**
    * Sets the user ID of this cyrus user.
    *
    * @param userId the user ID of this cyrus user
    */
    @Override
    public void setUserId(java.lang.String userId) {
        _cyrusUser.setUserId(userId);
    }

    /**
    * Returns the password of this cyrus user.
    *
    * @return the password of this cyrus user
    */
    @Override
    public java.lang.String getPassword() {
        return _cyrusUser.getPassword();
    }

    /**
    * Sets the password of this cyrus user.
    *
    * @param password the password of this cyrus user
    */
    @Override
    public void setPassword(java.lang.String password) {
        _cyrusUser.setPassword(password);
    }

    @Override
    public boolean isNew() {
        return _cyrusUser.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _cyrusUser.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _cyrusUser.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _cyrusUser.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _cyrusUser.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _cyrusUser.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _cyrusUser.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _cyrusUser.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _cyrusUser.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _cyrusUser.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _cyrusUser.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CyrusUserWrapper((CyrusUser) _cyrusUser.clone());
    }

    @Override
    public int compareTo(com.liferay.mail.model.CyrusUser cyrusUser) {
        return _cyrusUser.compareTo(cyrusUser);
    }

    @Override
    public int hashCode() {
        return _cyrusUser.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.mail.model.CyrusUser> toCacheModel() {
        return _cyrusUser.toCacheModel();
    }

    @Override
    public com.liferay.mail.model.CyrusUser toEscapedModel() {
        return new CyrusUserWrapper(_cyrusUser.toEscapedModel());
    }

    @Override
    public com.liferay.mail.model.CyrusUser toUnescapedModel() {
        return new CyrusUserWrapper(_cyrusUser.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _cyrusUser.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _cyrusUser.toXmlString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CyrusUserWrapper)) {
            return false;
        }

        CyrusUserWrapper cyrusUserWrapper = (CyrusUserWrapper) obj;

        if (Validator.equals(_cyrusUser, cyrusUserWrapper._cyrusUser)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public CyrusUser getWrappedCyrusUser() {
        return _cyrusUser;
    }

    @Override
    public CyrusUser getWrappedModel() {
        return _cyrusUser;
    }

    @Override
    public void resetOriginalValues() {
        _cyrusUser.resetOriginalValues();
    }
}
