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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.ext.model.ServiceRemoteDef;
import com.liferay.portal.ext.model.ServiceTag;
import com.liferay.portal.ext.service.ServiceTagLocalServiceUtil;
import com.liferay.portal.ext.service.base.ServiceRemoteDefLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.service.ClassNameLocalServiceUtil;

/**
 * The implementation of the service remote def local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.portal.ext.service.ServiceRemoteDefLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portal.ext.service.base.ServiceRemoteDefLocalServiceBaseImpl
 * @see com.liferay.portal.ext.service.ServiceRemoteDefLocalServiceUtil
 */
public class ServiceRemoteDefLocalServiceImpl
	extends ServiceRemoteDefLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.portal.ext.service.ServiceRemoteDefLocalServiceUtil} to access the service remote def local service.
	 */
	public ServiceRemoteDef findByCode(String code) throws SystemException {
		return this.serviceRemoteDefPersistence.fetchByCode(code);
	}
	
	public void removeRemoteService(long id) throws SystemException, PortalException {
		super.deleteServiceRemoteDef(id);
		long classNameId = ClassNameLocalServiceUtil.getClassNameId(ServiceRemoteDef.class.getName());
		this.serviceParamPersistence.removeByC_C(classNameId, id);		
	}
	
	public List<ServiceRemoteDef> findAll() throws SystemException, PortalException {
		return this.serviceRemoteDefPersistence.findAll();
	}
	
	public List<ServiceRemoteDef> findByTagId(long tagId) throws SystemException, PortalException {
		return this.serviceRemoteDefPersistence.findByTagId(tagId);
	}	
}