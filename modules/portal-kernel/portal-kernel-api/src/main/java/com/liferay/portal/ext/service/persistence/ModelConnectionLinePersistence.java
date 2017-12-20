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

import com.liferay.portal.ext.model.ModelConnectionLine;
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the model connection line service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ModelConnectionLinePersistenceImpl
 * @see ModelConnectionLineUtil
 * @generated
 */
@ProviderType
public interface ModelConnectionLinePersistence extends BasePersistence<ModelConnectionLine> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ModelConnectionLineUtil} to access the model connection line persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the model connection lines where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the matching model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findByC_C(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the model connection lines where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param start the lower bound of the range of model connection lines
	* @param end the upper bound of the range of model connection lines (not inclusive)
	* @return the range of matching model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findByC_C(
		long classNameId, long classPK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the model connection lines where classNameId = &#63; and classPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param start the lower bound of the range of model connection lines
	* @param end the upper bound of the range of model connection lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findByC_C(
		long classNameId, long classPK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching model connection line
	* @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a matching model connection line could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine findByC_C_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching model connection line, or <code>null</code> if a matching model connection line could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine fetchByC_C_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching model connection line
	* @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a matching model connection line could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine findByC_C_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching model connection line, or <code>null</code> if a matching model connection line could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine fetchByC_C_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection lines before and after the current model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param lineId the primary key of the current model connection line
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next model connection line
	* @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a model connection line with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine[] findByC_C_PrevAndNext(
		long lineId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the model connection lines where classNameId = &#63; and classPK = &#63; from the database.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @throws SystemException if a system exception occurred
	*/
	public void removeByC_C(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of model connection lines where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the number of matching model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_C(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection line where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63; or throws a {@link com.liferay.portal.ext.NoSuchModelConnectionLineException} if it could not be found.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param lineGroupId the line group ID
	* @return the matching model connection line
	* @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a matching model connection line could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine findByC_C_LG(
		long classNameId, long classPK, long lineGroupId)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection line where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param lineGroupId the line group ID
	* @return the matching model connection line, or <code>null</code> if a matching model connection line could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine fetchByC_C_LG(
		long classNameId, long classPK, long lineGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection line where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param lineGroupId the line group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching model connection line, or <code>null</code> if a matching model connection line could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine fetchByC_C_LG(
		long classNameId, long classPK, long lineGroupId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the model connection line where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63; from the database.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param lineGroupId the line group ID
	* @return the model connection line that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine removeByC_C_LG(
		long classNameId, long classPK, long lineGroupId)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of model connection lines where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param lineGroupId the line group ID
	* @return the number of matching model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public int countByC_C_LG(long classNameId, long classPK, long lineGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the model connection line in the entity cache if it is enabled.
	*
	* @param modelConnectionLine the model connection line
	*/
	public void cacheResult(
		com.liferay.portal.ext.model.ModelConnectionLine modelConnectionLine);

	/**
	* Caches the model connection lines in the entity cache if it is enabled.
	*
	* @param modelConnectionLines the model connection lines
	*/
	public void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> modelConnectionLines);

	/**
	* Creates a new model connection line with the primary key. Does not add the model connection line to the database.
	*
	* @param lineId the primary key for the new model connection line
	* @return the new model connection line
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine create(long lineId);

	/**
	* Removes the model connection line with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lineId the primary key of the model connection line
	* @return the model connection line that was removed
	* @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a model connection line with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine remove(long lineId)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.ext.model.ModelConnectionLine updateImpl(
		com.liferay.portal.ext.model.ModelConnectionLine modelConnectionLine)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection line with the primary key or throws a {@link com.liferay.portal.ext.NoSuchModelConnectionLineException} if it could not be found.
	*
	* @param lineId the primary key of the model connection line
	* @return the model connection line
	* @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a model connection line with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine findByPrimaryKey(
		long lineId)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the model connection line with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lineId the primary key of the model connection line
	* @return the model connection line, or <code>null</code> if a model connection line with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.ext.model.ModelConnectionLine fetchByPrimaryKey(
		long lineId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the model connection lines.
	*
	* @return the model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the model connection lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of model connection lines
	* @param end the upper bound of the range of model connection lines (not inclusive)
	* @return the range of model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the model connection lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of model connection lines
	* @param end the upper bound of the range of model connection lines (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the model connection lines from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of model connection lines.
	*
	* @return the number of model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}