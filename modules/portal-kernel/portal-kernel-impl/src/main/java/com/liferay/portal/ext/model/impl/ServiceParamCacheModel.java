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

import com.liferay.portal.ext.model.ServiceParam;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ServiceParam in entity cache.
 *
 * @author Jeff Qian
 * @see ServiceParam
 * @generated
 */
public class ServiceParamCacheModel implements CacheModel<ServiceParam>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{paramId=");
		sb.append(paramId);
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
		sb.append(", paramType=");
		sb.append(paramType);
		sb.append(", paramName=");
		sb.append(paramName);
		sb.append(", paramValue=");
		sb.append(paramValue);
		sb.append(", paramObject=");
		sb.append(paramObject);
		sb.append(", paramDesc=");
		sb.append(paramDesc);
		sb.append(", defaultValue=");
		sb.append(defaultValue);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServiceParam toEntityModel() {
		ServiceParamImpl serviceParamImpl = new ServiceParamImpl();

		serviceParamImpl.setParamId(paramId);
		serviceParamImpl.setUserId(userId);

		if (userName == null) {
			serviceParamImpl.setUserName(StringPool.BLANK);
		}
		else {
			serviceParamImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			serviceParamImpl.setCreateDate(null);
		}
		else {
			serviceParamImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			serviceParamImpl.setModifiedDate(null);
		}
		else {
			serviceParamImpl.setModifiedDate(new Date(modifiedDate));
		}

		serviceParamImpl.setClassNameId(classNameId);
		serviceParamImpl.setClassPK(classPK);

		if (paramType == null) {
			serviceParamImpl.setParamType(StringPool.BLANK);
		}
		else {
			serviceParamImpl.setParamType(paramType);
		}

		if (paramName == null) {
			serviceParamImpl.setParamName(StringPool.BLANK);
		}
		else {
			serviceParamImpl.setParamName(paramName);
		}

		if (paramValue == null) {
			serviceParamImpl.setParamValue(StringPool.BLANK);
		}
		else {
			serviceParamImpl.setParamValue(paramValue);
		}

		if (paramObject == null) {
			serviceParamImpl.setParamObject(StringPool.BLANK);
		}
		else {
			serviceParamImpl.setParamObject(paramObject);
		}

		if (paramDesc == null) {
			serviceParamImpl.setParamDesc(StringPool.BLANK);
		}
		else {
			serviceParamImpl.setParamDesc(paramDesc);
		}

		if (defaultValue == null) {
			serviceParamImpl.setDefaultValue(StringPool.BLANK);
		}
		else {
			serviceParamImpl.setDefaultValue(defaultValue);
		}

		serviceParamImpl.resetOriginalValues();

		return serviceParamImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		paramId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		classNameId = objectInput.readLong();
		classPK = objectInput.readLong();
		paramType = objectInput.readUTF();
		paramName = objectInput.readUTF();
		paramValue = objectInput.readUTF();
		paramObject = objectInput.readUTF();
		paramDesc = objectInput.readUTF();
		defaultValue = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(paramId);
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

		if (paramType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paramType);
		}

		if (paramName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paramName);
		}

		if (paramValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paramValue);
		}

		if (paramObject == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paramObject);
		}

		if (paramDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paramDesc);
		}

		if (defaultValue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(defaultValue);
		}
	}

	public long paramId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long classNameId;
	public long classPK;
	public String paramType;
	public String paramName;
	public String paramValue;
	public String paramObject;
	public String paramDesc;
	public String defaultValue;
}