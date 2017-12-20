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
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the model connection line service. This utility wraps {@link ModelConnectionLinePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ModelConnectionLinePersistence
 * @see ModelConnectionLinePersistenceImpl
 * @generated
 */
@ProviderType
public class ModelConnectionLineUtil {
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
	public static void clearCache(ModelConnectionLine modelConnectionLine) {
		getPersistence().clearCache(modelConnectionLine);
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
	public static List<ModelConnectionLine> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ModelConnectionLine> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ModelConnectionLine> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static ModelConnectionLine update(
		ModelConnectionLine modelConnectionLine) throws SystemException {
		return getPersistence().update(modelConnectionLine);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static ModelConnectionLine update(
		ModelConnectionLine modelConnectionLine, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(modelConnectionLine, serviceContext);
	}

	/**
	* Returns all the model connection lines where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the matching model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findByC_C(
		long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_C(classNameId, classPK);
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findByC_C(
		long classNameId, long classPK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_C(classNameId, classPK, start, end);
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findByC_C(
		long classNameId, long classPK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C(classNameId, classPK, start, end,
			orderByComparator);
	}

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
	public static com.liferay.portal.ext.model.ModelConnectionLine findByC_C_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C_First(classNameId, classPK, orderByComparator);
	}

	/**
	* Returns the first model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching model connection line, or <code>null</code> if a matching model connection line could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ModelConnectionLine fetchByC_C_First(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_C_First(classNameId, classPK, orderByComparator);
	}

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
	public static com.liferay.portal.ext.model.ModelConnectionLine findByC_C_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C_Last(classNameId, classPK, orderByComparator);
	}

	/**
	* Returns the last model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching model connection line, or <code>null</code> if a matching model connection line could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ModelConnectionLine fetchByC_C_Last(
		long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_C_Last(classNameId, classPK, orderByComparator);
	}

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
	public static com.liferay.portal.ext.model.ModelConnectionLine[] findByC_C_PrevAndNext(
		long lineId, long classNameId, long classPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByC_C_PrevAndNext(lineId, classNameId, classPK,
			orderByComparator);
	}

	/**
	* Removes all the model connection lines where classNameId = &#63; and classPK = &#63; from the database.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByC_C(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByC_C(classNameId, classPK);
	}

	/**
	* Returns the number of model connection lines where classNameId = &#63; and classPK = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @return the number of matching model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_C(long classNameId, long classPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_C(classNameId, classPK);
	}

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
	public static com.liferay.portal.ext.model.ModelConnectionLine findByC_C_LG(
		long classNameId, long classPK, long lineGroupId)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByC_C_LG(classNameId, classPK, lineGroupId);
	}

	/**
	* Returns the model connection line where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param lineGroupId the line group ID
	* @return the matching model connection line, or <code>null</code> if a matching model connection line could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ModelConnectionLine fetchByC_C_LG(
		long classNameId, long classPK, long lineGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByC_C_LG(classNameId, classPK, lineGroupId);
	}

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
	public static com.liferay.portal.ext.model.ModelConnectionLine fetchByC_C_LG(
		long classNameId, long classPK, long lineGroupId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByC_C_LG(classNameId, classPK, lineGroupId,
			retrieveFromCache);
	}

	/**
	* Removes the model connection line where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63; from the database.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param lineGroupId the line group ID
	* @return the model connection line that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ModelConnectionLine removeByC_C_LG(
		long classNameId, long classPK, long lineGroupId)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeByC_C_LG(classNameId, classPK, lineGroupId);
	}

	/**
	* Returns the number of model connection lines where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63;.
	*
	* @param classNameId the class name ID
	* @param classPK the class p k
	* @param lineGroupId the line group ID
	* @return the number of matching model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public static int countByC_C_LG(long classNameId, long classPK,
		long lineGroupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByC_C_LG(classNameId, classPK, lineGroupId);
	}

	/**
	* Caches the model connection line in the entity cache if it is enabled.
	*
	* @param modelConnectionLine the model connection line
	*/
	public static void cacheResult(
		com.liferay.portal.ext.model.ModelConnectionLine modelConnectionLine) {
		getPersistence().cacheResult(modelConnectionLine);
	}

	/**
	* Caches the model connection lines in the entity cache if it is enabled.
	*
	* @param modelConnectionLines the model connection lines
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> modelConnectionLines) {
		getPersistence().cacheResult(modelConnectionLines);
	}

	/**
	* Creates a new model connection line with the primary key. Does not add the model connection line to the database.
	*
	* @param lineId the primary key for the new model connection line
	* @return the new model connection line
	*/
	public static com.liferay.portal.ext.model.ModelConnectionLine create(
		long lineId) {
		return getPersistence().create(lineId);
	}

	/**
	* Removes the model connection line with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param lineId the primary key of the model connection line
	* @return the model connection line that was removed
	* @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a model connection line with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ModelConnectionLine remove(
		long lineId)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(lineId);
	}

	public static com.liferay.portal.ext.model.ModelConnectionLine updateImpl(
		com.liferay.portal.ext.model.ModelConnectionLine modelConnectionLine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(modelConnectionLine);
	}

	/**
	* Returns the model connection line with the primary key or throws a {@link com.liferay.portal.ext.NoSuchModelConnectionLineException} if it could not be found.
	*
	* @param lineId the primary key of the model connection line
	* @return the model connection line
	* @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a model connection line with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ModelConnectionLine findByPrimaryKey(
		long lineId)
		throws com.liferay.portal.ext.NoSuchModelConnectionLineException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(lineId);
	}

	/**
	* Returns the model connection line with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param lineId the primary key of the model connection line
	* @return the model connection line, or <code>null</code> if a model connection line with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.ext.model.ModelConnectionLine fetchByPrimaryKey(
		long lineId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(lineId);
	}

	/**
	* Returns all the model connection lines.
	*
	* @return the model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.liferay.portal.ext.model.ModelConnectionLine> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the model connection lines from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of model connection lines.
	*
	* @return the number of model connection lines
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ModelConnectionLinePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ModelConnectionLinePersistence)PortalBeanLocatorUtil.locate(ModelConnectionLinePersistence.class.getName());

			ReferenceRegistry.registerReference(ModelConnectionLineUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ModelConnectionLinePersistence persistence) {
	}

	private static ModelConnectionLinePersistence _persistence;
}