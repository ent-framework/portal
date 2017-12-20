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

package com.liferay.portal.ext.service.impl;

import java.util.List;

import com.liferay.portal.ext.model.ServiceHost;
import com.liferay.portal.ext.service.base.ServiceHostLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the service host local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.portal.ext.service.ServiceHostLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portal.ext.service.base.ServiceHostLocalServiceBaseImpl
 * @see com.liferay.portal.ext.service.ServiceHostLocalServiceUtil
 */
public class ServiceHostLocalServiceImpl extends ServiceHostLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.portal.ext.service.ServiceHostLocalServiceUtil} to access the service host local service.
	 */
	public List<ServiceHost> findAll() throws SystemException {
		return this.serviceHostPersistence.findAll();
	}
	
	public ServiceHost findByCode(String code) throws SystemException {
		return this.serviceHostPersistence.fetchByCode(code);
	}	
}