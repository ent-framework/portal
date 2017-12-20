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

import com.liferay.portal.ext.NoSuchServiceTagException;
import com.liferay.portal.ext.model.ServiceTag;
import com.liferay.portal.ext.model.impl.ServiceTagImpl;
import com.liferay.portal.ext.model.impl.ServiceTagModelImpl;
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
 * The persistence implementation for the service tag service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceTagPersistence
 * @see ServiceTagUtil
 * @generated
 */
public class ServiceTagPersistenceImpl extends BasePersistenceImpl<ServiceTag>
	implements ServiceTagPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceTagUtil} to access the service tag persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceTagImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
			ServiceTagModelImpl.FINDER_CACHE_ENABLED, ServiceTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
			ServiceTagModelImpl.FINDER_CACHE_ENABLED, ServiceTagImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
			ServiceTagModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_TAGNAME = new FinderPath(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
			ServiceTagModelImpl.FINDER_CACHE_ENABLED, ServiceTagImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByTagName",
			new String[] { String.class.getName() },
			ServiceTagModelImpl.TAGNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TAGNAME = new FinderPath(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
			ServiceTagModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTagName",
			new String[] { String.class.getName() });

	/**
	 * Returns the service tag where tagName = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceTagException} if it could not be found.
	 *
	 * @param tagName the tag name
	 * @return the matching service tag
	 * @throws com.liferay.portal.ext.NoSuchServiceTagException if a matching service tag could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceTag findByTagName(String tagName)
		throws NoSuchServiceTagException, SystemException {
		ServiceTag serviceTag = fetchByTagName(tagName);

		if (serviceTag == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("tagName=");
			msg.append(tagName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchServiceTagException(msg.toString());
		}

		return serviceTag;
	}

	/**
	 * Returns the service tag where tagName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tagName the tag name
	 * @return the matching service tag, or <code>null</code> if a matching service tag could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceTag fetchByTagName(String tagName) throws SystemException {
		return fetchByTagName(tagName, true);
	}

	/**
	 * Returns the service tag where tagName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tagName the tag name
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching service tag, or <code>null</code> if a matching service tag could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceTag fetchByTagName(String tagName, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { tagName };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_TAGNAME,
					finderArgs, this);
		}

		if (result instanceof ServiceTag) {
			ServiceTag serviceTag = (ServiceTag)result;

			if (!Validator.equals(tagName, serviceTag.getTagName())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SERVICETAG_WHERE);

			boolean bindTagName = false;

			if (tagName == null) {
				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_1);
			}
			else if (tagName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_3);
			}
			else {
				bindTagName = true;

				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTagName) {
					qPos.add(tagName);
				}

				List<ServiceTag> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TAGNAME,
						finderArgs, list);
				}
				else {
					ServiceTag serviceTag = list.get(0);

					result = serviceTag;

					cacheResult(serviceTag);

					if ((serviceTag.getTagName() == null) ||
							!serviceTag.getTagName().equals(tagName)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TAGNAME,
							finderArgs, serviceTag);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TAGNAME,
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
			return (ServiceTag)result;
		}
	}

	/**
	 * Removes the service tag where tagName = &#63; from the database.
	 *
	 * @param tagName the tag name
	 * @return the service tag that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceTag removeByTagName(String tagName)
		throws NoSuchServiceTagException, SystemException {
		ServiceTag serviceTag = findByTagName(tagName);

		return remove(serviceTag);
	}

	/**
	 * Returns the number of service tags where tagName = &#63;.
	 *
	 * @param tagName the tag name
	 * @return the number of matching service tags
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByTagName(String tagName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TAGNAME;

		Object[] finderArgs = new Object[] { tagName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SERVICETAG_WHERE);

			boolean bindTagName = false;

			if (tagName == null) {
				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_1);
			}
			else if (tagName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_3);
			}
			else {
				bindTagName = true;

				query.append(_FINDER_COLUMN_TAGNAME_TAGNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindTagName) {
					qPos.add(tagName);
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

	private static final String _FINDER_COLUMN_TAGNAME_TAGNAME_1 = "serviceTag.tagName IS NULL";
	private static final String _FINDER_COLUMN_TAGNAME_TAGNAME_2 = "serviceTag.tagName = ?";
	private static final String _FINDER_COLUMN_TAGNAME_TAGNAME_3 = "(serviceTag.tagName IS NULL OR serviceTag.tagName = '')";

	public ServiceTagPersistenceImpl() {
		setModelClass(ServiceTag.class);
	}

	/**
	 * Caches the service tag in the entity cache if it is enabled.
	 *
	 * @param serviceTag the service tag
	 */
	@Override
	public void cacheResult(ServiceTag serviceTag) {
		EntityCacheUtil.putResult(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
			ServiceTagImpl.class, serviceTag.getPrimaryKey(), serviceTag);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TAGNAME,
			new Object[] { serviceTag.getTagName() }, serviceTag);

		serviceTag.resetOriginalValues();
	}

	/**
	 * Caches the service tags in the entity cache if it is enabled.
	 *
	 * @param serviceTags the service tags
	 */
	@Override
	public void cacheResult(List<ServiceTag> serviceTags) {
		for (ServiceTag serviceTag : serviceTags) {
			if (EntityCacheUtil.getResult(
						ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
						ServiceTagImpl.class, serviceTag.getPrimaryKey()) == null) {
				cacheResult(serviceTag);
			}
			else {
				serviceTag.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service tags.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceTagImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceTagImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service tag.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServiceTag serviceTag) {
		EntityCacheUtil.removeResult(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
			ServiceTagImpl.class, serviceTag.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(serviceTag);
	}

	@Override
	public void clearCache(List<ServiceTag> serviceTags) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServiceTag serviceTag : serviceTags) {
			EntityCacheUtil.removeResult(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
				ServiceTagImpl.class, serviceTag.getPrimaryKey());

			clearUniqueFindersCache(serviceTag);
		}
	}

	protected void cacheUniqueFindersCache(ServiceTag serviceTag) {
		if (serviceTag.isNew()) {
			Object[] args = new Object[] { serviceTag.getTagName() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TAGNAME, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TAGNAME, args,
				serviceTag);
		}
		else {
			ServiceTagModelImpl serviceTagModelImpl = (ServiceTagModelImpl)serviceTag;

			if ((serviceTagModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_TAGNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { serviceTag.getTagName() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TAGNAME, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_TAGNAME, args,
					serviceTag);
			}
		}
	}

	protected void clearUniqueFindersCache(ServiceTag serviceTag) {
		ServiceTagModelImpl serviceTagModelImpl = (ServiceTagModelImpl)serviceTag;

		Object[] args = new Object[] { serviceTag.getTagName() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAGNAME, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TAGNAME, args);

		if ((serviceTagModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_TAGNAME.getColumnBitmask()) != 0) {
			args = new Object[] { serviceTagModelImpl.getOriginalTagName() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TAGNAME, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_TAGNAME, args);
		}
	}

	/**
	 * Creates a new service tag with the primary key. Does not add the service tag to the database.
	 *
	 * @param tagId the primary key for the new service tag
	 * @return the new service tag
	 */
	@Override
	public ServiceTag create(long tagId) {
		ServiceTag serviceTag = new ServiceTagImpl();

		serviceTag.setNew(true);
		serviceTag.setPrimaryKey(tagId);

		return serviceTag;
	}

	/**
	 * Removes the service tag with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tagId the primary key of the service tag
	 * @return the service tag that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceTagException if a service tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceTag remove(long tagId)
		throws NoSuchServiceTagException, SystemException {
		return remove((Serializable)tagId);
	}

	/**
	 * Removes the service tag with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service tag
	 * @return the service tag that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceTagException if a service tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceTag remove(Serializable primaryKey)
		throws NoSuchServiceTagException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServiceTag serviceTag = (ServiceTag)session.get(ServiceTagImpl.class,
					primaryKey);

			if (serviceTag == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceTagException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(serviceTag);
		}
		catch (NoSuchServiceTagException nsee) {
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
	protected ServiceTag removeImpl(ServiceTag serviceTag)
		throws SystemException {
		serviceTag = toUnwrappedModel(serviceTag);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(serviceTag)) {
				serviceTag = (ServiceTag)session.get(ServiceTagImpl.class,
						serviceTag.getPrimaryKeyObj());
			}

			if (serviceTag != null) {
				session.delete(serviceTag);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (serviceTag != null) {
			clearCache(serviceTag);
		}

		return serviceTag;
	}

	@Override
	public ServiceTag updateImpl(
		com.liferay.portal.ext.model.ServiceTag serviceTag)
		throws SystemException {
		serviceTag = toUnwrappedModel(serviceTag);

		boolean isNew = serviceTag.isNew();

		Session session = null;

		try {
			session = openSession();

			if (serviceTag.isNew()) {
				session.save(serviceTag);

				serviceTag.setNew(false);
			}
			else {
				session.merge(serviceTag);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ServiceTagModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
			ServiceTagImpl.class, serviceTag.getPrimaryKey(), serviceTag);

		clearUniqueFindersCache(serviceTag);
		cacheUniqueFindersCache(serviceTag);

		return serviceTag;
	}

	protected ServiceTag toUnwrappedModel(ServiceTag serviceTag) {
		if (serviceTag instanceof ServiceTagImpl) {
			return serviceTag;
		}

		ServiceTagImpl serviceTagImpl = new ServiceTagImpl();

		serviceTagImpl.setNew(serviceTag.isNew());
		serviceTagImpl.setPrimaryKey(serviceTag.getPrimaryKey());

		serviceTagImpl.setTagId(serviceTag.getTagId());
		serviceTagImpl.setUserId(serviceTag.getUserId());
		serviceTagImpl.setUserName(serviceTag.getUserName());
		serviceTagImpl.setCreateDate(serviceTag.getCreateDate());
		serviceTagImpl.setModifiedDate(serviceTag.getModifiedDate());
		serviceTagImpl.setTagName(serviceTag.getTagName());

		return serviceTagImpl;
	}

	/**
	 * Returns the service tag with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service tag
	 * @return the service tag
	 * @throws com.liferay.portal.ext.NoSuchServiceTagException if a service tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceTag findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceTagException, SystemException {
		ServiceTag serviceTag = fetchByPrimaryKey(primaryKey);

		if (serviceTag == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceTagException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return serviceTag;
	}

	/**
	 * Returns the service tag with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceTagException} if it could not be found.
	 *
	 * @param tagId the primary key of the service tag
	 * @return the service tag
	 * @throws com.liferay.portal.ext.NoSuchServiceTagException if a service tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceTag findByPrimaryKey(long tagId)
		throws NoSuchServiceTagException, SystemException {
		return findByPrimaryKey((Serializable)tagId);
	}

	/**
	 * Returns the service tag with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service tag
	 * @return the service tag, or <code>null</code> if a service tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceTag fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServiceTag serviceTag = (ServiceTag)EntityCacheUtil.getResult(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
				ServiceTagImpl.class, primaryKey);

		if (serviceTag == _nullServiceTag) {
			return null;
		}

		if (serviceTag == null) {
			Session session = null;

			try {
				session = openSession();

				serviceTag = (ServiceTag)session.get(ServiceTagImpl.class,
						primaryKey);

				if (serviceTag != null) {
					cacheResult(serviceTag);
				}
				else {
					EntityCacheUtil.putResult(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
						ServiceTagImpl.class, primaryKey, _nullServiceTag);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceTagModelImpl.ENTITY_CACHE_ENABLED,
					ServiceTagImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return serviceTag;
	}

	/**
	 * Returns the service tag with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tagId the primary key of the service tag
	 * @return the service tag, or <code>null</code> if a service tag with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceTag fetchByPrimaryKey(long tagId) throws SystemException {
		return fetchByPrimaryKey((Serializable)tagId);
	}

	/**
	 * Returns all the service tags.
	 *
	 * @return the service tags
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceTag> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ServiceTag> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<ServiceTag> findAll(int start, int end,
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

		List<ServiceTag> list = (List<ServiceTag>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICETAG);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICETAG;

				if (pagination) {
					sql = sql.concat(ServiceTagModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServiceTag>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceTag>(list);
				}
				else {
					list = (List<ServiceTag>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the service tags from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServiceTag serviceTag : findAll()) {
			remove(serviceTag);
		}
	}

	/**
	 * Returns the number of service tags.
	 *
	 * @return the number of service tags
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

				Query q = session.createQuery(_SQL_COUNT_SERVICETAG);

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
	 * Initializes the service tag persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.portal.util.PropsUtil.get(
						"value.object.listener.com.liferay.portal.ext.model.ServiceTag")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServiceTag>> listenersList = new ArrayList<ModelListener<ServiceTag>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServiceTag>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ServiceTagImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICETAG = "SELECT serviceTag FROM ServiceTag serviceTag";
	private static final String _SQL_SELECT_SERVICETAG_WHERE = "SELECT serviceTag FROM ServiceTag serviceTag WHERE ";
	private static final String _SQL_COUNT_SERVICETAG = "SELECT COUNT(serviceTag) FROM ServiceTag serviceTag";
	private static final String _SQL_COUNT_SERVICETAG_WHERE = "SELECT COUNT(serviceTag) FROM ServiceTag serviceTag WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "serviceTag.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServiceTag exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ServiceTag exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
	private static Log _log = LogFactoryUtil.getLog(ServiceTagPersistenceImpl.class);
	private static ServiceTag _nullServiceTag = new ServiceTagImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServiceTag> toCacheModel() {
				return _nullServiceTagCacheModel;
			}
		};

	private static CacheModel<ServiceTag> _nullServiceTagCacheModel = new CacheModel<ServiceTag>() {
			@Override
			public ServiceTag toEntityModel() {
				return _nullServiceTag;
			}
		};
}