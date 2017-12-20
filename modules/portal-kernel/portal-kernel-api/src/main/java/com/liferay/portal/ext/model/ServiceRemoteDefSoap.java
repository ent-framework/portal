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
public class ServiceRemoteDefSoap implements Serializable {
	public static ServiceRemoteDefSoap toSoapModel(ServiceRemoteDef model) {
		ServiceRemoteDefSoap soapModel = new ServiceRemoteDefSoap();

		soapModel.setRemoteId(model.getRemoteId());
		soapModel.setCode(model.getCode());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTagId(model.getTagId());
		soapModel.setHost(model.getHost());
		soapModel.setPath(model.getPath());
		soapModel.setHttpMethod(model.getHttpMethod());
		soapModel.setRawString(model.getRawString());
		soapModel.setDescription(model.getDescription());
		soapModel.setDeprecated(model.getDeprecated());
		soapModel.setSendWithCookies(model.getSendWithCookies());
		soapModel.setCookieDomain(model.getCookieDomain());
		soapModel.setCookiePath(model.getCookiePath());
		soapModel.setScriptParameter(model.getScriptParameter());
		soapModel.setScriptHeader(model.getScriptHeader());
		soapModel.setScriptResponse(model.getScriptResponse());
		soapModel.setCacheLiveTime(model.getCacheLiveTime());
		soapModel.setAuthId(model.getAuthId());

		return soapModel;
	}

	public static ServiceRemoteDefSoap[] toSoapModels(ServiceRemoteDef[] models) {
		ServiceRemoteDefSoap[] soapModels = new ServiceRemoteDefSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServiceRemoteDefSoap[][] toSoapModels(
		ServiceRemoteDef[][] models) {
		ServiceRemoteDefSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServiceRemoteDefSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServiceRemoteDefSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServiceRemoteDefSoap[] toSoapModels(
		List<ServiceRemoteDef> models) {
		List<ServiceRemoteDefSoap> soapModels = new ArrayList<ServiceRemoteDefSoap>(models.size());

		for (ServiceRemoteDef model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServiceRemoteDefSoap[soapModels.size()]);
	}

	public ServiceRemoteDefSoap() {
	}

	public long getPrimaryKey() {
		return _remoteId;
	}

	public void setPrimaryKey(long pk) {
		setRemoteId(pk);
	}

	public long getRemoteId() {
		return _remoteId;
	}

	public void setRemoteId(long remoteId) {
		_remoteId = remoteId;
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

	public long getTagId() {
		return _tagId;
	}

	public void setTagId(long tagId) {
		_tagId = tagId;
	}

	public long getHost() {
		return _host;
	}

	public void setHost(long host) {
		_host = host;
	}

	public String getPath() {
		return _path;
	}

	public void setPath(String path) {
		_path = path;
	}

	public String getHttpMethod() {
		return _httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		_httpMethod = httpMethod;
	}

	public String getRawString() {
		return _rawString;
	}

	public void setRawString(String rawString) {
		_rawString = rawString;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public boolean getDeprecated() {
		return _deprecated;
	}

	public boolean isDeprecated() {
		return _deprecated;
	}

	public void setDeprecated(boolean deprecated) {
		_deprecated = deprecated;
	}

	public boolean getSendWithCookies() {
		return _sendWithCookies;
	}

	public boolean isSendWithCookies() {
		return _sendWithCookies;
	}

	public void setSendWithCookies(boolean sendWithCookies) {
		_sendWithCookies = sendWithCookies;
	}

	public String getCookieDomain() {
		return _cookieDomain;
	}

	public void setCookieDomain(String cookieDomain) {
		_cookieDomain = cookieDomain;
	}

	public String getCookiePath() {
		return _cookiePath;
	}

	public void setCookiePath(String cookiePath) {
		_cookiePath = cookiePath;
	}

	public String getScriptParameter() {
		return _scriptParameter;
	}

	public void setScriptParameter(String scriptParameter) {
		_scriptParameter = scriptParameter;
	}

	public String getScriptHeader() {
		return _scriptHeader;
	}

	public void setScriptHeader(String scriptHeader) {
		_scriptHeader = scriptHeader;
	}

	public String getScriptResponse() {
		return _scriptResponse;
	}

	public void setScriptResponse(String scriptResponse) {
		_scriptResponse = scriptResponse;
	}

	public int getCacheLiveTime() {
		return _cacheLiveTime;
	}

	public void setCacheLiveTime(int cacheLiveTime) {
		_cacheLiveTime = cacheLiveTime;
	}

	public long getAuthId() {
		return _authId;
	}

	public void setAuthId(long authId) {
		_authId = authId;
	}

	private long _remoteId;
	private String _code;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _tagId;
	private long _host;
	private String _path;
	private String _httpMethod;
	private String _rawString;
	private String _description;
	private boolean _deprecated;
	private boolean _sendWithCookies;
	private String _cookieDomain;
	private String _cookiePath;
	private String _scriptParameter;
	private String _scriptHeader;
	private String _scriptResponse;
	private int _cacheLiveTime;
	private long _authId;
}