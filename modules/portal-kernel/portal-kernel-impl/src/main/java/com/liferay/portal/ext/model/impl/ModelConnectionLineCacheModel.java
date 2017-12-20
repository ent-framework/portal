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

import com.liferay.portal.ext.model.ModelConnectionLine;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ModelConnectionLine in entity cache.
 *
 * @author Jeff Qian
 * @see ModelConnectionLine
 * @generated
 */
public class ModelConnectionLineCacheModel implements CacheModel<ModelConnectionLine>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{lineId=");
		sb.append(lineId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", lineGroupId=");
		sb.append(lineGroupId);
		sb.append(", classNameId=");
		sb.append(classNameId);
		sb.append(", classPK=");
		sb.append(classPK);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ModelConnectionLine toEntityModel() {
		ModelConnectionLineImpl modelConnectionLineImpl = new ModelConnectionLineImpl();

		modelConnectionLineImpl.setLineId(lineId);
		modelConnectionLineImpl.setUserId(userId);

		if (userName == null) {
			modelConnectionLineImpl.setUserName(StringPool.BLANK);
		}
		else {
			modelConnectionLineImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			modelConnectionLineImpl.setCreateDate(null);
		}
		else {
			modelConnectionLineImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			modelConnectionLineImpl.setModifiedDate(null);
		}
		else {
			modelConnectionLineImpl.setModifiedDate(new Date(modifiedDate));
		}

		modelConnectionLineImpl.setLineGroupId(lineGroupId);
		modelConnectionLineImpl.setClassNameId(classNameId);
		modelConnectionLineImpl.setClassPK(classPK);

		modelConnectionLineImpl.resetOriginalValues();

		return modelConnectionLineImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		lineId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		lineGroupId = objectInput.readLong();
		classNameId = objectInput.readLong();
		classPK = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(lineId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(lineGroupId);
		objectOutput.writeLong(classNameId);
		objectOutput.writeLong(classPK);
	}

	public long lineId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long lineGroupId;
	public long classNameId;
	public long classPK;
}