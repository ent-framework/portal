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
public class ServiceAuthorizationSoap implements Serializable {
	public static ServiceAuthorizationSoap toSoapModel(
		ServiceAuthorization model) {
		ServiceAuthorizationSoap soapModel = new ServiceAuthorizationSoap();

		soapModel.setAuthId(model.getAuthId());
		soapModel.setCode(model.getCode());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setClassNameId(model.getClassNameId());
		soapModel.setClassPK(model.getClassPK());
		soapModel.setType(model.getType());
		soapModel.setTemplate(model.getTemplate());

		return soapModel;
	}

	public static ServiceAuthorizationSoap[] toSoapModels(
		ServiceAuthorization[] models) {
		ServiceAuthorizationSoap[] soapModels = new ServiceAuthorizationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServiceAuthorizationSoap[][] toSoapModels(
		ServiceAuthorization[][] models) {
		ServiceAuthorizationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServiceAuthorizationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServiceAuthorizationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServiceAuthorizationSoap[] toSoapModels(
		List<ServiceAuthorization> models) {
		List<ServiceAuthorizationSoap> soapModels = new ArrayList<ServiceAuthorizationSoap>(models.size());

		for (ServiceAuthorization model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServiceAuthorizationSoap[soapModels.size()]);
	}

	public ServiceAuthorizationSoap() {
	}

	public long getPrimaryKey() {
		return _authId;
	}

	public void setPrimaryKey(long pk) {
		setAuthId(pk);
	}

	public long getAuthId() {
		return _authId;
	}

	public void setAuthId(long authId) {
		_authId = authId;
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

	public long getClassNameId() {
		return _classNameId;
	}

	public void setClassNameId(long classNameId) {
		_classNameId = classNameId;
	}

	public long getClassPK() {
		return _classPK;
	}

	public void setClassPK(long classPK) {
		_classPK = classPK;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getTemplate() {
		return _template;
	}

	public void setTemplate(String template) {
		_template = template;
	}

	private long _authId;
	private String _code;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _classNameId;
	private long _classPK;
	private String _type;
	private String _template;
}