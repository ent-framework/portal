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

import com.liferay.portal.ext.NoSuchServiceHistoryException;
import com.liferay.portal.ext.model.ServiceHistory;
import com.liferay.portal.ext.model.impl.ServiceHistoryImpl;
import com.liferay.portal.ext.model.impl.ServiceHistoryModelImpl;
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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the service history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceHistoryPersistence
 * @see ServiceHistoryUtil
 * @generated
 */
public class ServiceHistoryPersistenceImpl extends BasePersistenceImpl<ServiceHistory>
	implements ServiceHistoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceHistoryUtil} to access the service history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceHistoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHistoryModelImpl.FINDER_CACHE_ENABLED,
			ServiceHistoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHistoryModelImpl.FINDER_CACHE_ENABLED,
			ServiceHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_C = new FinderPath(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHistoryModelImpl.FINDER_CACHE_ENABLED,
			ServiceHistoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByC_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C = new FinderPath(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHistoryModelImpl.FINDER_CACHE_ENABLED,
			ServiceHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_C",
			new String[] { Long.class.getName(), Long.class.getName() },
			ServiceHistoryModelImpl.CLASSNAMEID_COLUMN_BITMASK |
			ServiceHistoryModelImpl.CLASSPK_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C = new FinderPath(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_C",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the service histories where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @return the matching service histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceHistory> findByC_C(long classNameId, long classPK)
		throws SystemException {
		return findByC_C(classNameId, classPK, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service histories where classNameId = &#63; and classPK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param start the lower bound of the range of service histories
	 * @param end the upper bound of the range of service histories (not inclusive)
	 * @return the range of matching service histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceHistory> findByC_C(long classNameId, long classPK,
		int start, int end) throws SystemException {
		return findByC_C(classNameId, classPK, start, end, null);
	}

	/**
	 * Returns an ordered range of all the service histories where classNameId = &#63; and classPK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param start the lower bound of the range of service histories
	 * @param end the upper bound of the range of service histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching service histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceHistory> findByC_C(long classNameId, long classPK,
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

		List<ServiceHistory> list = (List<ServiceHistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ServiceHistory serviceHistory : list) {
				if ((classNameId != serviceHistory.getClassNameId()) ||
						(classPK != serviceHistory.getClassPK())) {
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

			query.append(_SQL_SELECT_SERVICEHISTORY_WHERE);

			query.append(_FINDER_COLUMN_C_C_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_CLASSPK_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ServiceHistoryModelImpl.ORDER_BY_JPQL);
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
					list = (List<ServiceHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceHistory>(list);
				}
				else {
					list = (List<ServiceHistory>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first service history in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service history
	 * @throws com.liferay.portal.ext.NoSuchServiceHistoryException if a matching service history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHistory findByC_C_First(long classNameId, long classPK,
		OrderByComparator orderByComparator)
		throws NoSuchServiceHistoryException, SystemException {
		ServiceHistory serviceHistory = fetchByC_C_First(classNameId, classPK,
				orderByComparator);

		if (serviceHistory != null) {
			return serviceHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("classNameId=");
		msg.append(classNameId);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceHistoryException(msg.toString());
	}

	/**
	 * Returns the first service history in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service history, or <code>null</code> if a matching service history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHistory fetchByC_C_First(long classNameId, long classPK,
		OrderByComparator orderByComparator) throws SystemException {
		List<ServiceHistory> list = findByC_C(classNameId, classPK, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last service history in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching service history
	 * @throws com.liferay.portal.ext.NoSuchServiceHistoryException if a matching service history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHistory findByC_C_Last(long classNameId, long classPK,
		OrderByComparator orderByComparator)
		throws NoSuchServiceHistoryException, SystemException {
		ServiceHistory serviceHistory = fetchByC_C_Last(classNameId, classPK,
				orderByComparator);

		if (serviceHistory != null) {
			return serviceHistory;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("classNameId=");
		msg.append(classNameId);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceHistoryException(msg.toString());
	}

	/**
	 * Returns the last service history in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching service history, or <code>null</code> if a matching service history could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHistory fetchByC_C_Last(long classNameId, long classPK,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_C(classNameId, classPK);

		if (count == 0) {
			return null;
		}

		List<ServiceHistory> list = findByC_C(classNameId, classPK, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the service histories before and after the current service history in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param hisId the primary key of the current service history
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next service history
	 * @throws com.liferay.portal.ext.NoSuchServiceHistoryException if a service history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHistory[] findByC_C_PrevAndNext(long hisId, long classNameId,
		long classPK, OrderByComparator orderByComparator)
		throws NoSuchServiceHistoryException, SystemException {
		ServiceHistory serviceHistory = findByPrimaryKey(hisId);

		Session session = null;

		try {
			session = openSession();

			ServiceHistory[] array = new ServiceHistoryImpl[3];

			array[0] = getByC_C_PrevAndNext(session, serviceHistory,
					classNameId, classPK, orderByComparator, true);

			array[1] = serviceHistory;

			array[2] = getByC_C_PrevAndNext(session, serviceHistory,
					classNameId, classPK, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ServiceHistory getByC_C_PrevAndNext(Session session,
		ServiceHistory serviceHistory, long classNameId, long classPK,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SERVICEHISTORY_WHERE);

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
			query.append(ServiceHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(classNameId);

		qPos.add(classPK);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(serviceHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ServiceHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the service histories where classNameId = &#63; and classPK = &#63; from the database.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_C(long classNameId, long classPK)
		throws SystemException {
		for (ServiceHistory serviceHistory : findByC_C(classNameId, classPK,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(serviceHistory);
		}
	}

	/**
	 * Returns the number of service histories where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @return the number of matching service histories
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

			query.append(_SQL_COUNT_SERVICEHISTORY_WHERE);

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

	private static final String _FINDER_COLUMN_C_C_CLASSNAMEID_2 = "serviceHistory.classNameId = ? AND ";
	private static final String _FINDER_COLUMN_C_C_CLASSPK_2 = "serviceHistory.classPK = ?";

	public ServiceHistoryPersistenceImpl() {
		setModelClass(ServiceHistory.class);
	}

	/**
	 * Caches the service history in the entity cache if it is enabled.
	 *
	 * @param serviceHistory the service history
	 */
	@Override
	public void cacheResult(ServiceHistory serviceHistory) {
		EntityCacheUtil.putResult(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHistoryImpl.class, serviceHistory.getPrimaryKey(),
			serviceHistory);

		serviceHistory.resetOriginalValues();
	}

	/**
	 * Caches the service histories in the entity cache if it is enabled.
	 *
	 * @param serviceHistories the service histories
	 */
	@Override
	public void cacheResult(List<ServiceHistory> serviceHistories) {
		for (ServiceHistory serviceHistory : serviceHistories) {
			if (EntityCacheUtil.getResult(
						ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
						ServiceHistoryImpl.class, serviceHistory.getPrimaryKey()) == null) {
				cacheResult(serviceHistory);
			}
			else {
				serviceHistory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service histories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceHistoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceHistoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service history.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServiceHistory serviceHistory) {
		EntityCacheUtil.removeResult(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHistoryImpl.class, serviceHistory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ServiceHistory> serviceHistories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServiceHistory serviceHistory : serviceHistories) {
			EntityCacheUtil.removeResult(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
				ServiceHistoryImpl.class, serviceHistory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new service history with the primary key. Does not add the service history to the database.
	 *
	 * @param hisId the primary key for the new service history
	 * @return the new service history
	 */
	@Override
	public ServiceHistory create(long hisId) {
		ServiceHistory serviceHistory = new ServiceHistoryImpl();

		serviceHistory.setNew(true);
		serviceHistory.setPrimaryKey(hisId);

		return serviceHistory;
	}

	/**
	 * Removes the service history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hisId the primary key of the service history
	 * @return the service history that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceHistoryException if a service history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHistory remove(long hisId)
		throws NoSuchServiceHistoryException, SystemException {
		return remove((Serializable)hisId);
	}

	/**
	 * Removes the service history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service history
	 * @return the service history that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceHistoryException if a service history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHistory remove(Serializable primaryKey)
		throws NoSuchServiceHistoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServiceHistory serviceHistory = (ServiceHistory)session.get(ServiceHistoryImpl.class,
					primaryKey);

			if (serviceHistory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(serviceHistory);
		}
		catch (NoSuchServiceHistoryException nsee) {
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
	protected ServiceHistory removeImpl(ServiceHistory serviceHistory)
		throws SystemException {
		serviceHistory = toUnwrappedModel(serviceHistory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(serviceHistory)) {
				serviceHistory = (ServiceHistory)session.get(ServiceHistoryImpl.class,
						serviceHistory.getPrimaryKeyObj());
			}

			if (serviceHistory != null) {
				session.delete(serviceHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (serviceHistory != null) {
			clearCache(serviceHistory);
		}

		return serviceHistory;
	}

	@Override
	public ServiceHistory updateImpl(
		com.liferay.portal.ext.model.ServiceHistory serviceHistory)
		throws SystemException {
		serviceHistory = toUnwrappedModel(serviceHistory);

		boolean isNew = serviceHistory.isNew();

		ServiceHistoryModelImpl serviceHistoryModelImpl = (ServiceHistoryModelImpl)serviceHistory;

		Session session = null;

		try {
			session = openSession();

			if (serviceHistory.isNew()) {
				session.save(serviceHistory);

				serviceHistory.setNew(false);
			}
			else {
				session.merge(serviceHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ServiceHistoryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((serviceHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						serviceHistoryModelImpl.getOriginalClassNameId(),
						serviceHistoryModelImpl.getOriginalClassPK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C,
					args);

				args = new Object[] {
						serviceHistoryModelImpl.getClassNameId(),
						serviceHistoryModelImpl.getClassPK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C,
					args);
			}
		}

		EntityCacheUtil.putResult(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHistoryImpl.class, serviceHistory.getPrimaryKey(),
			serviceHistory);

		return serviceHistory;
	}

	protected ServiceHistory toUnwrappedModel(ServiceHistory serviceHistory) {
		if (serviceHistory instanceof ServiceHistoryImpl) {
			return serviceHistory;
		}

		ServiceHistoryImpl serviceHistoryImpl = new ServiceHistoryImpl();

		serviceHistoryImpl.setNew(serviceHistory.isNew());
		serviceHistoryImpl.setPrimaryKey(serviceHistory.getPrimaryKey());

		serviceHistoryImpl.setHisId(serviceHistory.getHisId());
		serviceHistoryImpl.setUserId(serviceHistory.getUserId());
		serviceHistoryImpl.setUserName(serviceHistory.getUserName());
		serviceHistoryImpl.setCreateDate(serviceHistory.getCreateDate());
		serviceHistoryImpl.setModifiedDate(serviceHistory.getModifiedDate());
		serviceHistoryImpl.setClassNameId(serviceHistory.getClassNameId());
		serviceHistoryImpl.setClassPK(serviceHistory.getClassPK());
		serviceHistoryImpl.setPage(serviceHistory.getPage());
		serviceHistoryImpl.setFriendlyURL(serviceHistory.getFriendlyURL());
		serviceHistoryImpl.setPortletName(serviceHistory.getPortletName());
		serviceHistoryImpl.setStatusCode(serviceHistory.getStatusCode());
		serviceHistoryImpl.setTimeCost(serviceHistory.getTimeCost());
		serviceHistoryImpl.setResponseText(serviceHistory.getResponseText());
		serviceHistoryImpl.setWrappedText(serviceHistory.getWrappedText());
		serviceHistoryImpl.setDebugInfo(serviceHistory.getDebugInfo());

		return serviceHistoryImpl;
	}

	/**
	 * Returns the service history with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service history
	 * @return the service history
	 * @throws com.liferay.portal.ext.NoSuchServiceHistoryException if a service history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHistory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceHistoryException, SystemException {
		ServiceHistory serviceHistory = fetchByPrimaryKey(primaryKey);

		if (serviceHistory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return serviceHistory;
	}

	/**
	 * Returns the service history with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceHistoryException} if it could not be found.
	 *
	 * @param hisId the primary key of the service history
	 * @return the service history
	 * @throws com.liferay.portal.ext.NoSuchServiceHistoryException if a service history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHistory findByPrimaryKey(long hisId)
		throws NoSuchServiceHistoryException, SystemException {
		return findByPrimaryKey((Serializable)hisId);
	}

	/**
	 * Returns the service history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service history
	 * @return the service history, or <code>null</code> if a service history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHistory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServiceHistory serviceHistory = (ServiceHistory)EntityCacheUtil.getResult(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
				ServiceHistoryImpl.class, primaryKey);

		if (serviceHistory == _nullServiceHistory) {
			return null;
		}

		if (serviceHistory == null) {
			Session session = null;

			try {
				session = openSession();

				serviceHistory = (ServiceHistory)session.get(ServiceHistoryImpl.class,
						primaryKey);

				if (serviceHistory != null) {
					cacheResult(serviceHistory);
				}
				else {
					EntityCacheUtil.putResult(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
						ServiceHistoryImpl.class, primaryKey,
						_nullServiceHistory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceHistoryModelImpl.ENTITY_CACHE_ENABLED,
					ServiceHistoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return serviceHistory;
	}

	/**
	 * Returns the service history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hisId the primary key of the service history
	 * @return the service history, or <code>null</code> if a service history with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHistory fetchByPrimaryKey(long hisId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)hisId);
	}

	/**
	 * Returns all the service histories.
	 *
	 * @return the service histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceHistory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service histories
	 * @param end the upper bound of the range of service histories (not inclusive)
	 * @return the range of service histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceHistory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the service histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service histories
	 * @param end the upper bound of the range of service histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of service histories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceHistory> findAll(int start, int end,
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

		List<ServiceHistory> list = (List<ServiceHistory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICEHISTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICEHISTORY;

				if (pagination) {
					sql = sql.concat(ServiceHistoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServiceHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceHistory>(list);
				}
				else {
					list = (List<ServiceHistory>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the service histories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServiceHistory serviceHistory : findAll()) {
			remove(serviceHistory);
		}
	}

	/**
	 * Returns the number of service histories.
	 *
	 * @return the number of service histories
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

				Query q = session.createQuery(_SQL_COUNT_SERVICEHISTORY);

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
	 * Initializes the service history persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.portal.util.PropsUtil.get(
						"value.object.listener.com.liferay.portal.ext.model.ServiceHistory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServiceHistory>> listenersList = new ArrayList<ModelListener<ServiceHistory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServiceHistory>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ServiceHistoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICEHISTORY = "SELECT serviceHistory FROM ServiceHistory serviceHistory";
	private static final String _SQL_SELECT_SERVICEHISTORY_WHERE = "SELECT serviceHistory FROM ServiceHistory serviceHistory WHERE ";
	private static final String _SQL_COUNT_SERVICEHISTORY = "SELECT COUNT(serviceHistory) FROM ServiceHistory serviceHistory";
	private static final String _SQL_COUNT_SERVICEHISTORY_WHERE = "SELECT COUNT(serviceHistory) FROM ServiceHistory serviceHistory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "serviceHistory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServiceHistory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ServiceHistory exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
	private static Log _log = LogFactoryUtil.getLog(ServiceHistoryPersistenceImpl.class);
	private static ServiceHistory _nullServiceHistory = new ServiceHistoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServiceHistory> toCacheModel() {
				return _nullServiceHistoryCacheModel;
			}
		};

	private static CacheModel<ServiceHistory> _nullServiceHistoryCacheModel = new CacheModel<ServiceHistory>() {
			@Override
			public ServiceHistory toEntityModel() {
				return _nullServiceHistory;
			}
		};
}