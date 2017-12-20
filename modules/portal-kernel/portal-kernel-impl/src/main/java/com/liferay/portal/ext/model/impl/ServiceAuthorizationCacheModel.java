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

import com.liferay.portal.ext.model.ServiceAuthorization;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ServiceAuthorization in entity cache.
 *
 * @author Jeff Qian
 * @see ServiceAuthorization
 * @generated
 */
public class ServiceAuthorizationCacheModel implements CacheModel<ServiceAuthorization>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{authId=");
		sb.append(authId);
		sb.append(", code=");
		sb.append(code);
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
		sb.append(", type=");
		sb.append(type);
		sb.append(", template=");
		sb.append(template);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServiceAuthorization toEntityModel() {
		ServiceAuthorizationImpl serviceAuthorizationImpl = new ServiceAuthorizationImpl();

		serviceAuthorizationImpl.setAuthId(authId);

		if (code == null) {
			serviceAuthorizationImpl.setCode(StringPool.BLANK);
		}
		else {
			serviceAuthorizationImpl.setCode(code);
		}

		serviceAuthorizationImpl.setUserId(userId);

		if (userName == null) {
			serviceAuthorizationImpl.setUserName(StringPool.BLANK);
		}
		else {
			serviceAuthorizationImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			serviceAuthorizationImpl.setCreateDate(null);
		}
		else {
			serviceAuthorizationImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			serviceAuthorizationImpl.setModifiedDate(null);
		}
		else {
			serviceAuthorizationImpl.setModifiedDate(new Date(modifiedDate));
		}

		serviceAuthorizationImpl.setClassNameId(classNameId);
		serviceAuthorizationImpl.setClassPK(classPK);

		if (type == null) {
			serviceAuthorizationImpl.setType(StringPool.BLANK);
		}
		else {
			serviceAuthorizationImpl.setType(type);
		}

		if (template == null) {
			serviceAuthorizationImpl.setTemplate(StringPool.BLANK);
		}
		else {
			serviceAuthorizationImpl.setTemplate(template);
		}

		serviceAuthorizationImpl.resetOriginalValues();

		return serviceAuthorizationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		authId = objectInput.readLong();
		code = objectInput.readUTF();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		classNameId = objectInput.readLong();
		classPK = objectInput.readLong();
		type = objectInput.readUTF();
		template = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(authId);

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
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
		objectOutput.writeLong(classNameId);
		objectOutput.writeLong(classPK);

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (template == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(template);
		}
	}

	public long authId;
	public String code;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long classNameId;
	public long classPK;
	public String type;
	public String template;
}