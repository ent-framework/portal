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

import com.liferay.portal.ext.model.ServiceHost;
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the service host service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceHostPersistenceImpl
 * @see ServiceHostUtil
 * @generated
 */
@ProviderType
public interface ServiceHostPersistence extends BasePersistence<ServiceHost> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServiceHostUtil} to access the service host persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the service host where code = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceHostException} if it could not be found.
	*
	* @param code the code
	* @return the matching service host
	* @throws com.liferay.portal.ext.NoSuchServiceHostException if a matching service host could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceHost findByCode(
		java.lang.String code)
		throws com.liferay.portal.ext.NoSuchServiceHostException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service host where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param code the code
	* @return the matching service host, or <code>null</code> if a matching service host could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceHost fetchByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service host where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service host, or <code>null</code> if a matching service host could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceHost fetchByCode(
		java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the service host where code = &#63; from the database.
	*
	* @param code the code
	* @return the service host that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceHost removeByCode(
		java.lang.String code)
		throws com.liferay.portal.ext.NoSuchServiceHostException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service hosts where code = &#63;.
	*
	* @param code the code
	* @return the number of matching service hosts
	* @throws SystemException if a system exception occurred
	*/
	public int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the service host in the entity cache if it is enabled.
	*
	* @param serviceHost the service host
	*/
	public void cacheResult(
		com.liferay.portal.ext.model.ServiceHost serviceHost);

	/**
	* Caches the service hosts in the entity cache if it is enabled.
	*
	* @param serviceHosts the service hosts
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ServiceHost> serviceHosts);

	/**
	* Creates a new service host with the primary key. Does not add the service host to the database.
	*
	* @param hostId the primary key for the new service host
	* @return the new service host
	*/
	public com.liferay.portal.ext.model.ServiceHost create(long hostId);

	/**
	* Removes the service host with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hostId the primary key of the service host
	* @return the service host that was removed
	* @throws com.liferay.portal.ext.NoSuchServiceHostException if a service host with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceHost remove(long hostId)
		throws com.liferay.portal.ext.NoSuchServiceHostException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.ext.model.ServiceHost updateImpl(
		com.liferay.portal.ext.model.ServiceHost serviceHost)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service host with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceHostException} if it could not be found.
	*
	* @param hostId the primary key of the service host
	* @return the service host
	* @throws com.liferay.portal.ext.NoSuchServiceHostException if a service host with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceHost findByPrimaryKey(
		long hostId)
		throws com.liferay.portal.ext.NoSuchServiceHostException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service host with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hostId the primary key of the service host
	* @return the service host, or <code>null</code> if a service host with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceHost fetchByPrimaryKey(
		long hostId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service hosts.
	*
	* @return the service hosts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceHost> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service hosts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service hosts
	* @param end the upper bound of the range of service hosts (not inclusive)
	* @return the range of service hosts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceHost> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service hosts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service hosts
	* @param end the upper bound of the range of service hosts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service hosts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceHost> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service hosts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service hosts.
	*
	* @return the number of service hosts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}