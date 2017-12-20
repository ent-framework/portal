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

import com.liferay.portal.ext.NoSuchServiceRemoteDefException;
import com.liferay.portal.ext.model.ServiceRemoteDef;
import com.liferay.portal.ext.model.impl.ServiceRemoteDefImpl;
import com.liferay.portal.ext.model.impl.ServiceRemoteDefModelImpl;
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
 * The persistence implementation for the service remote def service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceRemoteDefPersistence
 * @see ServiceRemoteDefUtil
 * @generated
 */
public class ServiceRemoteDefPersistenceImpl extends BasePersistenceImpl<ServiceRemoteDef>
	implements ServiceRemoteDefPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceRemoteDefUtil} to access the service remote def persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceRemoteDefImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefModelImpl.FINDER_CACHE_ENABLED,
			ServiceRemoteDefImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefModelImpl.FINDER_CACHE_ENABLED,
			ServiceRemoteDefImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CODE = new FinderPath(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefModelImpl.FINDER_CACHE_ENABLED,
			ServiceRemoteDefImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCode", new String[] { String.class.getName() },
			ServiceRemoteDefModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODE = new FinderPath(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the service remote def where code = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceRemoteDefException} if it could not be found.
	 *
	 * @param code the code
	 * @return the matching service remote def
	 * @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a matching service remote def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef findByCode(String code)
		throws NoSuchServiceRemoteDefException, SystemException {
		ServiceRemoteDef serviceRemoteDef = fetchByCode(code);

		if (serviceRemoteDef == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("code=");
			msg.append(code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchServiceRemoteDefException(msg.toString());
		}

		return serviceRemoteDef;
	}

	/**
	 * Returns the service remote def where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param code the code
	 * @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef fetchByCode(String code) throws SystemException {
		return fetchByCode(code, true);
	}

	/**
	 * Returns the service remote def where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param code the code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef fetchByCode(String code, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { code };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODE,
					finderArgs, this);
		}

		if (result instanceof ServiceRemoteDef) {
			ServiceRemoteDef serviceRemoteDef = (ServiceRemoteDef)result;

			if (!Validator.equals(code, serviceRemoteDef.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SERVICEREMOTEDEF_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				List<ServiceRemoteDef> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
						finderArgs, list);
				}
				else {
					ServiceRemoteDef serviceRemoteDef = list.get(0);

					result = serviceRemoteDef;

					cacheResult(serviceRemoteDef);

					if ((serviceRemoteDef.getCode() == null) ||
							!serviceRemoteDef.getCode().equals(code)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
							finderArgs, serviceRemoteDef);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE,
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
			return (ServiceRemoteDef)result;
		}
	}

	/**
	 * Removes the service remote def where code = &#63; from the database.
	 *
	 * @param code the code
	 * @return the service remote def that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef removeByCode(String code)
		throws NoSuchServiceRemoteDefException, SystemException {
		ServiceRemoteDef serviceRemoteDef = findByCode(code);

		return remove(serviceRemoteDef);
	}

	/**
	 * Returns the number of service remote defs where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching service remote defs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCode(String code) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODE;

		Object[] finderArgs = new Object[] { code };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SERVICEREMOTEDEF_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
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

	private static final String _FINDER_COLUMN_CODE_CODE_1 = "serviceRemoteDef.code IS NULL";
	private static final String _FINDER_COLUMN_CODE_CODE_2 = "serviceRemoteDef.code = ?";
	private static final String _FINDER_COLUMN_CODE_CODE_3 = "(serviceRemoteDef.code IS NULL OR serviceRemoteDef.code = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_AUTHID = new FinderPath(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefModelImpl.FINDER_CACHE_ENABLED,
			ServiceRemoteDefImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByAuthId", new String[] { Long.class.getName() },
			ServiceRemoteDefModelImpl.AUTHID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_AUTHID = new FinderPath(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAuthId",
			new String[] { Long.class.getName() });

	/**
	 * Returns the service remote def where authId = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceRemoteDefException} if it could not be found.
	 *
	 * @param authId the auth ID
	 * @return the matching service remote def
	 * @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a matching service remote def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef findByAuthId(long authId)
		throws NoSuchServiceRemoteDefException, SystemException {
		ServiceRemoteDef serviceRemoteDef = fetchByAuthId(authId);

		if (serviceRemoteDef == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("authId=");
			msg.append(authId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchServiceRemoteDefException(msg.toString());
		}

		return serviceRemoteDef;
	}

	/**
	 * Returns the service remote def where authId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param authId the auth ID
	 * @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef fetchByAuthId(long authId)
		throws SystemException {
		return fetchByAuthId(authId, true);
	}

	/**
	 * Returns the service remote def where authId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param authId the auth ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching service remote def, or <code>null</code> if a matching service remote def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef fetchByAuthId(long authId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { authId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_AUTHID,
					finderArgs, this);
		}

		if (result instanceof ServiceRemoteDef) {
			ServiceRemoteDef serviceRemoteDef = (ServiceRemoteDef)result;

			if ((authId != serviceRemoteDef.getAuthId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SERVICEREMOTEDEF_WHERE);

			query.append(_FINDER_COLUMN_AUTHID_AUTHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(authId);

				List<ServiceRemoteDef> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AUTHID,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"ServiceRemoteDefPersistenceImpl.fetchByAuthId(long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					ServiceRemoteDef serviceRemoteDef = list.get(0);

					result = serviceRemoteDef;

					cacheResult(serviceRemoteDef);

					if ((serviceRemoteDef.getAuthId() != authId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AUTHID,
							finderArgs, serviceRemoteDef);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_AUTHID,
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
			return (ServiceRemoteDef)result;
		}
	}

	/**
	 * Removes the service remote def where authId = &#63; from the database.
	 *
	 * @param authId the auth ID
	 * @return the service remote def that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef removeByAuthId(long authId)
		throws NoSuchServiceRemoteDefException, SystemException {
		ServiceRemoteDef serviceRemoteDef = findByAuthId(authId);

		return remove(serviceRemoteDef);
	}

	/**
	 * Returns the number of service remote defs where authId = &#63;.
	 *
	 * @param authId the auth ID
	 * @return the number of matching service remote defs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByAuthId(long authId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_AUTHID;

		Object[] finderArgs = new Object[] { authId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SERVICEREMOTEDEF_WHERE);

			query.append(_FINDER_COLUMN_AUTHID_AUTHID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(authId);

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

	private static final String _FINDER_COLUMN_AUTHID_AUTHID_2 = "serviceRemoteDef.authId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TAGID = new FinderPath(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefModelImpl.FINDER_CACHE_ENABLED,
			ServiceRemoteDefImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByTagId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGID = new FinderPath(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefModelImpl.FINDER_CACHE_ENABLED,
			ServiceRemoteDefImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTagId",
			new String[] { Long.class.getName() },
			ServiceRemoteDefModelImpl.TAGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAGID = new FinderPath(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTagId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the service remote defs where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @return the matching service remote defs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceRemoteDef> findByTagId(long tagId)
		throws SystemException {
		return findByTagId(tagId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ServiceRemoteDef> findByTagId(long tagId, int start, int end)
		throws SystemException {
		return findByTagId(tagId, start, end, null);
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
	@Override
	public List<ServiceRemoteDef> findByTagId(long tagId, int start, int end,
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

		List<ServiceRemoteDef> list = (List<ServiceRemoteDef>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ServiceRemoteDef serviceRemoteDef : list) {
				if ((tagId != serviceRemoteDef.getTagId())) {
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

			query.append(_SQL_SELECT_SERVICEREMOTEDEF_WHERE);

			query.append(_FINDER_COLUMN_TAGID_TAGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ServiceRemoteDefModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tagId);

				if (!pagination) {
					list = (List<ServiceRemoteDef>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceRemoteDef>(list);
				}
				else {
					list = (List<ServiceRemoteDef>)QueryUtil.list(q,
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
	 * Returns the first service remote def in the ordered set where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service remote def
	 * @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a matching service remote def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef findByTagId_First(long tagId,
		OrderByComparator orderByComparator)
		throws NoSuchServiceRemoteDefException, SystemException {
		ServiceRemoteDef serviceRemoteDef = fetchByTagId_First(tagId,
				orderByComparator);

		if (serviceRemoteDef != null) {
			return serviceRemoteDef;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tagId=");
		msg.append(tagId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceRemoteDefException(msg.toString());
	}

	/**
	 * Returns the first service remote def in the ordered set where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching service remote def, or <code>null</code> if a matching service remote def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef fetchByTagId_First(long tagId,
		OrderByComparator orderByComparator) throws SystemException {
		List<ServiceRemoteDef> list = findByTagId(tagId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ServiceRemoteDef findByTagId_Last(long tagId,
		OrderByComparator orderByComparator)
		throws NoSuchServiceRemoteDefException, SystemException {
		ServiceRemoteDef serviceRemoteDef = fetchByTagId_Last(tagId,
				orderByComparator);

		if (serviceRemoteDef != null) {
			return serviceRemoteDef;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tagId=");
		msg.append(tagId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServiceRemoteDefException(msg.toString());
	}

	/**
	 * Returns the last service remote def in the ordered set where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching service remote def, or <code>null</code> if a matching service remote def could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef fetchByTagId_Last(long tagId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByTagId(tagId);

		if (count == 0) {
			return null;
		}

		List<ServiceRemoteDef> list = findByTagId(tagId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ServiceRemoteDef[] findByTagId_PrevAndNext(long remoteId,
		long tagId, OrderByComparator orderByComparator)
		throws NoSuchServiceRemoteDefException, SystemException {
		ServiceRemoteDef serviceRemoteDef = findByPrimaryKey(remoteId);

		Session session = null;

		try {
			session = openSession();

			ServiceRemoteDef[] array = new ServiceRemoteDefImpl[3];

			array[0] = getByTagId_PrevAndNext(session, serviceRemoteDef, tagId,
					orderByComparator, true);

			array[1] = serviceRemoteDef;

			array[2] = getByTagId_PrevAndNext(session, serviceRemoteDef, tagId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ServiceRemoteDef getByTagId_PrevAndNext(Session session,
		ServiceRemoteDef serviceRemoteDef, long tagId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SERVICEREMOTEDEF_WHERE);

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
			query.append(ServiceRemoteDefModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tagId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(serviceRemoteDef);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ServiceRemoteDef> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the service remote defs where tagId = &#63; from the database.
	 *
	 * @param tagId the tag ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByTagId(long tagId) throws SystemException {
		for (ServiceRemoteDef serviceRemoteDef : findByTagId(tagId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(serviceRemoteDef);
		}
	}

	/**
	 * Returns the number of service remote defs where tagId = &#63;.
	 *
	 * @param tagId the tag ID
	 * @return the number of matching service remote defs
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

			query.append(_SQL_COUNT_SERVICEREMOTEDEF_WHERE);

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

	private static final String _FINDER_COLUMN_TAGID_TAGID_2 = "serviceRemoteDef.tagId = ?";

	public ServiceRemoteDefPersistenceImpl() {
		setModelClass(ServiceRemoteDef.class);
	}

	/**
	 * Caches the service remote def in the entity cache if it is enabled.
	 *
	 * @param serviceRemoteDef the service remote def
	 */
	@Override
	public void cacheResult(ServiceRemoteDef serviceRemoteDef) {
		EntityCacheUtil.putResult(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefImpl.class, serviceRemoteDef.getPrimaryKey(),
			serviceRemoteDef);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
			new Object[] { serviceRemoteDef.getCode() }, serviceRemoteDef);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AUTHID,
			new Object[] { serviceRemoteDef.getAuthId() }, serviceRemoteDef);

		serviceRemoteDef.resetOriginalValues();
	}

	/**
	 * Caches the service remote defs in the entity cache if it is enabled.
	 *
	 * @param serviceRemoteDefs the service remote defs
	 */
	@Override
	public void cacheResult(List<ServiceRemoteDef> serviceRemoteDefs) {
		for (ServiceRemoteDef serviceRemoteDef : serviceRemoteDefs) {
			if (EntityCacheUtil.getResult(
						ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
						ServiceRemoteDefImpl.class,
						serviceRemoteDef.getPrimaryKey()) == null) {
				cacheResult(serviceRemoteDef);
			}
			else {
				serviceRemoteDef.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service remote defs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceRemoteDefImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceRemoteDefImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service remote def.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServiceRemoteDef serviceRemoteDef) {
		EntityCacheUtil.removeResult(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefImpl.class, serviceRemoteDef.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(serviceRemoteDef);
	}

	@Override
	public void clearCache(List<ServiceRemoteDef> serviceRemoteDefs) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServiceRemoteDef serviceRemoteDef : serviceRemoteDefs) {
			EntityCacheUtil.removeResult(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
				ServiceRemoteDefImpl.class, serviceRemoteDef.getPrimaryKey());

			clearUniqueFindersCache(serviceRemoteDef);
		}
	}

	protected void cacheUniqueFindersCache(ServiceRemoteDef serviceRemoteDef) {
		if (serviceRemoteDef.isNew()) {
			Object[] args = new Object[] { serviceRemoteDef.getCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args,
				serviceRemoteDef);

			args = new Object[] { serviceRemoteDef.getAuthId() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_AUTHID, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AUTHID, args,
				serviceRemoteDef);
		}
		else {
			ServiceRemoteDefModelImpl serviceRemoteDefModelImpl = (ServiceRemoteDefModelImpl)serviceRemoteDef;

			if ((serviceRemoteDefModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { serviceRemoteDef.getCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args,
					serviceRemoteDef);
			}

			if ((serviceRemoteDefModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_AUTHID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { serviceRemoteDef.getAuthId() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_AUTHID, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_AUTHID, args,
					serviceRemoteDef);
			}
		}
	}

	protected void clearUniqueFindersCache(ServiceRemoteDef serviceRemoteDef) {
		ServiceRemoteDefModelImpl serviceRemoteDefModelImpl = (ServiceRemoteDefModelImpl)serviceRemoteDef;

		Object[] args = new Object[] { serviceRemoteDef.getCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);

		if ((serviceRemoteDefModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
			args = new Object[] { serviceRemoteDefModelImpl.getOriginalCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);
		}

		args = new Object[] { serviceRemoteDef.getAuthId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUTHID, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_AUTHID, args);

		if ((serviceRemoteDefModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_AUTHID.getColumnBitmask()) != 0) {
			args = new Object[] { serviceRemoteDefModelImpl.getOriginalAuthId() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_AUTHID, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_AUTHID, args);
		}
	}

	/**
	 * Creates a new service remote def with the primary key. Does not add the service remote def to the database.
	 *
	 * @param remoteId the primary key for the new service remote def
	 * @return the new service remote def
	 */
	@Override
	public ServiceRemoteDef create(long remoteId) {
		ServiceRemoteDef serviceRemoteDef = new ServiceRemoteDefImpl();

		serviceRemoteDef.setNew(true);
		serviceRemoteDef.setPrimaryKey(remoteId);

		return serviceRemoteDef;
	}

	/**
	 * Removes the service remote def with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param remoteId the primary key of the service remote def
	 * @return the service remote def that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a service remote def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef remove(long remoteId)
		throws NoSuchServiceRemoteDefException, SystemException {
		return remove((Serializable)remoteId);
	}

	/**
	 * Removes the service remote def with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service remote def
	 * @return the service remote def that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a service remote def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef remove(Serializable primaryKey)
		throws NoSuchServiceRemoteDefException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServiceRemoteDef serviceRemoteDef = (ServiceRemoteDef)session.get(ServiceRemoteDefImpl.class,
					primaryKey);

			if (serviceRemoteDef == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceRemoteDefException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(serviceRemoteDef);
		}
		catch (NoSuchServiceRemoteDefException nsee) {
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
	protected ServiceRemoteDef removeImpl(ServiceRemoteDef serviceRemoteDef)
		throws SystemException {
		serviceRemoteDef = toUnwrappedModel(serviceRemoteDef);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(serviceRemoteDef)) {
				serviceRemoteDef = (ServiceRemoteDef)session.get(ServiceRemoteDefImpl.class,
						serviceRemoteDef.getPrimaryKeyObj());
			}

			if (serviceRemoteDef != null) {
				session.delete(serviceRemoteDef);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (serviceRemoteDef != null) {
			clearCache(serviceRemoteDef);
		}

		return serviceRemoteDef;
	}

	@Override
	public ServiceRemoteDef updateImpl(
		com.liferay.portal.ext.model.ServiceRemoteDef serviceRemoteDef)
		throws SystemException {
		serviceRemoteDef = toUnwrappedModel(serviceRemoteDef);

		boolean isNew = serviceRemoteDef.isNew();

		ServiceRemoteDefModelImpl serviceRemoteDefModelImpl = (ServiceRemoteDefModelImpl)serviceRemoteDef;

		Session session = null;

		try {
			session = openSession();

			if (serviceRemoteDef.isNew()) {
				session.save(serviceRemoteDef);

				serviceRemoteDef.setNew(false);
			}
			else {
				session.merge(serviceRemoteDef);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ServiceRemoteDefModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((serviceRemoteDefModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						serviceRemoteDefModelImpl.getOriginalTagId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAGID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGID,
					args);

				args = new Object[] { serviceRemoteDefModelImpl.getTagId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAGID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TAGID,
					args);
			}
		}

		EntityCacheUtil.putResult(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
			ServiceRemoteDefImpl.class, serviceRemoteDef.getPrimaryKey(),
			serviceRemoteDef);

		clearUniqueFindersCache(serviceRemoteDef);
		cacheUniqueFindersCache(serviceRemoteDef);

		return serviceRemoteDef;
	}

	protected ServiceRemoteDef toUnwrappedModel(
		ServiceRemoteDef serviceRemoteDef) {
		if (serviceRemoteDef instanceof ServiceRemoteDefImpl) {
			return serviceRemoteDef;
		}

		ServiceRemoteDefImpl serviceRemoteDefImpl = new ServiceRemoteDefImpl();

		serviceRemoteDefImpl.setNew(serviceRemoteDef.isNew());
		serviceRemoteDefImpl.setPrimaryKey(serviceRemoteDef.getPrimaryKey());

		serviceRemoteDefImpl.setRemoteId(serviceRemoteDef.getRemoteId());
		serviceRemoteDefImpl.setCode(serviceRemoteDef.getCode());
		serviceRemoteDefImpl.setUserId(serviceRemoteDef.getUserId());
		serviceRemoteDefImpl.setUserName(serviceRemoteDef.getUserName());
		serviceRemoteDefImpl.setCreateDate(serviceRemoteDef.getCreateDate());
		serviceRemoteDefImpl.setModifiedDate(serviceRemoteDef.getModifiedDate());
		serviceRemoteDefImpl.setTagId(serviceRemoteDef.getTagId());
		serviceRemoteDefImpl.setHost(serviceRemoteDef.getHost());
		serviceRemoteDefImpl.setPath(serviceRemoteDef.getPath());
		serviceRemoteDefImpl.setHttpMethod(serviceRemoteDef.getHttpMethod());
		serviceRemoteDefImpl.setRawString(serviceRemoteDef.getRawString());
		serviceRemoteDefImpl.setDescription(serviceRemoteDef.getDescription());
		serviceRemoteDefImpl.setDeprecated(serviceRemoteDef.isDeprecated());
		serviceRemoteDefImpl.setSendWithCookies(serviceRemoteDef.isSendWithCookies());
		serviceRemoteDefImpl.setCookieDomain(serviceRemoteDef.getCookieDomain());
		serviceRemoteDefImpl.setCookiePath(serviceRemoteDef.getCookiePath());
		serviceRemoteDefImpl.setScriptParameter(serviceRemoteDef.getScriptParameter());
		serviceRemoteDefImpl.setScriptHeader(serviceRemoteDef.getScriptHeader());
		serviceRemoteDefImpl.setScriptResponse(serviceRemoteDef.getScriptResponse());
		serviceRemoteDefImpl.setCacheLiveTime(serviceRemoteDef.getCacheLiveTime());
		serviceRemoteDefImpl.setAuthId(serviceRemoteDef.getAuthId());

		return serviceRemoteDefImpl;
	}

	/**
	 * Returns the service remote def with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service remote def
	 * @return the service remote def
	 * @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a service remote def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceRemoteDefException, SystemException {
		ServiceRemoteDef serviceRemoteDef = fetchByPrimaryKey(primaryKey);

		if (serviceRemoteDef == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceRemoteDefException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return serviceRemoteDef;
	}

	/**
	 * Returns the service remote def with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceRemoteDefException} if it could not be found.
	 *
	 * @param remoteId the primary key of the service remote def
	 * @return the service remote def
	 * @throws com.liferay.portal.ext.NoSuchServiceRemoteDefException if a service remote def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef findByPrimaryKey(long remoteId)
		throws NoSuchServiceRemoteDefException, SystemException {
		return findByPrimaryKey((Serializable)remoteId);
	}

	/**
	 * Returns the service remote def with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service remote def
	 * @return the service remote def, or <code>null</code> if a service remote def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServiceRemoteDef serviceRemoteDef = (ServiceRemoteDef)EntityCacheUtil.getResult(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
				ServiceRemoteDefImpl.class, primaryKey);

		if (serviceRemoteDef == _nullServiceRemoteDef) {
			return null;
		}

		if (serviceRemoteDef == null) {
			Session session = null;

			try {
				session = openSession();

				serviceRemoteDef = (ServiceRemoteDef)session.get(ServiceRemoteDefImpl.class,
						primaryKey);

				if (serviceRemoteDef != null) {
					cacheResult(serviceRemoteDef);
				}
				else {
					EntityCacheUtil.putResult(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
						ServiceRemoteDefImpl.class, primaryKey,
						_nullServiceRemoteDef);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceRemoteDefModelImpl.ENTITY_CACHE_ENABLED,
					ServiceRemoteDefImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return serviceRemoteDef;
	}

	/**
	 * Returns the service remote def with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param remoteId the primary key of the service remote def
	 * @return the service remote def, or <code>null</code> if a service remote def with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceRemoteDef fetchByPrimaryKey(long remoteId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)remoteId);
	}

	/**
	 * Returns all the service remote defs.
	 *
	 * @return the service remote defs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceRemoteDef> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ServiceRemoteDef> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<ServiceRemoteDef> findAll(int start, int end,
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

		List<ServiceRemoteDef> list = (List<ServiceRemoteDef>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICEREMOTEDEF);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICEREMOTEDEF;

				if (pagination) {
					sql = sql.concat(ServiceRemoteDefModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServiceRemoteDef>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceRemoteDef>(list);
				}
				else {
					list = (List<ServiceRemoteDef>)QueryUtil.list(q,
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
	 * Removes all the service remote defs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServiceRemoteDef serviceRemoteDef : findAll()) {
			remove(serviceRemoteDef);
		}
	}

	/**
	 * Returns the number of service remote defs.
	 *
	 * @return the number of service remote defs
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

				Query q = session.createQuery(_SQL_COUNT_SERVICEREMOTEDEF);

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
	 * Initializes the service remote def persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.portal.util.PropsUtil.get(
						"value.object.listener.com.liferay.portal.ext.model.ServiceRemoteDef")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServiceRemoteDef>> listenersList = new ArrayList<ModelListener<ServiceRemoteDef>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServiceRemoteDef>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ServiceRemoteDefImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICEREMOTEDEF = "SELECT serviceRemoteDef FROM ServiceRemoteDef serviceRemoteDef";
	private static final String _SQL_SELECT_SERVICEREMOTEDEF_WHERE = "SELECT serviceRemoteDef FROM ServiceRemoteDef serviceRemoteDef WHERE ";
	private static final String _SQL_COUNT_SERVICEREMOTEDEF = "SELECT COUNT(serviceRemoteDef) FROM ServiceRemoteDef serviceRemoteDef";
	private static final String _SQL_COUNT_SERVICEREMOTEDEF_WHERE = "SELECT COUNT(serviceRemoteDef) FROM ServiceRemoteDef serviceRemoteDef WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "serviceRemoteDef.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServiceRemoteDef exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ServiceRemoteDef exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
	private static Log _log = LogFactoryUtil.getLog(ServiceRemoteDefPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"code", "host", "path"
			});
	private static ServiceRemoteDef _nullServiceRemoteDef = new ServiceRemoteDefImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServiceRemoteDef> toCacheModel() {
				return _nullServiceRemoteDefCacheModel;
			}
		};

	private static CacheModel<ServiceRemoteDef> _nullServiceRemoteDefCacheModel = new CacheModel<ServiceRemoteDef>() {
			@Override
			public ServiceRemoteDef toEntityModel() {
				return _nullServiceRemoteDef;
			}
		};
}