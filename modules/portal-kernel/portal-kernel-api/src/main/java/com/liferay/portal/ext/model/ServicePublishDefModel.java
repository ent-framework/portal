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
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ServicePublishDef service. Represents a row in the &quot;ServicePublishDef&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.ext.model.impl.ServicePublishDefModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.ext.model.impl.ServicePublishDefImpl}.
 * </p>
 *
 * @author Jeff Qian
 * @see ServicePublishDef
 * @see com.liferay.portal.ext.model.impl.ServicePublishDefImpl
 * @see com.liferay.portal.ext.model.impl.ServicePublishDefModelImpl
 * @generated
 */
@ProviderType
public interface ServicePublishDefModel extends BaseModel<ServicePublishDef> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a service publish def model instance should use the {@link ServicePublishDef} interface instead.
	 */

	/**
	 * Returns the primary key of this service publish def.
	 *
	 * @return the primary key of this service publish def
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this service publish def.
	 *
	 * @param primaryKey the primary key of this service publish def
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the publish ID of this service publish def.
	 *
	 * @return the publish ID of this service publish def
	 */
	public long getPublishId();

	/**
	 * Sets the publish ID of this service publish def.
	 *
	 * @param publishId the publish ID of this service publish def
	 */
	public void setPublishId(long publishId);

	/**
	 * Returns the path of this service publish def.
	 *
	 * @return the path of this service publish def
	 */
	@AutoEscape
	public String getPath();

	/**
	 * Sets the path of this service publish def.
	 *
	 * @param path the path of this service publish def
	 */
	public void setPath(String path);

	/**
	 * Returns the user ID of this service publish def.
	 *
	 * @return the user ID of this service publish def
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this service publish def.
	 *
	 * @param userId the user ID of this service publish def
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this service publish def.
	 *
	 * @return the user uuid of this service publish def
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this service publish def.
	 *
	 * @param userUuid the user uuid of this service publish def
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this service publish def.
	 *
	 * @return the user name of this service publish def
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this service publish def.
	 *
	 * @param userName the user name of this service publish def
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this service publish def.
	 *
	 * @return the create date of this service publish def
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this service publish def.
	 *
	 * @param createDate the create date of this service publish def
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this service publish def.
	 *
	 * @return the modified date of this service publish def
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this service publish def.
	 *
	 * @param modifiedDate the modified date of this service publish def
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the tag ID of this service publish def.
	 *
	 * @return the tag ID of this service publish def
	 */
	public long getTagId();

	/**
	 * Sets the tag ID of this service publish def.
	 *
	 * @param tagId the tag ID of this service publish def
	 */
	public void setTagId(long tagId);

	/**
	 * Returns the http method of this service publish def.
	 *
	 * @return the http method of this service publish def
	 */
	@AutoEscape
	public String getHttpMethod();

	/**
	 * Sets the http method of this service publish def.
	 *
	 * @param httpMethod the http method of this service publish def
	 */
	public void setHttpMethod(String httpMethod);

	/**
	 * Returns the script response of this service publish def.
	 *
	 * @return the script response of this service publish def
	 */
	@AutoEscape
	public String getScriptResponse();

	/**
	 * Sets the script response of this service publish def.
	 *
	 * @param scriptResponse the script response of this service publish def
	 */
	public void setScriptResponse(String scriptResponse);

	/**
	 * Returns the site awareness of this service publish def.
	 *
	 * @return the site awareness of this service publish def
	 */
	public boolean getSiteAwareness();

	/**
	 * Returns <code>true</code> if this service publish def is site awareness.
	 *
	 * @return <code>true</code> if this service publish def is site awareness; <code>false</code> otherwise
	 */
	public boolean isSiteAwareness();

	/**
	 * Sets whether this service publish def is site awareness.
	 *
	 * @param siteAwareness the site awareness of this service publish def
	 */
	public void setSiteAwareness(boolean siteAwareness);

	/**
	 * Returns the support anonymous of this service publish def.
	 *
	 * @return the support anonymous of this service publish def
	 */
	public boolean getSupportAnonymous();

	/**
	 * Returns <code>true</code> if this service publish def is support anonymous.
	 *
	 * @return <code>true</code> if this service publish def is support anonymous; <code>false</code> otherwise
	 */
	public boolean isSupportAnonymous();

	/**
	 * Sets whether this service publish def is support anonymous.
	 *
	 * @param supportAnonymous the support anonymous of this service publish def
	 */
	public void setSupportAnonymous(boolean supportAnonymous);

	/**
	 * Returns the description of this service publish def.
	 *
	 * @return the description of this service publish def
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this service publish def.
	 *
	 * @param description the description of this service publish def
	 */
	public void setDescription(String description);

	/**
	 * Returns the deprecated of this service publish def.
	 *
	 * @return the deprecated of this service publish def
	 */
	public boolean getDeprecated();

	/**
	 * Returns <code>true</code> if this service publish def is deprecated.
	 *
	 * @return <code>true</code> if this service publish def is deprecated; <code>false</code> otherwise
	 */
	public boolean isDeprecated();

	/**
	 * Sets whether this service publish def is deprecated.
	 *
	 * @param deprecated the deprecated of this service publish def
	 */
	public void setDeprecated(boolean deprecated);

	/**
	 * Returns the cache live time of this service publish def.
	 *
	 * @return the cache live time of this service publish def
	 */
	public int getCacheLiveTime();

	/**
	 * Sets the cache live time of this service publish def.
	 *
	 * @param cacheLiveTime the cache live time of this service publish def
	 */
	public void setCacheLiveTime(int cacheLiveTime);

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
		com.liferay.portal.ext.model.ServicePublishDef servicePublishDef);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portal.ext.model.ServicePublishDef> toCacheModel();

	@Override
	public com.liferay.portal.ext.model.ServicePublishDef toEscapedModel();

	@Override
	public com.liferay.portal.ext.model.ServicePublishDef toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}