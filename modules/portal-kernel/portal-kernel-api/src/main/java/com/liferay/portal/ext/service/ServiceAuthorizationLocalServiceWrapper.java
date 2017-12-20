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
 * Provides a wrapper for {@link ServiceAuthorizationLocalService}.
 *
 * @author Jeff Qian
 * @see ServiceAuthorizationLocalService
 * @generated
 */
@ProviderType
public class ServiceAuthorizationLocalServiceWrapper
	implements ServiceAuthorizationLocalService,
		ServiceWrapper<ServiceAuthorizationLocalService> {
	public ServiceAuthorizationLocalServiceWrapper(
		ServiceAuthorizationLocalService serviceAuthorizationLocalService) {
		_serviceAuthorizationLocalService = serviceAuthorizationLocalService;
	}

	/**
	* Adds the service authorization to the database. Also notifies the appropriate model listeners.
	*
	* @param serviceAuthorization the service authorization
	* @return the service authorization that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceAuthorization addServiceAuthorization(
		com.liferay.portal.ext.model.ServiceAuthorization serviceAuthorization)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceAuthorizationLocalService.addServiceAuthorization(serviceAuthorization);
	}

	/**
	* Creates a new service authorization with the primary key. Does not add the service authorization to the database.
	*
	* @param authId the primary key for the new service authorization
	* @return the new service authorization
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceAuthorization createServiceAuthorization(
		long authId) {
		return _serviceAuthorizationLocalService.createServiceAuthorization(authId);
	}

	/**
	* Deletes the service authorization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param authId the primary key of the service authorization
	* @return the service authorization that was removed
	* @throws PortalException if a service authorization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceAuthorization deleteServiceAuthorization(
		long authId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceAuthorizationLocalService.deleteServiceAuthorization(authId);
	}

	/**
	* Deletes the service authorization from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceAuthorization the service authorization
	* @return the service authorization that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceAuthorization deleteServiceAuthorization(
		com.liferay.portal.ext.model.ServiceAuthorization serviceAuthorization)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceAuthorizationLocalService.deleteServiceAuthorization(serviceAuthorization);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _serviceAuthorizationLocalService.dynamicQuery();
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
		return _serviceAuthorizationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceAuthorizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceAuthorizationLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceAuthorizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceAuthorizationLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _serviceAuthorizationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _serviceAuthorizationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.portal.ext.model.ServiceAuthorization fetchServiceAuthorization(
		long authId) throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceAuthorizationLocalService.fetchServiceAuthorization(authId);
	}

	/**
	* Returns the service authorization with the primary key.
	*
	* @param authId the primary key of the service authorization
	* @return the service authorization
	* @throws PortalException if a service authorization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceAuthorization getServiceAuthorization(
		long authId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceAuthorizationLocalService.getServiceAuthorization(authId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceAuthorizationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the service authorizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceAuthorizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service authorizations
	* @param end the upper bound of the range of service authorizations (not inclusive)
	* @return the range of service authorizations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.portal.ext.model.ServiceAuthorization> getServiceAuthorizations(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceAuthorizationLocalService.getServiceAuthorizations(start,
			end);
	}

	/**
	* Returns the number of service authorizations.
	*
	* @return the number of service authorizations
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getServiceAuthorizationsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceAuthorizationLocalService.getServiceAuthorizationsCount();
	}

	/**
	* Updates the service authorization in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param serviceAuthorization the service authorization
	* @return the service authorization that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceAuthorization updateServiceAuthorization(
		com.liferay.portal.ext.model.ServiceAuthorization serviceAuthorization)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceAuthorizationLocalService.updateServiceAuthorization(serviceAuthorization);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _serviceAuthorizationLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_serviceAuthorizationLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServiceAuthorizationLocalService getWrappedServiceAuthorizationLocalService() {
		return _serviceAuthorizationLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServiceAuthorizationLocalService(
		ServiceAuthorizationLocalService serviceAuthorizationLocalService) {
		_serviceAuthorizationLocalService = serviceAuthorizationLocalService;
	}

	@Override
	public ServiceAuthorizationLocalService getWrappedService() {
		return _serviceAuthorizationLocalService;
	}

	@Override
	public void setWrappedService(
		ServiceAuthorizationLocalService serviceAuthorizationLocalService) {
		_serviceAuthorizationLocalService = serviceAuthorizationLocalService;
	}

	private ServiceAuthorizationLocalService _serviceAuthorizationLocalService;
}