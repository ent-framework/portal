package com.liferay.mail.service.persistence;

import com.liferay.mail.NoSuchCyrusUserException;
import com.liferay.mail.model.CyrusUser;
import com.liferay.mail.model.impl.CyrusUserImpl;
import com.liferay.mail.model.impl.CyrusUserModelImpl;
import com.liferay.mail.service.persistence.CyrusUserPersistence;

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
import com.liferay.portal.kernel.util.SetUtil;
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
import java.util.Set;

/**
 * The persistence implementation for the cyrus user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CyrusUserPersistence
 * @see CyrusUserUtil
 * @generated
 */
public class CyrusUserPersistenceImpl extends BasePersistenceImpl<CyrusUser>
    implements CyrusUserPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CyrusUserUtil} to access the cyrus user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CyrusUserImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CyrusUserModelImpl.ENTITY_CACHE_ENABLED,
            CyrusUserModelImpl.FINDER_CACHE_ENABLED, CyrusUserImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CyrusUserModelImpl.ENTITY_CACHE_ENABLED,
            CyrusUserModelImpl.FINDER_CACHE_ENABLED, CyrusUserImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CyrusUserModelImpl.ENTITY_CACHE_ENABLED,
            CyrusUserModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_CYRUSUSER = "SELECT cyrusUser FROM CyrusUser cyrusUser";
    private static final String _SQL_COUNT_CYRUSUSER = "SELECT COUNT(cyrusUser) FROM CyrusUser cyrusUser";
    private static final String _ORDER_BY_ENTITY_ALIAS = "cyrusUser.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CyrusUser exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
    private static final Logger _log = LoggerFactory.getLogger(CyrusUserPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "password"
            });
    private static CyrusUser _nullCyrusUser = new CyrusUserImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<CyrusUser> toCacheModel() {
                return _nullCyrusUserCacheModel;
            }
        };

    private static CacheModel<CyrusUser> _nullCyrusUserCacheModel = new CacheModel<CyrusUser>() {
            @Override
            public CyrusUser toEntityModel() {
                return _nullCyrusUser;
            }
        };

    public CyrusUserPersistenceImpl() {
        setModelClass(CyrusUser.class);
    }

    /**
     * Caches the cyrus user in the entity cache if it is enabled.
     *
     * @param cyrusUser the cyrus user
     */
    @Override
    public void cacheResult(CyrusUser cyrusUser) {
        EntityCacheUtil.putResult(CyrusUserModelImpl.ENTITY_CACHE_ENABLED,
            CyrusUserImpl.class, cyrusUser.getPrimaryKey(), cyrusUser);

        cyrusUser.resetOriginalValues();
    }

    /**
     * Caches the cyrus users in the entity cache if it is enabled.
     *
     * @param cyrusUsers the cyrus users
     */
    @Override
    public void cacheResult(List<CyrusUser> cyrusUsers) {
        for (CyrusUser cyrusUser : cyrusUsers) {
            if (EntityCacheUtil.getResult(
                        CyrusUserModelImpl.ENTITY_CACHE_ENABLED,
                        CyrusUserImpl.class, cyrusUser.getPrimaryKey()) == null) {
                cacheResult(cyrusUser);
            } else {
                cyrusUser.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all cyrus users.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CyrusUserImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CyrusUserImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the cyrus user.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(CyrusUser cyrusUser) {
        EntityCacheUtil.removeResult(CyrusUserModelImpl.ENTITY_CACHE_ENABLED,
            CyrusUserImpl.class, cyrusUser.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<CyrusUser> cyrusUsers) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (CyrusUser cyrusUser : cyrusUsers) {
            EntityCacheUtil.removeResult(CyrusUserModelImpl.ENTITY_CACHE_ENABLED,
                CyrusUserImpl.class, cyrusUser.getPrimaryKey());
        }
    }

    /**
     * Creates a new cyrus user with the primary key. Does not add the cyrus user to the database.
     *
     * @param userId the primary key for the new cyrus user
     * @return the new cyrus user
     */
    @Override
    public CyrusUser create(String userId) {
        CyrusUser cyrusUser = new CyrusUserImpl();

        cyrusUser.setNew(true);
        cyrusUser.setPrimaryKey(userId);

        return cyrusUser;
    }

    /**
     * Removes the cyrus user with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param userId the primary key of the cyrus user
     * @return the cyrus user that was removed
     * @throws com.liferay.mail.NoSuchCyrusUserException if a cyrus user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusUser remove(String userId)
        throws NoSuchCyrusUserException, SystemException {
        return remove((Serializable) userId);
    }

    /**
     * Removes the cyrus user with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the cyrus user
     * @return the cyrus user that was removed
     * @throws com.liferay.mail.NoSuchCyrusUserException if a cyrus user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusUser remove(Serializable primaryKey)
        throws NoSuchCyrusUserException, SystemException {
        Session session = null;

        try {
            session = openSession();

            CyrusUser cyrusUser = (CyrusUser) session.get(CyrusUserImpl.class,
                    primaryKey);

            if (cyrusUser == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCyrusUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(cyrusUser);
        } catch (NoSuchCyrusUserException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected CyrusUser removeImpl(CyrusUser cyrusUser)
        throws SystemException {
        cyrusUser = toUnwrappedModel(cyrusUser);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(cyrusUser)) {
                cyrusUser = (CyrusUser) session.get(CyrusUserImpl.class,
                        cyrusUser.getPrimaryKeyObj());
            }

            if (cyrusUser != null) {
                session.delete(cyrusUser);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (cyrusUser != null) {
            clearCache(cyrusUser);
        }

        return cyrusUser;
    }

    @Override
    public CyrusUser updateImpl(com.liferay.mail.model.CyrusUser cyrusUser)
        throws SystemException {
        cyrusUser = toUnwrappedModel(cyrusUser);

        boolean isNew = cyrusUser.isNew();

        Session session = null;

        try {
            session = openSession();

            if (cyrusUser.isNew()) {
                session.save(cyrusUser);

                cyrusUser.setNew(false);
            } else {
                session.merge(cyrusUser);
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

        EntityCacheUtil.putResult(CyrusUserModelImpl.ENTITY_CACHE_ENABLED,
            CyrusUserImpl.class, cyrusUser.getPrimaryKey(), cyrusUser);

        return cyrusUser;
    }

    protected CyrusUser toUnwrappedModel(CyrusUser cyrusUser) {
        if (cyrusUser instanceof CyrusUserImpl) {
            return cyrusUser;
        }

        CyrusUserImpl cyrusUserImpl = new CyrusUserImpl();

        cyrusUserImpl.setNew(cyrusUser.isNew());
        cyrusUserImpl.setPrimaryKey(cyrusUser.getPrimaryKey());

        cyrusUserImpl.setUserId(cyrusUser.getUserId());
        cyrusUserImpl.setPassword(cyrusUser.getPassword());

        return cyrusUserImpl;
    }

    /**
     * Returns the cyrus user with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the cyrus user
     * @return the cyrus user
     * @throws com.liferay.mail.NoSuchCyrusUserException if a cyrus user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusUser findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCyrusUserException, SystemException {
        CyrusUser cyrusUser = fetchByPrimaryKey(primaryKey);

        if (cyrusUser == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCyrusUserException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return cyrusUser;
    }

    /**
     * Returns the cyrus user with the primary key or throws a {@link com.liferay.mail.NoSuchCyrusUserException} if it could not be found.
     *
     * @param userId the primary key of the cyrus user
     * @return the cyrus user
     * @throws com.liferay.mail.NoSuchCyrusUserException if a cyrus user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusUser findByPrimaryKey(String userId)
        throws NoSuchCyrusUserException, SystemException {
        return findByPrimaryKey((Serializable) userId);
    }

    /**
     * Returns the cyrus user with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the cyrus user
     * @return the cyrus user, or <code>null</code> if a cyrus user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusUser fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        CyrusUser cyrusUser = (CyrusUser) EntityCacheUtil.getResult(CyrusUserModelImpl.ENTITY_CACHE_ENABLED,
                CyrusUserImpl.class, primaryKey);

        if (cyrusUser == _nullCyrusUser) {
            return null;
        }

        if (cyrusUser == null) {
            Session session = null;

            try {
                session = openSession();

                cyrusUser = (CyrusUser) session.get(CyrusUserImpl.class,
                        primaryKey);

                if (cyrusUser != null) {
                    cacheResult(cyrusUser);
                } else {
                    EntityCacheUtil.putResult(CyrusUserModelImpl.ENTITY_CACHE_ENABLED,
                        CyrusUserImpl.class, primaryKey, _nullCyrusUser);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CyrusUserModelImpl.ENTITY_CACHE_ENABLED,
                    CyrusUserImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return cyrusUser;
    }

    /**
     * Returns the cyrus user with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param userId the primary key of the cyrus user
     * @return the cyrus user, or <code>null</code> if a cyrus user with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CyrusUser fetchByPrimaryKey(String userId) throws SystemException {
        return fetchByPrimaryKey((Serializable) userId);
    }

    /**
     * Returns all the cyrus users.
     *
     * @return the cyrus users
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CyrusUser> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the cyrus users.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mail.model.impl.CyrusUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of cyrus users
     * @param end the upper bound of the range of cyrus users (not inclusive)
     * @return the range of cyrus users
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CyrusUser> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the cyrus users.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mail.model.impl.CyrusUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of cyrus users
     * @param end the upper bound of the range of cyrus users (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of cyrus users
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CyrusUser> findAll(int start, int end,
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

        List<CyrusUser> list = (List<CyrusUser>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CYRUSUSER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CYRUSUSER;

                if (pagination) {
                    sql = sql.concat(CyrusUserModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<CyrusUser>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CyrusUser>(list);
                } else {
                    list = (List<CyrusUser>) QueryUtil.list(q, getDialect(),
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
     * Removes all the cyrus users from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (CyrusUser cyrusUser : findAll()) {
            remove(cyrusUser);
        }
    }

    /**
     * Returns the number of cyrus users.
     *
     * @return the number of cyrus users
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

                Query q = session.createQuery(_SQL_COUNT_CYRUSUSER);

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

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the cyrus user persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.portal.util.PropsUtil.get(
                        "value.object.listener.com.liferay.mail.model.CyrusUser")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<CyrusUser>> listenersList = new ArrayList<ModelListener<CyrusUser>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<CyrusUser>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e.getMessage());
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CyrusUserImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
