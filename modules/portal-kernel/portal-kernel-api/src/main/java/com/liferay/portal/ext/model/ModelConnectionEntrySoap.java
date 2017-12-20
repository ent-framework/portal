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
 * This class is used by SOAP remote services, specifically {@link com.liferay.portal.ext.service.http.ModelConnectionEntryServiceSoap}.
 *
 * @author Jeff Qian
 * @see com.liferay.portal.ext.service.http.ModelConnectionEntryServiceSoap
 * @generated
 */
public class ModelConnectionEntrySoap implements Serializable {
	public static ModelConnectionEntrySoap toSoapModel(
		ModelConnectionEntry model) {
		ModelConnectionEntrySoap soapModel = new ModelConnectionEntrySoap();

		soapModel.setEntryId(model.getEntryId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setEntryGroupId(model.getEntryGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setClassNameId(model.getClassNameId());
		soapModel.setClassPK(model.getClassPK());

		return soapModel;
	}

	public static ModelConnectionEntrySoap[] toSoapModels(
		ModelConnectionEntry[] models) {
		ModelConnectionEntrySoap[] soapModels = new ModelConnectionEntrySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ModelConnectionEntrySoap[][] toSoapModels(
		ModelConnectionEntry[][] models) {
		ModelConnectionEntrySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ModelConnectionEntrySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ModelConnectionEntrySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ModelConnectionEntrySoap[] toSoapModels(
		List<ModelConnectionEntry> models) {
		List<ModelConnectionEntrySoap> soapModels = new ArrayList<ModelConnectionEntrySoap>(models.size());

		for (ModelConnectionEntry model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ModelConnectionEntrySoap[soapModels.size()]);
	}

	public ModelConnectionEntrySoap() {
	}

	public long getPrimaryKey() {
		return _entryId;
	}

	public void setPrimaryKey(long pk) {
		setEntryId(pk);
	}

	public long getEntryId() {
		return _entryId;
	}

	public void setEntryId(long entryId) {
		_entryId = entryId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getEntryGroupId() {
		return _entryGroupId;
	}

	public void setEntryGroupId(long entryGroupId) {
		_entryGroupId = entryGroupId;
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

	private long _entryId;
	private long _companyId;
	private long _entryGroupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _classNameId;
	private long _classPK;
}