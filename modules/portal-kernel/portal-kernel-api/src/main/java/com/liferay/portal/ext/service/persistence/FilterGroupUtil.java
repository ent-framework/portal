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

package com.liferay.portal.ext.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.ext.model.FilterGroup;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the filter group service. This utility wraps {@link FilterGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see FilterGroupPersistence
 * @see FilterGroupPersistenceImpl
 * @generated
 */
@ProviderType
public class FilterGroupUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(FilterGroup filterGroup) {
		getPersistence().clearCache(filterGroup);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilterGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilterGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilterGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static FilterGroup update(FilterGroup filterGroup)
		throws SystemException {
		return getPersistence().update(filterGroup);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static FilterGroup update(FilterGroup filterGroup,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(filterGroup, serviceContext);
	}

	/**
	* Returns all the filter groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.FilterGroup> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the filter groups where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of filter groups
	* @param end the upper bound of the range of filter groups (not inclusive)
	* @return the range of matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.FilterGroup> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the filter groups where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of filter groups
	* @param end the upper bound of the range of filter groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.FilterGroup> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first filter group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first filter group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last filter group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last filter group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the filter groups before and after the current filter group in the ordered set where groupId = &#63;.
	*
	* @param filterGroupId the primary key of the current filter group
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup[] findByGroupId_PrevAndNext(
		long filterGroupId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(filterGroupId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the filter groups where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of filter groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the filter groups where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @return the matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.FilterGroup> findByFilterScopeId(
		long filterScopeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFilterScopeId(filterScopeId);
	}

	/**
	* Returns a range of all the filter groups where filterScopeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param filterScopeId the filter scope ID
	* @param start the lower bound of the range of filter groups
	* @param end the upper bound of the range of filter groups (not inclusive)
	* @return the range of matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.FilterGroup> findByFilterScopeId(
		long filterScopeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByFilterScopeId(filterScopeId, start, end);
	}

	/**
	* Returns an ordered range of all the filter groups where filterScopeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param filterScopeId the filter scope ID
	* @param start the lower bound of the range of filter groups
	* @param end the upper bound of the range of filter groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.FilterGroup> findByFilterScopeId(
		long filterScopeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFilterScopeId(filterScopeId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first filter group in the ordered set where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup findByFilterScopeId_First(
		long filterScopeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFilterScopeId_First(filterScopeId, orderByComparator);
	}

	/**
	* Returns the first filter group in the ordered set where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup fetchByFilterScopeId_First(
		long filterScopeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFilterScopeId_First(filterScopeId, orderByComparator);
	}

	/**
	* Returns the last filter group in the ordered set where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup findByFilterScopeId_Last(
		long filterScopeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFilterScopeId_Last(filterScopeId, orderByComparator);
	}

	/**
	* Returns the last filter group in the ordered set where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup fetchByFilterScopeId_Last(
		long filterScopeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByFilterScopeId_Last(filterScopeId, orderByComparator);
	}

	/**
	* Returns the filter groups before and after the current filter group in the ordered set where filterScopeId = &#63;.
	*
	* @param filterGroupId the primary key of the current filter group
	* @param filterScopeId the filter scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup[] findByFilterScopeId_PrevAndNext(
		long filterGroupId, long filterScopeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByFilterScopeId_PrevAndNext(filterGroupId,
			filterScopeId, orderByComparator);
	}

	/**
	* Removes all the filter groups where filterScopeId = &#63; from the database.
	*
	* @param filterScopeId the filter scope ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByFilterScopeId(long filterScopeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByFilterScopeId(filterScopeId);
	}

	/**
	* Returns the number of filter groups where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @return the number of matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByFilterScopeId(long filterScopeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByFilterScopeId(filterScopeId);
	}

	/**
	* Returns the filter group where groupId = &#63; and filterScopeId = &#63; or throws a {@link com.liferay.portal.ext.NoSuchFilterGroupException} if it could not be found.
	*
	* @param groupId the group ID
	* @param filterScopeId the filter scope ID
	* @return the matching filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup findByF_G(
		long groupId, long filterScopeId)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByF_G(groupId, filterScopeId);
	}

	/**
	* Returns the filter group where groupId = &#63; and filterScopeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param filterScopeId the filter scope ID
	* @return the matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup fetchByF_G(
		long groupId, long filterScopeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByF_G(groupId, filterScopeId);
	}

	/**
	* Returns the filter group where groupId = &#63; and filterScopeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param filterScopeId the filter scope ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup fetchByF_G(
		long groupId, long filterScopeId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByF_G(groupId, filterScopeId, retrieveFromCache);
	}

	/**
	* Removes the filter group where groupId = &#63; and filterScopeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param filterScopeId the filter scope ID
	* @return the filter group that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup removeByF_G(
		long groupId, long filterScopeId)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByF_G(groupId, filterScopeId);
	}

	/**
	* Returns the number of filter groups where groupId = &#63; and filterScopeId = &#63;.
	*
	* @param groupId the group ID
	* @param filterScopeId the filter scope ID
	* @return the number of matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countByF_G(long groupId, long filterScopeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByF_G(groupId, filterScopeId);
	}

	/**
	* Caches the filter group in the entity cache if it is enabled.
	*
	* @param filterGroup the filter group
	*/
	public static void cacheResult(
		com.liferay.portal.ext.model.FilterGroup filterGroup) {
		getPersistence().cacheResult(filterGroup);
	}

	/**
	* Caches the filter groups in the entity cache if it is enabled.
	*
	* @param filterGroups the filter groups
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.ext.model.FilterGroup> filterGroups) {
		getPersistence().cacheResult(filterGroups);
	}

	/**
	* Creates a new filter group with the primary key. Does not add the filter group to the database.
	*
	* @param filterGroupId the primary key for the new filter group
	* @return the new filter group
	*/
	public static com.liferay.portal.ext.model.FilterGroup create(
		long filterGroupId) {
		return getPersistence().create(filterGroupId);
	}

	/**
	* Removes the filter group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param filterGroupId the primary key of the filter group
	* @return the filter group that was removed
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup remove(
		long filterGroupId)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(filterGroupId);
	}

	public static com.liferay.portal.ext.model.FilterGroup updateImpl(
		com.liferay.portal.ext.model.FilterGroup filterGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(filterGroup);
	}

	/**
	* Returns the filter group with the primary key or throws a {@link com.liferay.portal.ext.NoSuchFilterGroupException} if it could not be found.
	*
	* @param filterGroupId the primary key of the filter group
	* @return the filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup findByPrimaryKey(
		long filterGroupId)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(filterGroupId);
	}

	/**
	* Returns the filter group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param filterGroupId the primary key of the filter group
	* @return the filter group, or <code>null</code> if a filter group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.FilterGroup fetchByPrimaryKey(
		long filterGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(filterGroupId);
	}

	/**
	* Returns all the filter groups.
	*
	* @return the filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.FilterGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.portal.ext.model.FilterGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the filter groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of filter groups
	* @param end the upper bound of the range of filter groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.FilterGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the filter groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of filter groups.
	*
	* @return the number of filter groups
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FilterGroupPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FilterGroupPersistence)PortalBeanLocatorUtil.locate(FilterGroupPersistence.class.getName());

			ReferenceRegistry.registerReference(FilterGroupUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FilterGroupPersistence persistence) {
	}

	private static FilterGroupPersistence _persistence;
}