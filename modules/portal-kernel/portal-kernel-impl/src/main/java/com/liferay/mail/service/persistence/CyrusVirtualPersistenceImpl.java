package com.liferay.mail.service.persistence;

import com.liferay.mail.NoSuchCyrusVirtualException;
import com.liferay.mail.model.CyrusVirtual;
import com.liferay.mail.model.impl.CyrusVirtualImpl;
import com.liferay.mail.model.impl.CyrusVirtualModelImpl;
import com.liferay.mail.service.persistence.CyrusVirtualPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the cyrus virtual service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CyrusVirtualPersistence
 * @see CyrusVirtualUtil
 * @generated
 */
public class CyrusVirtualPersistenceImpl extends BasePersistenceImpl<CyrusVirtual>
    implements CyrusVirtualPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CyrusVirtualUtil} to access the cyrus virtual persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CyrusVirtualImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CyrusVirtualModelImpl.ENTITY_CACHE_ENABLED,
            CyrusVirtualModelImpl.FINDER_CACHE_ENABLED, CyrusVirtualImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CyrusVirtualModelImpl.ENTITY_CACHE_ENABLED,
            CyrusVirtualModelImpl.FINDER_CACHE_ENABLED, CyrusVirtualImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CyrusVirtualModelImpl.ENTITY_CACHE_ENABLED,
            CyrusVirtualModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_CYRUSVIRTUAL = "SELECT cyrusVirtual FROM CyrusVirtual cyrusVirtual";
    private static final String _SQL_COUNT_CYRUSVIRTUAL = "SELECT COUNT(cyrusVirtual) FROM CyrusVirtual cyrusVirtual";
    private static final String _ORDER_BY_ENTITY_ALIAS = "cyrusVirtual.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CyrusVirtual exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
    private static final Logger _log = LoggerFactory.getLogger(CyrusVirtualPersistenceImpl.class);
    private static CyrusVirtual _nullCyrusVirtual = new CyrusVirtualImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<CyrusVirtual> toCacheModel() {
                return _nullCyrusVirtualCacheModel;
            }
        };

    private static CacheModel<CyrusVirtual> _nullCyrusVirtualCacheModel = new CacheModel<CyrusVirtual>() {
            @Override
            public CyrusVirtual toEntityModel() {
                return _nullCyrusVirtual;
            }
        };

    public CyrusVirtualPersistenceImpl() {
        setModelClass(CyrusVirtual.class);
    }

    /**
     * Caches the cyrus virtual in the entity cache if it is enabled.
     *
     * @param cyrusVirtual the cyrus virtual
     */
    @Override
    public void cacheResult(CyrusVirtual cyrusVirtual) {
        EntityCacheUtil.putResult(CyrusVirtualModelImpl.ENTITY_CACHE_ENABLED,
            CyrusVirtualImpl.class, cyrusVirtual.getPrimaryKey(), cyrusVirtual);

        cyrusVirtual.resetOriginalValues();
    }

    /**
     * Caches the cyrus virtuals in the entity cache if it is enabled.
     *
     * @param cyrusVirtuals the cyrus virtuals
     */
    @Override
    public void cacheResult(List<CyrusVirtual> cyrusVirtuals) {
        for (CyrusVirtual cyrusVirtual : cyrusVirtuals) {
            if (EntityCacheUtil.getResult(
                        CyrusVirtualModelImpl.ENTITY_CACHE_ENABLED,
                        CyrusVirtualImpl.class, cyrusVirtual.getPrimaryKey()) == null) {
                cacheResult(cyrusVirtual);
            } else {
                cyrusVirtual.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all cyrus virtuals.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CyrusVirtualImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CyrusVirtualImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the cyrus virtual.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(CyrusVirtual cyrusVirtual) {
        EntityCacheUtil.removeResult(CyrusVirtualModelImpl.ENTITY_CACHE_ENABLED,
            CyrusVirtualImpl.class, cyrusVirtual.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<CyrusVirtual> cyrusVirtuals) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (CyrusVirtual cyrusVirtual : cyrusVirtuals) {
            EntityCacheUtil.removeResult(CyrusVirtualModelImpl.ENTITY_CACHE_ENABLED,
                CyrusVirtualImpl.class, cyrusVirtual.getPrimaryKey());
        }
    }

    /**
     * Creates a new cyrus virtual with the primary key. Does not add the cyrus virtual to the database.
     *
     * @param emailAddress the primary key for the new cyrus virtual
     * @return the new cyrus virtual
     */
    @Override
    public CyrusVirtual create(String emailAddress) {
        CyrusVirtual cyrusVirtual = new CyrusVirtualImpl();

        cyrusVirtual.setNew(true);
        cyrusVirtual.setPrimaryKey(emailAddress);

        return cyrusVirtual;
    }

    /**
     * Removes the cyrus virtual with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param emailAddress the primary key of the cyrus virtual
     * @return the cyrus virtual that was removed
     * @throws com.liferay.mail.NoSuchCyrusVirtualException if a cyrus virtual with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusVirtual remove(String emailAddress)
        throws NoSuchCyrusVirtualException, SystemException {
        return remove((Serializable) emailAddress);
    }

    /**
     * Removes the cyrus virtual with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the cyrus virtual
     * @return the cyrus virtual that was removed
     * @throws com.liferay.mail.NoSuchCyrusVirtualException if a cyrus virtual with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusVirtual remove(Serializable primaryKey)
        throws NoSuchCyrusVirtualException, SystemException {
        Session session = null;

        try {
            session = openSession();

            CyrusVirtual cyrusVirtual = (CyrusVirtual) session.get(CyrusVirtualImpl.class,
                    primaryKey);

            if (cyrusVirtual == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCyrusVirtualException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(cyrusVirtual);
        } catch (NoSuchCyrusVirtualException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected CyrusVirtual removeImpl(CyrusVirtual cyrusVirtual)
        throws SystemException {
        cyrusVirtual = toUnwrappedModel(cyrusVirtual);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(cyrusVirtual)) {
                cyrusVirtual = (CyrusVirtual) session.get(CyrusVirtualImpl.class,
                        cyrusVirtual.getPrimaryKeyObj());
            }

            if (cyrusVirtual != null) {
                session.delete(cyrusVirtual);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (cyrusVirtual != null) {
            clearCache(cyrusVirtual);
        }

        return cyrusVirtual;
    }

    @Override
    public CyrusVirtual updateImpl(
        com.liferay.mail.model.CyrusVirtual cyrusVirtual)
        throws SystemException {
        cyrusVirtual = toUnwrappedModel(cyrusVirtual);

        boolean isNew = cyrusVirtual.isNew();

        Session session = null;

        try {
            session = openSession();

            if (cyrusVirtual.isNew()) {
                session.save(cyrusVirtual);

                cyrusVirtual.setNew(false);
            } else {
                session.merge(cyrusVirtual);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(CyrusVirtualModelImpl.ENTITY_CACHE_ENABLED,
            CyrusVirtualImpl.class, cyrusVirtual.getPrimaryKey(), cyrusVirtual);

        return cyrusVirtual;
    }

    protected CyrusVirtual toUnwrappedModel(CyrusVirtual cyrusVirtual) {
        if (cyrusVirtual instanceof CyrusVirtualImpl) {
            return cyrusVirtual;
        }

        CyrusVirtualImpl cyrusVirtualImpl = new CyrusVirtualImpl();

        cyrusVirtualImpl.setNew(cyrusVirtual.isNew());
        cyrusVirtualImpl.setPrimaryKey(cyrusVirtual.getPrimaryKey());

        cyrusVirtualImpl.setEmailAddress(cyrusVirtual.getEmailAddress());
        cyrusVirtualImpl.setUserId(cyrusVirtual.getUserId());

        return cyrusVirtualImpl;
    }

    /**
     * Returns the cyrus virtual with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the cyrus virtual
     * @return the cyrus virtual
     * @throws com.liferay.mail.NoSuchCyrusVirtualException if a cyrus virtual with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusVirtual findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCyrusVirtualException, SystemException {
        CyrusVirtual cyrusVirtual = fetchByPrimaryKey(primaryKey);

        if (cyrusVirtual == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCyrusVirtualException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return cyrusVirtual;
    }

    /**
     * Returns the cyrus virtual with the primary key or throws a {@link com.liferay.mail.NoSuchCyrusVirtualException} if it could not be found.
     *
     * @param emailAddress the primary key of the cyrus virtual
     * @return the cyrus virtual
     * @throws com.liferay.mail.NoSuchCyrusVirtualException if a cyrus virtual with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusVirtual findByPrimaryKey(String emailAddress)
        throws NoSuchCyrusVirtualException, SystemException {
        return findByPrimaryKey((Serializable) emailAddress);
    }

    /**
     * Returns the cyrus virtual with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the cyrus virtual
     * @return the cyrus virtual, or <code>null</code> if a cyrus virtual with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusVirtual fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        CyrusVirtual cyrusVirtual = (CyrusVirtual) EntityCacheUtil.getResult(CyrusVirtualModelImpl.ENTITY_CACHE_ENABLED,
                CyrusVirtualImpl.class, primaryKey);

        if (cyrusVirtual == _nullCyrusVirtual) {
            return null;
        }

        if (cyrusVirtual == null) {
            Session session = null;

            try {
                session = openSession();

                cyrusVirtual = (CyrusVirtual) session.get(CyrusVirtualImpl.class,
                        primaryKey);

                if (cyrusVirtual != null) {
                    cacheResult(cyrusVirtual);
                } else {
                    EntityCacheUtil.putResult(CyrusVirtualModelImpl.ENTITY_CACHE_ENABLED,
                        CyrusVirtualImpl.class, primaryKey, _nullCyrusVirtual);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CyrusVirtualModelImpl.ENTITY_CACHE_ENABLED,
                    CyrusVirtualImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return cyrusVirtual;
    }

    /**
     * Returns the cyrus virtual with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param emailAddress the primary key of the cyrus virtual
     * @return the cyrus virtual, or <code>null</code> if a cyrus virtual with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusVirtual fetchByPrimaryKey(String emailAddress)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) emailAddress);
    }

    /**
     * Returns all the cyrus virtuals.
     *
     * @return the cyrus virtuals
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CyrusVirtual> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the cyrus virtuals.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mail.model.impl.CyrusVirtualModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of cyrus virtuals
     * @param end the upper bound of the range of cyrus virtuals (not inclusive)
     * @return the range of cyrus virtuals
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CyrusVirtual> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the cyrus virtuals.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mail.model.impl.CyrusVirtualModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of cyrus virtuals
     * @param end the upper bound of the range of cyrus virtuals (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of cyrus virtuals
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CyrusVirtual> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<CyrusVirtual> list = (List<CyrusVirtual>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CYRUSVIRTUAL);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CYRUSVIRTUAL;

                if (pagination) {
                    sql = sql.concat(CyrusVirtualModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<CyrusVirtual>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CyrusVirtual>(list);
                } else {
                    list = (List<CyrusVirtual>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the cyrus virtuals from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (CyrusVirtual cyrusVirtual : findAll()) {
            remove(cyrusVirtual);
        }
    }

    /**
     * Returns the number of cyrus virtuals.
     *
     * @return the number of cyrus virtuals
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_CYRUSVIRTUAL);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the cyrus virtual persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.portal.util.PropsUtil.get(
                        "value.object.listener.com.liferay.mail.model.CyrusVirtual")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<CyrusVirtual>> listenersList = new ArrayList<ModelListener<CyrusVirtual>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<CyrusVirtual>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e.getMessage());
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CyrusVirtualImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
