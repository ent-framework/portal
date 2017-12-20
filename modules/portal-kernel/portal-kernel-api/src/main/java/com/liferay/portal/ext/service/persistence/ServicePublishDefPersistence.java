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

import com.liferay.portal.ext.model.ServicePublishDef;
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the service publish def service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServicePublishDefPersistenceImpl
 * @see ServicePublishDefUtil
 * @generated
 */
@ProviderType
public interface ServicePublishDefPersistence extends BasePersistence<ServicePublishDef> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServicePublishDefUtil} to access the service publish def persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the service publish def where path = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServicePublishDefException} if it could not be found.
	*
	* @param path the path
	* @return the matching service publish def
	* @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef findByPath(
		java.lang.String path)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service publish def where path = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param path the path
	* @return the matching service publish def, or <code>null</code> if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef fetchByPath(
		java.lang.String path)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service publish def where path = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param path the path
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service publish def, or <code>null</code> if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef fetchByPath(
		java.lang.String path, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the service publish def where path = &#63; from the database.
	*
	* @param path the path
	* @return the service publish def that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef removeByPath(
		java.lang.String path)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service publish defs where path = &#63;.
	*
	* @param path the path
	* @return the number of matching service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public int countByPath(java.lang.String path)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service publish defs where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the matching service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findByTagId(
		long tagId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service publish defs where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServicePublishDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagId the tag ID
	* @param start the lower bound of the range of service publish defs
	* @param end the upper bound of the range of service publish defs (not inclusive)
	* @return the range of matching service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findByTagId(
		long tagId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service publish defs where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServicePublishDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagId the tag ID
	* @param start the lower bound of the range of service publish defs
	* @param end the upper bound of the range of service publish defs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findByTagId(
		long tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service publish def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service publish def
	* @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef findByTagId_First(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service publish def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service publish def, or <code>null</code> if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef fetchByTagId_First(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service publish def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service publish def
	* @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef findByTagId_Last(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service publish def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service publish def, or <code>null</code> if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef fetchByTagId_Last(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service publish defs before and after the current service publish def in the ordered set where tagId = &#63;.
	*
	* @param publishId the primary key of the current service publish def
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service publish def
	* @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a service publish def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef[] findByTagId_PrevAndNext(
		long publishId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service publish defs where tagId = &#63; from the database.
	*
	* @param tagId the tag ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTagId(long tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service publish defs where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the number of matching service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTagId(long tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the service publish def in the entity cache if it is enabled.
	*
	* @param servicePublishDef the service publish def
	*/
	public void cacheResult(
		com.liferay.portal.ext.model.ServicePublishDef servicePublishDef);

	/**
	* Caches the service publish defs in the entity cache if it is enabled.
	*
	* @param servicePublishDefs the service publish defs
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ServicePublishDef> servicePublishDefs);

	/**
	* Creates a new service publish def with the primary key. Does not add the service publish def to the database.
	*
	* @param publishId the primary key for the new service publish def
	* @return the new service publish def
	*/
	public com.liferay.portal.ext.model.ServicePublishDef create(long publishId);

	/**
	* Removes the service publish def with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param publishId the primary key of the service publish def
	* @return the service publish def that was removed
	* @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a service publish def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef remove(long publishId)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.ext.model.ServicePublishDef updateImpl(
		com.liferay.portal.ext.model.ServicePublishDef servicePublishDef)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service publish def with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServicePublishDefException} if it could not be found.
	*
	* @param publishId the primary key of the service publish def
	* @return the service publish def
	* @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a service publish def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef findByPrimaryKey(
		long publishId)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service publish def with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param publishId the primary key of the service publish def
	* @return the service publish def, or <code>null</code> if a service publish def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServicePublishDef fetchByPrimaryKey(
		long publishId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service publish defs.
	*
	* @return the service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service publish defs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServicePublishDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service publish defs
	* @param end the upper bound of the range of service publish defs (not inclusive)
	* @return the range of service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service publish defs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServicePublishDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service publish defs
	* @param end the upper bound of the range of service publish defs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service publish defs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service publish defs.
	*
	* @return the number of service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}