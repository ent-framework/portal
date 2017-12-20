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
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ModelConnectionEntry service. Represents a row in the &quot;ModelConnectionEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryImpl}.
 * </p>
 *
 * @author Jeff Qian
 * @see ModelConnectionEntry
 * @see com.liferay.portal.ext.model.impl.ModelConnectionEntryImpl
 * @see com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl
 * @generated
 */
@ProviderType
public interface ModelConnectionEntryModel extends AttachedModel, AuditedModel,
	BaseModel<ModelConnectionEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a model connection entry model instance should use the {@link ModelConnectionEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this model connection entry.
	 *
	 * @return the primary key of this model connection entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this model connection entry.
	 *
	 * @param primaryKey the primary key of this model connection entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the entry ID of this model connection entry.
	 *
	 * @return the entry ID of this model connection entry
	 */
	public long getEntryId();

	/**
	 * Sets the entry ID of this model connection entry.
	 *
	 * @param entryId the entry ID of this model connection entry
	 */
	public void setEntryId(long entryId);

	/**
	 * Returns the company ID of this model connection entry.
	 *
	 * @return the company ID of this model connection entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this model connection entry.
	 *
	 * @param companyId the company ID of this model connection entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the entry group ID of this model connection entry.
	 *
	 * @return the entry group ID of this model connection entry
	 */
	public long getEntryGroupId();

	/**
	 * Sets the entry group ID of this model connection entry.
	 *
	 * @param entryGroupId the entry group ID of this model connection entry
	 */
	public void setEntryGroupId(long entryGroupId);

	/**
	 * Returns the user ID of this model connection entry.
	 *
	 * @return the user ID of this model connection entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this model connection entry.
	 *
	 * @param userId the user ID of this model connection entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this model connection entry.
	 *
	 * @return the user uuid of this model connection entry
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this model connection entry.
	 *
	 * @param userUuid the user uuid of this model connection entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this model connection entry.
	 *
	 * @return the user name of this model connection entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this model connection entry.
	 *
	 * @param userName the user name of this model connection entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this model connection entry.
	 *
	 * @return the create date of this model connection entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this model connection entry.
	 *
	 * @param createDate the create date of this model connection entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this model connection entry.
	 *
	 * @return the modified date of this model connection entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this model connection entry.
	 *
	 * @param modifiedDate the modified date of this model connection entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the fully qualified class name of this model connection entry.
	 *
	 * @return the fully qualified class name of this model connection entry
	 */
	@Override
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this model connection entry.
	 *
	 * @return the class name ID of this model connection entry
	 */
	@Override
	public long getClassNameId();

	/**
	 * Sets the class name ID of this model connection entry.
	 *
	 * @param classNameId the class name ID of this model connection entry
	 */
	@Override
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class p k of this model connection entry.
	 *
	 * @return the class p k of this model connection entry
	 */
	@Override
	public long getClassPK();

	/**
	 * Sets the class p k of this model connection entry.
	 *
	 * @param classPK the class p k of this model connection entry
	 */
	@Override
	public void setClassPK(long classPK);

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
	public int compareTo(
		com.liferay.portal.ext.model.ModelConnectionEntry modelConnectionEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portal.ext.model.ModelConnectionEntry> toCacheModel();

	@Override
	public com.liferay.portal.ext.model.ModelConnectionEntry toEscapedModel();

	@Override
	public com.liferay.portal.ext.model.ModelConnectionEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}