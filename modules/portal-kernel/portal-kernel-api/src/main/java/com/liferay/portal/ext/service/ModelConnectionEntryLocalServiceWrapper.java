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
 * Provides a wrapper for {@link ModelConnectionEntryLocalService}.
 *
 * @author Jeff Qian
 * @see ModelConnectionEntryLocalService
 * @generated
 */
@ProviderType
public class ModelConnectionEntryLocalServiceWrapper
	implements ModelConnectionEntryLocalService,
		ServiceWrapper<ModelConnectionEntryLocalService> {
	public ModelConnectionEntryLocalServiceWrapper(
		ModelConnectionEntryLocalService modelConnectionEntryLocalService) {
		_modelConnectionEntryLocalService = modelConnectionEntryLocalService;
	}

	/**
	* Adds the model connection entry to the database. Also notifies the appropriate model listeners.
	*
	* @param modelConnectionEntry the model connection entry
	* @return the model connection entry that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionEntry addModelConnectionEntry(
		com.liferay.portal.ext.model.ModelConnectionEntry modelConnectionEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionEntryLocalService.addModelConnectionEntry(modelConnectionEntry);
	}

	/**
	* Creates a new model connection entry with the primary key. Does not add the model connection entry to the database.
	*
	* @param entryId the primary key for the new model connection entry
	* @return the new model connection entry
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionEntry createModelConnectionEntry(
		long entryId) {
		return _modelConnectionEntryLocalService.createModelConnectionEntry(entryId);
	}

	/**
	* Deletes the model connection entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the model connection entry
	* @return the model connection entry that was removed
	* @throws PortalException if a model connection entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionEntry deleteModelConnectionEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionEntryLocalService.deleteModelConnectionEntry(entryId);
	}

	/**
	* Deletes the model connection entry from the database. Also notifies the appropriate model listeners.
	*
	* @param modelConnectionEntry the model connection entry
	* @return the model connection entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionEntry deleteModelConnectionEntry(
		com.liferay.portal.ext.model.ModelConnectionEntry modelConnectionEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionEntryLocalService.deleteModelConnectionEntry(modelConnectionEntry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _modelConnectionEntryLocalService.dynamicQuery();
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
		return _modelConnectionEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _modelConnectionEntryLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _modelConnectionEntryLocalService.dynamicQuery(dynamicQuery,
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
		return _modelConnectionEntryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _modelConnectionEntryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.portal.ext.model.ModelConnectionEntry fetchModelConnectionEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionEntryLocalService.fetchModelConnectionEntry(entryId);
	}

	/**
	* Returns the model connection entry with the primary key.
	*
	* @param entryId the primary key of the model connection entry
	* @return the model connection entry
	* @throws PortalException if a model connection entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionEntry getModelConnectionEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionEntryLocalService.getModelConnectionEntry(entryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the model connection entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of model connection entries
	* @param end the upper bound of the range of model connection entries (not inclusive)
	* @return the range of model connection entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionEntry> getModelConnectionEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionEntryLocalService.getModelConnectionEntries(start,
			end);
	}

	/**
	* Returns the number of model connection entries.
	*
	* @return the number of model connection entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getModelConnectionEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionEntryLocalService.getModelConnectionEntriesCount();
	}

	/**
	* Updates the model connection entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param modelConnectionEntry the model connection entry
	* @return the model connection entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionEntry updateModelConnectionEntry(
		com.liferay.portal.ext.model.ModelConnectionEntry modelConnectionEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionEntryLocalService.updateModelConnectionEntry(modelConnectionEntry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _modelConnectionEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_modelConnectionEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ModelConnectionEntryLocalService getWrappedModelConnectionEntryLocalService() {
		return _modelConnectionEntryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedModelConnectionEntryLocalService(
		ModelConnectionEntryLocalService modelConnectionEntryLocalService) {
		_modelConnectionEntryLocalService = modelConnectionEntryLocalService;
	}

	@Override
	public ModelConnectionEntryLocalService getWrappedService() {
		return _modelConnectionEntryLocalService;
	}

	@Override
	public void setWrappedService(
		ModelConnectionEntryLocalService modelConnectionEntryLocalService) {
		_modelConnectionEntryLocalService = modelConnectionEntryLocalService;
	}

	private ModelConnectionEntryLocalService _modelConnectionEntryLocalService;
}