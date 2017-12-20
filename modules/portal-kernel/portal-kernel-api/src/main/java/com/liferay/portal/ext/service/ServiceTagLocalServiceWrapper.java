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
 * Provides a wrapper for {@link ServiceTagLocalService}.
 *
 * @author Jeff Qian
 * @see ServiceTagLocalService
 * @generated
 */
@ProviderType
public class ServiceTagLocalServiceWrapper implements ServiceTagLocalService,
	ServiceWrapper<ServiceTagLocalService> {
	public ServiceTagLocalServiceWrapper(
		ServiceTagLocalService serviceTagLocalService) {
		_serviceTagLocalService = serviceTagLocalService;
	}

	/**
	* Adds the service tag to the database. Also notifies the appropriate model listeners.
	*
	* @param serviceTag the service tag
	* @return the service tag that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceTag addServiceTag(
		com.liferay.portal.ext.model.ServiceTag serviceTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceTagLocalService.addServiceTag(serviceTag);
	}

	/**
	* Creates a new service tag with the primary key. Does not add the service tag to the database.
	*
	* @param tagId the primary key for the new service tag
	* @return the new service tag
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceTag createServiceTag(long tagId) {
		return _serviceTagLocalService.createServiceTag(tagId);
	}

	/**
	* Deletes the service tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tagId the primary key of the service tag
	* @return the service tag that was removed
	* @throws PortalException if a service tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceTag deleteServiceTag(long tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceTagLocalService.deleteServiceTag(tagId);
	}

	/**
	* Deletes the service tag from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceTag the service tag
	* @return the service tag that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceTag deleteServiceTag(
		com.liferay.portal.ext.model.ServiceTag serviceTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceTagLocalService.deleteServiceTag(serviceTag);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _serviceTagLocalService.dynamicQuery();
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
		return _serviceTagLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceTagLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _serviceTagLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _serviceTagLocalService.dynamicQueryCount(dynamicQuery);
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
		return _serviceTagLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.portal.ext.model.ServiceTag fetchServiceTag(long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceTagLocalService.fetchServiceTag(tagId);
	}

	/**
	* Returns the service tag with the primary key.
	*
	* @param tagId the primary key of the service tag
	* @return the service tag
	* @throws PortalException if a service tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceTag getServiceTag(long tagId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceTagLocalService.getServiceTag(tagId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceTagLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the service tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service tags
	* @param end the upper bound of the range of service tags (not inclusive)
	* @return the range of service tags
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.portal.ext.model.ServiceTag> getServiceTags(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceTagLocalService.getServiceTags(start, end);
	}

	/**
	* Returns the number of service tags.
	*
	* @return the number of service tags
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getServiceTagsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceTagLocalService.getServiceTagsCount();
	}

	/**
	* Updates the service tag in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param serviceTag the service tag
	* @return the service tag that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ServiceTag updateServiceTag(
		com.liferay.portal.ext.model.ServiceTag serviceTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceTagLocalService.updateServiceTag(serviceTag);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _serviceTagLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_serviceTagLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public com.liferay.portal.ext.model.ServiceTag find(
		java.lang.String tagName)
		throws com.liferay.portal.ext.NoSuchServiceTagException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceTagLocalService.find(tagName);
	}

	@Override
	public java.util.List<com.liferay.portal.ext.model.ServiceTag> findAll()
		throws com.liferay.portal.ext.NoSuchServiceTagException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceTagLocalService.findAll();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ServiceTagLocalService getWrappedServiceTagLocalService() {
		return _serviceTagLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedServiceTagLocalService(
		ServiceTagLocalService serviceTagLocalService) {
		_serviceTagLocalService = serviceTagLocalService;
	}

	@Override
	public ServiceTagLocalService getWrappedService() {
		return _serviceTagLocalService;
	}

	@Override
	public void setWrappedService(ServiceTagLocalService serviceTagLocalService) {
		_serviceTagLocalService = serviceTagLocalService;
	}

	private ServiceTagLocalService _serviceTagLocalService;
}