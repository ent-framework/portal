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

package com.liferay.portal.ext.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ServicePublishDefLocalService}.
 *
 * @author Jeff Qian
 * @see ServicePublishDefLocalService
 * @generated
 */
@ProviderType
public class ServicePublishDefLocalServiceWrapper
	implements ServicePublishDefLocalService,
		ServiceWrapper<ServicePublishDefLocalService> {
	public ServicePublishDefLocalServiceWrapper(
		ServicePublishDefLocalService servicePublishDefLocalService) {
		_servicePublishDefLocalService = servicePublishDefLocalService;
	}

	/**
	* Adds the service publish def to the database. Also notifies the appropriate model listeners.
	*
	* @param servicePublishDef the service publish def
	* @return the service publish def that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServicePublishDef addServicePublishDef(
		com.liferay.portal.ext.model.ServicePublishDef servicePublishDef)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.addServicePublishDef(servicePublishDef);
	}

	/**
	* Creates a new service publish def with the primary key. Does not add the service publish def to the database.
	*
	* @param publishId the primary key for the new service publish def
	* @return the new service publish def
	*/
	@Override
	public com.liferay.portal.ext.model.ServicePublishDef createServicePublishDef(
		long publishId) {
		return _servicePublishDefLocalService.createServicePublishDef(publishId);
	}

	/**
	* Deletes the service publish def with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param publishId the primary key of the service publish def
	* @return the service publish def that was removed
	* @throws PortalException if a service publish def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServicePublishDef deleteServicePublishDef(
		long publishId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.deleteServicePublishDef(publishId);
	}

	/**
	* Deletes the service publish def from the database. Also notifies the appropriate model listeners.
	*
	* @param servicePublishDef the service publish def
	* @return the service publish def that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServicePublishDef deleteServicePublishDef(
		com.liferay.portal.ext.model.ServicePublishDef servicePublishDef)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.deleteServicePublishDef(servicePublishDef);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _servicePublishDefLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServicePublishDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServicePublishDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.portal.ext.model.ServicePublishDef fetchServicePublishDef(
		long publishId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.fetchServicePublishDef(publishId);
	}

	/**
	* Returns the service publish def with the primary key.
	*
	* @param publishId the primary key of the service publish def
	* @return the service publish def
	* @throws PortalException if a service publish def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServicePublishDef getServicePublishDef(
		long publishId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.getServicePublishDef(publishId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the service publish defs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServicePublishDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service publish defs
	* @param end the upper bound of the range of service publish defs (not inclusive)
	* @return the range of service publish defs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.portal.ext.model.ServicePublishDef> getServicePublishDefs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.getServicePublishDefs(start, end);
	}

	/**
	* Returns the number of service publish defs.
	*
	* @return the number of service publish defs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getServicePublishDefsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.getServicePublishDefsCount();
	}

	/**
	* Updates the service publish def in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param servicePublishDef the service publish def
	* @return the service publish def that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServicePublishDef updateServicePublishDef(
		com.liferay.portal.ext.model.ServicePublishDef servicePublishDef)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.updateServicePublishDef(servicePublishDef);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _servicePublishDefLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_servicePublishDefLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public com.liferay.portal.ext.model.ServicePublishDef findByPath(
		java.lang.String path)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.findByPath(path);
	}

	@Override
	public void removePublishService(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_servicePublishDefLocalService.removePublishService(id);
	}

	@Override
	public java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.findAll();
	}

	@Override
	public java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findByTagId(
		long tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicePublishDefLocalService.findByTagId(tagId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServicePublishDefLocalService getWrappedServicePublishDefLocalService() {
		return _servicePublishDefLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServicePublishDefLocalService(
		ServicePublishDefLocalService servicePublishDefLocalService) {
		_servicePublishDefLocalService = servicePublishDefLocalService;
	}

	@Override
	public ServicePublishDefLocalService getWrappedService() {
		return _servicePublishDefLocalService;
	}

	@Override
	public void setWrappedService(
		ServicePublishDefLocalService servicePublishDefLocalService) {
		_servicePublishDefLocalService = servicePublishDefLocalService;
	}

	private ServicePublishDefLocalService _servicePublishDefLocalService;
}