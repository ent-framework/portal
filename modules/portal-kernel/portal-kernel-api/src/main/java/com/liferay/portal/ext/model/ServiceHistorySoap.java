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
public class ServiceHistorySoap implements Serializable {
	public static ServiceHistorySoap toSoapModel(ServiceHistory model) {
		ServiceHistorySoap soapModel = new ServiceHistorySoap();

		soapModel.setHisId(model.getHisId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setClassNameId(model.getClassNameId());
		soapModel.setClassPK(model.getClassPK());
		soapModel.setPage(model.getPage());
		soapModel.setFriendlyURL(model.getFriendlyURL());
		soapModel.setPortletName(model.getPortletName());
		soapModel.setStatusCode(model.getStatusCode());
		soapModel.setTimeCost(model.getTimeCost());
		soapModel.setResponseText(model.getResponseText());
		soapModel.setWrappedText(model.getWrappedText());
		soapModel.setDebugInfo(model.getDebugInfo());

		return soapModel;
	}

	public static ServiceHistorySoap[] toSoapModels(ServiceHistory[] models) {
		ServiceHistorySoap[] soapModels = new ServiceHistorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ServiceHistorySoap[][] toSoapModels(ServiceHistory[][] models) {
		ServiceHistorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ServiceHistorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new ServiceHistorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ServiceHistorySoap[] toSoapModels(List<ServiceHistory> models) {
		List<ServiceHistorySoap> soapModels = new ArrayList<ServiceHistorySoap>(models.size());

		for (ServiceHistory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ServiceHistorySoap[soapModels.size()]);
	}

	public ServiceHistorySoap() {
	}

	public long getPrimaryKey() {
		return _hisId;
	}

	public void setPrimaryKey(long pk) {
		setHisId(pk);
	}

	public long getHisId() {
		return _hisId;
	}

	public void setHisId(long hisId) {
		_hisId = hisId;
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

	public String getPage() {
		return _page;
	}

	public void setPage(String page) {
		_page = page;
	}

	public String getFriendlyURL() {
		return _friendlyURL;
	}

	public void setFriendlyURL(String friendlyURL) {
		_friendlyURL = friendlyURL;
	}

	public String getPortletName() {
		return _portletName;
	}

	public void setPortletName(String portletName) {
		_portletName = portletName;
	}

	public int getStatusCode() {
		return _statusCode;
	}

	public void setStatusCode(int statusCode) {
		_statusCode = statusCode;
	}

	public int getTimeCost() {
		return _timeCost;
	}

	public void setTimeCost(int timeCost) {
		_timeCost = timeCost;
	}

	public String getResponseText() {
		return _responseText;
	}

	public void setResponseText(String responseText) {
		_responseText = responseText;
	}

	public String getWrappedText() {
		return _wrappedText;
	}

	public void setWrappedText(String wrappedText) {
		_wrappedText = wrappedText;
	}

	public String getDebugInfo() {
		return _debugInfo;
	}

	public void setDebugInfo(String debugInfo) {
		_debugInfo = debugInfo;
	}

	private long _hisId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _classNameId;
	private long _classPK;
	private String _page;
	private String _friendlyURL;
	private String _portletName;
	private int _statusCode;
	private int _timeCost;
	private String _responseText;
	private String _wrappedText;
	private String _debugInfo;
}