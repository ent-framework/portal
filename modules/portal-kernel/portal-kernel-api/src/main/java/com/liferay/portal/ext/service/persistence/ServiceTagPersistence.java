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
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the service tag service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceTagPersistenceImpl
 * @see ServiceTagUtil
 * @generated
 */
@ProviderType
public interface ServiceTagPersistence extends BasePersistence<ServiceTag> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServiceTagUtil} to access the service tag persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the service tag where tagName = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceTagException} if it could not be found.
	*
	* @param tagName the tag name
	* @return the matching service tag
	* @throws com.liferay.portal.ext.NoSuchServiceTagException if a matching service tag could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceTag findByTagName(
		java.lang.String tagName)
		throws com.liferay.portal.ext.NoSuchServiceTagException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service tag where tagName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param tagName the tag name
	* @return the matching service tag, or <code>null</code> if a matching service tag could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceTag fetchByTagName(
		java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service tag where tagName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param tagName the tag name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service tag, or <code>null</code> if a matching service tag could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceTag fetchByTagName(
		java.lang.String tagName, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the service tag where tagName = &#63; from the database.
	*
	* @param tagName the tag name
	* @return the service tag that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceTag removeByTagName(
		java.lang.String tagName)
		throws com.liferay.portal.ext.NoSuchServiceTagException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service tags where tagName = &#63;.
	*
	* @param tagName the tag name
	* @return the number of matching service tags
	* @throws SystemException if a system exception occurred
	*/
	public int countByTagName(java.lang.String tagName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the service tag in the entity cache if it is enabled.
	*
	* @param serviceTag the service tag
	*/
	public void cacheResult(com.liferay.portal.ext.model.ServiceTag serviceTag);

	/**
	* Caches the service tags in the entity cache if it is enabled.
	*
	* @param serviceTags the service tags
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ServiceTag> serviceTags);

	/**
	* Creates a new service tag with the primary key. Does not add the service tag to the database.
	*
	* @param tagId the primary key for the new service tag
	* @return the new service tag
	*/
	public com.liferay.portal.ext.model.ServiceTag create(long tagId);

	/**
	* Removes the service tag with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tagId the primary key of the service tag
	* @return the service tag that was removed
	* @throws com.liferay.portal.ext.NoSuchServiceTagException if a service tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceTag remove(long tagId)
		throws com.liferay.portal.ext.NoSuchServiceTagException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.ext.model.ServiceTag updateImpl(
		com.liferay.portal.ext.model.ServiceTag serviceTag)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service tag with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceTagException} if it could not be found.
	*
	* @param tagId the primary key of the service tag
	* @return the service tag
	* @throws com.liferay.portal.ext.NoSuchServiceTagException if a service tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceTag findByPrimaryKey(long tagId)
		throws com.liferay.portal.ext.NoSuchServiceTagException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service tag with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tagId the primary key of the service tag
	* @return the service tag, or <code>null</code> if a service tag with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceTag fetchByPrimaryKey(long tagId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service tags.
	*
	* @return the service tags
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceTag> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portal.ext.model.ServiceTag> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.portal.ext.model.ServiceTag> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service tags from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service tags.
	*
	* @return the number of service tags
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}