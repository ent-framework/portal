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
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the service remote def service. This utility wraps {@link ServiceRemoteDefPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceRemoteDefPersistence
 * @see ServiceRemoteDefPersistenceImpl
 * @generated
 */
@ProviderType
public class ServiceRemoteDefUtil {
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
	public static void clearCache(ServiceRemoteDef serviceRemoteDef) {
		getPersistence().clearCache(serviceRemoteDef);
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
	public static List<ServiceRemoteDef> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ServiceRemoteDef> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ServiceRemoteDef> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ServiceRemoteDef update(ServiceRemoteDef serviceRemoteDef)
		throws SystemException {
		return getPersistence().update(serviceRemoteDef);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ServiceRemoteDef update(ServiceRemoteDef serviceRemoteDef,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(serviceRemoteDef, serviceContext);
	}

	/**
	* Returns the service remote def where code = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceRemoteDefException} if it could not be found.
	*
	* @param code the code
	* @return the matching service remote def
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef findByCode(
		java.lang.String code)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCode(code);
	}

	/**
	* Returns the service remote def where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param code the code
	* @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef fetchByCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode(code);
	}

	/**
	* Returns the service remote def where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param code the code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef fetchByCode(
		java.lang.String code, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCode(code, retrieveFromCache);
	}

	/**
	* Removes the service remote def where code = &#63; from the database.
	*
	* @param code the code
	* @return the service remote def that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef removeByCode(
		java.lang.String code)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByCode(code);
	}

	/**
	* Returns the number of service remote defs where code = &#63;.
	*
	* @param code the code
	* @return the number of matching service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCode(java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCode(code);
	}

	/**
	* Returns the service remote def where authId = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceRemoteDefException} if it could not be found.
	*
	* @param authId the auth ID
	* @return the matching service remote def
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef findByAuthId(
		long authId)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByAuthId(authId);
	}

	/**
	* Returns the service remote def where authId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param authId the auth ID
	* @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef fetchByAuthId(
		long authId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAuthId(authId);
	}

	/**
	* Returns the service remote def where authId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param authId the auth ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef fetchByAuthId(
		long authId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAuthId(authId, retrieveFromCache);
	}

	/**
	* Removes the service remote def where authId = &#63; from the database.
	*
	* @param authId the auth ID
	* @return the service remote def that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef removeByAuthId(
		long authId)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByAuthId(authId);
	}

	/**
	* Returns the number of service remote defs where authId = &#63;.
	*
	* @param authId the auth ID
	* @return the number of matching service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAuthId(long authId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAuthId(authId);
	}

	/**
	* Returns all the service remote defs where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the matching service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findByTagId(
		long tagId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagId(tagId);
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findByTagId(
		long tagId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagId(tagId, start, end);
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findByTagId(
		long tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagId(tagId, start, end, orderByComparator);
	}

	/**
	* Returns the first service remote def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service remote def
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef findByTagId_First(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagId_First(tagId, orderByComparator);
	}

	/**
	* Returns the first service remote def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef fetchByTagId_First(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTagId_First(tagId, orderByComparator);
	}

	/**
	* Returns the last service remote def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service remote def
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef findByTagId_Last(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagId_Last(tagId, orderByComparator);
	}

	/**
	* Returns the last service remote def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service remote def, or <code>null</code> if a matching service remote def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef fetchByTagId_Last(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTagId_Last(tagId, orderByComparator);
	}

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
	public static com.liferay.portal.ext.model.ServiceRemoteDef[] findByTagId_PrevAndNext(
		long remoteId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTagId_PrevAndNext(remoteId, tagId, orderByComparator);
	}

	/**
	* Removes all the service remote defs where tagId = &#63; from the database.
	*
	* @param tagId the tag ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTagId(long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTagId(tagId);
	}

	/**
	* Returns the number of service remote defs where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the number of matching service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTagId(long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTagId(tagId);
	}

	/**
	* Caches the service remote def in the entity cache if it is enabled.
	*
	* @param serviceRemoteDef the service remote def
	*/
	public static void cacheResult(
		com.liferay.portal.ext.model.ServiceRemoteDef serviceRemoteDef) {
		getPersistence().cacheResult(serviceRemoteDef);
	}

	/**
	* Caches the service remote defs in the entity cache if it is enabled.
	*
	* @param serviceRemoteDefs the service remote defs
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> serviceRemoteDefs) {
		getPersistence().cacheResult(serviceRemoteDefs);
	}

	/**
	* Creates a new service remote def with the primary key. Does not add the service remote def to the database.
	*
	* @param remoteId the primary key for the new service remote def
	* @return the new service remote def
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef create(
		long remoteId) {
		return getPersistence().create(remoteId);
	}

	/**
	* Removes the service remote def with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param remoteId the primary key of the service remote def
	* @return the service remote def that was removed
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a service remote def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef remove(
		long remoteId)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(remoteId);
	}

	public static com.liferay.portal.ext.model.ServiceRemoteDef updateImpl(
		com.liferay.portal.ext.model.ServiceRemoteDef serviceRemoteDef)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(serviceRemoteDef);
	}

	/**
	* Returns the service remote def with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceRemoteDefException} if it could not be found.
	*
	* @param remoteId the primary key of the service remote def
	* @return the service remote def
	* @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a service remote def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef findByPrimaryKey(
		long remoteId)
		throws com.liferay.portal.ext.NoSuchServiceRemoteDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(remoteId);
	}

	/**
	* Returns the service remote def with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param remoteId the primary key of the service remote def
	* @return the service remote def, or <code>null</code> if a service remote def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceRemoteDef fetchByPrimaryKey(
		long remoteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(remoteId);
	}

	/**
	* Returns all the service remote defs.
	*
	* @return the service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ServiceRemoteDef> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the service remote defs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of service remote defs.
	*
	* @return the number of service remote defs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ServiceRemoteDefPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ServiceRemoteDefPersistence)PortalBeanLocatorUtil.locate(ServiceRemoteDefPersistence.class.getName());

			ReferenceRegistry.registerReference(ServiceRemoteDefUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ServiceRemoteDefPersistence persistence) {
	}

	private static ServiceRemoteDefPersistence _persistence;
}