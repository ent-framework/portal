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
 * This class is a wrapper for {@link ServiceParam}.
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceParam
 * @generated
 */
@ProviderType
public class ServiceParamWrapper implements ServiceParam,
	ModelWrapper<ServiceParam> {
	public ServiceParamWrapper(ServiceParam serviceParam) {
		_serviceParam = serviceParam;
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceParam.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceParam.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("paramId", getParamId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());
		attributes.put("paramType", getParamType());
		attributes.put("paramName", getParamName());
		attributes.put("paramValue", getParamValue());
		attributes.put("paramObject", getParamObject());
		attributes.put("paramDesc", getParamDesc());
		attributes.put("defaultValue", getDefaultValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long paramId = (Long)attributes.get("paramId");

		if (paramId != null) {
			setParamId(paramId);
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

		String paramType = (String)attributes.get("paramType");

		if (paramType != null) {
			setParamType(paramType);
		}

		String paramName = (String)attributes.get("paramName");

		if (paramName != null) {
			setParamName(paramName);
		}

		String paramValue = (String)attributes.get("paramValue");

		if (paramValue != null) {
			setParamValue(paramValue);
		}

		String paramObject = (String)attributes.get("paramObject");

		if (paramObject != null) {
			setParamObject(paramObject);
		}

		String paramDesc = (String)attributes.get("paramDesc");

		if (paramDesc != null) {
			setParamDesc(paramDesc);
		}

		String defaultValue = (String)attributes.get("defaultValue");

		if (defaultValue != null) {
			setDefaultValue(defaultValue);
		}
	}

	/**
	* Returns the primary key of this service param.
	*
	* @return the primary key of this service param
	*/
	@Override
	public long getPrimaryKey() {
		return _serviceParam.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service param.
	*
	* @param primaryKey the primary key of this service param
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_serviceParam.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the param ID of this service param.
	*
	* @return the param ID of this service param
	*/
	@Override
	public long getParamId() {
		return _serviceParam.getParamId();
	}

	/**
	* Sets the param ID of this service param.
	*
	* @param paramId the param ID of this service param
	*/
	@Override
	public void setParamId(long paramId) {
		_serviceParam.setParamId(paramId);
	}

	/**
	* Returns the user ID of this service param.
	*
	* @return the user ID of this service param
	*/
	@Override
	public long getUserId() {
		return _serviceParam.getUserId();
	}

	/**
	* Sets the user ID of this service param.
	*
	* @param userId the user ID of this service param
	*/
	@Override
	public void setUserId(long userId) {
		_serviceParam.setUserId(userId);
	}

	/**
	* Returns the user uuid of this service param.
	*
	* @return the user uuid of this service param
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceParam.getUserUuid();
	}

	/**
	* Sets the user uuid of this service param.
	*
	* @param userUuid the user uuid of this service param
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_serviceParam.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this service param.
	*
	* @return the user name of this service param
	*/
	@Override
	public java.lang.String getUserName() {
		return _serviceParam.getUserName();
	}

	/**
	* Sets the user name of this service param.
	*
	* @param userName the user name of this service param
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_serviceParam.setUserName(userName);
	}

	/**
	* Returns the create date of this service param.
	*
	* @return the create date of this service param
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _serviceParam.getCreateDate();
	}

	/**
	* Sets the create date of this service param.
	*
	* @param createDate the create date of this service param
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_serviceParam.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this service param.
	*
	* @return the modified date of this service param
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _serviceParam.getModifiedDate();
	}

	/**
	* Sets the modified date of this service param.
	*
	* @param modifiedDate the modified date of this service param
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_serviceParam.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the fully qualified class name of this service param.
	*
	* @return the fully qualified class name of this service param
	*/
	@Override
	public java.lang.String getClassName() {
		return _serviceParam.getClassName();
	}

	@Override
	public void setClassName(java.lang.String className) {
		_serviceParam.setClassName(className);
	}

	/**
	* Returns the class name ID of this service param.
	*
	* @return the class name ID of this service param
	*/
	@Override
	public long getClassNameId() {
		return _serviceParam.getClassNameId();
	}

	/**
	* Sets the class name ID of this service param.
	*
	* @param classNameId the class name ID of this service param
	*/
	@Override
	public void setClassNameId(long classNameId) {
		_serviceParam.setClassNameId(classNameId);
	}

	/**
	* Returns the class p k of this service param.
	*
	* @return the class p k of this service param
	*/
	@Override
	public long getClassPK() {
		return _serviceParam.getClassPK();
	}

	/**
	* Sets the class p k of this service param.
	*
	* @param classPK the class p k of this service param
	*/
	@Override
	public void setClassPK(long classPK) {
		_serviceParam.setClassPK(classPK);
	}

	/**
	* Returns the param type of this service param.
	*
	* @return the param type of this service param
	*/
	@Override
	public java.lang.String getParamType() {
		return _serviceParam.getParamType();
	}

	/**
	* Sets the param type of this service param.
	*
	* @param paramType the param type of this service param
	*/
	@Override
	public void setParamType(java.lang.String paramType) {
		_serviceParam.setParamType(paramType);
	}

	/**
	* Returns the param name of this service param.
	*
	* @return the param name of this service param
	*/
	@Override
	public java.lang.String getParamName() {
		return _serviceParam.getParamName();
	}

	/**
	* Sets the param name of this service param.
	*
	* @param paramName the param name of this service param
	*/
	@Override
	public void setParamName(java.lang.String paramName) {
		_serviceParam.setParamName(paramName);
	}

	/**
	* Returns the param value of this service param.
	*
	* @return the param value of this service param
	*/
	@Override
	public java.lang.String getParamValue() {
		return _serviceParam.getParamValue();
	}

	/**
	* Sets the param value of this service param.
	*
	* @param paramValue the param value of this service param
	*/
	@Override
	public void setParamValue(java.lang.String paramValue) {
		_serviceParam.setParamValue(paramValue);
	}

	/**
	* Returns the param object of this service param.
	*
	* @return the param object of this service param
	*/
	@Override
	public java.lang.String getParamObject() {
		return _serviceParam.getParamObject();
	}

	/**
	* Sets the param object of this service param.
	*
	* @param paramObject the param object of this service param
	*/
	@Override
	public void setParamObject(java.lang.String paramObject) {
		_serviceParam.setParamObject(paramObject);
	}

	/**
	* Returns the param desc of this service param.
	*
	* @return the param desc of this service param
	*/
	@Override
	public java.lang.String getParamDesc() {
		return _serviceParam.getParamDesc();
	}

	/**
	* Sets the param desc of this service param.
	*
	* @param paramDesc the param desc of this service param
	*/
	@Override
	public void setParamDesc(java.lang.String paramDesc) {
		_serviceParam.setParamDesc(paramDesc);
	}

	/**
	* Returns the default value of this service param.
	*
	* @return the default value of this service param
	*/
	@Override
	public java.lang.String getDefaultValue() {
		return _serviceParam.getDefaultValue();
	}

	/**
	* Sets the default value of this service param.
	*
	* @param defaultValue the default value of this service param
	*/
	@Override
	public void setDefaultValue(java.lang.String defaultValue) {
		_serviceParam.setDefaultValue(defaultValue);
	}

	@Override
	public boolean isNew() {
		return _serviceParam.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_serviceParam.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _serviceParam.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_serviceParam.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _serviceParam.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _serviceParam.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_serviceParam.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _serviceParam.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_serviceParam.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_serviceParam.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_serviceParam.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceParamWrapper((ServiceParam)_serviceParam.clone());
	}

	@Override
	public int compareTo(com.liferay.portal.ext.model.ServiceParam serviceParam) {
		return _serviceParam.compareTo(serviceParam);
	}

	@Override
	public int hashCode() {
		return _serviceParam.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.portal.ext.model.ServiceParam> toCacheModel() {
		return _serviceParam.toCacheModel();
	}

	@Override
	public com.liferay.portal.ext.model.ServiceParam toEscapedModel() {
		return new ServiceParamWrapper(_serviceParam.toEscapedModel());
	}

	@Override
	public com.liferay.portal.ext.model.ServiceParam toUnescapedModel() {
		return new ServiceParamWrapper(_serviceParam.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _serviceParam.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _serviceParam.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceParam.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceParamWrapper)) {
			return false;
		}

		ServiceParamWrapper serviceParamWrapper = (ServiceParamWrapper)obj;

		if (Validator.equals(_serviceParam, serviceParamWrapper._serviceParam)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServiceParam getWrappedServiceParam() {
		return _serviceParam;
	}

	@Override
	public ServiceParam getWrappedModel() {
		return _serviceParam;
	}

	@Override
	public void resetOriginalValues() {
		_serviceParam.resetOriginalValues();
	}

	private ServiceParam _serviceParam;
}