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
 * This class is a wrapper for {@link ServiceHost}.
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceHost
 * @generated
 */
@ProviderType
public class ServiceHostWrapper implements ServiceHost,
	ModelWrapper<ServiceHost> {
	public ServiceHostWrapper(ServiceHost serviceHost) {
		_serviceHost = serviceHost;
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceHost.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceHost.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("hostId", getHostId());
		attributes.put("code", getCode());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("address", getAddress());
		attributes.put("protocol", getProtocol());
		attributes.put("port", getPort());
		attributes.put("proxyHost", getProxyHost());
		attributes.put("proxyPort", getProxyPort());
		attributes.put("proxyUserName", getProxyUserName());
		attributes.put("proxyPassword", getProxyPassword());
		attributes.put("proxyAuthType", getProxyAuthType());
		attributes.put("cacheResponse", getCacheResponse());
		attributes.put("maxConnectionsPerHost", getMaxConnectionsPerHost());
		attributes.put("timeout", getTimeout());
		attributes.put("sessionCookieUseFullHostName",
			getSessionCookieUseFullHostName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long hostId = (Long)attributes.get("hostId");

		if (hostId != null) {
			setHostId(hostId);
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

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String protocol = (String)attributes.get("protocol");

		if (protocol != null) {
			setProtocol(protocol);
		}

		Integer port = (Integer)attributes.get("port");

		if (port != null) {
			setPort(port);
		}

		String proxyHost = (String)attributes.get("proxyHost");

		if (proxyHost != null) {
			setProxyHost(proxyHost);
		}

		Integer proxyPort = (Integer)attributes.get("proxyPort");

		if (proxyPort != null) {
			setProxyPort(proxyPort);
		}

		String proxyUserName = (String)attributes.get("proxyUserName");

		if (proxyUserName != null) {
			setProxyUserName(proxyUserName);
		}

		String proxyPassword = (String)attributes.get("proxyPassword");

		if (proxyPassword != null) {
			setProxyPassword(proxyPassword);
		}

		String proxyAuthType = (String)attributes.get("proxyAuthType");

		if (proxyAuthType != null) {
			setProxyAuthType(proxyAuthType);
		}

		Boolean cacheResponse = (Boolean)attributes.get("cacheResponse");

		if (cacheResponse != null) {
			setCacheResponse(cacheResponse);
		}

		Integer maxConnectionsPerHost = (Integer)attributes.get(
				"maxConnectionsPerHost");

		if (maxConnectionsPerHost != null) {
			setMaxConnectionsPerHost(maxConnectionsPerHost);
		}

		Integer timeout = (Integer)attributes.get("timeout");

		if (timeout != null) {
			setTimeout(timeout);
		}

		Boolean sessionCookieUseFullHostName = (Boolean)attributes.get(
				"sessionCookieUseFullHostName");

		if (sessionCookieUseFullHostName != null) {
			setSessionCookieUseFullHostName(sessionCookieUseFullHostName);
		}
	}

	/**
	* Returns the primary key of this service host.
	*
	* @return the primary key of this service host
	*/
	@Override
	public long getPrimaryKey() {
		return _serviceHost.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service host.
	*
	* @param primaryKey the primary key of this service host
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_serviceHost.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the host ID of this service host.
	*
	* @return the host ID of this service host
	*/
	@Override
	public long getHostId() {
		return _serviceHost.getHostId();
	}

	/**
	* Sets the host ID of this service host.
	*
	* @param hostId the host ID of this service host
	*/
	@Override
	public void setHostId(long hostId) {
		_serviceHost.setHostId(hostId);
	}

	/**
	* Returns the code of this service host.
	*
	* @return the code of this service host
	*/
	@Override
	public java.lang.String getCode() {
		return _serviceHost.getCode();
	}

	/**
	* Sets the code of this service host.
	*
	* @param code the code of this service host
	*/
	@Override
	public void setCode(java.lang.String code) {
		_serviceHost.setCode(code);
	}

	/**
	* Returns the user ID of this service host.
	*
	* @return the user ID of this service host
	*/
	@Override
	public long getUserId() {
		return _serviceHost.getUserId();
	}

	/**
	* Sets the user ID of this service host.
	*
	* @param userId the user ID of this service host
	*/
	@Override
	public void setUserId(long userId) {
		_serviceHost.setUserId(userId);
	}

	/**
	* Returns the user uuid of this service host.
	*
	* @return the user uuid of this service host
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceHost.getUserUuid();
	}

	/**
	* Sets the user uuid of this service host.
	*
	* @param userUuid the user uuid of this service host
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_serviceHost.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this service host.
	*
	* @return the user name of this service host
	*/
	@Override
	public java.lang.String getUserName() {
		return _serviceHost.getUserName();
	}

	/**
	* Sets the user name of this service host.
	*
	* @param userName the user name of this service host
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_serviceHost.setUserName(userName);
	}

	/**
	* Returns the create date of this service host.
	*
	* @return the create date of this service host
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _serviceHost.getCreateDate();
	}

	/**
	* Sets the create date of this service host.
	*
	* @param createDate the create date of this service host
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_serviceHost.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this service host.
	*
	* @return the modified date of this service host
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _serviceHost.getModifiedDate();
	}

	/**
	* Sets the modified date of this service host.
	*
	* @param modifiedDate the modified date of this service host
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_serviceHost.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the address of this service host.
	*
	* @return the address of this service host
	*/
	@Override
	public java.lang.String getAddress() {
		return _serviceHost.getAddress();
	}

	/**
	* Sets the address of this service host.
	*
	* @param address the address of this service host
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_serviceHost.setAddress(address);
	}

	/**
	* Returns the protocol of this service host.
	*
	* @return the protocol of this service host
	*/
	@Override
	public java.lang.String getProtocol() {
		return _serviceHost.getProtocol();
	}

	/**
	* Sets the protocol of this service host.
	*
	* @param protocol the protocol of this service host
	*/
	@Override
	public void setProtocol(java.lang.String protocol) {
		_serviceHost.setProtocol(protocol);
	}

	/**
	* Returns the port of this service host.
	*
	* @return the port of this service host
	*/
	@Override
	public int getPort() {
		return _serviceHost.getPort();
	}

	/**
	* Sets the port of this service host.
	*
	* @param port the port of this service host
	*/
	@Override
	public void setPort(int port) {
		_serviceHost.setPort(port);
	}

	/**
	* Returns the proxy host of this service host.
	*
	* @return the proxy host of this service host
	*/
	@Override
	public java.lang.String getProxyHost() {
		return _serviceHost.getProxyHost();
	}

	/**
	* Sets the proxy host of this service host.
	*
	* @param proxyHost the proxy host of this service host
	*/
	@Override
	public void setProxyHost(java.lang.String proxyHost) {
		_serviceHost.setProxyHost(proxyHost);
	}

	/**
	* Returns the proxy port of this service host.
	*
	* @return the proxy port of this service host
	*/
	@Override
	public int getProxyPort() {
		return _serviceHost.getProxyPort();
	}

	/**
	* Sets the proxy port of this service host.
	*
	* @param proxyPort the proxy port of this service host
	*/
	@Override
	public void setProxyPort(int proxyPort) {
		_serviceHost.setProxyPort(proxyPort);
	}

	/**
	* Returns the proxy user name of this service host.
	*
	* @return the proxy user name of this service host
	*/
	@Override
	public java.lang.String getProxyUserName() {
		return _serviceHost.getProxyUserName();
	}

	/**
	* Sets the proxy user name of this service host.
	*
	* @param proxyUserName the proxy user name of this service host
	*/
	@Override
	public void setProxyUserName(java.lang.String proxyUserName) {
		_serviceHost.setProxyUserName(proxyUserName);
	}

	/**
	* Returns the proxy password of this service host.
	*
	* @return the proxy password of this service host
	*/
	@Override
	public java.lang.String getProxyPassword() {
		return _serviceHost.getProxyPassword();
	}

	/**
	* Sets the proxy password of this service host.
	*
	* @param proxyPassword the proxy password of this service host
	*/
	@Override
	public void setProxyPassword(java.lang.String proxyPassword) {
		_serviceHost.setProxyPassword(proxyPassword);
	}

	/**
	* Returns the proxy auth type of this service host.
	*
	* @return the proxy auth type of this service host
	*/
	@Override
	public java.lang.String getProxyAuthType() {
		return _serviceHost.getProxyAuthType();
	}

	/**
	* Sets the proxy auth type of this service host.
	*
	* @param proxyAuthType the proxy auth type of this service host
	*/
	@Override
	public void setProxyAuthType(java.lang.String proxyAuthType) {
		_serviceHost.setProxyAuthType(proxyAuthType);
	}

	/**
	* Returns the cache response of this service host.
	*
	* @return the cache response of this service host
	*/
	@Override
	public boolean getCacheResponse() {
		return _serviceHost.getCacheResponse();
	}

	/**
	* Returns <code>true</code> if this service host is cache response.
	*
	* @return <code>true</code> if this service host is cache response; <code>false</code> otherwise
	*/
	@Override
	public boolean isCacheResponse() {
		return _serviceHost.isCacheResponse();
	}

	/**
	* Sets whether this service host is cache response.
	*
	* @param cacheResponse the cache response of this service host
	*/
	@Override
	public void setCacheResponse(boolean cacheResponse) {
		_serviceHost.setCacheResponse(cacheResponse);
	}

	/**
	* Returns the max connections per host of this service host.
	*
	* @return the max connections per host of this service host
	*/
	@Override
	public int getMaxConnectionsPerHost() {
		return _serviceHost.getMaxConnectionsPerHost();
	}

	/**
	* Sets the max connections per host of this service host.
	*
	* @param maxConnectionsPerHost the max connections per host of this service host
	*/
	@Override
	public void setMaxConnectionsPerHost(int maxConnectionsPerHost) {
		_serviceHost.setMaxConnectionsPerHost(maxConnectionsPerHost);
	}

	/**
	* Returns the timeout of this service host.
	*
	* @return the timeout of this service host
	*/
	@Override
	public int getTimeout() {
		return _serviceHost.getTimeout();
	}

	/**
	* Sets the timeout of this service host.
	*
	* @param timeout the timeout of this service host
	*/
	@Override
	public void setTimeout(int timeout) {
		_serviceHost.setTimeout(timeout);
	}

	/**
	* Returns the session cookie use full host name of this service host.
	*
	* @return the session cookie use full host name of this service host
	*/
	@Override
	public boolean getSessionCookieUseFullHostName() {
		return _serviceHost.getSessionCookieUseFullHostName();
	}

	/**
	* Returns <code>true</code> if this service host is session cookie use full host name.
	*
	* @return <code>true</code> if this service host is session cookie use full host name; <code>false</code> otherwise
	*/
	@Override
	public boolean isSessionCookieUseFullHostName() {
		return _serviceHost.isSessionCookieUseFullHostName();
	}

	/**
	* Sets whether this service host is session cookie use full host name.
	*
	* @param sessionCookieUseFullHostName the session cookie use full host name of this service host
	*/
	@Override
	public void setSessionCookieUseFullHostName(
		boolean sessionCookieUseFullHostName) {
		_serviceHost.setSessionCookieUseFullHostName(sessionCookieUseFullHostName);
	}

	@Override
	public boolean isNew() {
		return _serviceHost.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_serviceHost.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _serviceHost.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_serviceHost.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _serviceHost.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _serviceHost.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_serviceHost.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _serviceHost.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_serviceHost.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_serviceHost.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_serviceHost.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceHostWrapper((ServiceHost)_serviceHost.clone());
	}

	@Override
	public int compareTo(com.liferay.portal.ext.model.ServiceHost serviceHost) {
		return _serviceHost.compareTo(serviceHost);
	}

	@Override
	public int hashCode() {
		return _serviceHost.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.portal.ext.model.ServiceHost> toCacheModel() {
		return _serviceHost.toCacheModel();
	}

	@Override
	public com.liferay.portal.ext.model.ServiceHost toEscapedModel() {
		return new ServiceHostWrapper(_serviceHost.toEscapedModel());
	}

	@Override
	public com.liferay.portal.ext.model.ServiceHost toUnescapedModel() {
		return new ServiceHostWrapper(_serviceHost.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _serviceHost.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _serviceHost.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceHost.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceHostWrapper)) {
			return false;
		}

		ServiceHostWrapper serviceHostWrapper = (ServiceHostWrapper)obj;

		if (Validator.equals(_serviceHost, serviceHostWrapper._serviceHost)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServiceHost getWrappedServiceHost() {
		return _serviceHost;
	}

	@Override
	public ServiceHost getWrappedModel() {
		return _serviceHost;
	}

	@Override
	public void resetOriginalValues() {
		_serviceHost.resetOriginalValues();
	}

	private ServiceHost _serviceHost;
}