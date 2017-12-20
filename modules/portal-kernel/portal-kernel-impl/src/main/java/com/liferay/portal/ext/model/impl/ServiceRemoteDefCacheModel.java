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

import com.liferay.portal.ext.model.ServiceRemoteDef;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ServiceRemoteDef in entity cache.
 *
 * @author Jeff Qian
 * @see ServiceRemoteDef
 * @generated
 */
public class ServiceRemoteDefCacheModel implements CacheModel<ServiceRemoteDef>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{remoteId=");
		sb.append(remoteId);
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
		sb.append(", tagId=");
		sb.append(tagId);
		sb.append(", host=");
		sb.append(host);
		sb.append(", path=");
		sb.append(path);
		sb.append(", httpMethod=");
		sb.append(httpMethod);
		sb.append(", rawString=");
		sb.append(rawString);
		sb.append(", description=");
		sb.append(description);
		sb.append(", deprecated=");
		sb.append(deprecated);
		sb.append(", sendWithCookies=");
		sb.append(sendWithCookies);
		sb.append(", cookieDomain=");
		sb.append(cookieDomain);
		sb.append(", cookiePath=");
		sb.append(cookiePath);
		sb.append(", scriptParameter=");
		sb.append(scriptParameter);
		sb.append(", scriptHeader=");
		sb.append(scriptHeader);
		sb.append(", scriptResponse=");
		sb.append(scriptResponse);
		sb.append(", cacheLiveTime=");
		sb.append(cacheLiveTime);
		sb.append(", authId=");
		sb.append(authId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServiceRemoteDef toEntityModel() {
		ServiceRemoteDefImpl serviceRemoteDefImpl = new ServiceRemoteDefImpl();

		serviceRemoteDefImpl.setRemoteId(remoteId);

		if (code == null) {
			serviceRemoteDefImpl.setCode(StringPool.BLANK);
		}
		else {
			serviceRemoteDefImpl.setCode(code);
		}

		serviceRemoteDefImpl.setUserId(userId);

		if (userName == null) {
			serviceRemoteDefImpl.setUserName(StringPool.BLANK);
		}
		else {
			serviceRemoteDefImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			serviceRemoteDefImpl.setCreateDate(null);
		}
		else {
			serviceRemoteDefImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			serviceRemoteDefImpl.setModifiedDate(null);
		}
		else {
			serviceRemoteDefImpl.setModifiedDate(new Date(modifiedDate));
		}

		serviceRemoteDefImpl.setTagId(tagId);
		serviceRemoteDefImpl.setHost(host);

		if (path == null) {
			serviceRemoteDefImpl.setPath(StringPool.BLANK);
		}
		else {
			serviceRemoteDefImpl.setPath(path);
		}

		if (httpMethod == null) {
			serviceRemoteDefImpl.setHttpMethod(StringPool.BLANK);
		}
		else {
			serviceRemoteDefImpl.setHttpMethod(httpMethod);
		}

		if (rawString == null) {
			serviceRemoteDefImpl.setRawString(StringPool.BLANK);
		}
		else {
			serviceRemoteDefImpl.setRawString(rawString);
		}

		if (description == null) {
			serviceRemoteDefImpl.setDescription(StringPool.BLANK);
		}
		else {
			serviceRemoteDefImpl.setDescription(description);
		}

		serviceRemoteDefImpl.setDeprecated(deprecated);
		serviceRemoteDefImpl.setSendWithCookies(sendWithCookies);

		if (cookieDomain == null) {
			serviceRemoteDefImpl.setCookieDomain(StringPool.BLANK);
		}
		else {
			serviceRemoteDefImpl.setCookieDomain(cookieDomain);
		}

		if (cookiePath == null) {
			serviceRemoteDefImpl.setCookiePath(StringPool.BLANK);
		}
		else {
			serviceRemoteDefImpl.setCookiePath(cookiePath);
		}

		if (scriptParameter == null) {
			serviceRemoteDefImpl.setScriptParameter(StringPool.BLANK);
		}
		else {
			serviceRemoteDefImpl.setScriptParameter(scriptParameter);
		}

		if (scriptHeader == null) {
			serviceRemoteDefImpl.setScriptHeader(StringPool.BLANK);
		}
		else {
			serviceRemoteDefImpl.setScriptHeader(scriptHeader);
		}

		if (scriptResponse == null) {
			serviceRemoteDefImpl.setScriptResponse(StringPool.BLANK);
		}
		else {
			serviceRemoteDefImpl.setScriptResponse(scriptResponse);
		}

		serviceRemoteDefImpl.setCacheLiveTime(cacheLiveTime);
		serviceRemoteDefImpl.setAuthId(authId);

		serviceRemoteDefImpl.resetOriginalValues();

		return serviceRemoteDefImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		remoteId = objectInput.readLong();
		code = objectInput.readUTF();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tagId = objectInput.readLong();
		host = objectInput.readLong();
		path = objectInput.readUTF();
		httpMethod = objectInput.readUTF();
		rawString = objectInput.readUTF();
		description = objectInput.readUTF();
		deprecated = objectInput.readBoolean();
		sendWithCookies = objectInput.readBoolean();
		cookieDomain = objectInput.readUTF();
		cookiePath = objectInput.readUTF();
		scriptParameter = objectInput.readUTF();
		scriptHeader = objectInput.readUTF();
		scriptResponse = objectInput.readUTF();
		cacheLiveTime = objectInput.readInt();
		authId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(remoteId);

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
		objectOutput.writeLong(tagId);
		objectOutput.writeLong(host);

		if (path == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(path);
		}

		if (httpMethod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(httpMethod);
		}

		if (rawString == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(rawString);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeBoolean(deprecated);
		objectOutput.writeBoolean(sendWithCookies);

		if (cookieDomain == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cookieDomain);
		}

		if (cookiePath == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cookiePath);
		}

		if (scriptParameter == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(scriptParameter);
		}

		if (scriptHeader == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(scriptHeader);
		}

		if (scriptResponse == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(scriptResponse);
		}

		objectOutput.writeInt(cacheLiveTime);
		objectOutput.writeLong(authId);
	}

	public long remoteId;
	public String code;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long tagId;
	public long host;
	public String path;
	public String httpMethod;
	public String rawString;
	public String description;
	public boolean deprecated;
	public boolean sendWithCookies;
	public String cookieDomain;
	public String cookiePath;
	public String scriptParameter;
	public String scriptHeader;
	public String scriptResponse;
	public int cacheLiveTime;
	public long authId;
}