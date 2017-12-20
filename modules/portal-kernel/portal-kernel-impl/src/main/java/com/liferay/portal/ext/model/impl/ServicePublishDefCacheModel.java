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

package com.liferay.portal.ext.model.impl;

import com.liferay.portal.ext.model.ServicePublishDef;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ServicePublishDef in entity cache.
 *
 * @author Jeff Qian
 * @see ServicePublishDef
 * @generated
 */
public class ServicePublishDefCacheModel implements CacheModel<ServicePublishDef>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{publishId=");
		sb.append(publishId);
		sb.append(", path=");
		sb.append(path);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", tagId=");
		sb.append(tagId);
		sb.append(", httpMethod=");
		sb.append(httpMethod);
		sb.append(", scriptResponse=");
		sb.append(scriptResponse);
		sb.append(", siteAwareness=");
		sb.append(siteAwareness);
		sb.append(", supportAnonymous=");
		sb.append(supportAnonymous);
		sb.append(", description=");
		sb.append(description);
		sb.append(", deprecated=");
		sb.append(deprecated);
		sb.append(", cacheLiveTime=");
		sb.append(cacheLiveTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServicePublishDef toEntityModel() {
		ServicePublishDefImpl servicePublishDefImpl = new ServicePublishDefImpl();

		servicePublishDefImpl.setPublishId(publishId);

		if (path == null) {
			servicePublishDefImpl.setPath(StringPool.BLANK);
		}
		else {
			servicePublishDefImpl.setPath(path);
		}

		servicePublishDefImpl.setUserId(userId);

		if (userName == null) {
			servicePublishDefImpl.setUserName(StringPool.BLANK);
		}
		else {
			servicePublishDefImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			servicePublishDefImpl.setCreateDate(null);
		}
		else {
			servicePublishDefImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			servicePublishDefImpl.setModifiedDate(null);
		}
		else {
			servicePublishDefImpl.setModifiedDate(new Date(modifiedDate));
		}

		servicePublishDefImpl.setTagId(tagId);

		if (httpMethod == null) {
			servicePublishDefImpl.setHttpMethod(StringPool.BLANK);
		}
		else {
			servicePublishDefImpl.setHttpMethod(httpMethod);
		}

		if (scriptResponse == null) {
			servicePublishDefImpl.setScriptResponse(StringPool.BLANK);
		}
		else {
			servicePublishDefImpl.setScriptResponse(scriptResponse);
		}

		servicePublishDefImpl.setSiteAwareness(siteAwareness);
		servicePublishDefImpl.setSupportAnonymous(supportAnonymous);

		if (description == null) {
			servicePublishDefImpl.setDescription(StringPool.BLANK);
		}
		else {
			servicePublishDefImpl.setDescription(description);
		}

		servicePublishDefImpl.setDeprecated(deprecated);
		servicePublishDefImpl.setCacheLiveTime(cacheLiveTime);

		servicePublishDefImpl.resetOriginalValues();

		return servicePublishDefImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		publishId = objectInput.readLong();
		path = objectInput.readUTF();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tagId = objectInput.readLong();
		httpMethod = objectInput.readUTF();
		scriptResponse = objectInput.readUTF();
		siteAwareness = objectInput.readBoolean();
		supportAnonymous = objectInput.readBoolean();
		description = objectInput.readUTF();
		deprecated = objectInput.readBoolean();
		cacheLiveTime = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(publishId);

		if (path == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(path);
		}

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(tagId);

		if (httpMethod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(httpMethod);
		}

		if (scriptResponse == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(scriptResponse);
		}

		objectOutput.writeBoolean(siteAwareness);
		objectOutput.writeBoolean(supportAnonymous);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeBoolean(deprecated);
		objectOutput.writeInt(cacheLiveTime);
	}

	public long publishId;
	public String path;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long tagId;
	public String httpMethod;
	public String scriptResponse;
	public boolean siteAwareness;
	public boolean supportAnonymous;
	public String description;
	public boolean deprecated;
	public int cacheLiveTime;
}