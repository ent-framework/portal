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

package com.liferay.portal.model;

import com.liferay.portal.kernel.exception.SystemException;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
public interface AuditedModel extends ClassedModel {

	public long getCompanyId();

	public Date getCreateDate();

	public Date getModifiedDate();

	public long getUserId();

	public String getUserName();

	public String getUserUuid() throws SystemException;

	public void setCompanyId(Long companyId);

	public void setCreateDate(Date date);

	public void setModifiedDate(Date date);

	public void setUserId(Long userId);

	public void setUserName(String userName);

	public void setUserUuid(String userUuid);

}