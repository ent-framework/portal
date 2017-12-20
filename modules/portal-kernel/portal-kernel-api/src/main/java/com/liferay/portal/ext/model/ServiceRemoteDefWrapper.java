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
 * This class is a wrapper for {@link ServiceRemoteDef}.
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceRemoteDef
 * @generated
 */
@ProviderType
public class ServiceRemoteDefWrapper implements ServiceRemoteDef,
	ModelWrapper<ServiceRemoteDef> {
	public ServiceRemoteDefWrapper(ServiceRemoteDef serviceRemoteDef) {
		_serviceRemoteDef = serviceRemoteDef;
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceRemoteDef.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceRemoteDef.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("remoteId", getRemoteId());
		attributes.put("code", getCode());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tagId", getTagId());
		attributes.put("host", getHost());
		attributes.put("path", getPath());
		attributes.put("httpMethod", getHttpMethod());
		attributes.put("rawString", getRawString());
		attributes.put("description", getDescription());
		attributes.put("deprecated", getDeprecated());
		attributes.put("sendWithCookies", getSendWithCookies());
		attributes.put("cookieDomain", getCookieDomain());
		attributes.put("cookiePath", getCookiePath());
		attributes.put("scriptParameter", getScriptParameter());
		attributes.put("scriptHeader", getScriptHeader());
		attributes.put("scriptResponse", getScriptResponse());
		attributes.put("cacheLiveTime", getCacheLiveTime());
		attributes.put("authId", getAuthId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long remoteId = (Long)attributes.get("remoteId");

		if (remoteId != null) {
			setRemoteId(remoteId);
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

		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		Long host = (Long)attributes.get("host");

		if (host != null) {
			setHost(host);
		}

		String path = (String)attributes.get("path");

		if (path != null) {
			setPath(path);
		}

		String httpMethod = (String)attributes.get("httpMethod");

		if (httpMethod != null) {
			setHttpMethod(httpMethod);
		}

		String rawString = (String)attributes.get("rawString");

		if (rawString != null) {
			setRawString(rawString);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean deprecated = (Boolean)attributes.get("deprecated");

		if (deprecated != null) {
			setDeprecated(deprecated);
		}

		Boolean sendWithCookies = (Boolean)attributes.get("sendWithCookies");

		if (sendWithCookies != null) {
			setSendWithCookies(sendWithCookies);
		}

		String cookieDomain = (String)attributes.get("cookieDomain");

		if (cookieDomain != null) {
			setCookieDomain(cookieDomain);
		}

		String cookiePath = (String)attributes.get("cookiePath");

		if (cookiePath != null) {
			setCookiePath(cookiePath);
		}

		String scriptParameter = (String)attributes.get("scriptParameter");

		if (scriptParameter != null) {
			setScriptParameter(scriptParameter);
		}

		String scriptHeader = (String)attributes.get("scriptHeader");

		if (scriptHeader != null) {
			setScriptHeader(scriptHeader);
		}

		String scriptResponse = (String)attributes.get("scriptResponse");

		if (scriptResponse != null) {
			setScriptResponse(scriptResponse);
		}

		Integer cacheLiveTime = (Integer)attributes.get("cacheLiveTime");

		if (cacheLiveTime != null) {
			setCacheLiveTime(cacheLiveTime);
		}

		Long authId = (Long)attributes.get("authId");

		if (authId != null) {
			setAuthId(authId);
		}
	}

	/**
	* Returns the primary key of this service remote def.
	*
	* @return the primary key of this service remote def
	*/
	@Override
	public long getPrimaryKey() {
		return _serviceRemoteDef.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service remote def.
	*
	* @param primaryKey the primary key of this service remote def
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_serviceRemoteDef.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the remote ID of this service remote def.
	*
	* @return the remote ID of this service remote def
	*/
	@Override
	public long getRemoteId() {
		return _serviceRemoteDef.getRemoteId();
	}

	/**
	* Sets the remote ID of this service remote def.
	*
	* @param remoteId the remote ID of this service remote def
	*/
	@Override
	public void setRemoteId(long remoteId) {
		_serviceRemoteDef.setRemoteId(remoteId);
	}

	/**
	* Returns the code of this service remote def.
	*
	* @return the code of this service remote def
	*/
	@Override
	public java.lang.String getCode() {
		return _serviceRemoteDef.getCode();
	}

	/**
	* Sets the code of this service remote def.
	*
	* @param code the code of this service remote def
	*/
	@Override
	public void setCode(java.lang.String code) {
		_serviceRemoteDef.setCode(code);
	}

	/**
	* Returns the user ID of this service remote def.
	*
	* @return the user ID of this service remote def
	*/
	@Override
	public long getUserId() {
		return _serviceRemoteDef.getUserId();
	}

	/**
	* Sets the user ID of this service remote def.
	*
	* @param userId the user ID of this service remote def
	*/
	@Override
	public void setUserId(long userId) {
		_serviceRemoteDef.setUserId(userId);
	}

	/**
	* Returns the user uuid of this service remote def.
	*
	* @return the user uuid of this service remote def
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDef.getUserUuid();
	}

	/**
	* Sets the user uuid of this service remote def.
	*
	* @param userUuid the user uuid of this service remote def
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_serviceRemoteDef.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this service remote def.
	*
	* @return the user name of this service remote def
	*/
	@Override
	public java.lang.String getUserName() {
		return _serviceRemoteDef.getUserName();
	}

	/**
	* Sets the user name of this service remote def.
	*
	* @param userName the user name of this service remote def
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_serviceRemoteDef.setUserName(userName);
	}

	/**
	* Returns the create date of this service remote def.
	*
	* @return the create date of this service remote def
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _serviceRemoteDef.getCreateDate();
	}

	/**
	* Sets the create date of this service remote def.
	*
	* @param createDate the create date of this service remote def
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_serviceRemoteDef.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this service remote def.
	*
	* @return the modified date of this service remote def
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _serviceRemoteDef.getModifiedDate();
	}

	/**
	* Sets the modified date of this service remote def.
	*
	* @param modifiedDate the modified date of this service remote def
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_serviceRemoteDef.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the tag ID of this service remote def.
	*
	* @return the tag ID of this service remote def
	*/
	@Override
	public long getTagId() {
		return _serviceRemoteDef.getTagId();
	}

	/**
	* Sets the tag ID of this service remote def.
	*
	* @param tagId the tag ID of this service remote def
	*/
	@Override
	public void setTagId(long tagId) {
		_serviceRemoteDef.setTagId(tagId);
	}

	/**
	* Returns the host of this service remote def.
	*
	* @return the host of this service remote def
	*/
	@Override
	public long getHost() {
		return _serviceRemoteDef.getHost();
	}

	/**
	* Sets the host of this service remote def.
	*
	* @param host the host of this service remote def
	*/
	@Override
	public void setHost(long host) {
		_serviceRemoteDef.setHost(host);
	}

	/**
	* Returns the path of this service remote def.
	*
	* @return the path of this service remote def
	*/
	@Override
	public java.lang.String getPath() {
		return _serviceRemoteDef.getPath();
	}

	/**
	* Sets the path of this service remote def.
	*
	* @param path the path of this service remote def
	*/
	@Override
	public void setPath(java.lang.String path) {
		_serviceRemoteDef.setPath(path);
	}

	/**
	* Returns the http method of this service remote def.
	*
	* @return the http method of this service remote def
	*/
	@Override
	public java.lang.String getHttpMethod() {
		return _serviceRemoteDef.getHttpMethod();
	}

	/**
	* Sets the http method of this service remote def.
	*
	* @param httpMethod the http method of this service remote def
	*/
	@Override
	public void setHttpMethod(java.lang.String httpMethod) {
		_serviceRemoteDef.setHttpMethod(httpMethod);
	}

	/**
	* Returns the raw string of this service remote def.
	*
	* @return the raw string of this service remote def
	*/
	@Override
	public java.lang.String getRawString() {
		return _serviceRemoteDef.getRawString();
	}

	/**
	* Sets the raw string of this service remote def.
	*
	* @param rawString the raw string of this service remote def
	*/
	@Override
	public void setRawString(java.lang.String rawString) {
		_serviceRemoteDef.setRawString(rawString);
	}

	/**
	* Returns the description of this service remote def.
	*
	* @return the description of this service remote def
	*/
	@Override
	public java.lang.String getDescription() {
		return _serviceRemoteDef.getDescription();
	}

	/**
	* Sets the description of this service remote def.
	*
	* @param description the description of this service remote def
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_serviceRemoteDef.setDescription(description);
	}

	/**
	* Returns the deprecated of this service remote def.
	*
	* @return the deprecated of this service remote def
	*/
	@Override
	public boolean getDeprecated() {
		return _serviceRemoteDef.getDeprecated();
	}

	/**
	* Returns <code>true</code> if this service remote def is deprecated.
	*
	* @return <code>true</code> if this service remote def is deprecated; <code>false</code> otherwise
	*/
	@Override
	public boolean isDeprecated() {
		return _serviceRemoteDef.isDeprecated();
	}

	/**
	* Sets whether this service remote def is deprecated.
	*
	* @param deprecated the deprecated of this service remote def
	*/
	@Override
	public void setDeprecated(boolean deprecated) {
		_serviceRemoteDef.setDeprecated(deprecated);
	}

	/**
	* Returns the send with cookies of this service remote def.
	*
	* @return the send with cookies of this service remote def
	*/
	@Override
	public boolean getSendWithCookies() {
		return _serviceRemoteDef.getSendWithCookies();
	}

	/**
	* Returns <code>true</code> if this service remote def is send with cookies.
	*
	* @return <code>true</code> if this service remote def is send with cookies; <code>false</code> otherwise
	*/
	@Override
	public boolean isSendWithCookies() {
		return _serviceRemoteDef.isSendWithCookies();
	}

	/**
	* Sets whether this service remote def is send with cookies.
	*
	* @param sendWithCookies the send with cookies of this service remote def
	*/
	@Override
	public void setSendWithCookies(boolean sendWithCookies) {
		_serviceRemoteDef.setSendWithCookies(sendWithCookies);
	}

	/**
	* Returns the cookie domain of this service remote def.
	*
	* @return the cookie domain of this service remote def
	*/
	@Override
	public java.lang.String getCookieDomain() {
		return _serviceRemoteDef.getCookieDomain();
	}

	/**
	* Sets the cookie domain of this service remote def.
	*
	* @param cookieDomain the cookie domain of this service remote def
	*/
	@Override
	public void setCookieDomain(java.lang.String cookieDomain) {
		_serviceRemoteDef.setCookieDomain(cookieDomain);
	}

	/**
	* Returns the cookie path of this service remote def.
	*
	* @return the cookie path of this service remote def
	*/
	@Override
	public java.lang.String getCookiePath() {
		return _serviceRemoteDef.getCookiePath();
	}

	/**
	* Sets the cookie path of this service remote def.
	*
	* @param cookiePath the cookie path of this service remote def
	*/
	@Override
	public void setCookiePath(java.lang.String cookiePath) {
		_serviceRemoteDef.setCookiePath(cookiePath);
	}

	/**
	* Returns the script parameter of this service remote def.
	*
	* @return the script parameter of this service remote def
	*/
	@Override
	public java.lang.String getScriptParameter() {
		return _serviceRemoteDef.getScriptParameter();
	}

	/**
	* Sets the script parameter of this service remote def.
	*
	* @param scriptParameter the script parameter of this service remote def
	*/
	@Override
	public void setScriptParameter(java.lang.String scriptParameter) {
		_serviceRemoteDef.setScriptParameter(scriptParameter);
	}

	/**
	* Returns the script header of this service remote def.
	*
	* @return the script header of this service remote def
	*/
	@Override
	public java.lang.String getScriptHeader() {
		return _serviceRemoteDef.getScriptHeader();
	}

	/**
	* Sets the script header of this service remote def.
	*
	* @param scriptHeader the script header of this service remote def
	*/
	@Override
	public void setScriptHeader(java.lang.String scriptHeader) {
		_serviceRemoteDef.setScriptHeader(scriptHeader);
	}

	/**
	* Returns the script response of this service remote def.
	*
	* @return the script response of this service remote def
	*/
	@Override
	public java.lang.String getScriptResponse() {
		return _serviceRemoteDef.getScriptResponse();
	}

	/**
	* Sets the script response of this service remote def.
	*
	* @param scriptResponse the script response of this service remote def
	*/
	@Override
	public void setScriptResponse(java.lang.String scriptResponse) {
		_serviceRemoteDef.setScriptResponse(scriptResponse);
	}

	/**
	* Returns the cache live time of this service remote def.
	*
	* @return the cache live time of this service remote def
	*/
	@Override
	public int getCacheLiveTime() {
		return _serviceRemoteDef.getCacheLiveTime();
	}

	/**
	* Sets the cache live time of this service remote def.
	*
	* @param cacheLiveTime the cache live time of this service remote def
	*/
	@Override
	public void setCacheLiveTime(int cacheLiveTime) {
		_serviceRemoteDef.setCacheLiveTime(cacheLiveTime);
	}

	/**
	* Returns the auth ID of this service remote def.
	*
	* @return the auth ID of this service remote def
	*/
	@Override
	public long getAuthId() {
		return _serviceRemoteDef.getAuthId();
	}

	/**
	* Sets the auth ID of this service remote def.
	*
	* @param authId the auth ID of this service remote def
	*/
	@Override
	public void setAuthId(long authId) {
		_serviceRemoteDef.setAuthId(authId);
	}

	@Override
	public boolean isNew() {
		return _serviceRemoteDef.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_serviceRemoteDef.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _serviceRemoteDef.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_serviceRemoteDef.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _serviceRemoteDef.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _serviceRemoteDef.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_serviceRemoteDef.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _serviceRemoteDef.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_serviceRemoteDef.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_serviceRemoteDef.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_serviceRemoteDef.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceRemoteDefWrapper((ServiceRemoteDef)_serviceRemoteDef.clone());
	}

	@Override
	public int compareTo(
		com.liferay.portal.ext.model.ServiceRemoteDef serviceRemoteDef) {
		return _serviceRemoteDef.compareTo(serviceRemoteDef);
	}

	@Override
	public int hashCode() {
		return _serviceRemoteDef.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.portal.ext.model.ServiceRemoteDef> toCacheModel() {
		return _serviceRemoteDef.toCacheModel();
	}

	@Override
	public com.liferay.portal.ext.model.ServiceRemoteDef toEscapedModel() {
		return new ServiceRemoteDefWrapper(_serviceRemoteDef.toEscapedModel());
	}

	@Override
	public com.liferay.portal.ext.model.ServiceRemoteDef toUnescapedModel() {
		return new ServiceRemoteDefWrapper(_serviceRemoteDef.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _serviceRemoteDef.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _serviceRemoteDef.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceRemoteDef.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceRemoteDefWrapper)) {
			return false;
		}

		ServiceRemoteDefWrapper serviceRemoteDefWrapper = (ServiceRemoteDefWrapper)obj;

		if (Validator.equals(_serviceRemoteDef,
					serviceRemoteDefWrapper._serviceRemoteDef)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServiceRemoteDef getWrappedServiceRemoteDef() {
		return _serviceRemoteDef;
	}

	@Override
	public ServiceRemoteDef getWrappedModel() {
		return _serviceRemoteDef;
	}

	@Override
	public void resetOriginalValues() {
		_serviceRemoteDef.resetOriginalValues();
	}

	private ServiceRemoteDef _serviceRemoteDef;
}