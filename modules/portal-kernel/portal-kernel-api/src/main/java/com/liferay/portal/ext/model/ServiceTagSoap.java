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
public class ServiceTagSoap implements Serializable {
	public static ServiceTagSoap toSoapModel(ServiceTag model) {
		ServiceTagSoap soapModel = new ServiceTagSoap();

		soapModel.setTagId(model.getTagId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTagName(model.getTagName());

		return soapModel;
	}

	public static ServiceTagSoap[] toSoapModels(ServiceTag[] models) {
		ServiceTagSoap[] soapModels = new ServiceTagSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServiceTagSoap[][] toSoapModels(ServiceTag[][] models) {
		ServiceTagSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServiceTagSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServiceTagSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServiceTagSoap[] toSoapModels(List<ServiceTag> models) {
		List<ServiceTagSoap> soapModels = new ArrayList<ServiceTagSoap>(models.size());

		for (ServiceTag model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServiceTagSoap[soapModels.size()]);
	}

	public ServiceTagSoap() {
	}

	public long getPrimaryKey() {
		return _tagId;
	}

	public void setPrimaryKey(long pk) {
		setTagId(pk);
	}

	public long getTagId() {
		return _tagId;
	}

	public void setTagId(long tagId) {
		_tagId = tagId;
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

	public String getTagName() {
		return _tagName;
	}

	public void setTagName(String tagName) {
		_tagName = tagName;
	}

	private long _tagId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tagName;
}