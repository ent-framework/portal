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
 * Provides a wrapper for {@link ServiceParamLocalService}.
 *
 * @author Jeff Qian
 * @see ServiceParamLocalService
 * @generated
 */
@ProviderType
public class ServiceParamLocalServiceWrapper implements ServiceParamLocalService,
	ServiceWrapper<ServiceParamLocalService> {
	public ServiceParamLocalServiceWrapper(
		ServiceParamLocalService serviceParamLocalService) {
		_serviceParamLocalService = serviceParamLocalService;
	}

	/**
	* Adds the service param to the database. Also notifies the appropriate model listeners.
	*
	* @param serviceParam the service param
	* @return the service param that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceParam addServiceParam(
		com.liferay.portal.ext.model.ServiceParam serviceParam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceParamLocalService.addServiceParam(serviceParam);
	}

	/**
	* Creates a new service param with the primary key. Does not add the service param to the database.
	*
	* @param paramId the primary key for the new service param
	* @return the new service param
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceParam createServiceParam(
		long paramId) {
		return _serviceParamLocalService.createServiceParam(paramId);
	}

	/**
	* Deletes the service param with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paramId the primary key of the service param
	* @return the service param that was removed
	* @throws PortalException if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceParam deleteServiceParam(
		long paramId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceParamLocalService.deleteServiceParam(paramId);
	}

	/**
	* Deletes the service param from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceParam the service param
	* @return the service param that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceParam deleteServiceParam(
		com.liferay.portal.ext.model.ServiceParam serviceParam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceParamLocalService.deleteServiceParam(serviceParam);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _serviceParamLocalService.dynamicQuery();
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
		return _serviceParamLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceParamLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceParamLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _serviceParamLocalService.dynamicQueryCount(dynamicQuery);
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
		return _serviceParamLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.portal.ext.model.ServiceParam fetchServiceParam(
		long paramId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceParamLocalService.fetchServiceParam(paramId);
	}

	/**
	* Returns the service param with the primary key.
	*
	* @param paramId the primary key of the service param
	* @return the service param
	* @throws PortalException if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceParam getServiceParam(
		long paramId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceParamLocalService.getServiceParam(paramId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceParamLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the service params.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @return the range of service params
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.portal.ext.model.ServiceParam> getServiceParams(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceParamLocalService.getServiceParams(start, end);
	}

	/**
	* Returns the number of service params.
	*
	* @return the number of service params
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getServiceParamsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceParamLocalService.getServiceParamsCount();
	}

	/**
	* Updates the service param in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param serviceParam the service param
	* @return the service param that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceParam updateServiceParam(
		com.liferay.portal.ext.model.ServiceParam serviceParam)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceParamLocalService.updateServiceParam(serviceParam);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _serviceParamLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_serviceParamLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C_P(
		long classNameId, long classPK, java.lang.String paramType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceParamLocalService.findByC_C_P(classNameId, classPK,
			paramType);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServiceParamLocalService getWrappedServiceParamLocalService() {
		return _serviceParamLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServiceParamLocalService(
		ServiceParamLocalService serviceParamLocalService) {
		_serviceParamLocalService = serviceParamLocalService;
	}

	@Override
	public ServiceParamLocalService getWrappedService() {
		return _serviceParamLocalService;
	}

	@Override
	public void setWrappedService(
		ServiceParamLocalService serviceParamLocalService) {
		_serviceParamLocalService = serviceParamLocalService;
	}

	private ServiceParamLocalService _serviceParamLocalService;
}