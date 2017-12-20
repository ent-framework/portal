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
 * This class is a wrapper for {@link ModelConnectionLine}.
 * </p>
 *
 * @author Jeff Qian
 * @see ModelConnectionLine
 * @generated
 */
@ProviderType
public class ModelConnectionLineWrapper implements ModelConnectionLine,
	ModelWrapper<ModelConnectionLine> {
	public ModelConnectionLineWrapper(ModelConnectionLine modelConnectionLine) {
		_modelConnectionLine = modelConnectionLine;
	}

	@Override
	public Class<?> getModelClass() {
		return ModelConnectionLine.class;
	}

	@Override
	public String getModelClassName() {
		return ModelConnectionLine.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("lineId", getLineId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("lineGroupId", getLineGroupId());
		attributes.put("classNameId", getClassNameId());
		attributes.put("classPK", getClassPK());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long lineId = (Long)attributes.get("lineId");

		if (lineId != null) {
			setLineId(lineId);
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

		Long lineGroupId = (Long)attributes.get("lineGroupId");

		if (lineGroupId != null) {
			setLineGroupId(lineGroupId);
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
	* Returns the primary key of this model connection line.
	*
	* @return the primary key of this model connection line
	*/
	@Override
	public long getPrimaryKey() {
		return _modelConnectionLine.getPrimaryKey();
	}

	/**
	* Sets the primary key of this model connection line.
	*
	* @param primaryKey the primary key of this model connection line
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_modelConnectionLine.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the line ID of this model connection line.
	*
	* @return the line ID of this model connection line
	*/
	@Override
	public long getLineId() {
		return _modelConnectionLine.getLineId();
	}

	/**
	* Sets the line ID of this model connection line.
	*
	* @param lineId the line ID of this model connection line
	*/
	@Override
	public void setLineId(long lineId) {
		_modelConnectionLine.setLineId(lineId);
	}

	/**
	* Returns the user ID of this model connection line.
	*
	* @return the user ID of this model connection line
	*/
	@Override
	public long getUserId() {
		return _modelConnectionLine.getUserId();
	}

	/**
	* Sets the user ID of this model connection line.
	*
	* @param userId the user ID of this model connection line
	*/
	@Override
	public void setUserId(long userId) {
		_modelConnectionLine.setUserId(userId);
	}

	/**
	* Returns the user uuid of this model connection line.
	*
	* @return the user uuid of this model connection line
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionLine.getUserUuid();
	}

	/**
	* Sets the user uuid of this model connection line.
	*
	* @param userUuid the user uuid of this model connection line
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_modelConnectionLine.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this model connection line.
	*
	* @return the user name of this model connection line
	*/
	@Override
	public java.lang.String getUserName() {
		return _modelConnectionLine.getUserName();
	}

	/**
	* Sets the user name of this model connection line.
	*
	* @param userName the user name of this model connection line
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_modelConnectionLine.setUserName(userName);
	}

	/**
	* Returns the create date of this model connection line.
	*
	* @return the create date of this model connection line
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _modelConnectionLine.getCreateDate();
	}

	/**
	* Sets the create date of this model connection line.
	*
	* @param createDate the create date of this model connection line
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_modelConnectionLine.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this model connection line.
	*
	* @return the modified date of this model connection line
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _modelConnectionLine.getModifiedDate();
	}

	/**
	* Sets the modified date of this model connection line.
	*
	* @param modifiedDate the modified date of this model connection line
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_modelConnectionLine.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the line group ID of this model connection line.
	*
	* @return the line group ID of this model connection line
	*/
	@Override
	public long getLineGroupId() {
		return _modelConnectionLine.getLineGroupId();
	}

	/**
	* Sets the line group ID of this model connection line.
	*
	* @param lineGroupId the line group ID of this model connection line
	*/
	@Override
	public void setLineGroupId(long lineGroupId) {
		_modelConnectionLine.setLineGroupId(lineGroupId);
	}

	/**
	* Returns the fully qualified class name of this model connection line.
	*
	* @return the fully qualified class name of this model connection line
	*/
	@Override
	public java.lang.String getClassName() {
		return _modelConnectionLine.getClassName();
	}

	@Override
	public void setClassName(java.lang.String className) {
		_modelConnectionLine.setClassName(className);
	}

	/**
	* Returns the class name ID of this model connection line.
	*
	* @return the class name ID of this model connection line
	*/
	@Override
	public long getClassNameId() {
		return _modelConnectionLine.getClassNameId();
	}

	/**
	* Sets the class name ID of this model connection line.
	*
	* @param classNameId the class name ID of this model connection line
	*/
	@Override
	public void setClassNameId(long classNameId) {
		_modelConnectionLine.setClassNameId(classNameId);
	}

	/**
	* Returns the class p k of this model connection line.
	*
	* @return the class p k of this model connection line
	*/
	@Override
	public long getClassPK() {
		return _modelConnectionLine.getClassPK();
	}

	/**
	* Sets the class p k of this model connection line.
	*
	* @param classPK the class p k of this model connection line
	*/
	@Override
	public void setClassPK(long classPK) {
		_modelConnectionLine.setClassPK(classPK);
	}

	@Override
	public boolean isNew() {
		return _modelConnectionLine.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_modelConnectionLine.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _modelConnectionLine.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_modelConnectionLine.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _modelConnectionLine.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _modelConnectionLine.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_modelConnectionLine.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _modelConnectionLine.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_modelConnectionLine.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_modelConnectionLine.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_modelConnectionLine.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ModelConnectionLineWrapper((ModelConnectionLine)_modelConnectionLine.clone());
	}

	@Override
	public int compareTo(
		com.liferay.portal.ext.model.ModelConnectionLine modelConnectionLine) {
		return _modelConnectionLine.compareTo(modelConnectionLine);
	}

	@Override
	public int hashCode() {
		return _modelConnectionLine.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.portal.ext.model.ModelConnectionLine> toCacheModel() {
		return _modelConnectionLine.toCacheModel();
	}

	@Override
	public com.liferay.portal.ext.model.ModelConnectionLine toEscapedModel() {
		return new ModelConnectionLineWrapper(_modelConnectionLine.toEscapedModel());
	}

	@Override
	public com.liferay.portal.ext.model.ModelConnectionLine toUnescapedModel() {
		return new ModelConnectionLineWrapper(_modelConnectionLine.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _modelConnectionLine.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _modelConnectionLine.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_modelConnectionLine.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ModelConnectionLineWrapper)) {
			return false;
		}

		ModelConnectionLineWrapper modelConnectionLineWrapper = (ModelConnectionLineWrapper)obj;

		if (Validator.equals(_modelConnectionLine,
					modelConnectionLineWrapper._modelConnectionLine)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public ModelConnectionLine getWrappedModelConnectionLine() {
		return _modelConnectionLine;
	}

	@Override
	public ModelConnectionLine getWrappedModel() {
		return _modelConnectionLine;
	}

	@Override
	public void resetOriginalValues() {
		_modelConnectionLine.resetOriginalValues();
	}

	private ModelConnectionLine _modelConnectionLine;
}