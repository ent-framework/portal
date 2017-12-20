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
public class ServiceParamSoap implements Serializable {
	public static ServiceParamSoap toSoapModel(ServiceParam model) {
		ServiceParamSoap soapModel = new ServiceParamSoap();

		soapModel.setParamId(model.getParamId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setClassNameId(model.getClassNameId());
		soapModel.setClassPK(model.getClassPK());
		soapModel.setParamType(model.getParamType());
		soapModel.setParamName(model.getParamName());
		soapModel.setParamValue(model.getParamValue());
		soapModel.setParamObject(model.getParamObject());
		soapModel.setParamDesc(model.getParamDesc());
		soapModel.setDefaultValue(model.getDefaultValue());

		return soapModel;
	}

	public static ServiceParamSoap[] toSoapModels(ServiceParam[] models) {
		ServiceParamSoap[] soapModels = new ServiceParamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServiceParamSoap[][] toSoapModels(ServiceParam[][] models) {
		ServiceParamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServiceParamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServiceParamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServiceParamSoap[] toSoapModels(List<ServiceParam> models) {
		List<ServiceParamSoap> soapModels = new ArrayList<ServiceParamSoap>(models.size());

		for (ServiceParam model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServiceParamSoap[soapModels.size()]);
	}

	public ServiceParamSoap() {
	}

	public long getPrimaryKey() {
		return _paramId;
	}

	public void setPrimaryKey(long pk) {
		setParamId(pk);
	}

	public long getParamId() {
		return _paramId;
	}

	public void setParamId(long paramId) {
		_paramId = paramId;
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

	public String getParamType() {
		return _paramType;
	}

	public void setParamType(String paramType) {
		_paramType = paramType;
	}

	public String getParamName() {
		return _paramName;
	}

	public void setParamName(String paramName) {
		_paramName = paramName;
	}

	public String getParamValue() {
		return _paramValue;
	}

	public void setParamValue(String paramValue) {
		_paramValue = paramValue;
	}

	public String getParamObject() {
		return _paramObject;
	}

	public void setParamObject(String paramObject) {
		_paramObject = paramObject;
	}

	public String getParamDesc() {
		return _paramDesc;
	}

	public void setParamDesc(String paramDesc) {
		_paramDesc = paramDesc;
	}

	public String getDefaultValue() {
		return _defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		_defaultValue = defaultValue;
	}

	private long _paramId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _classNameId;
	private long _classPK;
	private String _paramType;
	private String _paramName;
	private String _paramValue;
	private String _paramObject;
	private String _paramDesc;
	private String _defaultValue;
}