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
public class ServicePublishDefSoap implements Serializable {
	public static ServicePublishDefSoap toSoapModel(ServicePublishDef model) {
		ServicePublishDefSoap soapModel = new ServicePublishDefSoap();

		soapModel.setPublishId(model.getPublishId());
		soapModel.setPath(model.getPath());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTagId(model.getTagId());
		soapModel.setHttpMethod(model.getHttpMethod());
		soapModel.setScriptResponse(model.getScriptResponse());
		soapModel.setSiteAwareness(model.getSiteAwareness());
		soapModel.setSupportAnonymous(model.getSupportAnonymous());
		soapModel.setDescription(model.getDescription());
		soapModel.setDeprecated(model.getDeprecated());
		soapModel.setCacheLiveTime(model.getCacheLiveTime());

		return soapModel;
	}

	public static ServicePublishDefSoap[] toSoapModels(
		ServicePublishDef[] models) {
		ServicePublishDefSoap[] soapModels = new ServicePublishDefSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServicePublishDefSoap[][] toSoapModels(
		ServicePublishDef[][] models) {
		ServicePublishDefSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServicePublishDefSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServicePublishDefSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServicePublishDefSoap[] toSoapModels(
		List<ServicePublishDef> models) {
		List<ServicePublishDefSoap> soapModels = new ArrayList<ServicePublishDefSoap>(models.size());

		for (ServicePublishDef model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServicePublishDefSoap[soapModels.size()]);
	}

	public ServicePublishDefSoap() {
	}

	public long getPrimaryKey() {
		return _publishId;
	}

	public void setPrimaryKey(long pk) {
		setPublishId(pk);
	}

	public long getPublishId() {
		return _publishId;
	}

	public void setPublishId(long publishId) {
		_publishId = publishId;
	}

	public String getPath() {
		return _path;
	}

	public void setPath(String path) {
		_path = path;
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

	public String getHttpMethod() {
		return _httpMethod;
	}

	public void setHttpMethod(String httpMethod) {
		_httpMethod = httpMethod;
	}

	public String getScriptResponse() {
		return _scriptResponse;
	}

	public void setScriptResponse(String scriptResponse) {
		_scriptResponse = scriptResponse;
	}

	public boolean getSiteAwareness() {
		return _siteAwareness;
	}

	public boolean isSiteAwareness() {
		return _siteAwareness;
	}

	public void setSiteAwareness(boolean siteAwareness) {
		_siteAwareness = siteAwareness;
	}

	public boolean getSupportAnonymous() {
		return _supportAnonymous;
	}

	public boolean isSupportAnonymous() {
		return _supportAnonymous;
	}

	public void setSupportAnonymous(boolean supportAnonymous) {
		_supportAnonymous = supportAnonymous;
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

	public int getCacheLiveTime() {
		return _cacheLiveTime;
	}

	public void setCacheLiveTime(int cacheLiveTime) {
		_cacheLiveTime = cacheLiveTime;
	}

	private long _publishId;
	private String _path;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _tagId;
	private String _httpMethod;
	private String _scriptResponse;
	private boolean _siteAwareness;
	private boolean _supportAnonymous;
	private String _description;
	private boolean _deprecated;
	private int _cacheLiveTime;
}