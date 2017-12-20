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
 * This class is used by SOAP remote services, specifically {@link com.liferay.portal.ext.service.http.ModelConnectionLineServiceSoap}.
 *
 * @author Jeff Qian
 * @see com.liferay.portal.ext.service.http.ModelConnectionLineServiceSoap
 * @generated
 */
public class ModelConnectionLineSoap implements Serializable {
	public static ModelConnectionLineSoap toSoapModel(ModelConnectionLine model) {
		ModelConnectionLineSoap soapModel = new ModelConnectionLineSoap();

		soapModel.setLineId(model.getLineId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setLineGroupId(model.getLineGroupId());
		soapModel.setClassNameId(model.getClassNameId());
		soapModel.setClassPK(model.getClassPK());

		return soapModel;
	}

	public static ModelConnectionLineSoap[] toSoapModels(
		ModelConnectionLine[] models) {
		ModelConnectionLineSoap[] soapModels = new ModelConnectionLineSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ModelConnectionLineSoap[][] toSoapModels(
		ModelConnectionLine[][] models) {
		ModelConnectionLineSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ModelConnectionLineSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ModelConnectionLineSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ModelConnectionLineSoap[] toSoapModels(
		List<ModelConnectionLine> models) {
		List<ModelConnectionLineSoap> soapModels = new ArrayList<ModelConnectionLineSoap>(models.size());

		for (ModelConnectionLine model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ModelConnectionLineSoap[soapModels.size()]);
	}

	public ModelConnectionLineSoap() {
	}

	public long getPrimaryKey() {
		return _lineId;
	}

	public void setPrimaryKey(long pk) {
		setLineId(pk);
	}

	public long getLineId() {
		return _lineId;
	}

	public void setLineId(long lineId) {
		_lineId = lineId;
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

	public long getLineGroupId() {
		return _lineGroupId;
	}

	public void setLineGroupId(long lineGroupId) {
		_lineGroupId = lineGroupId;
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

	private long _lineId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _lineGroupId;
	private long _classNameId;
	private long _classPK;
}