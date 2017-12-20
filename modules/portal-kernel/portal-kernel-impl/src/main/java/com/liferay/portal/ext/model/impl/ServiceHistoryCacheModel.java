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

import com.liferay.portal.ext.model.ServiceHistory;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ServiceHistory in entity cache.
 *
 * @author Jeff Qian
 * @see ServiceHistory
 * @generated
 */
public class ServiceHistoryCacheModel implements CacheModel<ServiceHistory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{hisId=");
		sb.append(hisId);
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
		sb.append(", page=");
		sb.append(page);
		sb.append(", friendlyURL=");
		sb.append(friendlyURL);
		sb.append(", portletName=");
		sb.append(portletName);
		sb.append(", statusCode=");
		sb.append(statusCode);
		sb.append(", timeCost=");
		sb.append(timeCost);
		sb.append(", responseText=");
		sb.append(responseText);
		sb.append(", wrappedText=");
		sb.append(wrappedText);
		sb.append(", debugInfo=");
		sb.append(debugInfo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ServiceHistory toEntityModel() {
		ServiceHistoryImpl serviceHistoryImpl = new ServiceHistoryImpl();

		serviceHistoryImpl.setHisId(hisId);
		serviceHistoryImpl.setUserId(userId);

		if (userName == null) {
			serviceHistoryImpl.setUserName(StringPool.BLANK);
		}
		else {
			serviceHistoryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			serviceHistoryImpl.setCreateDate(null);
		}
		else {
			serviceHistoryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			serviceHistoryImpl.setModifiedDate(null);
		}
		else {
			serviceHistoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		serviceHistoryImpl.setClassNameId(classNameId);
		serviceHistoryImpl.setClassPK(classPK);

		if (page == null) {
			serviceHistoryImpl.setPage(StringPool.BLANK);
		}
		else {
			serviceHistoryImpl.setPage(page);
		}

		if (friendlyURL == null) {
			serviceHistoryImpl.setFriendlyURL(StringPool.BLANK);
		}
		else {
			serviceHistoryImpl.setFriendlyURL(friendlyURL);
		}

		if (portletName == null) {
			serviceHistoryImpl.setPortletName(StringPool.BLANK);
		}
		else {
			serviceHistoryImpl.setPortletName(portletName);
		}

		serviceHistoryImpl.setStatusCode(statusCode);
		serviceHistoryImpl.setTimeCost(timeCost);

		if (responseText == null) {
			serviceHistoryImpl.setResponseText(StringPool.BLANK);
		}
		else {
			serviceHistoryImpl.setResponseText(responseText);
		}

		if (wrappedText == null) {
			serviceHistoryImpl.setWrappedText(StringPool.BLANK);
		}
		else {
			serviceHistoryImpl.setWrappedText(wrappedText);
		}

		if (debugInfo == null) {
			serviceHistoryImpl.setDebugInfo(StringPool.BLANK);
		}
		else {
			serviceHistoryImpl.setDebugInfo(debugInfo);
		}

		serviceHistoryImpl.resetOriginalValues();

		return serviceHistoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		hisId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		classNameId = objectInput.readLong();
		classPK = objectInput.readLong();
		page = objectInput.readUTF();
		friendlyURL = objectInput.readUTF();
		portletName = objectInput.readUTF();
		statusCode = objectInput.readInt();
		timeCost = objectInput.readInt();
		responseText = objectInput.readUTF();
		wrappedText = objectInput.readUTF();
		debugInfo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(hisId);
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

		if (page == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(page);
		}

		if (friendlyURL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(friendlyURL);
		}

		if (portletName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portletName);
		}

		objectOutput.writeInt(statusCode);
		objectOutput.writeInt(timeCost);

		if (responseText == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(responseText);
		}

		if (wrappedText == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wrappedText);
		}

		if (debugInfo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(debugInfo);
		}
	}

	public long hisId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long classNameId;
	public long classPK;
	public String page;
	public String friendlyURL;
	public String portletName;
	public int statusCode;
	public int timeCost;
	public String responseText;
	public String wrappedText;
	public String debugInfo;
}