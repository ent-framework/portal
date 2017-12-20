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
 * This class is a wrapper for {@link ServiceTag}.
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceTag
 * @generated
 */
@ProviderType
public class ServiceTagWrapper implements ServiceTag, ModelWrapper<ServiceTag> {
	public ServiceTagWrapper(ServiceTag serviceTag) {
		_serviceTag = serviceTag;
	}

	@Override
	public Class<?> getModelClass() {
		return ServiceTag.class;
	}

	@Override
	public String getModelClassName() {
		return ServiceTag.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tagId", getTagId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tagName", getTagName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tagId = (Long)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
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

		String tagName = (String)attributes.get("tagName");

		if (tagName != null) {
			setTagName(tagName);
		}
	}

	/**
	* Returns the primary key of this service tag.
	*
	* @return the primary key of this service tag
	*/
	@Override
	public long getPrimaryKey() {
		return _serviceTag.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service tag.
	*
	* @param primaryKey the primary key of this service tag
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_serviceTag.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the tag ID of this service tag.
	*
	* @return the tag ID of this service tag
	*/
	@Override
	public long getTagId() {
		return _serviceTag.getTagId();
	}

	/**
	* Sets the tag ID of this service tag.
	*
	* @param tagId the tag ID of this service tag
	*/
	@Override
	public void setTagId(long tagId) {
		_serviceTag.setTagId(tagId);
	}

	/**
	* Returns the user ID of this service tag.
	*
	* @return the user ID of this service tag
	*/
	@Override
	public long getUserId() {
		return _serviceTag.getUserId();
	}

	/**
	* Sets the user ID of this service tag.
	*
	* @param userId the user ID of this service tag
	*/
	@Override
	public void setUserId(long userId) {
		_serviceTag.setUserId(userId);
	}

	/**
	* Returns the user uuid of this service tag.
	*
	* @return the user uuid of this service tag
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceTag.getUserUuid();
	}

	/**
	* Sets the user uuid of this service tag.
	*
	* @param userUuid the user uuid of this service tag
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_serviceTag.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this service tag.
	*
	* @return the user name of this service tag
	*/
	@Override
	public java.lang.String getUserName() {
		return _serviceTag.getUserName();
	}

	/**
	* Sets the user name of this service tag.
	*
	* @param userName the user name of this service tag
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_serviceTag.setUserName(userName);
	}

	/**
	* Returns the create date of this service tag.
	*
	* @return the create date of this service tag
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _serviceTag.getCreateDate();
	}

	/**
	* Sets the create date of this service tag.
	*
	* @param createDate the create date of this service tag
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_serviceTag.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this service tag.
	*
	* @return the modified date of this service tag
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _serviceTag.getModifiedDate();
	}

	/**
	* Sets the modified date of this service tag.
	*
	* @param modifiedDate the modified date of this service tag
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_serviceTag.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the tag name of this service tag.
	*
	* @return the tag name of this service tag
	*/
	@Override
	public java.lang.String getTagName() {
		return _serviceTag.getTagName();
	}

	/**
	* Sets the tag name of this service tag.
	*
	* @param tagName the tag name of this service tag
	*/
	@Override
	public void setTagName(java.lang.String tagName) {
		_serviceTag.setTagName(tagName);
	}

	@Override
	public boolean isNew() {
		return _serviceTag.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_serviceTag.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _serviceTag.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_serviceTag.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _serviceTag.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _serviceTag.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_serviceTag.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _serviceTag.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_serviceTag.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_serviceTag.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_serviceTag.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceTagWrapper((ServiceTag)_serviceTag.clone());
	}

	@Override
	public int compareTo(com.liferay.portal.ext.model.ServiceTag serviceTag) {
		return _serviceTag.compareTo(serviceTag);
	}

	@Override
	public int hashCode() {
		return _serviceTag.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.portal.ext.model.ServiceTag> toCacheModel() {
		return _serviceTag.toCacheModel();
	}

	@Override
	public com.liferay.portal.ext.model.ServiceTag toEscapedModel() {
		return new ServiceTagWrapper(_serviceTag.toEscapedModel());
	}

	@Override
	public com.liferay.portal.ext.model.ServiceTag toUnescapedModel() {
		return new ServiceTagWrapper(_serviceTag.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _serviceTag.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _serviceTag.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceTag.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceTagWrapper)) {
			return false;
		}

		ServiceTagWrapper serviceTagWrapper = (ServiceTagWrapper)obj;

		if (Validator.equals(_serviceTag, serviceTagWrapper._serviceTag)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ServiceTag getWrappedServiceTag() {
		return _serviceTag;
	}

	@Override
	public ServiceTag getWrappedModel() {
		return _serviceTag;
	}

	@Override
	public void resetOriginalValues() {
		_serviceTag.resetOriginalValues();
	}

	private ServiceTag _serviceTag;
}