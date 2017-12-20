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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Jeff Qian
 * @generated
 */
public class ServiceHostSoap implements Serializable {
	public static ServiceHostSoap toSoapModel(ServiceHost model) {
		ServiceHostSoap soapModel = new ServiceHostSoap();

		soapModel.setHostId(model.getHostId());
		soapModel.setCode(model.getCode());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setAddress(model.getAddress());
		soapModel.setProtocol(model.getProtocol());
		soapModel.setPort(model.getPort());
		soapModel.setProxyHost(model.getProxyHost());
		soapModel.setProxyPort(model.getProxyPort());
		soapModel.setProxyUserName(model.getProxyUserName());
		soapModel.setProxyPassword(model.getProxyPassword());
		soapModel.setProxyAuthType(model.getProxyAuthType());
		soapModel.setCacheResponse(model.getCacheResponse());
		soapModel.setMaxConnectionsPerHost(model.getMaxConnectionsPerHost());
		soapModel.setTimeout(model.getTimeout());
		soapModel.setSessionCookieUseFullHostName(model.getSessionCookieUseFullHostName());

		return soapModel;
	}

	public static ServiceHostSoap[] toSoapModels(ServiceHost[] models) {
		ServiceHostSoap[] soapModels = new ServiceHostSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServiceHostSoap[][] toSoapModels(ServiceHost[][] models) {
		ServiceHostSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServiceHostSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServiceHostSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServiceHostSoap[] toSoapModels(List<ServiceHost> models) {
		List<ServiceHostSoap> soapModels = new ArrayList<ServiceHostSoap>(models.size());

		for (ServiceHost model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServiceHostSoap[soapModels.size()]);
	}

	public ServiceHostSoap() {
	}

	public long getPrimaryKey() {
		return _hostId;
	}

	public void setPrimaryKey(long pk) {
		setHostId(pk);
	}

	public long getHostId() {
		return _hostId;
	}

	public void setHostId(long hostId) {
		_hostId = hostId;
	}

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getProtocol() {
		return _protocol;
	}

	public void setProtocol(String protocol) {
		_protocol = protocol;
	}

	public int getPort() {
		return _port;
	}

	public void setPort(int port) {
		_port = port;
	}

	public String getProxyHost() {
		return _proxyHost;
	}

	public void setProxyHost(String proxyHost) {
		_proxyHost = proxyHost;
	}

	public int getProxyPort() {
		return _proxyPort;
	}

	public void setProxyPort(int proxyPort) {
		_proxyPort = proxyPort;
	}

	public String getProxyUserName() {
		return _proxyUserName;
	}

	public void setProxyUserName(String proxyUserName) {
		_proxyUserName = proxyUserName;
	}

	public String getProxyPassword() {
		return _proxyPassword;
	}

	public void setProxyPassword(String proxyPassword) {
		_proxyPassword = proxyPassword;
	}

	public String getProxyAuthType() {
		return _proxyAuthType;
	}

	public void setProxyAuthType(String proxyAuthType) {
		_proxyAuthType = proxyAuthType;
	}

	public boolean getCacheResponse() {
		return _cacheResponse;
	}

	public boolean isCacheResponse() {
		return _cacheResponse;
	}

	public void setCacheResponse(boolean cacheResponse) {
		_cacheResponse = cacheResponse;
	}

	public int getMaxConnectionsPerHost() {
		return _maxConnectionsPerHost;
	}

	public void setMaxConnectionsPerHost(int maxConnectionsPerHost) {
		_maxConnectionsPerHost = maxConnectionsPerHost;
	}

	public int getTimeout() {
		return _timeout;
	}

	public void setTimeout(int timeout) {
		_timeout = timeout;
	}

	public boolean getSessionCookieUseFullHostName() {
		return _sessionCookieUseFullHostName;
	}

	public boolean isSessionCookieUseFullHostName() {
		return _sessionCookieUseFullHostName;
	}

	public void setSessionCookieUseFullHostName(
		boolean sessionCookieUseFullHostName) {
		_sessionCookieUseFullHostName = sessionCookieUseFullHostName;
	}

	private long _hostId;
	private String _code;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _address;
	private String _protocol;
	private int _port;
	private String _proxyHost;
	private int _proxyPort;
	private String _proxyUserName;
	private String _proxyPassword;
	private String _proxyAuthType;
	private boolean _cacheResponse;
	private int _maxConnectionsPerHost;
	private int _timeout;
	private boolean _sessionCookieUseFullHostName;
}