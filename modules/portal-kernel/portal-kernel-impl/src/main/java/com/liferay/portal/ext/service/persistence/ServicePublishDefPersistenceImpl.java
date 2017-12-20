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

import com.liferay.portal.ext.NoSuchServicePublishDefException;
import com.liferay.portal.ext.model.ServicePublishDef;
import com.liferay.portal.ext.model.impl.ServicePublishDefImpl;
import com.liferay.portal.ext.model.impl.ServicePublishDefModelImpl;
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
import com.liferay.portal.kernel.util.SetUtil;
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
import java.util.Set;

/**
 * The persistence implementation for the service publish def service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServicePublishDefPersistence
 * @see ServicePublishDefUtil
 * @generated
 */
public class ServicePublishDefPersistenceImpl extends BasePersistenceImpl<ServicePublishDef>
	implements ServicePublishDefPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServicePublishDefUtil} to access the service publish def persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServicePublishDefImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
			ServicePublishDefModelImpl.FINDER_CACHE_ENABLED,
			ServicePublishDefImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
			ServicePublishDefModelImpl.FINDER_CACHE_ENABLED,
			ServicePublishDefImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
			ServicePublishDefModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_PATH = new FinderPath(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
			ServicePublishDefModelImpl.FINDER_CACHE_ENABLED,
			ServicePublishDefImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByPath", new String[] { String.class.getName() },
			ServicePublishDefModelImpl.PATH_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PATH = new FinderPath(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
			ServicePublishDefModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPath",
			new String[] { String.class.getName() });

	/**
	 * Returns the service publish def where path = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServicePublishDefException} if it could not be found.
	 *
	 * @param path the path
	 * @return the matching service publish def
	 * @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a matching service publish def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef findByPath(String path)
		throws NoSuchServicePublishDefException, SystemException {
		ServicePublishDef servicePublishDef = fetchByPath(path);

		if (servicePublishDef == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("path=");
			msg.append(path);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchServicePublishDefException(msg.toString());
		}

		return servicePublishDef;
	}

	/**
	 * Returns the service publish def where path = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param path the path
	 * @return the matching service publish def, or <code>null</code> if a matching service publish def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef fetchByPath(String path) throws SystemException {
		return fetchByPath(path, true);
	}

	/**
	 * Returns the service publish def where path = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param path the path
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching service publish def, or <code>null</code> if a matching service publish def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef fetchByPath(String path, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { path };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PATH,
					finderArgs, this);
		}

		if (result instanceof ServicePublishDef) {
			ServicePublishDef servicePublishDef = (ServicePublishDef)result;

			if (!Validator.equals(path, servicePublishDef.getPath())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SERVICEPUBLISHDEF_WHERE);

			boolean bindPath = false;

			if (path == null) {
				query.append(_FINDER_COLUMN_PATH_PATH_1);
			}
			else if (path.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PATH_PATH_3);
			}
			else {
				bindPath = true;

				query.append(_FINDER_COLUMN_PATH_PATH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPath) {
					qPos.add(path);
				}

				List<ServicePublishDef> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PATH,
						finderArgs, list);
				}
				else {
					ServicePublishDef servicePublishDef = list.get(0);

					result = servicePublishDef;

					cacheResult(servicePublishDef);

					if ((servicePublishDef.getPath() == null) ||
							!servicePublishDef.getPath().equals(path)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PATH,
							finderArgs, servicePublishDef);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PATH,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ServicePublishDef)result;
		}
	}

	/**
	 * Removes the service publish def where path = &#63; from the database.
	 *
	 * @param path the path
	 * @return the service publish def that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef removeByPath(String path)
		throws NoSuchServicePublishDefException, SystemException {
		ServicePublishDef servicePublishDef = findByPath(path);

		return remove(servicePublishDef);
	}

	/**
	 * Returns the number of service publish defs where path = &#63;.
	 *
	 * @param path the path
	 * @return the number of matching service publish defs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPath(String path) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PATH;

		Object[] finderArgs = new Object[] { path };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SERVICEPUBLISHDEF_WHERE);

			boolean bindPath = false;

			if (path == null) {
				query.append(_FINDER_COLUMN_PATH_PATH_1);
			}
			else if (path.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PATH_PATH_3);
			}
			else {
				bindPath = true;

				query.append(_FINDER_COLUMN_PATH_PATH_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPath) {
					qPos.add(path);
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

	private static final String _FINDER_COLUMN_PATH_PATH_1 = "servicePublishDef.path IS NULL";
	private static final String _FINDER_COLUMN_PATH_PATH_2 = "servicePublishDef.path = ?";
	private static final String _FINDER_COLUMN_PATH_PATH_3 = "(servicePublishDef.path IS NULL OR servicePublishDef.path = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TAGID = new FinderPath(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
			ServicePublishDefModelImpl.FINDER_CACHE_ENABLED,
			ServicePublishDefImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTagId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGID = new FinderPath(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
			ServicePublishDefModelImpl.FINDER_CACHE_ENABLED,
			ServicePublishDefImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTagId",
			new String[] { Long.class.getName() },
			ServicePublishDefModelImpl.TAGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAGID = new FinderPath(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
			ServicePublishDefModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTagId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the service publish defs where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @return the matching service publish defs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServicePublishDef> findByTagId(long tagId)
		throws SystemException {
		return findByTagId(tagId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ServicePublishDef> findByTagId(long tagId, int start, int end)
		throws SystemException {
		return findByTagId(tagId, start, end, null);
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
	@Override
	public List<ServicePublishDef> findByTagId(long tagId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGID;
			finderArgs = new Object[] { tagId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TAGID;
			finderArgs = new Object[] { tagId, start, end, orderByComparator };
		}

		List<ServicePublishDef> list = (List<ServicePublishDef>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ServicePublishDef servicePublishDef : list) {
				if ((tagId != servicePublishDef.getTagId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_SERVICEPUBLISHDEF_WHERE);

			query.append(_FINDER_COLUMN_TAGID_TAGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ServicePublishDefModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tagId);

				if (!pagination) {
					list = (List<ServicePublishDef>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServicePublishDef>(list);
				}
				else {
					list = (List<ServicePublishDef>)QueryUtil.list(q,
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
	 * Returns the first service publish def in the ordered set where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service publish def
	 * @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a matching service publish def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef findByTagId_First(long tagId,
		OrderByComparator orderByComparator)
		throws NoSuchServicePublishDefException, SystemException {
		ServicePublishDef servicePublishDef = fetchByTagId_First(tagId,
				orderByComparator);

		if (servicePublishDef != null) {
			return servicePublishDef;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tagId=");
		msg.append(tagId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServicePublishDefException(msg.toString());
	}

	/**
	 * Returns the first service publish def in the ordered set where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service publish def, or <code>null</code> if a matching service publish def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef fetchByTagId_First(long tagId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ServicePublishDef> list = findByTagId(tagId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ServicePublishDef findByTagId_Last(long tagId,
		OrderByComparator orderByComparator)
		throws NoSuchServicePublishDefException, SystemException {
		ServicePublishDef servicePublishDef = fetchByTagId_Last(tagId,
				orderByComparator);

		if (servicePublishDef != null) {
			return servicePublishDef;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tagId=");
		msg.append(tagId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServicePublishDefException(msg.toString());
	}

	/**
	 * Returns the last service publish def in the ordered set where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching service publish def, or <code>null</code> if a matching service publish def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef fetchByTagId_Last(long tagId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTagId(tagId);

		if (count == 0) {
			return null;
		}

		List<ServicePublishDef> list = findByTagId(tagId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ServicePublishDef[] findByTagId_PrevAndNext(long publishId,
		long tagId, OrderByComparator orderByComparator)
		throws NoSuchServicePublishDefException, SystemException {
		ServicePublishDef servicePublishDef = findByPrimaryKey(publishId);

		Session session = null;

		try {
			session = openSession();

			ServicePublishDef[] array = new ServicePublishDefImpl[3];

			array[0] = getByTagId_PrevAndNext(session, servicePublishDef,
					tagId, orderByComparator, true);

			array[1] = servicePublishDef;

			array[2] = getByTagId_PrevAndNext(session, servicePublishDef,
					tagId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ServicePublishDef getByTagId_PrevAndNext(Session session,
		ServicePublishDef servicePublishDef, long tagId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SERVICEPUBLISHDEF_WHERE);

		query.append(_FINDER_COLUMN_TAGID_TAGID_2);

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
			query.append(ServicePublishDefModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tagId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(servicePublishDef);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ServicePublishDef> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the service publish defs where tagId = &#63; from the database.
	 *
	 * @param tagId the tag ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTagId(long tagId) throws SystemException {
		for (ServicePublishDef servicePublishDef : findByTagId(tagId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(servicePublishDef);
		}
	}

	/**
	 * Returns the number of service publish defs where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @return the number of matching service publish defs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTagId(long tagId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TAGID;

		Object[] finderArgs = new Object[] { tagId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SERVICEPUBLISHDEF_WHERE);

			query.append(_FINDER_COLUMN_TAGID_TAGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tagId);

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

	private static final String _FINDER_COLUMN_TAGID_TAGID_2 = "servicePublishDef.tagId = ?";

	public ServicePublishDefPersistenceImpl() {
		setModelClass(ServicePublishDef.class);
	}

	/**
	 * Caches the service publish def in the entity cache if it is enabled.
	 *
	 * @param servicePublishDef the service publish def
	 */
	@Override
	public void cacheResult(ServicePublishDef servicePublishDef) {
		EntityCacheUtil.putResult(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
			ServicePublishDefImpl.class, servicePublishDef.getPrimaryKey(),
			servicePublishDef);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PATH,
			new Object[] { servicePublishDef.getPath() }, servicePublishDef);

		servicePublishDef.resetOriginalValues();
	}

	/**
	 * Caches the service publish defs in the entity cache if it is enabled.
	 *
	 * @param servicePublishDefs the service publish defs
	 */
	@Override
	public void cacheResult(List<ServicePublishDef> servicePublishDefs) {
		for (ServicePublishDef servicePublishDef : servicePublishDefs) {
			if (EntityCacheUtil.getResult(
						ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
						ServicePublishDefImpl.class,
						servicePublishDef.getPrimaryKey()) == null) {
				cacheResult(servicePublishDef);
			}
			else {
				servicePublishDef.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service publish defs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServicePublishDefImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServicePublishDefImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service publish def.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServicePublishDef servicePublishDef) {
		EntityCacheUtil.removeResult(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
			ServicePublishDefImpl.class, servicePublishDef.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(servicePublishDef);
	}

	@Override
	public void clearCache(List<ServicePublishDef> servicePublishDefs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServicePublishDef servicePublishDef : servicePublishDefs) {
			EntityCacheUtil.removeResult(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
				ServicePublishDefImpl.class, servicePublishDef.getPrimaryKey());

			clearUniqueFindersCache(servicePublishDef);
		}
	}

	protected void cacheUniqueFindersCache(ServicePublishDef servicePublishDef) {
		if (servicePublishDef.isNew()) {
			Object[] args = new Object[] { servicePublishDef.getPath() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PATH, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PATH, args,
				servicePublishDef);
		}
		else {
			ServicePublishDefModelImpl servicePublishDefModelImpl = (ServicePublishDefModelImpl)servicePublishDef;

			if ((servicePublishDefModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PATH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { servicePublishDef.getPath() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PATH, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PATH, args,
					servicePublishDef);
			}
		}
	}

	protected void clearUniqueFindersCache(ServicePublishDef servicePublishDef) {
		ServicePublishDefModelImpl servicePublishDefModelImpl = (ServicePublishDefModelImpl)servicePublishDef;

		Object[] args = new Object[] { servicePublishDef.getPath() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PATH, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PATH, args);

		if ((servicePublishDefModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PATH.getColumnBitmask()) != 0) {
			args = new Object[] { servicePublishDefModelImpl.getOriginalPath() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PATH, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PATH, args);
		}
	}

	/**
	 * Creates a new service publish def with the primary key. Does not add the service publish def to the database.
	 *
	 * @param publishId the primary key for the new service publish def
	 * @return the new service publish def
	 */
	@Override
	public ServicePublishDef create(long publishId) {
		ServicePublishDef servicePublishDef = new ServicePublishDefImpl();

		servicePublishDef.setNew(true);
		servicePublishDef.setPrimaryKey(publishId);

		return servicePublishDef;
	}

	/**
	 * Removes the service publish def with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param publishId the primary key of the service publish def
	 * @return the service publish def that was removed
	 * @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a service publish def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef remove(long publishId)
		throws NoSuchServicePublishDefException, SystemException {
		return remove((Serializable)publishId);
	}

	/**
	 * Removes the service publish def with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service publish def
	 * @return the service publish def that was removed
	 * @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a service publish def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef remove(Serializable primaryKey)
		throws NoSuchServicePublishDefException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServicePublishDef servicePublishDef = (ServicePublishDef)session.get(ServicePublishDefImpl.class,
					primaryKey);

			if (servicePublishDef == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServicePublishDefException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(servicePublishDef);
		}
		catch (NoSuchServicePublishDefException nsee) {
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
	protected ServicePublishDef removeImpl(ServicePublishDef servicePublishDef)
		throws SystemException {
		servicePublishDef = toUnwrappedModel(servicePublishDef);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(servicePublishDef)) {
				servicePublishDef = (ServicePublishDef)session.get(ServicePublishDefImpl.class,
						servicePublishDef.getPrimaryKeyObj());
			}

			if (servicePublishDef != null) {
				session.delete(servicePublishDef);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (servicePublishDef != null) {
			clearCache(servicePublishDef);
		}

		return servicePublishDef;
	}

	@Override
	public ServicePublishDef updateImpl(
		com.liferay.portal.ext.model.ServicePublishDef servicePublishDef)
		throws SystemException {
		servicePublishDef = toUnwrappedModel(servicePublishDef);

		boolean isNew = servicePublishDef.isNew();

		ServicePublishDefModelImpl servicePublishDefModelImpl = (ServicePublishDefModelImpl)servicePublishDef;

		Session session = null;

		try {
			session = openSession();

			if (servicePublishDef.isNew()) {
				session.save(servicePublishDef);

				servicePublishDef.setNew(false);
			}
			else {
				session.merge(servicePublishDef);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ServicePublishDefModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((servicePublishDefModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						servicePublishDefModelImpl.getOriginalTagId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAGID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGID,
					args);

				args = new Object[] { servicePublishDefModelImpl.getTagId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAGID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGID,
					args);
			}
		}

		EntityCacheUtil.putResult(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
			ServicePublishDefImpl.class, servicePublishDef.getPrimaryKey(),
			servicePublishDef);

		clearUniqueFindersCache(servicePublishDef);
		cacheUniqueFindersCache(servicePublishDef);

		return servicePublishDef;
	}

	protected ServicePublishDef toUnwrappedModel(
		ServicePublishDef servicePublishDef) {
		if (servicePublishDef instanceof ServicePublishDefImpl) {
			return servicePublishDef;
		}

		ServicePublishDefImpl servicePublishDefImpl = new ServicePublishDefImpl();

		servicePublishDefImpl.setNew(servicePublishDef.isNew());
		servicePublishDefImpl.setPrimaryKey(servicePublishDef.getPrimaryKey());

		servicePublishDefImpl.setPublishId(servicePublishDef.getPublishId());
		servicePublishDefImpl.setPath(servicePublishDef.getPath());
		servicePublishDefImpl.setUserId(servicePublishDef.getUserId());
		servicePublishDefImpl.setUserName(servicePublishDef.getUserName());
		servicePublishDefImpl.setCreateDate(servicePublishDef.getCreateDate());
		servicePublishDefImpl.setModifiedDate(servicePublishDef.getModifiedDate());
		servicePublishDefImpl.setTagId(servicePublishDef.getTagId());
		servicePublishDefImpl.setHttpMethod(servicePublishDef.getHttpMethod());
		servicePublishDefImpl.setScriptResponse(servicePublishDef.getScriptResponse());
		servicePublishDefImpl.setSiteAwareness(servicePublishDef.isSiteAwareness());
		servicePublishDefImpl.setSupportAnonymous(servicePublishDef.isSupportAnonymous());
		servicePublishDefImpl.setDescription(servicePublishDef.getDescription());
		servicePublishDefImpl.setDeprecated(servicePublishDef.isDeprecated());
		servicePublishDefImpl.setCacheLiveTime(servicePublishDef.getCacheLiveTime());

		return servicePublishDefImpl;
	}

	/**
	 * Returns the service publish def with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service publish def
	 * @return the service publish def
	 * @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a service publish def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServicePublishDefException, SystemException {
		ServicePublishDef servicePublishDef = fetchByPrimaryKey(primaryKey);

		if (servicePublishDef == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServicePublishDefException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return servicePublishDef;
	}

	/**
	 * Returns the service publish def with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServicePublishDefException} if it could not be found.
	 *
	 * @param publishId the primary key of the service publish def
	 * @return the service publish def
	 * @throws com.liferay.portal.ext.NoSuchServicePublishDefException if a service publish def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef findByPrimaryKey(long publishId)
		throws NoSuchServicePublishDefException, SystemException {
		return findByPrimaryKey((Serializable)publishId);
	}

	/**
	 * Returns the service publish def with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service publish def
	 * @return the service publish def, or <code>null</code> if a service publish def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServicePublishDef servicePublishDef = (ServicePublishDef)EntityCacheUtil.getResult(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
				ServicePublishDefImpl.class, primaryKey);

		if (servicePublishDef == _nullServicePublishDef) {
			return null;
		}

		if (servicePublishDef == null) {
			Session session = null;

			try {
				session = openSession();

				servicePublishDef = (ServicePublishDef)session.get(ServicePublishDefImpl.class,
						primaryKey);

				if (servicePublishDef != null) {
					cacheResult(servicePublishDef);
				}
				else {
					EntityCacheUtil.putResult(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
						ServicePublishDefImpl.class, primaryKey,
						_nullServicePublishDef);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServicePublishDefModelImpl.ENTITY_CACHE_ENABLED,
					ServicePublishDefImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return servicePublishDef;
	}

	/**
	 * Returns the service publish def with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param publishId the primary key of the service publish def
	 * @return the service publish def, or <code>null</code> if a service publish def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServicePublishDef fetchByPrimaryKey(long publishId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)publishId);
	}

	/**
	 * Returns all the service publish defs.
	 *
	 * @return the service publish defs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServicePublishDef> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ServicePublishDef> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<ServicePublishDef> findAll(int start, int end,
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

		List<ServicePublishDef> list = (List<ServicePublishDef>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICEPUBLISHDEF);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICEPUBLISHDEF;

				if (pagination) {
					sql = sql.concat(ServicePublishDefModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServicePublishDef>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServicePublishDef>(list);
				}
				else {
					list = (List<ServicePublishDef>)QueryUtil.list(q,
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
	 * Removes all the service publish defs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServicePublishDef servicePublishDef : findAll()) {
			remove(servicePublishDef);
		}
	}

	/**
	 * Returns the number of service publish defs.
	 *
	 * @return the number of service publish defs
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

				Query q = session.createQuery(_SQL_COUNT_SERVICEPUBLISHDEF);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the service publish def persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.portal.util.PropsUtil.get(
						"value.object.listener.com.liferay.portal.ext.model.ServicePublishDef")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServicePublishDef>> listenersList = new ArrayList<ModelListener<ServicePublishDef>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServicePublishDef>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ServicePublishDefImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICEPUBLISHDEF = "SELECT servicePublishDef FROM ServicePublishDef servicePublishDef";
	private static final String _SQL_SELECT_SERVICEPUBLISHDEF_WHERE = "SELECT servicePublishDef FROM ServicePublishDef servicePublishDef WHERE ";
	private static final String _SQL_COUNT_SERVICEPUBLISHDEF = "SELECT COUNT(servicePublishDef) FROM ServicePublishDef servicePublishDef";
	private static final String _SQL_COUNT_SERVICEPUBLISHDEF_WHERE = "SELECT COUNT(servicePublishDef) FROM ServicePublishDef servicePublishDef WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "servicePublishDef.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServicePublishDef exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ServicePublishDef exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
	private static Log _log = LogFactoryUtil.getLog(ServicePublishDefPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"path"
			});
	private static ServicePublishDef _nullServicePublishDef = new ServicePublishDefImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServicePublishDef> toCacheModel() {
				return _nullServicePublishDefCacheModel;
			}
		};

	private static CacheModel<ServicePublishDef> _nullServicePublishDefCacheModel =
		new CacheModel<ServicePublishDef>() {
			@Override
			public ServicePublishDef toEntityModel() {
				return _nullServicePublishDef;
			}
		};
}