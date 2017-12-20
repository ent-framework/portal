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
 * Provides a wrapper for {@link ModelConnectionLineLocalService}.
 *
 * @author Jeff Qian
 * @see ModelConnectionLineLocalService
 * @generated
 */
@ProviderType
public class ModelConnectionLineLocalServiceWrapper
	implements ModelConnectionLineLocalService,
		ServiceWrapper<ModelConnectionLineLocalService> {
	public ModelConnectionLineLocalServiceWrapper(
		ModelConnectionLineLocalService modelConnectionLineLocalService) {
		_modelConnectionLineLocalService = modelConnectionLineLocalService;
	}

	/**
	* Adds the model connection line to the database. Also notifies the appropriate model listeners.
	*
	* @param modelConnectionLine the model connection line
	* @return the model connection line that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionLine addModelConnectionLine(
		com.liferay.portal.ext.model.ModelConnectionLine modelConnectionLine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionLineLocalService.addModelConnectionLine(modelConnectionLine);
	}

	/**
	* Creates a new model connection line with the primary key. Does not add the model connection line to the database.
	*
	* @param lineId the primary key for the new model connection line
	* @return the new model connection line
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionLine createModelConnectionLine(
		long lineId) {
		return _modelConnectionLineLocalService.createModelConnectionLine(lineId);
	}

	/**
	* Deletes the model connection line with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lineId the primary key of the model connection line
	* @return the model connection line that was removed
	* @throws PortalException if a model connection line with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionLine deleteModelConnectionLine(
		long lineId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionLineLocalService.deleteModelConnectionLine(lineId);
	}

	/**
	* Deletes the model connection line from the database. Also notifies the appropriate model listeners.
	*
	* @param modelConnectionLine the model connection line
	* @return the model connection line that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionLine deleteModelConnectionLine(
		com.liferay.portal.ext.model.ModelConnectionLine modelConnectionLine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionLineLocalService.deleteModelConnectionLine(modelConnectionLine);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _modelConnectionLineLocalService.dynamicQuery();
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
		return _modelConnectionLineLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _modelConnectionLineLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _modelConnectionLineLocalService.dynamicQuery(dynamicQuery,
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
		return _modelConnectionLineLocalService.dynamicQueryCount(dynamicQuery);
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
		return _modelConnectionLineLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.portal.ext.model.ModelConnectionLine fetchModelConnectionLine(
		long lineId) throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionLineLocalService.fetchModelConnectionLine(lineId);
	}

	/**
	* Returns the model connection line with the primary key.
	*
	* @param lineId the primary key of the model connection line
	* @return the model connection line
	* @throws PortalException if a model connection line with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionLine getModelConnectionLine(
		long lineId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionLineLocalService.getModelConnectionLine(lineId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionLineLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the model connection lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of model connection lines
	* @param end the upper bound of the range of model connection lines (not inclusive)
	* @return the range of model connection lines
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> getModelConnectionLines(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionLineLocalService.getModelConnectionLines(start,
			end);
	}

	/**
	* Returns the number of model connection lines.
	*
	* @return the number of model connection lines
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getModelConnectionLinesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionLineLocalService.getModelConnectionLinesCount();
	}

	/**
	* Updates the model connection line in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param modelConnectionLine the model connection line
	* @return the model connection line that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.ModelConnectionLine updateModelConnectionLine(
		com.liferay.portal.ext.model.ModelConnectionLine modelConnectionLine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelConnectionLineLocalService.updateModelConnectionLine(modelConnectionLine);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _modelConnectionLineLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_modelConnectionLineLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public ModelConnectionLineLocalService getWrappedModelConnectionLineLocalService() {
		return _modelConnectionLineLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedModelConnectionLineLocalService(
		ModelConnectionLineLocalService modelConnectionLineLocalService) {
		_modelConnectionLineLocalService = modelConnectionLineLocalService;
	}

	@Override
	public ModelConnectionLineLocalService getWrappedService() {
		return _modelConnectionLineLocalService;
	}

	@Override
	public void setWrappedService(
		ModelConnectionLineLocalService modelConnectionLineLocalService) {
		_modelConnectionLineLocalService = modelConnectionLineLocalService;
	}

	private ModelConnectionLineLocalService _modelConnectionLineLocalService;
}