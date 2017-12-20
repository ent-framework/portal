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

import com.liferay.portal.ext.model.ServiceTag;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the service tag service. This utility wraps {@link ServiceTagPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceTagPersistence
 * @see ServiceTagPersistenceImpl
 * @generated
 */
@ProviderType
public class ServiceTagUtil {
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
	public static void clearCache(ServiceTag serviceTag) {
		getPersistence().clearCache(serviceTag);
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
	public static List<ServiceTag> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ServiceTag> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ServiceTag> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ServiceTag update(ServiceTag serviceTag)
		throws SystemException {
		return getPersistence().update(serviceTag);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ServiceTag update(ServiceTag serviceTag,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(serviceTag, serviceContext);
	}

	/**
	* Returns the service tag where tagName = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceTagException} if it could not be found.
	*
	* @param tagName the tag name
	* @return the matching service tag
	* @throws com.liferay.portal.ext.NoSuchServiceTagException if a matching service tag could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceTag findByTagName(
		java.lang.String tagName)
		throws com.liferay.portal.ext.NoSuchServiceTagException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByTagName(tagName);
	}

	/**
	* Returns the service tag where tagName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param tagName the tag name
	* @return the matching service tag, or <code>null</code> if a matching service tag could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceTag fetchByTagName(
		java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTagName(tagName);
	}

	/**
	* Returns the service tag where tagName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param tagName the tag name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service tag, or <code>null</code> if a matching service tag could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceTag fetchByTagName(
		java.lang.String tagName, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByTagName(tagName, retrieveFromCache);
	}

	/**
	* Removes the service tag where tagName = &#63; from the database.
	*
	* @param tagName the tag name
	* @return the service tag that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceTag removeByTagName(
		java.lang.String tagName)
		throws com.liferay.portal.ext.NoSuchServiceTagException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByTagName(tagName);
	}

	/**
	* Returns the number of service tags where tagName = &#63;.
	*
	* @param tagName the tag name
	* @return the number of matching service tags
	* @throws SystemException if a system exception occurred
	*/
	public static int countByTagName(java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByTagName(tagName);
	}

	/**
	* Caches the service tag in the entity cache if it is enabled.
	*
	* @param serviceTag the service tag
	*/
	public static void cacheResult(
		com.liferay.portal.ext.model.ServiceTag serviceTag) {
		getPersistence().cacheResult(serviceTag);
	}

	/**
	* Caches the service tags in the entity cache if it is enabled.
	*
	* @param serviceTags the service tags
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ServiceTag> serviceTags) {
		getPersistence().cacheResult(serviceTags);
	}

	/**
	* Creates a new service tag with the primary key. Does not add the service tag to the database.
	*
	* @param tagId the primary key for the new service tag
	* @return the new service tag
	*/
	public static com.liferay.portal.ext.model.ServiceTag create(long tagId) {
		return getPersistence().create(tagId);
	}

	/**
	* Removes the service tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tagId the primary key of the service tag
	* @return the service tag that was removed
	* @throws com.liferay.portal.ext.NoSuchServiceTagException if a service tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceTag remove(long tagId)
		throws com.liferay.portal.ext.NoSuchServiceTagException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(tagId);
	}

	public static com.liferay.portal.ext.model.ServiceTag updateImpl(
		com.liferay.portal.ext.model.ServiceTag serviceTag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(serviceTag);
	}

	/**
	* Returns the service tag with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceTagException} if it could not be found.
	*
	* @param tagId the primary key of the service tag
	* @return the service tag
	* @throws com.liferay.portal.ext.NoSuchServiceTagException if a service tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceTag findByPrimaryKey(
		long tagId)
		throws com.liferay.portal.ext.NoSuchServiceTagException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(tagId);
	}

	/**
	* Returns the service tag with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tagId the primary key of the service tag
	* @return the service tag, or <code>null</code> if a service tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ServiceTag fetchByPrimaryKey(
		long tagId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(tagId);
	}

	/**
	* Returns all the service tags.
	*
	* @return the service tags
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceTag> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the service tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service tags
	* @param end the upper bound of the range of service tags (not inclusive)
	* @return the range of service tags
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceTag> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the service tags.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceTagModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service tags
	* @param end the upper bound of the range of service tags (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service tags
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ServiceTag> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the service tags from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of service tags.
	*
	* @return the number of service tags
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ServiceTagPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ServiceTagPersistence)PortalBeanLocatorUtil.locate(ServiceTagPersistence.class.getName());

			ReferenceRegistry.registerReference(ServiceTagUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ServiceTagPersistence persistence) {
	}

	private static ServiceTagPersistence _persistence;
}