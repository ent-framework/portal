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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ServiceParam service. Represents a row in the &quot;ServiceParam&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.ext.model.impl.ServiceParamImpl}.
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceParam
 * @see com.liferay.portal.ext.model.impl.ServiceParamImpl
 * @see com.liferay.portal.ext.model.impl.ServiceParamModelImpl
 * @generated
 */
@ProviderType
public interface ServiceParamModel extends AttachedModel, BaseModel<ServiceParam> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a service param model instance should use the {@link ServiceParam} interface instead.
	 */

	/**
	 * Returns the primary key of this service param.
	 *
	 * @return the primary key of this service param
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this service param.
	 *
	 * @param primaryKey the primary key of this service param
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the param ID of this service param.
	 *
	 * @return the param ID of this service param
	 */
	public long getParamId();

	/**
	 * Sets the param ID of this service param.
	 *
	 * @param paramId the param ID of this service param
	 */
	public void setParamId(long paramId);

	/**
	 * Returns the user ID of this service param.
	 *
	 * @return the user ID of this service param
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this service param.
	 *
	 * @param userId the user ID of this service param
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this service param.
	 *
	 * @return the user uuid of this service param
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this service param.
	 *
	 * @param userUuid the user uuid of this service param
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this service param.
	 *
	 * @return the user name of this service param
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this service param.
	 *
	 * @param userName the user name of this service param
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this service param.
	 *
	 * @return the create date of this service param
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this service param.
	 *
	 * @param createDate the create date of this service param
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this service param.
	 *
	 * @return the modified date of this service param
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this service param.
	 *
	 * @param modifiedDate the modified date of this service param
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the fully qualified class name of this service param.
	 *
	 * @return the fully qualified class name of this service param
	 */
	@Override
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this service param.
	 *
	 * @return the class name ID of this service param
	 */
	@Override
	public long getClassNameId();

	/**
	 * Sets the class name ID of this service param.
	 *
	 * @param classNameId the class name ID of this service param
	 */
	@Override
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class p k of this service param.
	 *
	 * @return the class p k of this service param
	 */
	@Override
	public long getClassPK();

	/**
	 * Sets the class p k of this service param.
	 *
	 * @param classPK the class p k of this service param
	 */
	@Override
	public void setClassPK(long classPK);

	/**
	 * Returns the param type of this service param.
	 *
	 * @return the param type of this service param
	 */
	@AutoEscape
	public String getParamType();

	/**
	 * Sets the param type of this service param.
	 *
	 * @param paramType the param type of this service param
	 */
	public void setParamType(String paramType);

	/**
	 * Returns the param name of this service param.
	 *
	 * @return the param name of this service param
	 */
	@AutoEscape
	public String getParamName();

	/**
	 * Sets the param name of this service param.
	 *
	 * @param paramName the param name of this service param
	 */
	public void setParamName(String paramName);

	/**
	 * Returns the param value of this service param.
	 *
	 * @return the param value of this service param
	 */
	@AutoEscape
	public String getParamValue();

	/**
	 * Sets the param value of this service param.
	 *
	 * @param paramValue the param value of this service param
	 */
	public void setParamValue(String paramValue);

	/**
	 * Returns the param object of this service param.
	 *
	 * @return the param object of this service param
	 */
	@AutoEscape
	public String getParamObject();

	/**
	 * Sets the param object of this service param.
	 *
	 * @param paramObject the param object of this service param
	 */
	public void setParamObject(String paramObject);

	/**
	 * Returns the param desc of this service param.
	 *
	 * @return the param desc of this service param
	 */
	@AutoEscape
	public String getParamDesc();

	/**
	 * Sets the param desc of this service param.
	 *
	 * @param paramDesc the param desc of this service param
	 */
	public void setParamDesc(String paramDesc);

	/**
	 * Returns the default value of this service param.
	 *
	 * @return the default value of this service param
	 */
	@AutoEscape
	public String getDefaultValue();

	/**
	 * Sets the default value of this service param.
	 *
	 * @param defaultValue the default value of this service param
	 */
	public void setDefaultValue(String defaultValue);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.portal.ext.model.ServiceParam serviceParam);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portal.ext.model.ServiceParam> toCacheModel();

	@Override
	public com.liferay.portal.ext.model.ServiceParam toEscapedModel();

	@Override
	public com.liferay.portal.ext.model.ServiceParam toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}