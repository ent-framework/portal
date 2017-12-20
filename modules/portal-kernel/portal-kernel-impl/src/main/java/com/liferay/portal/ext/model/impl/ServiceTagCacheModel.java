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

import com.liferay.portal.ext.model.ServiceTag;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ServiceTag in entity cache.
 *
 * @author Jeff Qian
 * @see ServiceTag
 * @generated
 */
public class ServiceTagCacheModel implements CacheModel<ServiceTag>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{tagId=");
		sb.append(tagId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", tagName=");
		sb.append(tagName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServiceTag toEntityModel() {
		ServiceTagImpl serviceTagImpl = new ServiceTagImpl();

		serviceTagImpl.setTagId(tagId);
		serviceTagImpl.setUserId(userId);

		if (userName == null) {
			serviceTagImpl.setUserName(StringPool.BLANK);
		}
		else {
			serviceTagImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			serviceTagImpl.setCreateDate(null);
		}
		else {
			serviceTagImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			serviceTagImpl.setModifiedDate(null);
		}
		else {
			serviceTagImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tagName == null) {
			serviceTagImpl.setTagName(StringPool.BLANK);
		}
		else {
			serviceTagImpl.setTagName(tagName);
		}

		serviceTagImpl.resetOriginalValues();

		return serviceTagImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tagId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tagName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(tagId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (tagName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tagName);
		}
	}

	public long tagId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tagName;
}