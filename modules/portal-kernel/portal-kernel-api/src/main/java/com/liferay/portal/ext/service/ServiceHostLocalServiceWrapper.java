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
 * Provides a wrapper for {@link ServiceHostLocalService}.
 *
 * @author Jeff Qian
 * @see ServiceHostLocalService
 * @generated
 */
@ProviderType
public class ServiceHostLocalServiceWrapper implements ServiceHostLocalService,
	ServiceWrapper<ServiceHostLocalService> {
	public ServiceHostLocalServiceWrapper(
		ServiceHostLocalService serviceHostLocalService) {
		_serviceHostLocalService = serviceHostLocalService;
	}

	/**
	* Adds the service host to the database. Also notifies the appropriate model listeners.
	*
	* @param serviceHost the service host
	* @return the service host that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceHost addServiceHost(
		com.liferay.portal.ext.model.ServiceHost serviceHost)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceHostLocalService.addServiceHost(serviceHost);
	}

	/**
	* Creates a new service host with the primary key. Does not add the service host to the database.
	*
	* @param hostId the primary key for the new service host
	* @return the new service host
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceHost createServiceHost(
		long hostId) {
		return _serviceHostLocalService.createServiceHost(hostId);
	}

	/**
	* Deletes the service host with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hostId the primary key of the service host
	* @return the service host that was removed
	* @throws PortalException if a service host with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceHost deleteServiceHost(
		long hostId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceHostLocalService.deleteServiceHost(hostId);
	}

	/**
	* Deletes the service host from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceHost the service host
	* @return the service host that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceHost deleteServiceHost(
		com.liferay.portal.ext.model.ServiceHost serviceHost)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceHostLocalService.deleteServiceHost(serviceHost);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _serviceHostLocalService.dynamicQuery();
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
		return _serviceHostLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceHostLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceHostLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _serviceHostLocalService.dynamicQueryCount(dynamicQuery);
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
		return _serviceHostLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.portal.ext.model.ServiceHost fetchServiceHost(
		long hostId) throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceHostLocalService.fetchServiceHost(hostId);
	}

	/**
	* Returns the service host with the primary key.
	*
	* @param hostId the primary key of the service host
	* @return the service host
	* @throws PortalException if a service host with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceHost getServiceHost(long hostId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceHostLocalService.getServiceHost(hostId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceHostLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the service hosts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service hosts
	* @param end the upper bound of the range of service hosts (not inclusive)
	* @return the range of service hosts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.portal.ext.model.ServiceHost> getServiceHosts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceHostLocalService.getServiceHosts(start, end);
	}

	/**
	* Returns the number of service hosts.
	*
	* @return the number of service hosts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getServiceHostsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceHostLocalService.getServiceHostsCount();
	}

	/**
	* Updates the service host in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param serviceHost the service host
	* @return the service host that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceHost updateServiceHost(
		com.liferay.portal.ext.model.ServiceHost serviceHost)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceHostLocalService.updateServiceHost(serviceHost);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _serviceHostLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_serviceHostLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.util.List<com.liferay.portal.ext.model.ServiceHost> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceHostLocalService.findAll();
	}

	@Override
	public com.liferay.portal.ext.model.ServiceHost findByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceHostLocalService.findByCode(code);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServiceHostLocalService getWrappedServiceHostLocalService() {
		return _serviceHostLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServiceHostLocalService(
		ServiceHostLocalService serviceHostLocalService) {
		_serviceHostLocalService = serviceHostLocalService;
	}

	@Override
	public ServiceHostLocalService getWrappedService() {
		return _serviceHostLocalService;
	}

	@Override
	public void setWrappedService(
		ServiceHostLocalService serviceHostLocalService) {
		_serviceHostLocalService = serviceHostLocalService;
	}

	private ServiceHostLocalService _serviceHostLocalService;
}