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
 * This class is a wrapper for {@link ServiceHistory}.
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceHistory
 * @generated
 */
@ProviderType
public class ServiceHistoryWrapper implements ServiceHistory,
	ModelWrapper<ServiceHistory> {
	public ServiceHistoryWrapper(ServiceHistory serviceHistory) {
		_serviceHistory = serviceHistory;
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceHistory.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceHistory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("hisId", getHisId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());
		attributes.put("page", getPage());
		attributes.put("friendlyURL", getFriendlyURL());
		attributes.put("portletName", getPortletName());
		attributes.put("statusCode", getStatusCode());
		attributes.put("timeCost", getTimeCost());
		attributes.put("responseText", getResponseText());
		attributes.put("wrappedText", getWrappedText());
		attributes.put("debugInfo", getDebugInfo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long hisId = (Long)attributes.get("hisId");

		if (hisId != null) {
			setHisId(hisId);
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

		Long classNameId = (Long)attributes.get("classNameId");

		if (classNameId != null) {
			setClassNameId(classNameId);
		}

		Long classPK = (Long)attributes.get("classPK");

		if (classPK != null) {
			setClassPK(classPK);
		}

		String page = (String)attributes.get("page");

		if (page != null) {
			setPage(page);
		}

		String friendlyURL = (String)attributes.get("friendlyURL");

		if (friendlyURL != null) {
			setFriendlyURL(friendlyURL);
		}

		String portletName = (String)attributes.get("portletName");

		if (portletName != null) {
			setPortletName(portletName);
		}

		Integer statusCode = (Integer)attributes.get("statusCode");

		if (statusCode != null) {
			setStatusCode(statusCode);
		}

		Integer timeCost = (Integer)attributes.get("timeCost");

		if (timeCost != null) {
			setTimeCost(timeCost);
		}

		String responseText = (String)attributes.get("responseText");

		if (responseText != null) {
			setResponseText(responseText);
		}

		String wrappedText = (String)attributes.get("wrappedText");

		if (wrappedText != null) {
			setWrappedText(wrappedText);
		}

		String debugInfo = (String)attributes.get("debugInfo");

		if (debugInfo != null) {
			setDebugInfo(debugInfo);
		}
	}

	/**
	* Returns the primary key of this service history.
	*
	* @return the primary key of this service history
	*/
	@Override
	public long getPrimaryKey() {
		return _serviceHistory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service history.
	*
	* @param primaryKey the primary key of this service history
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_serviceHistory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the his ID of this service history.
	*
	* @return the his ID of this service history
	*/
	@Override
	public long getHisId() {
		return _serviceHistory.getHisId();
	}

	/**
	* Sets the his ID of this service history.
	*
	* @param hisId the his ID of this service history
	*/
	@Override
	public void setHisId(long hisId) {
		_serviceHistory.setHisId(hisId);
	}

	/**
	* Returns the user ID of this service history.
	*
	* @return the user ID of this service history
	*/
	@Override
	public long getUserId() {
		return _serviceHistory.getUserId();
	}

	/**
	* Sets the user ID of this service history.
	*
	* @param userId the user ID of this service history
	*/
	@Override
	public void setUserId(long userId) {
		_serviceHistory.setUserId(userId);
	}

	/**
	* Returns the user uuid of this service history.
	*
	* @return the user uuid of this service history
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceHistory.getUserUuid();
	}

	/**
	* Sets the user uuid of this service history.
	*
	* @param userUuid the user uuid of this service history
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_serviceHistory.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this service history.
	*
	* @return the user name of this service history
	*/
	@Override
	public java.lang.String getUserName() {
		return _serviceHistory.getUserName();
	}

	/**
	* Sets the user name of this service history.
	*
	* @param userName the user name of this service history
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_serviceHistory.setUserName(userName);
	}

	/**
	* Returns the create date of this service history.
	*
	* @return the create date of this service history
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _serviceHistory.getCreateDate();
	}

	/**
	* Sets the create date of this service history.
	*
	* @param createDate the create date of this service history
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_serviceHistory.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this service history.
	*
	* @return the modified date of this service history
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _serviceHistory.getModifiedDate();
	}

	/**
	* Sets the modified date of this service history.
	*
	* @param modifiedDate the modified date of this service history
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_serviceHistory.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the fully qualified class name of this service history.
	*
	* @return the fully qualified class name of this service history
	*/
	@Override
	public java.lang.String getClassName() {
		return _serviceHistory.getClassName();
	}

	@Override
	public void setClassName(java.lang.String className) {
		_serviceHistory.setClassName(className);
	}

	/**
	* Returns the class name ID of this service history.
	*
	* @return the class name ID of this service history
	*/
	@Override
	public long getClassNameId() {
		return _serviceHistory.getClassNameId();
	}

	/**
	* Sets the class name ID of this service history.
	*
	* @param classNameId the class name ID of this service history
	*/
	@Override
	public void setClassNameId(long classNameId) {
		_serviceHistory.setClassNameId(classNameId);
	}

	/**
	* Returns the class p k of this service history.
	*
	* @return the class p k of this service history
	*/
	@Override
	public long getClassPK() {
		return _serviceHistory.getClassPK();
	}

	/**
	* Sets the class p k of this service history.
	*
	* @param classPK the class p k of this service history
	*/
	@Override
	public void setClassPK(long classPK) {
		_serviceHistory.setClassPK(classPK);
	}

	/**
	* Returns the page of this service history.
	*
	* @return the page of this service history
	*/
	@Override
	public java.lang.String getPage() {
		return _serviceHistory.getPage();
	}

	/**
	* Sets the page of this service history.
	*
	* @param page the page of this service history
	*/
	@Override
	public void setPage(java.lang.String page) {
		_serviceHistory.setPage(page);
	}

	/**
	* Returns the friendly u r l of this service history.
	*
	* @return the friendly u r l of this service history
	*/
	@Override
	public java.lang.String getFriendlyURL() {
		return _serviceHistory.getFriendlyURL();
	}

	/**
	* Sets the friendly u r l of this service history.
	*
	* @param friendlyURL the friendly u r l of this service history
	*/
	@Override
	public void setFriendlyURL(java.lang.String friendlyURL) {
		_serviceHistory.setFriendlyURL(friendlyURL);
	}

	/**
	* Returns the portlet name of this service history.
	*
	* @return the portlet name of this service history
	*/
	@Override
	public java.lang.String getPortletName() {
		return _serviceHistory.getPortletName();
	}

	/**
	* Sets the portlet name of this service history.
	*
	* @param portletName the portlet name of this service history
	*/
	@Override
	public void setPortletName(java.lang.String portletName) {
		_serviceHistory.setPortletName(portletName);
	}

	/**
	* Returns the status code of this service history.
	*
	* @return the status code of this service history
	*/
	@Override
	public int getStatusCode() {
		return _serviceHistory.getStatusCode();
	}

	/**
	* Sets the status code of this service history.
	*
	* @param statusCode the status code of this service history
	*/
	@Override
	public void setStatusCode(int statusCode) {
		_serviceHistory.setStatusCode(statusCode);
	}

	/**
	* Returns the time cost of this service history.
	*
	* @return the time cost of this service history
	*/
	@Override
	public int getTimeCost() {
		return _serviceHistory.getTimeCost();
	}

	/**
	* Sets the time cost of this service history.
	*
	* @param timeCost the time cost of this service history
	*/
	@Override
	public void setTimeCost(int timeCost) {
		_serviceHistory.setTimeCost(timeCost);
	}

	/**
	* Returns the response text of this service history.
	*
	* @return the response text of this service history
	*/
	@Override
	public java.lang.String getResponseText() {
		return _serviceHistory.getResponseText();
	}

	/**
	* Sets the response text of this service history.
	*
	* @param responseText the response text of this service history
	*/
	@Override
	public void setResponseText(java.lang.String responseText) {
		_serviceHistory.setResponseText(responseText);
	}

	/**
	* Returns the wrapped text of this service history.
	*
	* @return the wrapped text of this service history
	*/
	@Override
	public java.lang.String getWrappedText() {
		return _serviceHistory.getWrappedText();
	}

	/**
	* Sets the wrapped text of this service history.
	*
	* @param wrappedText the wrapped text of this service history
	*/
	@Override
	public void setWrappedText(java.lang.String wrappedText) {
		_serviceHistory.setWrappedText(wrappedText);
	}

	/**
	* Returns the debug info of this service history.
	*
	* @return the debug info of this service history
	*/
	@Override
	public java.lang.String getDebugInfo() {
		return _serviceHistory.getDebugInfo();
	}

	/**
	* Sets the debug info of this service history.
	*
	* @param debugInfo the debug info of this service history
	*/
	@Override
	public void setDebugInfo(java.lang.String debugInfo) {
		_serviceHistory.setDebugInfo(debugInfo);
	}

	@Override
	public boolean isNew() {
		return _serviceHistory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_serviceHistory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _serviceHistory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_serviceHistory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _serviceHistory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _serviceHistory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_serviceHistory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _serviceHistory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_serviceHistory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_serviceHistory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_serviceHistory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceHistoryWrapper((ServiceHistory)_serviceHistory.clone());
	}

	@Override
	public int compareTo(
		com.liferay.portal.ext.model.ServiceHistory serviceHistory) {
		return _serviceHistory.compareTo(serviceHistory);
	}

	@Override
	public int hashCode() {
		return _serviceHistory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.portal.ext.model.ServiceHistory> toCacheModel() {
		return _serviceHistory.toCacheModel();
	}

	@Override
	public com.liferay.portal.ext.model.ServiceHistory toEscapedModel() {
		return new ServiceHistoryWrapper(_serviceHistory.toEscapedModel());
	}

	@Override
	public com.liferay.portal.ext.model.ServiceHistory toUnescapedModel() {
		return new ServiceHistoryWrapper(_serviceHistory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _serviceHistory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _serviceHistory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceHistory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceHistoryWrapper)) {
			return false;
		}

		ServiceHistoryWrapper serviceHistoryWrapper = (ServiceHistoryWrapper)obj;

		if (Validator.equals(_serviceHistory,
					serviceHistoryWrapper._serviceHistory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServiceHistory getWrappedServiceHistory() {
		return _serviceHistory;
	}

	@Override
	public ServiceHistory getWrappedModel() {
		return _serviceHistory;
	}

	@Override
	public void resetOriginalValues() {
		_serviceHistory.resetOriginalValues();
	}

	private ServiceHistory _serviceHistory;
}