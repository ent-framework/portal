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

import com.liferay.portal.ext.NoSuchServiceParamException;
import com.liferay.portal.ext.model.ServiceParam;
import com.liferay.portal.ext.model.impl.ServiceParamImpl;
import com.liferay.portal.ext.model.impl.ServiceParamModelImpl;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the service param service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceParamPersistence
 * @see ServiceParamUtil
 * @generated
 */
public class ServiceParamPersistenceImpl extends BasePersistenceImpl<ServiceParam>
	implements ServiceParamPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceParamUtil} to access the service param persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceParamImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamModelImpl.FINDER_CACHE_ENABLED, ServiceParamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamModelImpl.FINDER_CACHE_ENABLED, ServiceParamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_C_P = new FinderPath(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamModelImpl.FINDER_CACHE_ENABLED, ServiceParamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_C_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C_P = new FinderPath(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamModelImpl.FINDER_CACHE_ENABLED, ServiceParamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_C_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			ServiceParamModelImpl.CLASSNAMEID_COLUMN_BITMASK |
			ServiceParamModelImpl.CLASSPK_COLUMN_BITMASK |
			ServiceParamModelImpl.PARAMTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C_P = new FinderPath(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_C_P",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the service params where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param paramType the param type
	 * @return the matching service params
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceParam> findByC_C_P(long classNameId, long classPK,
		String paramType) throws SystemException {
		return findByC_C_P(classNameId, classPK, paramType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ServiceParam> findByC_C_P(long classNameId, long classPK,
		String paramType, int start, int end) throws SystemException {
		return findByC_C_P(classNameId, classPK, paramType, start, end, null);
	}

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
	@Override
	public List<ServiceParam> findByC_C_P(long classNameId, long classPK,
		String paramType, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C_P;
			finderArgs = new Object[] { classNameId, classPK, paramType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_C_P;
			finderArgs = new Object[] {
					classNameId, classPK, paramType,
					
					start, end, orderByComparator
				};
		}

		List<ServiceParam> list = (List<ServiceParam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ServiceParam serviceParam : list) {
				if ((classNameId != serviceParam.getClassNameId()) ||
						(classPK != serviceParam.getClassPK()) ||
						!Validator.equals(paramType, serviceParam.getParamType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_SERVICEPARAM_WHERE);

			query.append(_FINDER_COLUMN_C_C_P_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_P_CLASSPK_2);

			boolean bindParamType = false;

			if (paramType == null) {
				query.append(_FINDER_COLUMN_C_C_P_PARAMTYPE_1);
			}
			else if (paramType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_C_P_PARAMTYPE_3);
			}
			else {
				bindParamType = true;

				query.append(_FINDER_COLUMN_C_C_P_PARAMTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ServiceParamModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				if (bindParamType) {
					qPos.add(paramType);
				}

				if (!pagination) {
					list = (List<ServiceParam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceParam>(list);
				}
				else {
					list = (List<ServiceParam>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

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
	@Override
	public ServiceParam findByC_C_P_First(long classNameId, long classPK,
		String paramType, OrderByComparator orderByComparator)
		throws NoSuchServiceParamException, SystemException {
		ServiceParam serviceParam = fetchByC_C_P_First(classNameId, classPK,
				paramType, orderByComparator);

		if (serviceParam != null) {
			return serviceParam;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("classNameId=");
		msg.append(classNameId);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(", paramType=");
		msg.append(paramType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceParamException(msg.toString());
	}

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
	@Override
	public ServiceParam fetchByC_C_P_First(long classNameId, long classPK,
		String paramType, OrderByComparator orderByComparator)
		throws SystemException {
		List<ServiceParam> list = findByC_C_P(classNameId, classPK, paramType,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public ServiceParam findByC_C_P_Last(long classNameId, long classPK,
		String paramType, OrderByComparator orderByComparator)
		throws NoSuchServiceParamException, SystemException {
		ServiceParam serviceParam = fetchByC_C_P_Last(classNameId, classPK,
				paramType, orderByComparator);

		if (serviceParam != null) {
			return serviceParam;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("classNameId=");
		msg.append(classNameId);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(", paramType=");
		msg.append(paramType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceParamException(msg.toString());
	}

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
	@Override
	public ServiceParam fetchByC_C_P_Last(long classNameId, long classPK,
		String paramType, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByC_C_P(classNameId, classPK, paramType);

		if (count == 0) {
			return null;
		}

		List<ServiceParam> list = findByC_C_P(classNameId, classPK, paramType,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public ServiceParam[] findByC_C_P_PrevAndNext(long paramId,
		long classNameId, long classPK, String paramType,
		OrderByComparator orderByComparator)
		throws NoSuchServiceParamException, SystemException {
		ServiceParam serviceParam = findByPrimaryKey(paramId);

		Session session = null;

		try {
			session = openSession();

			ServiceParam[] array = new ServiceParamImpl[3];

			array[0] = getByC_C_P_PrevAndNext(session, serviceParam,
					classNameId, classPK, paramType, orderByComparator, true);

			array[1] = serviceParam;

			array[2] = getByC_C_P_PrevAndNext(session, serviceParam,
					classNameId, classPK, paramType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ServiceParam getByC_C_P_PrevAndNext(Session session,
		ServiceParam serviceParam, long classNameId, long classPK,
		String paramType, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SERVICEPARAM_WHERE);

		query.append(_FINDER_COLUMN_C_C_P_CLASSNAMEID_2);

		query.append(_FINDER_COLUMN_C_C_P_CLASSPK_2);

		boolean bindParamType = false;

		if (paramType == null) {
			query.append(_FINDER_COLUMN_C_C_P_PARAMTYPE_1);
		}
		else if (paramType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_C_C_P_PARAMTYPE_3);
		}
		else {
			bindParamType = true;

			query.append(_FINDER_COLUMN_C_C_P_PARAMTYPE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ServiceParamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(classNameId);

		qPos.add(classPK);

		if (bindParamType) {
			qPos.add(paramType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(serviceParam);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ServiceParam> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the service params where classNameId = &#63; and classPK = &#63; and paramType = &#63; from the database.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param paramType the param type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_C_P(long classNameId, long classPK, String paramType)
		throws SystemException {
		for (ServiceParam serviceParam : findByC_C_P(classNameId, classPK,
				paramType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(serviceParam);
		}
	}

	/**
	 * Returns the number of service params where classNameId = &#63; and classPK = &#63; and paramType = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param paramType the param type
	 * @return the number of matching service params
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_C_P(long classNameId, long classPK, String paramType)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_C_P;

		Object[] finderArgs = new Object[] { classNameId, classPK, paramType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_SERVICEPARAM_WHERE);

			query.append(_FINDER_COLUMN_C_C_P_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_P_CLASSPK_2);

			boolean bindParamType = false;

			if (paramType == null) {
				query.append(_FINDER_COLUMN_C_C_P_PARAMTYPE_1);
			}
			else if (paramType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_C_C_P_PARAMTYPE_3);
			}
			else {
				bindParamType = true;

				query.append(_FINDER_COLUMN_C_C_P_PARAMTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				if (bindParamType) {
					qPos.add(paramType);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_C_C_P_CLASSNAMEID_2 = "serviceParam.classNameId = ? AND ";
	private static final String _FINDER_COLUMN_C_C_P_CLASSPK_2 = "serviceParam.classPK = ? AND ";
	private static final String _FINDER_COLUMN_C_C_P_PARAMTYPE_1 = "serviceParam.paramType IS NULL";
	private static final String _FINDER_COLUMN_C_C_P_PARAMTYPE_2 = "serviceParam.paramType = ?";
	private static final String _FINDER_COLUMN_C_C_P_PARAMTYPE_3 = "(serviceParam.paramType IS NULL OR serviceParam.paramType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_C = new FinderPath(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamModelImpl.FINDER_CACHE_ENABLED, ServiceParamImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C = new FinderPath(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamModelImpl.FINDER_CACHE_ENABLED, ServiceParamImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_C",
			new String[] { Long.class.getName(), Long.class.getName() },
			ServiceParamModelImpl.CLASSNAMEID_COLUMN_BITMASK |
			ServiceParamModelImpl.CLASSPK_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C = new FinderPath(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_C",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the service params where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @return the matching service params
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceParam> findByC_C(long classNameId, long classPK)
		throws SystemException {
		return findByC_C(classNameId, classPK, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ServiceParam> findByC_C(long classNameId, long classPK,
		int start, int end) throws SystemException {
		return findByC_C(classNameId, classPK, start, end, null);
	}

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
	@Override
	public List<ServiceParam> findByC_C(long classNameId, long classPK,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C;
			finderArgs = new Object[] { classNameId, classPK };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_C_C;
			finderArgs = new Object[] {
					classNameId, classPK,
					
					start, end, orderByComparator
				};
		}

		List<ServiceParam> list = (List<ServiceParam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ServiceParam serviceParam : list) {
				if ((classNameId != serviceParam.getClassNameId()) ||
						(classPK != serviceParam.getClassPK())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_SERVICEPARAM_WHERE);

			query.append(_FINDER_COLUMN_C_C_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_CLASSPK_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ServiceParamModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				if (!pagination) {
					list = (List<ServiceParam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceParam>(list);
				}
				else {
					list = (List<ServiceParam>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

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
	@Override
	public ServiceParam findByC_C_First(long classNameId, long classPK,
		OrderByComparator orderByComparator)
		throws NoSuchServiceParamException, SystemException {
		ServiceParam serviceParam = fetchByC_C_First(classNameId, classPK,
				orderByComparator);

		if (serviceParam != null) {
			return serviceParam;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("classNameId=");
		msg.append(classNameId);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceParamException(msg.toString());
	}

	/**
	 * Returns the first service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service param, or <code>null</code> if a matching service param could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceParam fetchByC_C_First(long classNameId, long classPK,
		OrderByComparator orderByComparator) throws SystemException {
		List<ServiceParam> list = findByC_C(classNameId, classPK, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public ServiceParam findByC_C_Last(long classNameId, long classPK,
		OrderByComparator orderByComparator)
		throws NoSuchServiceParamException, SystemException {
		ServiceParam serviceParam = fetchByC_C_Last(classNameId, classPK,
				orderByComparator);

		if (serviceParam != null) {
			return serviceParam;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("classNameId=");
		msg.append(classNameId);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceParamException(msg.toString());
	}

	/**
	 * Returns the last service param in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching service param, or <code>null</code> if a matching service param could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceParam fetchByC_C_Last(long classNameId, long classPK,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_C(classNameId, classPK);

		if (count == 0) {
			return null;
		}

		List<ServiceParam> list = findByC_C(classNameId, classPK, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public ServiceParam[] findByC_C_PrevAndNext(long paramId, long classNameId,
		long classPK, OrderByComparator orderByComparator)
		throws NoSuchServiceParamException, SystemException {
		ServiceParam serviceParam = findByPrimaryKey(paramId);

		Session session = null;

		try {
			session = openSession();

			ServiceParam[] array = new ServiceParamImpl[3];

			array[0] = getByC_C_PrevAndNext(session, serviceParam, classNameId,
					classPK, orderByComparator, true);

			array[1] = serviceParam;

			array[2] = getByC_C_PrevAndNext(session, serviceParam, classNameId,
					classPK, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ServiceParam getByC_C_PrevAndNext(Session session,
		ServiceParam serviceParam, long classNameId, long classPK,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SERVICEPARAM_WHERE);

		query.append(_FINDER_COLUMN_C_C_CLASSNAMEID_2);

		query.append(_FINDER_COLUMN_C_C_CLASSPK_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ServiceParamModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(classNameId);

		qPos.add(classPK);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(serviceParam);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ServiceParam> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the service params where classNameId = &#63; and classPK = &#63; from the database.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_C(long classNameId, long classPK)
		throws SystemException {
		for (ServiceParam serviceParam : findByC_C(classNameId, classPK,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(serviceParam);
		}
	}

	/**
	 * Returns the number of service params where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @return the number of matching service params
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_C(long classNameId, long classPK)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_C;

		Object[] finderArgs = new Object[] { classNameId, classPK };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_SERVICEPARAM_WHERE);

			query.append(_FINDER_COLUMN_C_C_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_CLASSPK_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_C_C_CLASSNAMEID_2 = "serviceParam.classNameId = ? AND ";
	private static final String _FINDER_COLUMN_C_C_CLASSPK_2 = "serviceParam.classPK = ?";

	public ServiceParamPersistenceImpl() {
		setModelClass(ServiceParam.class);
	}

	/**
	 * Caches the service param in the entity cache if it is enabled.
	 *
	 * @param serviceParam the service param
	 */
	@Override
	public void cacheResult(ServiceParam serviceParam) {
		EntityCacheUtil.putResult(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamImpl.class, serviceParam.getPrimaryKey(), serviceParam);

		serviceParam.resetOriginalValues();
	}

	/**
	 * Caches the service params in the entity cache if it is enabled.
	 *
	 * @param serviceParams the service params
	 */
	@Override
	public void cacheResult(List<ServiceParam> serviceParams) {
		for (ServiceParam serviceParam : serviceParams) {
			if (EntityCacheUtil.getResult(
						ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
						ServiceParamImpl.class, serviceParam.getPrimaryKey()) == null) {
				cacheResult(serviceParam);
			}
			else {
				serviceParam.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service params.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceParamImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceParamImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service param.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServiceParam serviceParam) {
		EntityCacheUtil.removeResult(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamImpl.class, serviceParam.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ServiceParam> serviceParams) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServiceParam serviceParam : serviceParams) {
			EntityCacheUtil.removeResult(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
				ServiceParamImpl.class, serviceParam.getPrimaryKey());
		}
	}

	/**
	 * Creates a new service param with the primary key. Does not add the service param to the database.
	 *
	 * @param paramId the primary key for the new service param
	 * @return the new service param
	 */
	@Override
	public ServiceParam create(long paramId) {
		ServiceParam serviceParam = new ServiceParamImpl();

		serviceParam.setNew(true);
		serviceParam.setPrimaryKey(paramId);

		return serviceParam;
	}

	/**
	 * Removes the service param with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param paramId the primary key of the service param
	 * @return the service param that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceParam remove(long paramId)
		throws NoSuchServiceParamException, SystemException {
		return remove((Serializable)paramId);
	}

	/**
	 * Removes the service param with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service param
	 * @return the service param that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceParam remove(Serializable primaryKey)
		throws NoSuchServiceParamException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServiceParam serviceParam = (ServiceParam)session.get(ServiceParamImpl.class,
					primaryKey);

			if (serviceParam == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceParamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(serviceParam);
		}
		catch (NoSuchServiceParamException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ServiceParam removeImpl(ServiceParam serviceParam)
		throws SystemException {
		serviceParam = toUnwrappedModel(serviceParam);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(serviceParam)) {
				serviceParam = (ServiceParam)session.get(ServiceParamImpl.class,
						serviceParam.getPrimaryKeyObj());
			}

			if (serviceParam != null) {
				session.delete(serviceParam);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (serviceParam != null) {
			clearCache(serviceParam);
		}

		return serviceParam;
	}

	@Override
	public ServiceParam updateImpl(
		com.liferay.portal.ext.model.ServiceParam serviceParam)
		throws SystemException {
		serviceParam = toUnwrappedModel(serviceParam);

		boolean isNew = serviceParam.isNew();

		ServiceParamModelImpl serviceParamModelImpl = (ServiceParamModelImpl)serviceParam;

		Session session = null;

		try {
			session = openSession();

			if (serviceParam.isNew()) {
				session.save(serviceParam);

				serviceParam.setNew(false);
			}
			else {
				session.merge(serviceParam);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ServiceParamModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((serviceParamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C_P.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						serviceParamModelImpl.getOriginalClassNameId(),
						serviceParamModelImpl.getOriginalClassPK(),
						serviceParamModelImpl.getOriginalParamType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C_P,
					args);

				args = new Object[] {
						serviceParamModelImpl.getClassNameId(),
						serviceParamModelImpl.getClassPK(),
						serviceParamModelImpl.getParamType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C_P, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C_P,
					args);
			}

			if ((serviceParamModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						serviceParamModelImpl.getOriginalClassNameId(),
						serviceParamModelImpl.getOriginalClassPK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C,
					args);

				args = new Object[] {
						serviceParamModelImpl.getClassNameId(),
						serviceParamModelImpl.getClassPK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C,
					args);
			}
		}

		EntityCacheUtil.putResult(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
			ServiceParamImpl.class, serviceParam.getPrimaryKey(), serviceParam);

		return serviceParam;
	}

	protected ServiceParam toUnwrappedModel(ServiceParam serviceParam) {
		if (serviceParam instanceof ServiceParamImpl) {
			return serviceParam;
		}

		ServiceParamImpl serviceParamImpl = new ServiceParamImpl();

		serviceParamImpl.setNew(serviceParam.isNew());
		serviceParamImpl.setPrimaryKey(serviceParam.getPrimaryKey());

		serviceParamImpl.setParamId(serviceParam.getParamId());
		serviceParamImpl.setUserId(serviceParam.getUserId());
		serviceParamImpl.setUserName(serviceParam.getUserName());
		serviceParamImpl.setCreateDate(serviceParam.getCreateDate());
		serviceParamImpl.setModifiedDate(serviceParam.getModifiedDate());
		serviceParamImpl.setClassNameId(serviceParam.getClassNameId());
		serviceParamImpl.setClassPK(serviceParam.getClassPK());
		serviceParamImpl.setParamType(serviceParam.getParamType());
		serviceParamImpl.setParamName(serviceParam.getParamName());
		serviceParamImpl.setParamValue(serviceParam.getParamValue());
		serviceParamImpl.setParamObject(serviceParam.getParamObject());
		serviceParamImpl.setParamDesc(serviceParam.getParamDesc());
		serviceParamImpl.setDefaultValue(serviceParam.getDefaultValue());

		return serviceParamImpl;
	}

	/**
	 * Returns the service param with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service param
	 * @return the service param
	 * @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceParam findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceParamException, SystemException {
		ServiceParam serviceParam = fetchByPrimaryKey(primaryKey);

		if (serviceParam == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceParamException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return serviceParam;
	}

	/**
	 * Returns the service param with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceParamException} if it could not be found.
	 *
	 * @param paramId the primary key of the service param
	 * @return the service param
	 * @throws com.liferay.portal.ext.NoSuchServiceParamException if a service param with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceParam findByPrimaryKey(long paramId)
		throws NoSuchServiceParamException, SystemException {
		return findByPrimaryKey((Serializable)paramId);
	}

	/**
	 * Returns the service param with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service param
	 * @return the service param, or <code>null</code> if a service param with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceParam fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServiceParam serviceParam = (ServiceParam)EntityCacheUtil.getResult(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
				ServiceParamImpl.class, primaryKey);

		if (serviceParam == _nullServiceParam) {
			return null;
		}

		if (serviceParam == null) {
			Session session = null;

			try {
				session = openSession();

				serviceParam = (ServiceParam)session.get(ServiceParamImpl.class,
						primaryKey);

				if (serviceParam != null) {
					cacheResult(serviceParam);
				}
				else {
					EntityCacheUtil.putResult(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
						ServiceParamImpl.class, primaryKey, _nullServiceParam);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceParamModelImpl.ENTITY_CACHE_ENABLED,
					ServiceParamImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return serviceParam;
	}

	/**
	 * Returns the service param with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param paramId the primary key of the service param
	 * @return the service param, or <code>null</code> if a service param with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceParam fetchByPrimaryKey(long paramId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)paramId);
	}

	/**
	 * Returns all the service params.
	 *
	 * @return the service params
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceParam> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ServiceParam> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ServiceParam> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ServiceParam> list = (List<ServiceParam>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICEPARAM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICEPARAM;

				if (pagination) {
					sql = sql.concat(ServiceParamModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServiceParam>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceParam>(list);
				}
				else {
					list = (List<ServiceParam>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the service params from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServiceParam serviceParam : findAll()) {
			remove(serviceParam);
		}
	}

	/**
	 * Returns the number of service params.
	 *
	 * @return the number of service params
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SERVICEPARAM);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the service param persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.portal.util.PropsUtil.get(
						"value.object.listener.com.liferay.portal.ext.model.ServiceParam")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServiceParam>> listenersList = new ArrayList<ModelListener<ServiceParam>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServiceParam>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ServiceParamImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICEPARAM = "SELECT serviceParam FROM ServiceParam serviceParam";
	private static final String _SQL_SELECT_SERVICEPARAM_WHERE = "SELECT serviceParam FROM ServiceParam serviceParam WHERE ";
	private static final String _SQL_COUNT_SERVICEPARAM = "SELECT COUNT(serviceParam) FROM ServiceParam serviceParam";
	private static final String _SQL_COUNT_SERVICEPARAM_WHERE = "SELECT COUNT(serviceParam) FROM ServiceParam serviceParam WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "serviceParam.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServiceParam exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ServiceParam exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
	private static Log _log = LogFactoryUtil.getLog(ServiceParamPersistenceImpl.class);
	private static ServiceParam _nullServiceParam = new ServiceParamImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServiceParam> toCacheModel() {
				return _nullServiceParamCacheModel;
			}
		};

	private static CacheModel<ServiceParam> _nullServiceParamCacheModel = new CacheModel<ServiceParam>() {
			@Override
			public ServiceParam toEntityModel() {
				return _nullServiceParam;
			}
		};
}