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
 * This class is a wrapper for {@link ModelConnectionEntry}.
 * </p>
 *
 * @author Jeff Qian
 * @see ModelConnectionEntry
 * @generated
 */
@ProviderType
public class ModelConnectionEntryWrapper implements ModelConnectionEntry,
	ModelWrapper<ModelConnectionEntry> {
	public ModelConnectionEntryWrapper(
		ModelConnectionEntry modelConnectionEntry) {
		_modelConnectionEntry = modelConnectionEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return ModelConnectionEntry.class;
	}

	@Override
	public String getModelClassName() {
		return ModelConnectionEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("entryId", getEntryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("entryGroupId", getEntryGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long entryGroupId = (Long)attributes.get("entryGroupId");

		if (entryGroupId != null) {
			setEntryGroupId(entryGroupId);
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
	}

	/**
	* Returns the primary key of this model connection entry.
	*
	* @return the primary key of this model connection entry
	*/
	@Override
	public long getPrimaryKey() {
		return _modelConnectionEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this model connection entry.
	*
	* @param primaryKey the primary key of this model connection entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_modelConnectionEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the entry ID of this model connection entry.
	*
	* @return the entry ID of this model connection entry
	*/
	@Override
	public long getEntryId() {
		return _modelConnectionEntry.getEntryId();
	}

	/**
	* Sets the entry ID of this model connection entry.
	*
	* @param entryId the entry ID of this model connection entry
	*/
	@Override
	public void setEntryId(long entryId) {
		_modelConnectionEntry.setEntryId(entryId);
	}

	/**
	* Returns the company ID of this model connection entry.
	*
	* @return the company ID of this model connection entry
	*/
	@Override
	public long getCompanyId() {
		return _modelConnectionEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this model connection entry.
	*
	* @param companyId the company ID of this model connection entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_modelConnectionEntry.setCompanyId(companyId);
	}

	/**
	* Returns the entry group ID of this model connection entry.
	*
	* @return the entry group ID of this model connection entry
	*/
	@Override
	public long getEntryGroupId() {
		return _modelConnectionEntry.getEntryGroupId();
	}

	/**
	* Sets the entry group ID of this model connection entry.
	*
	* @param entryGroupId the entry group ID of this model connection entry
	*/
	@Override
	public void setEntryGroupId(long entryGroupId) {
		_modelConnectionEntry.setEntryGroupId(entryGroupId);
	}

	/**
	* Returns the user ID of this model connection entry.
	*
	* @return the user ID of this model connection entry
	*/
	@Override
	public long getUserId() {
		return _modelConnectionEntry.getUserId();
	}

	/**
	* Sets the user ID of this model connection entry.
	*
	* @param userId the user ID of this model connection entry
	*/
	@Override
	public void setUserId(long userId) {
		_modelConnectionEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this model connection entry.
	*
	* @return the user uuid of this model connection entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this model connection entry.
	*
	* @param userUuid the user uuid of this model connection entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_modelConnectionEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this model connection entry.
	*
	* @return the user name of this model connection entry
	*/
	@Override
	public java.lang.String getUserName() {
		return _modelConnectionEntry.getUserName();
	}

	/**
	* Sets the user name of this model connection entry.
	*
	* @param userName the user name of this model connection entry
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_modelConnectionEntry.setUserName(userName);
	}

	/**
	* Returns the create date of this model connection entry.
	*
	* @return the create date of this model connection entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _modelConnectionEntry.getCreateDate();
	}

	/**
	* Sets the create date of this model connection entry.
	*
	* @param createDate the create date of this model connection entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_modelConnectionEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this model connection entry.
	*
	* @return the modified date of this model connection entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _modelConnectionEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this model connection entry.
	*
	* @param modifiedDate the modified date of this model connection entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_modelConnectionEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the fully qualified class name of this model connection entry.
	*
	* @return the fully qualified class name of this model connection entry
	*/
	@Override
	public java.lang.String getClassName() {
		return _modelConnectionEntry.getClassName();
	}

	@Override
	public void setClassName(java.lang.String className) {
		_modelConnectionEntry.setClassName(className);
	}

	/**
	* Returns the class name ID of this model connection entry.
	*
	* @return the class name ID of this model connection entry
	*/
	@Override
	public long getClassNameId() {
		return _modelConnectionEntry.getClassNameId();
	}

	/**
	* Sets the class name ID of this model connection entry.
	*
	* @param classNameId the class name ID of this model connection entry
	*/
	@Override
	public void setClassNameId(long classNameId) {
		_modelConnectionEntry.setClassNameId(classNameId);
	}

	/**
	* Returns the class p k of this model connection entry.
	*
	* @return the class p k of this model connection entry
	*/
	@Override
	public long getClassPK() {
		return _modelConnectionEntry.getClassPK();
	}

	/**
	* Sets the class p k of this model connection entry.
	*
	* @param classPK the class p k of this model connection entry
	*/
	@Override
	public void setClassPK(long classPK) {
		_modelConnectionEntry.setClassPK(classPK);
	}

	@Override
	public boolean isNew() {
		return _modelConnectionEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_modelConnectionEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _modelConnectionEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_modelConnectionEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _modelConnectionEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _modelConnectionEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_modelConnectionEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _modelConnectionEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_modelConnectionEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_modelConnectionEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_modelConnectionEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ModelConnectionEntryWrapper((ModelConnectionEntry)_modelConnectionEntry.clone());
	}

	@Override
	public int compareTo(
		com.liferay.portal.ext.model.ModelConnectionEntry modelConnectionEntry) {
		return _modelConnectionEntry.compareTo(modelConnectionEntry);
	}

	@Override
	public int hashCode() {
		return _modelConnectionEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.portal.ext.model.ModelConnectionEntry> toCacheModel() {
		return _modelConnectionEntry.toCacheModel();
	}

	@Override
	public com.liferay.portal.ext.model.ModelConnectionEntry toEscapedModel() {
		return new ModelConnectionEntryWrapper(_modelConnectionEntry.toEscapedModel());
	}

	@Override
	public com.liferay.portal.ext.model.ModelConnectionEntry toUnescapedModel() {
		return new ModelConnectionEntryWrapper(_modelConnectionEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _modelConnectionEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _modelConnectionEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_modelConnectionEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ModelConnectionEntryWrapper)) {
			return false;
		}

		ModelConnectionEntryWrapper modelConnectionEntryWrapper = (ModelConnectionEntryWrapper)obj;

		if (Validator.equals(_modelConnectionEntry,
					modelConnectionEntryWrapper._modelConnectionEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ModelConnectionEntry getWrappedModelConnectionEntry() {
		return _modelConnectionEntry;
	}

	@Override
	public ModelConnectionEntry getWrappedModel() {
		return _modelConnectionEntry;
	}

	@Override
	public void resetOriginalValues() {
		_modelConnectionEntry.resetOriginalValues();
	}

	private ModelConnectionEntry _modelConnectionEntry;
}