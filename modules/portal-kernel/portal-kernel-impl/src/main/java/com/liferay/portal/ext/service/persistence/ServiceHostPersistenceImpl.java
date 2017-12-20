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

import com.liferay.portal.ext.NoSuchServiceHostException;
import com.liferay.portal.ext.model.ServiceHost;
import com.liferay.portal.ext.model.impl.ServiceHostImpl;
import com.liferay.portal.ext.model.impl.ServiceHostModelImpl;
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
 * The persistence implementation for the service host service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceHostPersistence
 * @see ServiceHostUtil
 * @generated
 */
public class ServiceHostPersistenceImpl extends BasePersistenceImpl<ServiceHost>
	implements ServiceHostPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceHostUtil} to access the service host persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceHostImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHostModelImpl.FINDER_CACHE_ENABLED, ServiceHostImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHostModelImpl.FINDER_CACHE_ENABLED, ServiceHostImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHostModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CODE = new FinderPath(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHostModelImpl.FINDER_CACHE_ENABLED, ServiceHostImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByCode",
			new String[] { String.class.getName() },
			ServiceHostModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODE = new FinderPath(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHostModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the service host where code = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceHostException} if it could not be found.
	 *
	 * @param code the code
	 * @return the matching service host
	 * @throws com.liferay.portal.ext.NoSuchServiceHostException if a matching service host could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHost findByCode(String code)
		throws NoSuchServiceHostException, SystemException {
		ServiceHost serviceHost = fetchByCode(code);

		if (serviceHost == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("code=");
			msg.append(code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchServiceHostException(msg.toString());
		}

		return serviceHost;
	}

	/**
	 * Returns the service host where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param code the code
	 * @return the matching service host, or <code>null</code> if a matching service host could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHost fetchByCode(String code) throws SystemException {
		return fetchByCode(code, true);
	}

	/**
	 * Returns the service host where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param code the code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching service host, or <code>null</code> if a matching service host could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHost fetchByCode(String code, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { code };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODE,
					finderArgs, this);
		}

		if (result instanceof ServiceHost) {
			ServiceHost serviceHost = (ServiceHost)result;

			if (!Validator.equals(code, serviceHost.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SERVICEHOST_WHERE);

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

				List<ServiceHost> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
						finderArgs, list);
				}
				else {
					ServiceHost serviceHost = list.get(0);

					result = serviceHost;

					cacheResult(serviceHost);

					if ((serviceHost.getCode() == null) ||
							!serviceHost.getCode().equals(code)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
							finderArgs, serviceHost);
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
			return (ServiceHost)result;
		}
	}

	/**
	 * Removes the service host where code = &#63; from the database.
	 *
	 * @param code the code
	 * @return the service host that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHost removeByCode(String code)
		throws NoSuchServiceHostException, SystemException {
		ServiceHost serviceHost = findByCode(code);

		return remove(serviceHost);
	}

	/**
	 * Returns the number of service hosts where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching service hosts
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

			query.append(_SQL_COUNT_SERVICEHOST_WHERE);

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

	private static final String _FINDER_COLUMN_CODE_CODE_1 = "serviceHost.code IS NULL";
	private static final String _FINDER_COLUMN_CODE_CODE_2 = "serviceHost.code = ?";
	private static final String _FINDER_COLUMN_CODE_CODE_3 = "(serviceHost.code IS NULL OR serviceHost.code = '')";

	public ServiceHostPersistenceImpl() {
		setModelClass(ServiceHost.class);
	}

	/**
	 * Caches the service host in the entity cache if it is enabled.
	 *
	 * @param serviceHost the service host
	 */
	@Override
	public void cacheResult(ServiceHost serviceHost) {
		EntityCacheUtil.putResult(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHostImpl.class, serviceHost.getPrimaryKey(), serviceHost);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
			new Object[] { serviceHost.getCode() }, serviceHost);

		serviceHost.resetOriginalValues();
	}

	/**
	 * Caches the service hosts in the entity cache if it is enabled.
	 *
	 * @param serviceHosts the service hosts
	 */
	@Override
	public void cacheResult(List<ServiceHost> serviceHosts) {
		for (ServiceHost serviceHost : serviceHosts) {
			if (EntityCacheUtil.getResult(
						ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
						ServiceHostImpl.class, serviceHost.getPrimaryKey()) == null) {
				cacheResult(serviceHost);
			}
			else {
				serviceHost.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service hosts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceHostImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceHostImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service host.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServiceHost serviceHost) {
		EntityCacheUtil.removeResult(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHostImpl.class, serviceHost.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(serviceHost);
	}

	@Override
	public void clearCache(List<ServiceHost> serviceHosts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServiceHost serviceHost : serviceHosts) {
			EntityCacheUtil.removeResult(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
				ServiceHostImpl.class, serviceHost.getPrimaryKey());

			clearUniqueFindersCache(serviceHost);
		}
	}

	protected void cacheUniqueFindersCache(ServiceHost serviceHost) {
		if (serviceHost.isNew()) {
			Object[] args = new Object[] { serviceHost.getCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args,
				serviceHost);
		}
		else {
			ServiceHostModelImpl serviceHostModelImpl = (ServiceHostModelImpl)serviceHost;

			if ((serviceHostModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { serviceHost.getCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args,
					serviceHost);
			}
		}
	}

	protected void clearUniqueFindersCache(ServiceHost serviceHost) {
		ServiceHostModelImpl serviceHostModelImpl = (ServiceHostModelImpl)serviceHost;

		Object[] args = new Object[] { serviceHost.getCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);

		if ((serviceHostModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
			args = new Object[] { serviceHostModelImpl.getOriginalCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);
		}
	}

	/**
	 * Creates a new service host with the primary key. Does not add the service host to the database.
	 *
	 * @param hostId the primary key for the new service host
	 * @return the new service host
	 */
	@Override
	public ServiceHost create(long hostId) {
		ServiceHost serviceHost = new ServiceHostImpl();

		serviceHost.setNew(true);
		serviceHost.setPrimaryKey(hostId);

		return serviceHost;
	}

	/**
	 * Removes the service host with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hostId the primary key of the service host
	 * @return the service host that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceHostException if a service host with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHost remove(long hostId)
		throws NoSuchServiceHostException, SystemException {
		return remove((Serializable)hostId);
	}

	/**
	 * Removes the service host with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service host
	 * @return the service host that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceHostException if a service host with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHost remove(Serializable primaryKey)
		throws NoSuchServiceHostException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServiceHost serviceHost = (ServiceHost)session.get(ServiceHostImpl.class,
					primaryKey);

			if (serviceHost == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceHostException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(serviceHost);
		}
		catch (NoSuchServiceHostException nsee) {
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
	protected ServiceHost removeImpl(ServiceHost serviceHost)
		throws SystemException {
		serviceHost = toUnwrappedModel(serviceHost);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(serviceHost)) {
				serviceHost = (ServiceHost)session.get(ServiceHostImpl.class,
						serviceHost.getPrimaryKeyObj());
			}

			if (serviceHost != null) {
				session.delete(serviceHost);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (serviceHost != null) {
			clearCache(serviceHost);
		}

		return serviceHost;
	}

	@Override
	public ServiceHost updateImpl(
		com.liferay.portal.ext.model.ServiceHost serviceHost)
		throws SystemException {
		serviceHost = toUnwrappedModel(serviceHost);

		boolean isNew = serviceHost.isNew();

		Session session = null;

		try {
			session = openSession();

			if (serviceHost.isNew()) {
				session.save(serviceHost);

				serviceHost.setNew(false);
			}
			else {
				session.merge(serviceHost);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ServiceHostModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
			ServiceHostImpl.class, serviceHost.getPrimaryKey(), serviceHost);

		clearUniqueFindersCache(serviceHost);
		cacheUniqueFindersCache(serviceHost);

		return serviceHost;
	}

	protected ServiceHost toUnwrappedModel(ServiceHost serviceHost) {
		if (serviceHost instanceof ServiceHostImpl) {
			return serviceHost;
		}

		ServiceHostImpl serviceHostImpl = new ServiceHostImpl();

		serviceHostImpl.setNew(serviceHost.isNew());
		serviceHostImpl.setPrimaryKey(serviceHost.getPrimaryKey());

		serviceHostImpl.setHostId(serviceHost.getHostId());
		serviceHostImpl.setCode(serviceHost.getCode());
		serviceHostImpl.setUserId(serviceHost.getUserId());
		serviceHostImpl.setUserName(serviceHost.getUserName());
		serviceHostImpl.setCreateDate(serviceHost.getCreateDate());
		serviceHostImpl.setModifiedDate(serviceHost.getModifiedDate());
		serviceHostImpl.setAddress(serviceHost.getAddress());
		serviceHostImpl.setProtocol(serviceHost.getProtocol());
		serviceHostImpl.setPort(serviceHost.getPort());
		serviceHostImpl.setProxyHost(serviceHost.getProxyHost());
		serviceHostImpl.setProxyPort(serviceHost.getProxyPort());
		serviceHostImpl.setProxyUserName(serviceHost.getProxyUserName());
		serviceHostImpl.setProxyPassword(serviceHost.getProxyPassword());
		serviceHostImpl.setProxyAuthType(serviceHost.getProxyAuthType());
		serviceHostImpl.setCacheResponse(serviceHost.isCacheResponse());
		serviceHostImpl.setMaxConnectionsPerHost(serviceHost.getMaxConnectionsPerHost());
		serviceHostImpl.setTimeout(serviceHost.getTimeout());
		serviceHostImpl.setSessionCookieUseFullHostName(serviceHost.isSessionCookieUseFullHostName());

		return serviceHostImpl;
	}

	/**
	 * Returns the service host with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service host
	 * @return the service host
	 * @throws com.liferay.portal.ext.NoSuchServiceHostException if a service host with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHost findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceHostException, SystemException {
		ServiceHost serviceHost = fetchByPrimaryKey(primaryKey);

		if (serviceHost == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceHostException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return serviceHost;
	}

	/**
	 * Returns the service host with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceHostException} if it could not be found.
	 *
	 * @param hostId the primary key of the service host
	 * @return the service host
	 * @throws com.liferay.portal.ext.NoSuchServiceHostException if a service host with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHost findByPrimaryKey(long hostId)
		throws NoSuchServiceHostException, SystemException {
		return findByPrimaryKey((Serializable)hostId);
	}

	/**
	 * Returns the service host with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service host
	 * @return the service host, or <code>null</code> if a service host with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHost fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServiceHost serviceHost = (ServiceHost)EntityCacheUtil.getResult(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
				ServiceHostImpl.class, primaryKey);

		if (serviceHost == _nullServiceHost) {
			return null;
		}

		if (serviceHost == null) {
			Session session = null;

			try {
				session = openSession();

				serviceHost = (ServiceHost)session.get(ServiceHostImpl.class,
						primaryKey);

				if (serviceHost != null) {
					cacheResult(serviceHost);
				}
				else {
					EntityCacheUtil.putResult(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
						ServiceHostImpl.class, primaryKey, _nullServiceHost);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceHostModelImpl.ENTITY_CACHE_ENABLED,
					ServiceHostImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return serviceHost;
	}

	/**
	 * Returns the service host with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hostId the primary key of the service host
	 * @return the service host, or <code>null</code> if a service host with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceHost fetchByPrimaryKey(long hostId) throws SystemException {
		return fetchByPrimaryKey((Serializable)hostId);
	}

	/**
	 * Returns all the service hosts.
	 *
	 * @return the service hosts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceHost> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service hosts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service hosts
	 * @param end the upper bound of the range of service hosts (not inclusive)
	 * @return the range of service hosts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceHost> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the service hosts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceHostModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service hosts
	 * @param end the upper bound of the range of service hosts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of service hosts
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceHost> findAll(int start, int end,
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

		List<ServiceHost> list = (List<ServiceHost>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICEHOST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICEHOST;

				if (pagination) {
					sql = sql.concat(ServiceHostModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServiceHost>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceHost>(list);
				}
				else {
					list = (List<ServiceHost>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the service hosts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServiceHost serviceHost : findAll()) {
			remove(serviceHost);
		}
	}

	/**
	 * Returns the number of service hosts.
	 *
	 * @return the number of service hosts
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

				Query q = session.createQuery(_SQL_COUNT_SERVICEHOST);

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
	 * Initializes the service host persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.portal.util.PropsUtil.get(
						"value.object.listener.com.liferay.portal.ext.model.ServiceHost")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServiceHost>> listenersList = new ArrayList<ModelListener<ServiceHost>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServiceHost>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ServiceHostImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICEHOST = "SELECT serviceHost FROM ServiceHost serviceHost";
	private static final String _SQL_SELECT_SERVICEHOST_WHERE = "SELECT serviceHost FROM ServiceHost serviceHost WHERE ";
	private static final String _SQL_COUNT_SERVICEHOST = "SELECT COUNT(serviceHost) FROM ServiceHost serviceHost";
	private static final String _SQL_COUNT_SERVICEHOST_WHERE = "SELECT COUNT(serviceHost) FROM ServiceHost serviceHost WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "serviceHost.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServiceHost exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ServiceHost exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
	private static Log _log = LogFactoryUtil.getLog(ServiceHostPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"code", "protocol", "port", "sessionCookieUseFullHostName"
			});
	private static ServiceHost _nullServiceHost = new ServiceHostImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServiceHost> toCacheModel() {
				return _nullServiceHostCacheModel;
			}
		};

	private static CacheModel<ServiceHost> _nullServiceHostCacheModel = new CacheModel<ServiceHost>() {
			@Override
			public ServiceHost toEntityModel() {
				return _nullServiceHost;
			}
		};
}