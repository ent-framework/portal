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
 * Provides a wrapper for {@link ServiceRemoteDefLocalService}.
 *
 * @author Jeff Qian
 * @see ServiceRemoteDefLocalService
 * @generated
 */
@ProviderType
public class ServiceRemoteDefLocalServiceWrapper
	implements ServiceRemoteDefLocalService,
		ServiceWrapper<ServiceRemoteDefLocalService> {
	public ServiceRemoteDefLocalServiceWrapper(
		ServiceRemoteDefLocalService serviceRemoteDefLocalService) {
		_serviceRemoteDefLocalService = serviceRemoteDefLocalService;
	}

	/**
	* Adds the service remote def to the database. Also notifies the appropriate model listeners.
	*
	* @param serviceRemoteDef the service remote def
	* @return the service remote def that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceRemoteDef addServiceRemoteDef(
		com.liferay.portal.ext.model.ServiceRemoteDef serviceRemoteDef)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.addServiceRemoteDef(serviceRemoteDef);
	}

	/**
	* Creates a new service remote def with the primary key. Does not add the service remote def to the database.
	*
	* @param remoteId the primary key for the new service remote def
	* @return the new service remote def
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceRemoteDef createServiceRemoteDef(
		long remoteId) {
		return _serviceRemoteDefLocalService.createServiceRemoteDef(remoteId);
	}

	/**
	* Deletes the service remote def with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param remoteId the primary key of the service remote def
	* @return the service remote def that was removed
	* @throws PortalException if a service remote def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceRemoteDef deleteServiceRemoteDef(
		long remoteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.deleteServiceRemoteDef(remoteId);
	}

	/**
	* Deletes the service remote def from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceRemoteDef the service remote def
	* @return the service remote def that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceRemoteDef deleteServiceRemoteDef(
		com.liferay.portal.ext.model.ServiceRemoteDef serviceRemoteDef)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.deleteServiceRemoteDef(serviceRemoteDef);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _serviceRemoteDefLocalService.dynamicQuery();
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
		return _serviceRemoteDefLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceRemoteDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceRemoteDefLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceRemoteDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceRemoteDefLocalService.dynamicQuery(dynamicQuery, start,
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
		return _serviceRemoteDefLocalService.dynamicQueryCount(dynamicQuery);
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
		return _serviceRemoteDefLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.portal.ext.model.ServiceRemoteDef fetchServiceRemoteDef(
		long remoteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.fetchServiceRemoteDef(remoteId);
	}

	/**
	* Returns the service remote def with the primary key.
	*
	* @param remoteId the primary key of the service remote def
	* @return the service remote def
	* @throws PortalException if a service remote def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceRemoteDef getServiceRemoteDef(
		long remoteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.getServiceRemoteDef(remoteId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the service remote defs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceRemoteDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service remote defs
	* @param end the upper bound of the range of service remote defs (not inclusive)
	* @return the range of service remote defs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> getServiceRemoteDefs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.getServiceRemoteDefs(start, end);
	}

	/**
	* Returns the number of service remote defs.
	*
	* @return the number of service remote defs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getServiceRemoteDefsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.getServiceRemoteDefsCount();
	}

	/**
	* Updates the service remote def in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param serviceRemoteDef the service remote def
	* @return the service remote def that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceRemoteDef updateServiceRemoteDef(
		com.liferay.portal.ext.model.ServiceRemoteDef serviceRemoteDef)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.updateServiceRemoteDef(serviceRemoteDef);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _serviceRemoteDefLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_serviceRemoteDefLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public com.liferay.portal.ext.model.ServiceRemoteDef findByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.findByCode(code);
	}

	@Override
	public void removeRemoteService(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_serviceRemoteDefLocalService.removeRemoteService(id);
	}

	@Override
	public java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.findAll();
	}

	@Override
	public java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findByTagId(
		long tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceRemoteDefLocalService.findByTagId(tagId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServiceRemoteDefLocalService getWrappedServiceRemoteDefLocalService() {
		return _serviceRemoteDefLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServiceRemoteDefLocalService(
		ServiceRemoteDefLocalService serviceRemoteDefLocalService) {
		_serviceRemoteDefLocalService = serviceRemoteDefLocalService;
	}

	@Override
	public ServiceRemoteDefLocalService getWrappedService() {
		return _serviceRemoteDefLocalService;
	}

	@Override
	public void setWrappedService(
		ServiceRemoteDefLocalService serviceRemoteDefLocalService) {
		_serviceRemoteDefLocalService = serviceRemoteDefLocalService;
	}

	private ServiceRemoteDefLocalService _serviceRemoteDefLocalService;
}