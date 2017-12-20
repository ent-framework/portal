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

import com.liferay.portal.ext.model.ModelConnectionEntry;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ModelConnectionEntry in entity cache.
 *
 * @author Jeff Qian
 * @see ModelConnectionEntry
 * @generated
 */
public class ModelConnectionEntryCacheModel implements CacheModel<ModelConnectionEntry>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{entryId=");
		sb.append(entryId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", entryGroupId=");
		sb.append(entryGroupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", classNameId=");
		sb.append(classNameId);
		sb.append(", classPK=");
		sb.append(classPK);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ModelConnectionEntry toEntityModel() {
		ModelConnectionEntryImpl modelConnectionEntryImpl = new ModelConnectionEntryImpl();

		modelConnectionEntryImpl.setEntryId(entryId);
		modelConnectionEntryImpl.setCompanyId(companyId);
		modelConnectionEntryImpl.setEntryGroupId(entryGroupId);
		modelConnectionEntryImpl.setUserId(userId);

		if (userName == null) {
			modelConnectionEntryImpl.setUserName(StringPool.BLANK);
		}
		else {
			modelConnectionEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			modelConnectionEntryImpl.setCreateDate(null);
		}
		else {
			modelConnectionEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			modelConnectionEntryImpl.setModifiedDate(null);
		}
		else {
			modelConnectionEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		modelConnectionEntryImpl.setClassNameId(classNameId);
		modelConnectionEntryImpl.setClassPK(classPK);

		modelConnectionEntryImpl.resetOriginalValues();

		return modelConnectionEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		entryId = objectInput.readLong();
		companyId = objectInput.readLong();
		entryGroupId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		classNameId = objectInput.readLong();
		classPK = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(entryId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(entryGroupId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(classNameId);
		objectOutput.writeLong(classPK);
	}

	public long entryId;
	public long companyId;
	public long entryGroupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long classNameId;
	public long classPK;
}