/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.ext.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ServiceAuthorization}.
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceAuthorization
 * @generated
 */
@ProviderType
public class ServiceAuthorizationWrapper implements ServiceAuthorization,
	ModelWrapper<ServiceAuthorization> {
	public ServiceAuthorizationWrapper(
		ServiceAuthorization serviceAuthorization) {
		_serviceAuthorization = serviceAuthorization;
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceAuthorization.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceAuthorization.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("authId", getAuthId());
		attributes.put("code", getCode());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());
		attributes.put("type", getType());
		attributes.put("template", getTemplate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long authId = (Long)attributes.get("authId");

		if (authId != null) {
			setAuthId(authId);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String template = (String)attributes.get("template");

		if (template != null) {
			setTemplate(template);
		}
	}

	/**
	* Returns the primary key of this service authorization.
	*
	* @return the primary key of this service authorization
	*/
	@Override
	public long getPrimaryKey() {
		return _serviceAuthorization.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service authorization.
	*
	* @param primaryKey the primary key of this service authorization
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_serviceAuthorization.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the auth ID of this service authorization.
	*
	* @return the auth ID of this service authorization
	*/
	@Override
	public long getAuthId() {
		return _serviceAuthorization.getAuthId();
	}

	/**
	* Sets the auth ID of this service authorization.
	*
	* @param authId the auth ID of this service authorization
	*/
	@Override
	public void setAuthId(long authId) {
		_serviceAuthorization.setAuthId(authId);
	}

	/**
	* Returns the code of this service authorization.
	*
	* @return the code of this service authorization
	*/
	@Override
	public java.lang.String getCode() {
		return _serviceAuthorization.getCode();
	}

	/**
	* Sets the code of this service authorization.
	*
	* @param code the code of this service authorization
	*/
	@Override
	public void setCode(java.lang.String code) {
		_serviceAuthorization.setCode(code);
	}

	/**
	* Returns the user ID of this service authorization.
	*
	* @return the user ID of this service authorization
	*/
	@Override
	public long getUserId() {
		return _serviceAuthorization.getUserId();
	}

	/**
	* Sets the user ID of this service authorization.
	*
	* @param userId the user ID of this service authorization
	*/
	@Override
	public void setUserId(long userId) {
		_serviceAuthorization.setUserId(userId);
	}

	/**
	* Returns the user uuid of this service authorization.
	*
	* @return the user uuid of this service authorization
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceAuthorization.getUserUuid();
	}

	/**
	* Sets the user uuid of this service authorization.
	*
	* @param userUuid the user uuid of this service authorization
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_serviceAuthorization.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this service authorization.
	*
	* @return the user name of this service authorization
	*/
	@Override
	public java.lang.String getUserName() {
		return _serviceAuthorization.getUserName();
	}

	/**
	* Sets the user name of this service authorization.
	*
	* @param userName the user name of this service authorization
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_serviceAuthorization.setUserName(userName);
	}

	/**
	* Returns the create date of this service authorization.
	*
	* @return the create date of this service authorization
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _serviceAuthorization.getCreateDate();
	}

	/**
	* Sets the create date of this service authorization.
	*
	* @param createDate the create date of this service authorization
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_serviceAuthorization.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this service authorization.
	*
	* @return the modified date of this service authorization
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _serviceAuthorization.getModifiedDate();
	}

	/**
	* Sets the modified date of this service authorization.
	*
	* @param modifiedDate the modified date of this service authorization
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_serviceAuthorization.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the fully qualified class name of this service authorization.
	*
	* @return the fully qualified class name of this service authorization
	*/
	@Override
	public java.lang.String getClassName() {
		return _serviceAuthorization.getClassName();
	}

	@Override
	public void setClassName(java.lang.String className) {
		_serviceAuthorization.setClassName(className);
	}

	/**
	* Returns the class name ID of this service authorization.
	*
	* @return the class name ID of this service authorization
	*/
	@Override
	public long getClassNameId() {
		return _serviceAuthorization.getClassNameId();
	}

	/**
	* Sets the class name ID of this service authorization.
	*
	* @param classNameId the class name ID of this service authorization
	*/
	@Override
	public void setClassNameId(long classNameId) {
		_serviceAuthorization.setClassNameId(classNameId);
	}

	/**
	* Returns the class p k of this service authorization.
	*
	* @return the class p k of this service authorization
	*/
	@Override
	public long getClassPK() {
		return _serviceAuthorization.getClassPK();
	}

	/**
	* Sets the class p k of this service authorization.
	*
	* @param classPK the class p k of this service authorization
	*/
	@Override
	public void setClassPK(long classPK) {
		_serviceAuthorization.setClassPK(classPK);
	}

	/**
	* Returns the type of this service authorization.
	*
	* @return the type of this service authorization
	*/
	@Override
	public java.lang.String getType() {
		return _serviceAuthorization.getType();
	}

	/**
	* Sets the type of this service authorization.
	*
	* @param type the type of this service authorization
	*/
	@Override
	public void setType(java.lang.String type) {
		_serviceAuthorization.setType(type);
	}

	/**
	* Returns the template of this service authorization.
	*
	* @return the template of this service authorization
	*/
	@Override
	public java.lang.String getTemplate() {
		return _serviceAuthorization.getTemplate();
	}

	/**
	* Sets the template of this service authorization.
	*
	* @param template the template of this service authorization
	*/
	@Override
	public void setTemplate(java.lang.String template) {
		_serviceAuthorization.setTemplate(template);
	}

	@Override
	public boolean isNew() {
		return _serviceAuthorization.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_serviceAuthorization.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _serviceAuthorization.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_serviceAuthorization.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _serviceAuthorization.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _serviceAuthorization.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_serviceAuthorization.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _serviceAuthorization.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_serviceAuthorization.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_serviceAuthorization.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_serviceAuthorization.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceAuthorizationWrapper((ServiceAuthorization)_serviceAuthorization.clone());
	}

	@Override
	public int compareTo(
		com.liferay.portal.ext.model.ServiceAuthorization serviceAuthorization) {
		return _serviceAuthorization.compareTo(serviceAuthorization);
	}

	@Override
	public int hashCode() {
		return _serviceAuthorization.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.portal.ext.model.ServiceAuthorization> toCacheModel() {
		return _serviceAuthorization.toCacheModel();
	}

	@Override
	public com.liferay.portal.ext.model.ServiceAuthorization toEscapedModel() {
		return new ServiceAuthorizationWrapper(_serviceAuthorization.toEscapedModel());
	}

	@Override
	public com.liferay.portal.ext.model.ServiceAuthorization toUnescapedModel() {
		return new ServiceAuthorizationWrapper(_serviceAuthorization.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _serviceAuthorization.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _serviceAuthorization.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceAuthorization.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceAuthorizationWrapper)) {
			return false;
		}

		ServiceAuthorizationWrapper serviceAuthorizationWrapper = (ServiceAuthorizationWrapper)obj;

		if (Validator.equals(_serviceAuthorization,
					serviceAuthorizationWrapper._serviceAuthorization)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServiceAuthorization getWrappedServiceAuthorization() {
		return _serviceAuthorization;
	}

	@Override
	public ServiceAuthorization getWrappedModel() {
		return _serviceAuthorization;
	}

	@Override
	public void resetOriginalValues() {
		_serviceAuthorization.resetOriginalValues();
	}

	private ServiceAuthorization _serviceAuthorization;
}