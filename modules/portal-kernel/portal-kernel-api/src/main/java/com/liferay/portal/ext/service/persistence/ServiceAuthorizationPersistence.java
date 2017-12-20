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

import com.liferay.portal.ext.model.ServiceAuthorization;
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the service authorization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceAuthorizationPersistenceImpl
 * @see ServiceAuthorizationUtil
 * @generated
 */
@ProviderType
public interface ServiceAuthorizationPersistence extends BasePersistence<ServiceAuthorization> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServiceAuthorizationUtil} to access the service authorization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the service authorization where code = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceAuthorizationException} if it could not be found.
	*
	* @param code the code
	* @return the matching service authorization
	* @throws com.liferay.portal.ext.NoSuchServiceAuthorizationException if a matching service authorization could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceAuthorization findByCode(
		java.lang.String code)
		throws com.liferay.portal.ext.NoSuchServiceAuthorizationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service authorization where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param code the code
	* @return the matching service authorization, or <code>null</code> if a matching service authorization could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceAuthorization fetchByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service authorization where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service authorization, or <code>null</code> if a matching service authorization could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceAuthorization fetchByCode(
		java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the service authorization where code = &#63; from the database.
	*
	* @param code the code
	* @return the service authorization that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceAuthorization removeByCode(
		java.lang.String code)
		throws com.liferay.portal.ext.NoSuchServiceAuthorizationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service authorizations where code = &#63;.
	*
	* @param code the code
	* @return the number of matching service authorizations
	* @throws SystemException if a system exception occurred
	*/
	public int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the service authorization in the entity cache if it is enabled.
	*
	* @param serviceAuthorization the service authorization
	*/
	public void cacheResult(
		com.liferay.portal.ext.model.ServiceAuthorization serviceAuthorization);

	/**
	* Caches the service authorizations in the entity cache if it is enabled.
	*
	* @param serviceAuthorizations the service authorizations
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ServiceAuthorization> serviceAuthorizations);

	/**
	* Creates a new service authorization with the primary key. Does not add the service authorization to the database.
	*
	* @param authId the primary key for the new service authorization
	* @return the new service authorization
	*/
	public com.liferay.portal.ext.model.ServiceAuthorization create(long authId);

	/**
	* Removes the service authorization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param authId the primary key of the service authorization
	* @return the service authorization that was removed
	* @throws com.liferay.portal.ext.NoSuchServiceAuthorizationException if a service authorization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceAuthorization remove(long authId)
		throws com.liferay.portal.ext.NoSuchServiceAuthorizationException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.ext.model.ServiceAuthorization updateImpl(
		com.liferay.portal.ext.model.ServiceAuthorization serviceAuthorization)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service authorization with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceAuthorizationException} if it could not be found.
	*
	* @param authId the primary key of the service authorization
	* @return the service authorization
	* @throws com.liferay.portal.ext.NoSuchServiceAuthorizationException if a service authorization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceAuthorization findByPrimaryKey(
		long authId)
		throws com.liferay.portal.ext.NoSuchServiceAuthorizationException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service authorization with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param authId the primary key of the service authorization
	* @return the service authorization, or <code>null</code> if a service authorization with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceAuthorization fetchByPrimaryKey(
		long authId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service authorizations.
	*
	* @return the service authorizations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceAuthorization> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service authorizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceAuthorizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service authorizations
	* @param end the upper bound of the range of service authorizations (not inclusive)
	* @return the range of service authorizations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceAuthorization> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service authorizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceAuthorizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service authorizations
	* @param end the upper bound of the range of service authorizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service authorizations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceAuthorization> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service authorizations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service authorizations.
	*
	* @return the number of service authorizations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}