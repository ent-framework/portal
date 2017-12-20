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
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the filter group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see FilterGroupPersistenceImpl
 * @see FilterGroupUtil
 * @generated
 */
@ProviderType
public interface FilterGroupPersistence extends BasePersistence<FilterGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilterGroupUtil} to access the filter group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the filter groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.FilterGroup> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portal.ext.model.FilterGroup> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portal.ext.model.FilterGroup> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first filter group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first filter group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last filter group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last filter group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.portal.ext.model.FilterGroup[] findByGroupId_PrevAndNext(
		long filterGroupId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the filter groups where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of filter groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the filter groups where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @return the matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.FilterGroup> findByFilterScopeId(
		long filterScopeId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portal.ext.model.FilterGroup> findByFilterScopeId(
		long filterScopeId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portal.ext.model.FilterGroup> findByFilterScopeId(
		long filterScopeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first filter group in the ordered set where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup findByFilterScopeId_First(
		long filterScopeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first filter group in the ordered set where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup fetchByFilterScopeId_First(
		long filterScopeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last filter group in the ordered set where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup findByFilterScopeId_Last(
		long filterScopeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last filter group in the ordered set where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup fetchByFilterScopeId_Last(
		long filterScopeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.portal.ext.model.FilterGroup[] findByFilterScopeId_PrevAndNext(
		long filterGroupId, long filterScopeId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the filter groups where filterScopeId = &#63; from the database.
	*
	* @param filterScopeId the filter scope ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByFilterScopeId(long filterScopeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of filter groups where filterScopeId = &#63;.
	*
	* @param filterScopeId the filter scope ID
	* @return the number of matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByFilterScopeId(long filterScopeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the filter group where groupId = &#63; and filterScopeId = &#63; or throws a {@link com.liferay.portal.ext.NoSuchFilterGroupException} if it could not be found.
	*
	* @param groupId the group ID
	* @param filterScopeId the filter scope ID
	* @return the matching filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup findByF_G(long groupId,
		long filterScopeId)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the filter group where groupId = &#63; and filterScopeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param filterScopeId the filter scope ID
	* @return the matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup fetchByF_G(long groupId,
		long filterScopeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the filter group where groupId = &#63; and filterScopeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param filterScopeId the filter scope ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching filter group, or <code>null</code> if a matching filter group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup fetchByF_G(long groupId,
		long filterScopeId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the filter group where groupId = &#63; and filterScopeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param filterScopeId the filter scope ID
	* @return the filter group that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup removeByF_G(long groupId,
		long filterScopeId)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of filter groups where groupId = &#63; and filterScopeId = &#63;.
	*
	* @param groupId the group ID
	* @param filterScopeId the filter scope ID
	* @return the number of matching filter groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByF_G(long groupId, long filterScopeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the filter group in the entity cache if it is enabled.
	*
	* @param filterGroup the filter group
	*/
	public void cacheResult(
		com.liferay.portal.ext.model.FilterGroup filterGroup);

	/**
	* Caches the filter groups in the entity cache if it is enabled.
	*
	* @param filterGroups the filter groups
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.ext.model.FilterGroup> filterGroups);

	/**
	* Creates a new filter group with the primary key. Does not add the filter group to the database.
	*
	* @param filterGroupId the primary key for the new filter group
	* @return the new filter group
	*/
	public com.liferay.portal.ext.model.FilterGroup create(long filterGroupId);

	/**
	* Removes the filter group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param filterGroupId the primary key of the filter group
	* @return the filter group that was removed
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup remove(long filterGroupId)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.ext.model.FilterGroup updateImpl(
		com.liferay.portal.ext.model.FilterGroup filterGroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the filter group with the primary key or throws a {@link com.liferay.portal.ext.NoSuchFilterGroupException} if it could not be found.
	*
	* @param filterGroupId the primary key of the filter group
	* @return the filter group
	* @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup findByPrimaryKey(
		long filterGroupId)
		throws com.liferay.portal.ext.NoSuchFilterGroupException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the filter group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param filterGroupId the primary key of the filter group
	* @return the filter group, or <code>null</code> if a filter group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.FilterGroup fetchByPrimaryKey(
		long filterGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the filter groups.
	*
	* @return the filter groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.FilterGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portal.ext.model.FilterGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portal.ext.model.FilterGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the filter groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of filter groups.
	*
	* @return the number of filter groups
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}