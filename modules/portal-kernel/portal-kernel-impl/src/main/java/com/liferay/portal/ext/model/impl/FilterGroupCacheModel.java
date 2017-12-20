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

import com.liferay.portal.ext.model.FilterGroup;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FilterGroup in entity cache.
 *
 * @author Jeff Qian
 * @see FilterGroup
 * @generated
 */
public class FilterGroupCacheModel implements CacheModel<FilterGroup>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{filterGroupId=");
		sb.append(filterGroupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", filterScopeId=");
		sb.append(filterScopeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FilterGroup toEntityModel() {
		FilterGroupImpl filterGroupImpl = new FilterGroupImpl();

		filterGroupImpl.setFilterGroupId(filterGroupId);
		filterGroupImpl.setUserId(userId);

		if (userName == null) {
			filterGroupImpl.setUserName(StringPool.BLANK);
		}
		else {
			filterGroupImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			filterGroupImpl.setCreateDate(null);
		}
		else {
			filterGroupImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			filterGroupImpl.setModifiedDate(null);
		}
		else {
			filterGroupImpl.setModifiedDate(new Date(modifiedDate));
		}

		filterGroupImpl.setGroupId(groupId);
		filterGroupImpl.setFilterScopeId(filterScopeId);

		filterGroupImpl.resetOriginalValues();

		return filterGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		filterGroupId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		groupId = objectInput.readLong();
		filterScopeId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(filterGroupId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(filterScopeId);
	}

	public long filterGroupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long groupId;
	public long filterScopeId;
}