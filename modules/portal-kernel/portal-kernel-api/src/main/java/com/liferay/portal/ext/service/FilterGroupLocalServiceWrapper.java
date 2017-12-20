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
 * Provides a wrapper for {@link FilterGroupLocalService}.
 *
 * @author Jeff Qian
 * @see FilterGroupLocalService
 * @generated
 */
@ProviderType
public class FilterGroupLocalServiceWrapper implements FilterGroupLocalService,
	ServiceWrapper<FilterGroupLocalService> {
	public FilterGroupLocalServiceWrapper(
		FilterGroupLocalService filterGroupLocalService) {
		_filterGroupLocalService = filterGroupLocalService;
	}

	/**
	* Adds the filter group to the database. Also notifies the appropriate model listeners.
	*
	* @param filterGroup the filter group
	* @return the filter group that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.FilterGroup addFilterGroup(
		com.liferay.portal.ext.model.FilterGroup filterGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _filterGroupLocalService.addFilterGroup(filterGroup);
	}

	/**
	* Creates a new filter group with the primary key. Does not add the filter group to the database.
	*
	* @param filterGroupId the primary key for the new filter group
	* @return the new filter group
	*/
	@Override
	public com.liferay.portal.ext.model.FilterGroup createFilterGroup(
		long filterGroupId) {
		return _filterGroupLocalService.createFilterGroup(filterGroupId);
	}

	/**
	* Deletes the filter group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param filterGroupId the primary key of the filter group
	* @return the filter group that was removed
	* @throws PortalException if a filter group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.FilterGroup deleteFilterGroup(
		long filterGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _filterGroupLocalService.deleteFilterGroup(filterGroupId);
	}

	/**
	* Deletes the filter group from the database. Also notifies the appropriate model listeners.
	*
	* @param filterGroup the filter group
	* @return the filter group that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.FilterGroup deleteFilterGroup(
		com.liferay.portal.ext.model.FilterGroup filterGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _filterGroupLocalService.deleteFilterGroup(filterGroup);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _filterGroupLocalService.dynamicQuery();
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
		return _filterGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _filterGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _filterGroupLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _filterGroupLocalService.dynamicQueryCount(dynamicQuery);
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
		return _filterGroupLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.portal.ext.model.FilterGroup fetchFilterGroup(
		long filterGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _filterGroupLocalService.fetchFilterGroup(filterGroupId);
	}

	/**
	* Returns the filter group with the primary key.
	*
	* @param filterGroupId the primary key of the filter group
	* @return the filter group
	* @throws PortalException if a filter group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.FilterGroup getFilterGroup(
		long filterGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _filterGroupLocalService.getFilterGroup(filterGroupId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _filterGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the filter groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of filter groups
	* @param end the upper bound of the range of filter groups (not inclusive)
	* @return the range of filter groups
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.portal.ext.model.FilterGroup> getFilterGroups(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _filterGroupLocalService.getFilterGroups(start, end);
	}

	/**
	* Returns the number of filter groups.
	*
	* @return the number of filter groups
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getFilterGroupsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _filterGroupLocalService.getFilterGroupsCount();
	}

	/**
	* Updates the filter group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param filterGroup the filter group
	* @return the filter group that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.portal.ext.model.FilterGroup updateFilterGroup(
		com.liferay.portal.ext.model.FilterGroup filterGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _filterGroupLocalService.updateFilterGroup(filterGroup);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _filterGroupLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_filterGroupLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public boolean isInScope(long groupId, long filterScopeId) {
		return _filterGroupLocalService.isInScope(groupId, filterScopeId);
	}

	@Override
	public void addFilterGroup(long filterScopeId, long[] groupIds)
		throws java.lang.Exception {
		_filterGroupLocalService.addFilterGroup(filterScopeId, groupIds);
	}

	@Override
	public java.util.List<com.liferay.portal.ext.model.FilterGroup> findByFilterScopeId(
		long filterScopeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _filterGroupLocalService.findByFilterScopeId(filterScopeId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FilterGroupLocalService getWrappedFilterGroupLocalService() {
		return _filterGroupLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFilterGroupLocalService(
		FilterGroupLocalService filterGroupLocalService) {
		_filterGroupLocalService = filterGroupLocalService;
	}

	@Override
	public FilterGroupLocalService getWrappedService() {
		return _filterGroupLocalService;
	}

	@Override
	public void setWrappedService(
		FilterGroupLocalService filterGroupLocalService) {
		_filterGroupLocalService = filterGroupLocalService;
	}

	private FilterGroupLocalService _filterGroupLocalService;
}