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
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the service publish def service. This utility wraps {@link ServicePublishDefPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServicePublishDefPersistence
 * @see ServicePublishDefPersistenceImpl
 * @generated
 */
@ProviderType
public class ServicePublishDefUtil {
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
	public static void clearCache(ServicePublishDef servicePublishDef) {
		getPersistence().clearCache(servicePublishDef);
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
	public static List<ServicePublishDef> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ServicePublishDef> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ServicePublishDef> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ServicePublishDef update(ServicePublishDef servicePublishDef)
		throws SystemException {
		return getPersistence().update(servicePublishDef);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ServicePublishDef update(
		ServicePublishDef servicePublishDef, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(servicePublishDef, serviceContext);
	}

	/**
	* Returns the service publish def where path = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServicePublishDefException} if it could not be found.
	*
	* @param path the path
	* @return the matching service publish def
	* @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef findByPath(
		java.lang.String path)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPath(path);
	}

	/**
	* Returns the service publish def where path = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param path the path
	* @return the matching service publish def, or <code>null</code> if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef fetchByPath(
		java.lang.String path)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPath(path);
	}

	/**
	* Returns the service publish def where path = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param path the path
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service publish def, or <code>null</code> if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef fetchByPath(
		java.lang.String path, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPath(path, retrieveFromCache);
	}

	/**
	* Removes the service publish def where path = &#63; from the database.
	*
	* @param path the path
	* @return the service publish def that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef removeByPath(
		java.lang.String path)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByPath(path);
	}

	/**
	* Returns the number of service publish defs where path = &#63;.
	*
	* @param path the path
	* @return the number of matching service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPath(java.lang.String path)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPath(path);
	}

	/**
	* Returns all the service publish defs where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the matching service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findByTagId(
		long tagId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagId(tagId);
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findByTagId(
		long tagId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagId(tagId, start, end);
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findByTagId(
		long tagId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagId(tagId, start, end, orderByComparator);
	}

	/**
	* Returns the first service publish def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service publish def
	* @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef findByTagId_First(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagId_First(tagId, orderByComparator);
	}

	/**
	* Returns the first service publish def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service publish def, or <code>null</code> if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef fetchByTagId_First(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTagId_First(tagId, orderByComparator);
	}

	/**
	* Returns the last service publish def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service publish def
	* @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef findByTagId_Last(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagId_Last(tagId, orderByComparator);
	}

	/**
	* Returns the last service publish def in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service publish def, or <code>null</code> if a matching service publish def could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef fetchByTagId_Last(
		long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTagId_Last(tagId, orderByComparator);
	}

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
	public static com.liferay.portal.ext.model.ServicePublishDef[] findByTagId_PrevAndNext(
		long publishId, long tagId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByTagId_PrevAndNext(publishId, tagId, orderByComparator);
	}

	/**
	* Removes all the service publish defs where tagId = &#63; from the database.
	*
	* @param tagId the tag ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByTagId(long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByTagId(tagId);
	}

	/**
	* Returns the number of service publish defs where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the number of matching service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTagId(long tagId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTagId(tagId);
	}

	/**
	* Caches the service publish def in the entity cache if it is enabled.
	*
	* @param servicePublishDef the service publish def
	*/
	public static void cacheResult(
		com.liferay.portal.ext.model.ServicePublishDef servicePublishDef) {
		getPersistence().cacheResult(servicePublishDef);
	}

	/**
	* Caches the service publish defs in the entity cache if it is enabled.
	*
	* @param servicePublishDefs the service publish defs
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ServicePublishDef> servicePublishDefs) {
		getPersistence().cacheResult(servicePublishDefs);
	}

	/**
	* Creates a new service publish def with the primary key. Does not add the service publish def to the database.
	*
	* @param publishId the primary key for the new service publish def
	* @return the new service publish def
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef create(
		long publishId) {
		return getPersistence().create(publishId);
	}

	/**
	* Removes the service publish def with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param publishId the primary key of the service publish def
	* @return the service publish def that was removed
	* @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a service publish def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef remove(
		long publishId)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(publishId);
	}

	public static com.liferay.portal.ext.model.ServicePublishDef updateImpl(
		com.liferay.portal.ext.model.ServicePublishDef servicePublishDef)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(servicePublishDef);
	}

	/**
	* Returns the service publish def with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServicePublishDefException} if it could not be found.
	*
	* @param publishId the primary key of the service publish def
	* @return the service publish def
	* @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a service publish def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef findByPrimaryKey(
		long publishId)
		throws com.liferay.portal.ext.NoSuchServicePublishDefException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(publishId);
	}

	/**
	* Returns the service publish def with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param publishId the primary key of the service publish def
	* @return the service publish def, or <code>null</code> if a service publish def with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServicePublishDef fetchByPrimaryKey(
		long publishId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(publishId);
	}

	/**
	* Returns all the service publish defs.
	*
	* @return the service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ServicePublishDef> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the service publish defs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of service publish defs.
	*
	* @return the number of service publish defs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ServicePublishDefPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ServicePublishDefPersistence)PortalBeanLocatorUtil.locate(ServicePublishDefPersistence.class.getName());

			ReferenceRegistry.registerReference(ServicePublishDefUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ServicePublishDefPersistence persistence) {
	}

	private static ServicePublishDefPersistence _persistence;
}