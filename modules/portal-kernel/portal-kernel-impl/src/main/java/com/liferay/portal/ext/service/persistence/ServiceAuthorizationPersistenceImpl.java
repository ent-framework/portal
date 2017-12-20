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

import com.liferay.portal.ext.NoSuchServiceAuthorizationException;
import com.liferay.portal.ext.model.ServiceAuthorization;
import com.liferay.portal.ext.model.impl.ServiceAuthorizationImpl;
import com.liferay.portal.ext.model.impl.ServiceAuthorizationModelImpl;
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
 * The persistence implementation for the service authorization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ServiceAuthorizationPersistence
 * @see ServiceAuthorizationUtil
 * @generated
 */
public class ServiceAuthorizationPersistenceImpl extends BasePersistenceImpl<ServiceAuthorization>
	implements ServiceAuthorizationPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServiceAuthorizationUtil} to access the service authorization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServiceAuthorizationImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
			ServiceAuthorizationModelImpl.FINDER_CACHE_ENABLED,
			ServiceAuthorizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
			ServiceAuthorizationModelImpl.FINDER_CACHE_ENABLED,
			ServiceAuthorizationImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
			ServiceAuthorizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_CODE = new FinderPath(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
			ServiceAuthorizationModelImpl.FINDER_CACHE_ENABLED,
			ServiceAuthorizationImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByCode", new String[] { String.class.getName() },
			ServiceAuthorizationModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODE = new FinderPath(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
			ServiceAuthorizationModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the service authorization where code = &#63; or throws a {@link com.liferay.portal.ext.NoSuchServiceAuthorizationException} if it could not be found.
	 *
	 * @param code the code
	 * @return the matching service authorization
	 * @throws com.liferay.portal.ext.NoSuchServiceAuthorizationException if a matching service authorization could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceAuthorization findByCode(String code)
		throws NoSuchServiceAuthorizationException, SystemException {
		ServiceAuthorization serviceAuthorization = fetchByCode(code);

		if (serviceAuthorization == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("code=");
			msg.append(code);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchServiceAuthorizationException(msg.toString());
		}

		return serviceAuthorization;
	}

	/**
	 * Returns the service authorization where code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param code the code
	 * @return the matching service authorization, or <code>null</code> if a matching service authorization could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceAuthorization fetchByCode(String code)
		throws SystemException {
		return fetchByCode(code, true);
	}

	/**
	 * Returns the service authorization where code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param code the code
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching service authorization, or <code>null</code> if a matching service authorization could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceAuthorization fetchByCode(String code,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { code };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CODE,
					finderArgs, this);
		}

		if (result instanceof ServiceAuthorization) {
			ServiceAuthorization serviceAuthorization = (ServiceAuthorization)result;

			if (!Validator.equals(code, serviceAuthorization.getCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_SERVICEAUTHORIZATION_WHERE);

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

				List<ServiceAuthorization> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
						finderArgs, list);
				}
				else {
					ServiceAuthorization serviceAuthorization = list.get(0);

					result = serviceAuthorization;

					cacheResult(serviceAuthorization);

					if ((serviceAuthorization.getCode() == null) ||
							!serviceAuthorization.getCode().equals(code)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
							finderArgs, serviceAuthorization);
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
			return (ServiceAuthorization)result;
		}
	}

	/**
	 * Removes the service authorization where code = &#63; from the database.
	 *
	 * @param code the code
	 * @return the service authorization that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceAuthorization removeByCode(String code)
		throws NoSuchServiceAuthorizationException, SystemException {
		ServiceAuthorization serviceAuthorization = findByCode(code);

		return remove(serviceAuthorization);
	}

	/**
	 * Returns the number of service authorizations where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching service authorizations
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

			query.append(_SQL_COUNT_SERVICEAUTHORIZATION_WHERE);

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

	private static final String _FINDER_COLUMN_CODE_CODE_1 = "serviceAuthorization.code IS NULL";
	private static final String _FINDER_COLUMN_CODE_CODE_2 = "serviceAuthorization.code = ?";
	private static final String _FINDER_COLUMN_CODE_CODE_3 = "(serviceAuthorization.code IS NULL OR serviceAuthorization.code = '')";

	public ServiceAuthorizationPersistenceImpl() {
		setModelClass(ServiceAuthorization.class);
	}

	/**
	 * Caches the service authorization in the entity cache if it is enabled.
	 *
	 * @param serviceAuthorization the service authorization
	 */
	@Override
	public void cacheResult(ServiceAuthorization serviceAuthorization) {
		EntityCacheUtil.putResult(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
			ServiceAuthorizationImpl.class,
			serviceAuthorization.getPrimaryKey(), serviceAuthorization);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE,
			new Object[] { serviceAuthorization.getCode() },
			serviceAuthorization);

		serviceAuthorization.resetOriginalValues();
	}

	/**
	 * Caches the service authorizations in the entity cache if it is enabled.
	 *
	 * @param serviceAuthorizations the service authorizations
	 */
	@Override
	public void cacheResult(List<ServiceAuthorization> serviceAuthorizations) {
		for (ServiceAuthorization serviceAuthorization : serviceAuthorizations) {
			if (EntityCacheUtil.getResult(
						ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
						ServiceAuthorizationImpl.class,
						serviceAuthorization.getPrimaryKey()) == null) {
				cacheResult(serviceAuthorization);
			}
			else {
				serviceAuthorization.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all service authorizations.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ServiceAuthorizationImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ServiceAuthorizationImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the service authorization.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ServiceAuthorization serviceAuthorization) {
		EntityCacheUtil.removeResult(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
			ServiceAuthorizationImpl.class, serviceAuthorization.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(serviceAuthorization);
	}

	@Override
	public void clearCache(List<ServiceAuthorization> serviceAuthorizations) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ServiceAuthorization serviceAuthorization : serviceAuthorizations) {
			EntityCacheUtil.removeResult(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
				ServiceAuthorizationImpl.class,
				serviceAuthorization.getPrimaryKey());

			clearUniqueFindersCache(serviceAuthorization);
		}
	}

	protected void cacheUniqueFindersCache(
		ServiceAuthorization serviceAuthorization) {
		if (serviceAuthorization.isNew()) {
			Object[] args = new Object[] { serviceAuthorization.getCode() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args,
				serviceAuthorization);
		}
		else {
			ServiceAuthorizationModelImpl serviceAuthorizationModelImpl = (ServiceAuthorizationModelImpl)serviceAuthorization;

			if ((serviceAuthorizationModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { serviceAuthorization.getCode() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CODE, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CODE, args,
					serviceAuthorization);
			}
		}
	}

	protected void clearUniqueFindersCache(
		ServiceAuthorization serviceAuthorization) {
		ServiceAuthorizationModelImpl serviceAuthorizationModelImpl = (ServiceAuthorizationModelImpl)serviceAuthorization;

		Object[] args = new Object[] { serviceAuthorization.getCode() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);

		if ((serviceAuthorizationModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CODE.getColumnBitmask()) != 0) {
			args = new Object[] { serviceAuthorizationModelImpl.getOriginalCode() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CODE, args);
		}
	}

	/**
	 * Creates a new service authorization with the primary key. Does not add the service authorization to the database.
	 *
	 * @param authId the primary key for the new service authorization
	 * @return the new service authorization
	 */
	@Override
	public ServiceAuthorization create(long authId) {
		ServiceAuthorization serviceAuthorization = new ServiceAuthorizationImpl();

		serviceAuthorization.setNew(true);
		serviceAuthorization.setPrimaryKey(authId);

		return serviceAuthorization;
	}

	/**
	 * Removes the service authorization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param authId the primary key of the service authorization
	 * @return the service authorization that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceAuthorizationException if a service authorization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceAuthorization remove(long authId)
		throws NoSuchServiceAuthorizationException, SystemException {
		return remove((Serializable)authId);
	}

	/**
	 * Removes the service authorization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the service authorization
	 * @return the service authorization that was removed
	 * @throws com.liferay.portal.ext.NoSuchServiceAuthorizationException if a service authorization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceAuthorization remove(Serializable primaryKey)
		throws NoSuchServiceAuthorizationException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ServiceAuthorization serviceAuthorization = (ServiceAuthorization)session.get(ServiceAuthorizationImpl.class,
					primaryKey);

			if (serviceAuthorization == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServiceAuthorizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(serviceAuthorization);
		}
		catch (NoSuchServiceAuthorizationException nsee) {
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
	protected ServiceAuthorization removeImpl(
		ServiceAuthorization serviceAuthorization) throws SystemException {
		serviceAuthorization = toUnwrappedModel(serviceAuthorization);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(serviceAuthorization)) {
				serviceAuthorization = (ServiceAuthorization)session.get(ServiceAuthorizationImpl.class,
						serviceAuthorization.getPrimaryKeyObj());
			}

			if (serviceAuthorization != null) {
				session.delete(serviceAuthorization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (serviceAuthorization != null) {
			clearCache(serviceAuthorization);
		}

		return serviceAuthorization;
	}

	@Override
	public ServiceAuthorization updateImpl(
		com.liferay.portal.ext.model.ServiceAuthorization serviceAuthorization)
		throws SystemException {
		serviceAuthorization = toUnwrappedModel(serviceAuthorization);

		boolean isNew = serviceAuthorization.isNew();

		Session session = null;

		try {
			session = openSession();

			if (serviceAuthorization.isNew()) {
				session.save(serviceAuthorization);

				serviceAuthorization.setNew(false);
			}
			else {
				session.merge(serviceAuthorization);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ServiceAuthorizationModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
			ServiceAuthorizationImpl.class,
			serviceAuthorization.getPrimaryKey(), serviceAuthorization);

		clearUniqueFindersCache(serviceAuthorization);
		cacheUniqueFindersCache(serviceAuthorization);

		return serviceAuthorization;
	}

	protected ServiceAuthorization toUnwrappedModel(
		ServiceAuthorization serviceAuthorization) {
		if (serviceAuthorization instanceof ServiceAuthorizationImpl) {
			return serviceAuthorization;
		}

		ServiceAuthorizationImpl serviceAuthorizationImpl = new ServiceAuthorizationImpl();

		serviceAuthorizationImpl.setNew(serviceAuthorization.isNew());
		serviceAuthorizationImpl.setPrimaryKey(serviceAuthorization.getPrimaryKey());

		serviceAuthorizationImpl.setAuthId(serviceAuthorization.getAuthId());
		serviceAuthorizationImpl.setCode(serviceAuthorization.getCode());
		serviceAuthorizationImpl.setUserId(serviceAuthorization.getUserId());
		serviceAuthorizationImpl.setUserName(serviceAuthorization.getUserName());
		serviceAuthorizationImpl.setCreateDate(serviceAuthorization.getCreateDate());
		serviceAuthorizationImpl.setModifiedDate(serviceAuthorization.getModifiedDate());
		serviceAuthorizationImpl.setClassNameId(serviceAuthorization.getClassNameId());
		serviceAuthorizationImpl.setClassPK(serviceAuthorization.getClassPK());
		serviceAuthorizationImpl.setType(serviceAuthorization.getType());
		serviceAuthorizationImpl.setTemplate(serviceAuthorization.getTemplate());

		return serviceAuthorizationImpl;
	}

	/**
	 * Returns the service authorization with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the service authorization
	 * @return the service authorization
	 * @throws com.liferay.portal.ext.NoSuchServiceAuthorizationException if a service authorization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceAuthorization findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServiceAuthorizationException, SystemException {
		ServiceAuthorization serviceAuthorization = fetchByPrimaryKey(primaryKey);

		if (serviceAuthorization == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServiceAuthorizationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return serviceAuthorization;
	}

	/**
	 * Returns the service authorization with the primary key or throws a {@link com.liferay.portal.ext.NoSuchServiceAuthorizationException} if it could not be found.
	 *
	 * @param authId the primary key of the service authorization
	 * @return the service authorization
	 * @throws com.liferay.portal.ext.NoSuchServiceAuthorizationException if a service authorization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceAuthorization findByPrimaryKey(long authId)
		throws NoSuchServiceAuthorizationException, SystemException {
		return findByPrimaryKey((Serializable)authId);
	}

	/**
	 * Returns the service authorization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the service authorization
	 * @return the service authorization, or <code>null</code> if a service authorization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceAuthorization fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ServiceAuthorization serviceAuthorization = (ServiceAuthorization)EntityCacheUtil.getResult(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
				ServiceAuthorizationImpl.class, primaryKey);

		if (serviceAuthorization == _nullServiceAuthorization) {
			return null;
		}

		if (serviceAuthorization == null) {
			Session session = null;

			try {
				session = openSession();

				serviceAuthorization = (ServiceAuthorization)session.get(ServiceAuthorizationImpl.class,
						primaryKey);

				if (serviceAuthorization != null) {
					cacheResult(serviceAuthorization);
				}
				else {
					EntityCacheUtil.putResult(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
						ServiceAuthorizationImpl.class, primaryKey,
						_nullServiceAuthorization);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ServiceAuthorizationModelImpl.ENTITY_CACHE_ENABLED,
					ServiceAuthorizationImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return serviceAuthorization;
	}

	/**
	 * Returns the service authorization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param authId the primary key of the service authorization
	 * @return the service authorization, or <code>null</code> if a service authorization with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ServiceAuthorization fetchByPrimaryKey(long authId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)authId);
	}

	/**
	 * Returns all the service authorizations.
	 *
	 * @return the service authorizations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceAuthorization> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the service authorizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceAuthorizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service authorizations
	 * @param end the upper bound of the range of service authorizations (not inclusive)
	 * @return the range of service authorizations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceAuthorization> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the service authorizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ServiceAuthorizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of service authorizations
	 * @param end the upper bound of the range of service authorizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of service authorizations
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ServiceAuthorization> findAll(int start, int end,
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

		List<ServiceAuthorization> list = (List<ServiceAuthorization>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SERVICEAUTHORIZATION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICEAUTHORIZATION;

				if (pagination) {
					sql = sql.concat(ServiceAuthorizationModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ServiceAuthorization>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ServiceAuthorization>(list);
				}
				else {
					list = (List<ServiceAuthorization>)QueryUtil.list(q,
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
	 * Removes all the service authorizations from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ServiceAuthorization serviceAuthorization : findAll()) {
			remove(serviceAuthorization);
		}
	}

	/**
	 * Returns the number of service authorizations.
	 *
	 * @return the number of service authorizations
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

				Query q = session.createQuery(_SQL_COUNT_SERVICEAUTHORIZATION);

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
	 * Initializes the service authorization persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.portal.util.PropsUtil.get(
						"value.object.listener.com.liferay.portal.ext.model.ServiceAuthorization")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ServiceAuthorization>> listenersList = new ArrayList<ModelListener<ServiceAuthorization>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ServiceAuthorization>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ServiceAuthorizationImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_SERVICEAUTHORIZATION = "SELECT serviceAuthorization FROM ServiceAuthorization serviceAuthorization";
	private static final String _SQL_SELECT_SERVICEAUTHORIZATION_WHERE = "SELECT serviceAuthorization FROM ServiceAuthorization serviceAuthorization WHERE ";
	private static final String _SQL_COUNT_SERVICEAUTHORIZATION = "SELECT COUNT(serviceAuthorization) FROM ServiceAuthorization serviceAuthorization";
	private static final String _SQL_COUNT_SERVICEAUTHORIZATION_WHERE = "SELECT COUNT(serviceAuthorization) FROM ServiceAuthorization serviceAuthorization WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "serviceAuthorization.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ServiceAuthorization exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ServiceAuthorization exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
	private static Log _log = LogFactoryUtil.getLog(ServiceAuthorizationPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"code", "type"
			});
	private static ServiceAuthorization _nullServiceAuthorization = new ServiceAuthorizationImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ServiceAuthorization> toCacheModel() {
				return _nullServiceAuthorizationCacheModel;
			}
		};

	private static CacheModel<ServiceAuthorization> _nullServiceAuthorizationCacheModel =
		new CacheModel<ServiceAuthorization>() {
			@Override
			public ServiceAuthorization toEntityModel() {
				return _nullServiceAuthorization;
			}
		};
}