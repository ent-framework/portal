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

import com.liferay.portal.ext.model.ModelConnectionEntry;
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the model connection entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ModelConnectionEntryPersistenceImpl
 * @see ModelConnectionEntryUtil
 * @generated
 */
@ProviderType
public interface ModelConnectionEntryPersistence extends BasePersistence<ModelConnectionEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ModelConnectionEntryUtil} to access the model connection entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the model connection entries where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the matching model connection entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionEntry> findByC_C(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the model connection entries where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param start the lower bound of the range of model connection entries
	* @param end the upper bound of the range of model connection entries (not inclusive)
	* @return the range of matching model connection entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionEntry> findByC_C(
		long classNameId, long classPK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the model connection entries where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param start the lower bound of the range of model connection entries
	* @param end the upper bound of the range of model connection entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching model connection entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionEntry> findByC_C(
		long classNameId, long classPK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first model connection entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching model connection entry
	* @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a matching model connection entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry findByC_C_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchModelConnectionEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first model connection entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching model connection entry, or <code>null</code> if a matching model connection entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry fetchByC_C_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last model connection entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching model connection entry
	* @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a matching model connection entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry findByC_C_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchModelConnectionEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last model connection entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching model connection entry, or <code>null</code> if a matching model connection entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry fetchByC_C_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection entries before and after the current model connection entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param entryId the primary key of the current model connection entry
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next model connection entry
	* @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a model connection entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry[] findByC_C_PrevAndNext(
		long entryId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchModelConnectionEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the model connection entries where classNameId = &#63; and classPK = &#63; from the database.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_C(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of model connection entries where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the number of matching model connection entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_C(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection entry where classNameId = &#63; and classPK = &#63; and entryGroupId = &#63; or throws a {@link com.liferay.portal.ext.NoSuchModelConnectionEntryException} if it could not be found.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param entryGroupId the entry group ID
	* @return the matching model connection entry
	* @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a matching model connection entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry findByC_C_EG(
		long classNameId, long classPK, long entryGroupId)
		throws com.liferay.portal.ext.NoSuchModelConnectionEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection entry where classNameId = &#63; and classPK = &#63; and entryGroupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param entryGroupId the entry group ID
	* @return the matching model connection entry, or <code>null</code> if a matching model connection entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry fetchByC_C_EG(
		long classNameId, long classPK, long entryGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection entry where classNameId = &#63; and classPK = &#63; and entryGroupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param entryGroupId the entry group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching model connection entry, or <code>null</code> if a matching model connection entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry fetchByC_C_EG(
		long classNameId, long classPK, long entryGroupId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the model connection entry where classNameId = &#63; and classPK = &#63; and entryGroupId = &#63; from the database.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param entryGroupId the entry group ID
	* @return the model connection entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry removeByC_C_EG(
		long classNameId, long classPK, long entryGroupId)
		throws com.liferay.portal.ext.NoSuchModelConnectionEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of model connection entries where classNameId = &#63; and classPK = &#63; and entryGroupId = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param entryGroupId the entry group ID
	* @return the number of matching model connection entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_C_EG(long classNameId, long classPK, long entryGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the model connection entry in the entity cache if it is enabled.
	*
	* @param modelConnectionEntry the model connection entry
	*/
	public void cacheResult(
		com.liferay.portal.ext.model.ModelConnectionEntry modelConnectionEntry);

	/**
	* Caches the model connection entries in the entity cache if it is enabled.
	*
	* @param modelConnectionEntries the model connection entries
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ModelConnectionEntry> modelConnectionEntries);

	/**
	* Creates a new model connection entry with the primary key. Does not add the model connection entry to the database.
	*
	* @param entryId the primary key for the new model connection entry
	* @return the new model connection entry
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry create(
		long entryId);

	/**
	* Removes the model connection entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the model connection entry
	* @return the model connection entry that was removed
	* @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a model connection entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry remove(
		long entryId)
		throws com.liferay.portal.ext.NoSuchModelConnectionEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.ext.model.ModelConnectionEntry updateImpl(
		com.liferay.portal.ext.model.ModelConnectionEntry modelConnectionEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection entry with the primary key or throws a {@link com.liferay.portal.ext.NoSuchModelConnectionEntryException} if it could not be found.
	*
	* @param entryId the primary key of the model connection entry
	* @return the model connection entry
	* @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a model connection entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry findByPrimaryKey(
		long entryId)
		throws com.liferay.portal.ext.NoSuchModelConnectionEntryException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the model connection entry
	* @return the model connection entry, or <code>null</code> if a model connection entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionEntry fetchByPrimaryKey(
		long entryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the model connection entries.
	*
	* @return the model connection entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the model connection entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of model connection entries
	* @param end the upper bound of the range of model connection entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of model connection entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the model connection entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of model connection entries.
	*
	* @return the number of model connection entries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}