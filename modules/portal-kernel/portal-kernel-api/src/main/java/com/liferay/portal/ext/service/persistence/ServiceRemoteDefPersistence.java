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

import com.liferay.portal.ext.model.ServiceRemoteDef;
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the service remote def service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceRemoteDefPersistenceImpl
 * @see ServiceRemoteDefUtil
 * @generated
 */
@ProviderType
public interface ServiceRemoteDefPersistence extends BasePersistence<ServiceRemoteDef> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServiceRemoteDefUtil} to access the service remote def persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the service remote def where code = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceRemoteDefException} if it could not be found.
	*
	* @param code the code
	* @return the matching service remote def
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef findByCode(
		java.lang.String code)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service remote def where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param code the code
	* @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef fetchByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service remote def where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef fetchByCode(
		java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the service remote def where code = &#63; from the database.
	*
	* @param code the code
	* @return the service remote def that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef removeByCode(
		java.lang.String code)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service remote defs where code = &#63;.
	*
	* @param code the code
	* @return the number of matching service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service remote def where authId = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceRemoteDefException} if it could not be found.
	*
	* @param authId the auth ID
	* @return the matching service remote def
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef findByAuthId(
		long authId)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service remote def where authId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param authId the auth ID
	* @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef fetchByAuthId(
		long authId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service remote def where authId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param authId the auth ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef fetchByAuthId(
		long authId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the service remote def where authId = &#63; from the database.
	*
	* @param authId the auth ID
	* @return the service remote def that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef removeByAuthId(
		long authId)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service remote defs where authId = &#63;.
	*
	* @param authId the auth ID
	* @return the number of matching service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public int countByAuthId(long authId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service remote defs where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the matching service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findByTagId(
		long tagId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service remote defs where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceRemoteDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagId the tag ID
	* @param start the lower bound of the range of service remote defs
	* @param end the upper bound of the range of service remote defs (not inclusive)
	* @return the range of matching service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findByTagId(
		long tagId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service remote defs where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceRemoteDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagId the tag ID
	* @param start the lower bound of the range of service remote defs
	* @param end the upper bound of the range of service remote defs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findByTagId(
		long tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service remote def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service remote def
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef findByTagId_First(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service remote def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef fetchByTagId_First(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service remote def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service remote def
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef findByTagId_Last(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service remote def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef fetchByTagId_Last(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service remote defs before and after the current service remote def in the ordered set where tagId = &#63;.
	*
	* @param remoteId the primary key of the current service remote def
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service remote def
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a service remote def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef[] findByTagId_PrevAndNext(
		long remoteId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service remote defs where tagId = &#63; from the database.
	*
	* @param tagId the tag ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByTagId(long tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service remote defs where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the number of matching service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public int countByTagId(long tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the service remote def in the entity cache if it is enabled.
	*
	* @param serviceRemoteDef the service remote def
	*/
	public void cacheResult(
		com.liferay.portal.ext.model.ServiceRemoteDef serviceRemoteDef);

	/**
	* Caches the service remote defs in the entity cache if it is enabled.
	*
	* @param serviceRemoteDefs the service remote defs
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> serviceRemoteDefs);

	/**
	* Creates a new service remote def with the primary key. Does not add the service remote def to the database.
	*
	* @param remoteId the primary key for the new service remote def
	* @return the new service remote def
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef create(long remoteId);

	/**
	* Removes the service remote def with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param remoteId the primary key of the service remote def
	* @return the service remote def that was removed
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a service remote def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef remove(long remoteId)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.ext.model.ServiceRemoteDef updateImpl(
		com.liferay.portal.ext.model.ServiceRemoteDef serviceRemoteDef)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service remote def with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceRemoteDefException} if it could not be found.
	*
	* @param remoteId the primary key of the service remote def
	* @return the service remote def
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a service remote def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef findByPrimaryKey(
		long remoteId)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service remote def with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param remoteId the primary key of the service remote def
	* @return the service remote def, or <code>null</code> if a service remote def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceRemoteDef fetchByPrimaryKey(
		long remoteId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service remote defs.
	*
	* @return the service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service remote defs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceRemoteDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service remote defs
	* @param end the upper bound of the range of service remote defs (not inclusive)
	* @return the range of service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service remote defs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceRemoteDefModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service remote defs
	* @param end the upper bound of the range of service remote defs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service remote defs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service remote defs.
	*
	* @return the number of service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}