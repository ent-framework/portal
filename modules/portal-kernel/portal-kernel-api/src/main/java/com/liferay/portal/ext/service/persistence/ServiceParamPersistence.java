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

import com.liferay.portal.ext.model.ServiceParam;
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the service param service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceParamPersistenceImpl
 * @see ServiceParamUtil
 * @generated
 */
@ProviderType
public interface ServiceParamPersistence extends BasePersistence<ServiceParam> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServiceParamUtil} to access the service param persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the service params where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @return the matching service params
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C_P(
		long classNameId, long classPK, java.lang.String paramType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service params where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @return the range of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C_P(
		long classNameId, long classPK, java.lang.String paramType, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service params where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C_P(
		long classNameId, long classPK, java.lang.String paramType, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service param in the ordered set where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam findByC_C_P_First(
		long classNameId, long classPK, java.lang.String paramType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service param in the ordered set where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service param, or <code>null</code> if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam fetchByC_C_P_First(
		long classNameId, long classPK, java.lang.String paramType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service param in the ordered set where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam findByC_C_P_Last(
		long classNameId, long classPK, java.lang.String paramType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service param in the ordered set where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service param, or <code>null</code> if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam fetchByC_C_P_Last(
		long classNameId, long classPK, java.lang.String paramType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service params before and after the current service param in the ordered set where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param paramId the primary key of the current service param
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam[] findByC_C_P_PrevAndNext(
		long paramId, long classNameId, long classPK,
		java.lang.String paramType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service params where classNameId = &#63; and classPK = &#63; and paramType = &#63; from the database.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_C_P(long classNameId, long classPK,
		java.lang.String paramType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service params where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param paramType the param type
	* @return the number of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_C_P(long classNameId, long classPK,
		java.lang.String paramType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service params where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the matching service params
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service params where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @return the range of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C(
		long classNameId, long classPK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service params where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceParam> findByC_C(
		long classNameId, long classPK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam findByC_C_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching service param, or <code>null</code> if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam fetchByC_C_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam findByC_C_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching service param, or <code>null</code> if a matching service param could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam fetchByC_C_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service params before and after the current service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param paramId the primary key of the current service param
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam[] findByC_C_PrevAndNext(
		long paramId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service params where classNameId = &#63; and classPK = &#63; from the database.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_C(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service params where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the number of matching service params
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_C(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the service param in the entity cache if it is enabled.
	*
	* @param serviceParam the service param
	*/
	public void cacheResult(
		com.liferay.portal.ext.model.ServiceParam serviceParam);

	/**
	* Caches the service params in the entity cache if it is enabled.
	*
	* @param serviceParams the service params
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ServiceParam> serviceParams);

	/**
	* Creates a new service param with the primary key. Does not add the service param to the database.
	*
	* @param paramId the primary key for the new service param
	* @return the new service param
	*/
	public com.liferay.portal.ext.model.ServiceParam create(long paramId);

	/**
	* Removes the service param with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paramId the primary key of the service param
	* @return the service param that was removed
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam remove(long paramId)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.ext.model.ServiceParam updateImpl(
		com.liferay.portal.ext.model.ServiceParam serviceParam)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service param with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceParamException} if it could not be found.
	*
	* @param paramId the primary key of the service param
	* @return the service param
	* @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam findByPrimaryKey(
		long paramId)
		throws com.liferay.portal.ext.NoSuchServiceParamException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the service param with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param paramId the primary key of the service param
	* @return the service param, or <code>null</code> if a service param with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ServiceParam fetchByPrimaryKey(
		long paramId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the service params.
	*
	* @return the service params
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceParam> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the service params.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @return the range of service params
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceParam> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the service params.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceParamModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of service params
	* @param end the upper bound of the range of service params (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service params
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ServiceParam> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the service params from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of service params.
	*
	* @return the number of service params
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}