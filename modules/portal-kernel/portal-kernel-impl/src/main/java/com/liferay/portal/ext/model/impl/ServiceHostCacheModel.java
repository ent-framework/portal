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

import com.liferay.portal.ext.model.ServiceHost;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ServiceHost in entity cache.
 *
 * @author Jeff Qian
 * @see ServiceHost
 * @generated
 */
public class ServiceHostCacheModel implements CacheModel<ServiceHost>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{hostId=");
		sb.append(hostId);
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
		sb.append(", address=");
		sb.append(address);
		sb.append(", protocol=");
		sb.append(protocol);
		sb.append(", port=");
		sb.append(port);
		sb.append(", proxyHost=");
		sb.append(proxyHost);
		sb.append(", proxyPort=");
		sb.append(proxyPort);
		sb.append(", proxyUserName=");
		sb.append(proxyUserName);
		sb.append(", proxyPassword=");
		sb.append(proxyPassword);
		sb.append(", proxyAuthType=");
		sb.append(proxyAuthType);
		sb.append(", cacheResponse=");
		sb.append(cacheResponse);
		sb.append(", maxConnectionsPerHost=");
		sb.append(maxConnectionsPerHost);
		sb.append(", timeout=");
		sb.append(timeout);
		sb.append(", sessionCookieUseFullHostName=");
		sb.append(sessionCookieUseFullHostName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServiceHost toEntityModel() {
		ServiceHostImpl serviceHostImpl = new ServiceHostImpl();

		serviceHostImpl.setHostId(hostId);

		if (code == null) {
			serviceHostImpl.setCode(StringPool.BLANK);
		}
		else {
			serviceHostImpl.setCode(code);
		}

		serviceHostImpl.setUserId(userId);

		if (userName == null) {
			serviceHostImpl.setUserName(StringPool.BLANK);
		}
		else {
			serviceHostImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			serviceHostImpl.setCreateDate(null);
		}
		else {
			serviceHostImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			serviceHostImpl.setModifiedDate(null);
		}
		else {
			serviceHostImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (address == null) {
			serviceHostImpl.setAddress(StringPool.BLANK);
		}
		else {
			serviceHostImpl.setAddress(address);
		}

		if (protocol == null) {
			serviceHostImpl.setProtocol(StringPool.BLANK);
		}
		else {
			serviceHostImpl.setProtocol(protocol);
		}

		serviceHostImpl.setPort(port);

		if (proxyHost == null) {
			serviceHostImpl.setProxyHost(StringPool.BLANK);
		}
		else {
			serviceHostImpl.setProxyHost(proxyHost);
		}

		serviceHostImpl.setProxyPort(proxyPort);

		if (proxyUserName == null) {
			serviceHostImpl.setProxyUserName(StringPool.BLANK);
		}
		else {
			serviceHostImpl.setProxyUserName(proxyUserName);
		}

		if (proxyPassword == null) {
			serviceHostImpl.setProxyPassword(StringPool.BLANK);
		}
		else {
			serviceHostImpl.setProxyPassword(proxyPassword);
		}

		if (proxyAuthType == null) {
			serviceHostImpl.setProxyAuthType(StringPool.BLANK);
		}
		else {
			serviceHostImpl.setProxyAuthType(proxyAuthType);
		}

		serviceHostImpl.setCacheResponse(cacheResponse);
		serviceHostImpl.setMaxConnectionsPerHost(maxConnectionsPerHost);
		serviceHostImpl.setTimeout(timeout);
		serviceHostImpl.setSessionCookieUseFullHostName(sessionCookieUseFullHostName);

		serviceHostImpl.resetOriginalValues();

		return serviceHostImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		hostId = objectInput.readLong();
		code = objectInput.readUTF();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		address = objectInput.readUTF();
		protocol = objectInput.readUTF();
		port = objectInput.readInt();
		proxyHost = objectInput.readUTF();
		proxyPort = objectInput.readInt();
		proxyUserName = objectInput.readUTF();
		proxyPassword = objectInput.readUTF();
		proxyAuthType = objectInput.readUTF();
		cacheResponse = objectInput.readBoolean();
		maxConnectionsPerHost = objectInput.readInt();
		timeout = objectInput.readInt();
		sessionCookieUseFullHostName = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(hostId);

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

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (protocol == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(protocol);
		}

		objectOutput.writeInt(port);

		if (proxyHost == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proxyHost);
		}

		objectOutput.writeInt(proxyPort);

		if (proxyUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proxyUserName);
		}

		if (proxyPassword == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proxyPassword);
		}

		if (proxyAuthType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(proxyAuthType);
		}

		objectOutput.writeBoolean(cacheResponse);
		objectOutput.writeInt(maxConnectionsPerHost);
		objectOutput.writeInt(timeout);
		objectOutput.writeBoolean(sessionCookieUseFullHostName);
	}

	public long hostId;
	public String code;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String address;
	public String protocol;
	public int port;
	public String proxyHost;
	public int proxyPort;
	public String proxyUserName;
	public String proxyPassword;
	public String proxyAuthType;
	public boolean cacheResponse;
	public int maxConnectionsPerHost;
	public int timeout;
	public boolean sessionCookieUseFullHostName;
}