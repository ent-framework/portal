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
 * This class is a wrapper for {@link ServicePublishDef}.
 * </p>
 *
 * @author Jeff Qian
 * @see ServicePublishDef
 * @generated
 */
@ProviderType
public class ServicePublishDefWrapper implements ServicePublishDef,
	ModelWrapper<ServicePublishDef> {
	public ServicePublishDefWrapper(ServicePublishDef servicePublishDef) {
		_servicePublishDef = servicePublishDef;
	}

	@Override
	public Class<?> getModelClass() {
		return ServicePublishDef.class;
	}

	@Override
	public String getModelClassName() {
		return ServicePublishDef.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("publishId", getPublishId());
		attributes.put("path", getPath());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tagId", getTagId());
		attributes.put("httpMethod", getHttpMethod());
		attributes.put("scriptResponse", getScriptResponse());
		attributes.put("siteAwareness", getSiteAwareness());
		attributes.put("supportAnonymous", getSupportAnonymous());
		attributes.put("description", getDescription());
		attributes.put("deprecated", getDeprecated());
		attributes.put("cacheLiveTime", getCacheLiveTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long publishId = (Long)attributes.get("publishId");

		if (publishId != null) {
			setPublishId(publishId);
		}

		String path = (String)attributes.get("path");

		if (path != null) {
			setPath(path);
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

		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		String httpMethod = (String)attributes.get("httpMethod");

		if (httpMethod != null) {
			setHttpMethod(httpMethod);
		}

		String scriptResponse = (String)attributes.get("scriptResponse");

		if (scriptResponse != null) {
			setScriptResponse(scriptResponse);
		}

		Boolean siteAwareness = (Boolean)attributes.get("siteAwareness");

		if (siteAwareness != null) {
			setSiteAwareness(siteAwareness);
		}

		Boolean supportAnonymous = (Boolean)attributes.get("supportAnonymous");

		if (supportAnonymous != null) {
			setSupportAnonymous(supportAnonymous);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean deprecated = (Boolean)attributes.get("deprecated");

		if (deprecated != null) {
			setDeprecated(deprecated);
		}

		Integer cacheLiveTime = (Integer)attributes.get("cacheLiveTime");

		if (cacheLiveTime != null) {
			setCacheLiveTime(cacheLiveTime);
		}
	}

	/**
	* Returns the primary key of this service publish def.
	*
	* @return the primary key of this service publish def
	*/
	@Override
	public long getPrimaryKey() {
		return _servicePublishDef.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service publish def.
	*
	* @param primaryKey the primary key of this service publish def
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_servicePublishDef.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the publish ID of this service publish def.
	*
	* @return the publish ID of this service publish def
	*/
	@Override
	public long getPublishId() {
		return _servicePublishDef.getPublishId();
	}

	/**
	* Sets the publish ID of this service publish def.
	*
	* @param publishId the publish ID of this service publish def
	*/
	@Override
	public void setPublishId(long publishId) {
		_servicePublishDef.setPublishId(publishId);
	}

	/**
	* Returns the path of this service publish def.
	*
	* @return the path of this service publish def
	*/
	@Override
	public java.lang.String getPath() {
		return _servicePublishDef.getPath();
	}

	/**
	* Sets the path of this service publish def.
	*
	* @param path the path of this service publish def
	*/
	@Override
	public void setPath(java.lang.String path) {
		_servicePublishDef.setPath(path);
	}

	/**
	* Returns the user ID of this service publish def.
	*
	* @return the user ID of this service publish def
	*/
	@Override
	public long getUserId() {
		return _servicePublishDef.getUserId();
	}

	/**
	* Sets the user ID of this service publish def.
	*
	* @param userId the user ID of this service publish def
	*/
	@Override
	public void setUserId(long userId) {
		_servicePublishDef.setUserId(userId);
	}

	/**
	* Returns the user uuid of this service publish def.
	*
	* @return the user uuid of this service publish def
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDef.getUserUuid();
	}

	/**
	* Sets the user uuid of this service publish def.
	*
	* @param userUuid the user uuid of this service publish def
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_servicePublishDef.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this service publish def.
	*
	* @return the user name of this service publish def
	*/
	@Override
	public java.lang.String getUserName() {
		return _servicePublishDef.getUserName();
	}

	/**
	* Sets the user name of this service publish def.
	*
	* @param userName the user name of this service publish def
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_servicePublishDef.setUserName(userName);
	}

	/**
	* Returns the create date of this service publish def.
	*
	* @return the create date of this service publish def
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _servicePublishDef.getCreateDate();
	}

	/**
	* Sets the create date of this service publish def.
	*
	* @param createDate the create date of this service publish def
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_servicePublishDef.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this service publish def.
	*
	* @return the modified date of this service publish def
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _servicePublishDef.getModifiedDate();
	}

	/**
	* Sets the modified date of this service publish def.
	*
	* @param modifiedDate the modified date of this service publish def
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_servicePublishDef.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the tag ID of this service publish def.
	*
	* @return the tag ID of this service publish def
	*/
	@Override
	public long getTagId() {
		return _servicePublishDef.getTagId();
	}

	/**
	* Sets the tag ID of this service publish def.
	*
	* @param tagId the tag ID of this service publish def
	*/
	@Override
	public void setTagId(long tagId) {
		_servicePublishDef.setTagId(tagId);
	}

	/**
	* Returns the http method of this service publish def.
	*
	* @return the http method of this service publish def
	*/
	@Override
	public java.lang.String getHttpMethod() {
		return _servicePublishDef.getHttpMethod();
	}

	/**
	* Sets the http method of this service publish def.
	*
	* @param httpMethod the http method of this service publish def
	*/
	@Override
	public void setHttpMethod(java.lang.String httpMethod) {
		_servicePublishDef.setHttpMethod(httpMethod);
	}

	/**
	* Returns the script response of this service publish def.
	*
	* @return the script response of this service publish def
	*/
	@Override
	public java.lang.String getScriptResponse() {
		return _servicePublishDef.getScriptResponse();
	}

	/**
	* Sets the script response of this service publish def.
	*
	* @param scriptResponse the script response of this service publish def
	*/
	@Override
	public void setScriptResponse(java.lang.String scriptResponse) {
		_servicePublishDef.setScriptResponse(scriptResponse);
	}

	/**
	* Returns the site awareness of this service publish def.
	*
	* @return the site awareness of this service publish def
	*/
	@Override
	public boolean getSiteAwareness() {
		return _servicePublishDef.getSiteAwareness();
	}

	/**
	* Returns <code>true</code> if this service publish def is site awareness.
	*
	* @return <code>true</code> if this service publish def is site awareness; <code>false</code> otherwise
	*/
	@Override
	public boolean isSiteAwareness() {
		return _servicePublishDef.isSiteAwareness();
	}

	/**
	* Sets whether this service publish def is site awareness.
	*
	* @param siteAwareness the site awareness of this service publish def
	*/
	@Override
	public void setSiteAwareness(boolean siteAwareness) {
		_servicePublishDef.setSiteAwareness(siteAwareness);
	}

	/**
	* Returns the support anonymous of this service publish def.
	*
	* @return the support anonymous of this service publish def
	*/
	@Override
	public boolean getSupportAnonymous() {
		return _servicePublishDef.getSupportAnonymous();
	}

	/**
	* Returns <code>true</code> if this service publish def is support anonymous.
	*
	* @return <code>true</code> if this service publish def is support anonymous; <code>false</code> otherwise
	*/
	@Override
	public boolean isSupportAnonymous() {
		return _servicePublishDef.isSupportAnonymous();
	}

	/**
	* Sets whether this service publish def is support anonymous.
	*
	* @param supportAnonymous the support anonymous of this service publish def
	*/
	@Override
	public void setSupportAnonymous(boolean supportAnonymous) {
		_servicePublishDef.setSupportAnonymous(supportAnonymous);
	}

	/**
	* Returns the description of this service publish def.
	*
	* @return the description of this service publish def
	*/
	@Override
	public java.lang.String getDescription() {
		return _servicePublishDef.getDescription();
	}

	/**
	* Sets the description of this service publish def.
	*
	* @param description the description of this service publish def
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_servicePublishDef.setDescription(description);
	}

	/**
	* Returns the deprecated of this service publish def.
	*
	* @return the deprecated of this service publish def
	*/
	@Override
	public boolean getDeprecated() {
		return _servicePublishDef.getDeprecated();
	}

	/**
	* Returns <code>true</code> if this service publish def is deprecated.
	*
	* @return <code>true</code> if this service publish def is deprecated; <code>false</code> otherwise
	*/
	@Override
	public boolean isDeprecated() {
		return _servicePublishDef.isDeprecated();
	}

	/**
	* Sets whether this service publish def is deprecated.
	*
	* @param deprecated the deprecated of this service publish def
	*/
	@Override
	public void setDeprecated(boolean deprecated) {
		_servicePublishDef.setDeprecated(deprecated);
	}

	/**
	* Returns the cache live time of this service publish def.
	*
	* @return the cache live time of this service publish def
	*/
	@Override
	public int getCacheLiveTime() {
		return _servicePublishDef.getCacheLiveTime();
	}

	/**
	* Sets the cache live time of this service publish def.
	*
	* @param cacheLiveTime the cache live time of this service publish def
	*/
	@Override
	public void setCacheLiveTime(int cacheLiveTime) {
		_servicePublishDef.setCacheLiveTime(cacheLiveTime);
	}

	@Override
	public boolean isNew() {
		return _servicePublishDef.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_servicePublishDef.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _servicePublishDef.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_servicePublishDef.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _servicePublishDef.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _servicePublishDef.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_servicePublishDef.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _servicePublishDef.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_servicePublishDef.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_servicePublishDef.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_servicePublishDef.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServicePublishDefWrapper((ServicePublishDef)_servicePublishDef.clone());
	}

	@Override
	public int compareTo(
		com.liferay.portal.ext.model.ServicePublishDef servicePublishDef) {
		return _servicePublishDef.compareTo(servicePublishDef);
	}

	@Override
	public int hashCode() {
		return _servicePublishDef.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.portal.ext.model.ServicePublishDef> toCacheModel() {
		return _servicePublishDef.toCacheModel();
	}

	@Override
	public com.liferay.portal.ext.model.ServicePublishDef toEscapedModel() {
		return new ServicePublishDefWrapper(_servicePublishDef.toEscapedModel());
	}

	@Override
	public com.liferay.portal.ext.model.ServicePublishDef toUnescapedModel() {
		return new ServicePublishDefWrapper(_servicePublishDef.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _servicePublishDef.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _servicePublishDef.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_servicePublishDef.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServicePublishDefWrapper)) {
			return false;
		}

		ServicePublishDefWrapper servicePublishDefWrapper = (ServicePublishDefWrapper)obj;

		if (Validator.equals(_servicePublishDef,
					servicePublishDefWrapper._servicePublishDef)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServicePublishDef getWrappedServicePublishDef() {
		return _servicePublishDef;
	}

	@Override
	public ServicePublishDef getWrappedModel() {
		return _servicePublishDef;
	}

	@Override
	public void resetOriginalValues() {
		_servicePublishDef.resetOriginalValues();
	}

	private ServicePublishDef _servicePublishDef;
}