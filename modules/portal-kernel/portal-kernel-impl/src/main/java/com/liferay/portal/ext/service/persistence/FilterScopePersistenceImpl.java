package com.liferay.portal.ext.service.persistence;

import com.liferay.portal.ext.NoSuchFilterScopeException;
import com.liferay.portal.ext.model.FilterScope;
import com.liferay.portal.ext.model.impl.FilterScopeImpl;
import com.liferay.portal.ext.model.impl.FilterScopeModelImpl;
import com.liferay.portal.ext.service.persistence.FilterScopePersistence;
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
 * The persistence implementation for the filter scope service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see FilterScopePersistence
 * @see FilterScopeUtil
 * @generated
 */
public class FilterScopePersistenceImpl extends BasePersistenceImpl<FilterScope>
    implements FilterScopePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link FilterScopeUtil} to access the filter scope persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = FilterScopeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
            FilterScopeModelImpl.FINDER_CACHE_ENABLED, FilterScopeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
            FilterScopeModelImpl.FINDER_CACHE_ENABLED, FilterScopeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
            FilterScopeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_FETCH_BY_FC = new FinderPath(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
            FilterScopeModelImpl.FINDER_CACHE_ENABLED, FilterScopeImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByFC",
            new String[] { String.class.getName(), String.class.getName() },
            FilterScopeModelImpl.CLASSNAME_COLUMN_BITMASK |
            FilterScopeModelImpl.FILTERNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FC = new FinderPath(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
            FilterScopeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFC",
            new String[] { String.class.getName(), String.class.getName() });
    private static final String _FINDER_COLUMN_FC_CLASSNAME_1 = "filterScope.className IS NULL AND ";
    private static final String _FINDER_COLUMN_FC_CLASSNAME_2 = "filterScope.className = ? AND ";
    private static final String _FINDER_COLUMN_FC_CLASSNAME_3 = "(filterScope.className IS NULL OR filterScope.className = '') AND ";
    private static final String _FINDER_COLUMN_FC_FILTERNAME_1 = "filterScope.filterName IS NULL";
    private static final String _FINDER_COLUMN_FC_FILTERNAME_2 = "filterScope.filterName = ?";
    private static final String _FINDER_COLUMN_FC_FILTERNAME_3 = "(filterScope.filterName IS NULL OR filterScope.filterName = '')";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CLASSNAME =
        new FinderPath(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
            FilterScopeModelImpl.FINDER_CACHE_ENABLED, FilterScopeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByClassName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAME =
        new FinderPath(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
            FilterScopeModelImpl.FINDER_CACHE_ENABLED, FilterScopeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByClassName",
            new String[] { String.class.getName() },
            FilterScopeModelImpl.CLASSNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CLASSNAME = new FinderPath(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
            FilterScopeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByClassName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_CLASSNAME_CLASSNAME_1 = "filterScope.className IS NULL";
    private static final String _FINDER_COLUMN_CLASSNAME_CLASSNAME_2 = "filterScope.className = ?";
    private static final String _FINDER_COLUMN_CLASSNAME_CLASSNAME_3 = "(filterScope.className IS NULL OR filterScope.className = '')";
    private static final String _SQL_SELECT_FILTERSCOPE = "SELECT filterScope FROM FilterScope filterScope";
    private static final String _SQL_SELECT_FILTERSCOPE_WHERE = "SELECT filterScope FROM FilterScope filterScope WHERE ";
    private static final String _SQL_COUNT_FILTERSCOPE = "SELECT COUNT(filterScope) FROM FilterScope filterScope";
    private static final String _SQL_COUNT_FILTERSCOPE_WHERE = "SELECT COUNT(filterScope) FROM FilterScope filterScope WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "filterScope.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FilterScope exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FilterScope exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
    private static Log _log = LogFactoryUtil.getLog(FilterScopePersistenceImpl.class);
    private static FilterScope _nullFilterScope = new FilterScopeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<FilterScope> toCacheModel() {
                return _nullFilterScopeCacheModel;
            }
        };

    private static CacheModel<FilterScope> _nullFilterScopeCacheModel = new CacheModel<FilterScope>() {
            @Override
            public FilterScope toEntityModel() {
                return _nullFilterScope;
            }
        };

    public FilterScopePersistenceImpl() {
        setModelClass(FilterScope.class);
    }

    /**
     * Returns the filter scope where className = &#63; and filterName = &#63; or throws a {@link com.liferay.portal.ext.NoSuchFilterScopeException} if it could not be found.
     *
     * @param className the class name
     * @param filterName the filter name
     * @return the matching filter scope
     * @throws com.liferay.portal.ext.NoSuchFilterScopeException if a matching filter scope could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope findByFC(String className, String filterName)
        throws NoSuchFilterScopeException, SystemException {
        FilterScope filterScope = fetchByFC(className, filterName);

        if (filterScope == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("className=");
            msg.append(className);

            msg.append(", filterName=");
            msg.append(filterName);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchFilterScopeException(msg.toString());
        }

        return filterScope;
    }

    /**
     * Returns the filter scope where className = &#63; and filterName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param className the class name
     * @param filterName the filter name
     * @return the matching filter scope, or <code>null</code> if a matching filter scope could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope fetchByFC(String className, String filterName)
        throws SystemException {
        return fetchByFC(className, filterName, true);
    }

    /**
     * Returns the filter scope where className = &#63; and filterName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param className the class name
     * @param filterName the filter name
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching filter scope, or <code>null</code> if a matching filter scope could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope fetchByFC(String className, String filterName,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { className, filterName };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_FC,
                    finderArgs, this);
        }

        if (result instanceof FilterScope) {
            FilterScope filterScope = (FilterScope) result;

            if (!Validator.equals(className, filterScope.getClassName()) ||
                    !Validator.equals(filterName, filterScope.getFilterName())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_FILTERSCOPE_WHERE);

            boolean bindClassName = false;

            if (className == null) {
                query.append(_FINDER_COLUMN_FC_CLASSNAME_1);
            } else if (className.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FC_CLASSNAME_3);
            } else {
                bindClassName = true;

                query.append(_FINDER_COLUMN_FC_CLASSNAME_2);
            }

            boolean bindFilterName = false;

            if (filterName == null) {
                query.append(_FINDER_COLUMN_FC_FILTERNAME_1);
            } else if (filterName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FC_FILTERNAME_3);
            } else {
                bindFilterName = true;

                query.append(_FINDER_COLUMN_FC_FILTERNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindClassName) {
                    qPos.add(className);
                }

                if (bindFilterName) {
                    qPos.add(filterName);
                }

                List<FilterScope> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FC,
                        finderArgs, list);
                } else {
                    FilterScope filterScope = list.get(0);

                    result = filterScope;

                    cacheResult(filterScope);

                    if ((filterScope.getClassName() == null) ||
                            !filterScope.getClassName().equals(className) ||
                            (filterScope.getFilterName() == null) ||
                            !filterScope.getFilterName().equals(filterName)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FC,
                            finderArgs, filterScope);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FC, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (FilterScope) result;
        }
    }

    /**
     * Removes the filter scope where className = &#63; and filterName = &#63; from the database.
     *
     * @param className the class name
     * @param filterName the filter name
     * @return the filter scope that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope removeByFC(String className, String filterName)
        throws NoSuchFilterScopeException, SystemException {
        FilterScope filterScope = findByFC(className, filterName);

        return remove(filterScope);
    }

    /**
     * Returns the number of filter scopes where className = &#63; and filterName = &#63;.
     *
     * @param className the class name
     * @param filterName the filter name
     * @return the number of matching filter scopes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByFC(String className, String filterName)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FC;

        Object[] finderArgs = new Object[] { className, filterName };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FILTERSCOPE_WHERE);

            boolean bindClassName = false;

            if (className == null) {
                query.append(_FINDER_COLUMN_FC_CLASSNAME_1);
            } else if (className.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FC_CLASSNAME_3);
            } else {
                bindClassName = true;

                query.append(_FINDER_COLUMN_FC_CLASSNAME_2);
            }

            boolean bindFilterName = false;

            if (filterName == null) {
                query.append(_FINDER_COLUMN_FC_FILTERNAME_1);
            } else if (filterName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_FC_FILTERNAME_3);
            } else {
                bindFilterName = true;

                query.append(_FINDER_COLUMN_FC_FILTERNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindClassName) {
                    qPos.add(className);
                }

                if (bindFilterName) {
                    qPos.add(filterName);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the filter scopes where className = &#63;.
     *
     * @param className the class name
     * @return the matching filter scopes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterScope> findByClassName(String className)
        throws SystemException {
        return findByClassName(className, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the filter scopes where className = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterScopeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param className the class name
     * @param start the lower bound of the range of filter scopes
     * @param end the upper bound of the range of filter scopes (not inclusive)
     * @return the range of matching filter scopes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterScope> findByClassName(String className, int start,
        int end) throws SystemException {
        return findByClassName(className, start, end, null);
    }

    /**
     * Returns an ordered range of all the filter scopes where className = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterScopeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param className the class name
     * @param start the lower bound of the range of filter scopes
     * @param end the upper bound of the range of filter scopes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching filter scopes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterScope> findByClassName(String className, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAME;
            finderArgs = new Object[] { className };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CLASSNAME;
            finderArgs = new Object[] { className, start, end, orderByComparator };
        }

        List<FilterScope> list = (List<FilterScope>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (FilterScope filterScope : list) {
                if (!Validator.equals(className, filterScope.getClassName())) {
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
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_FILTERSCOPE_WHERE);

            boolean bindClassName = false;

            if (className == null) {
                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_1);
            } else if (className.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_3);
            } else {
                bindClassName = true;

                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FilterScopeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindClassName) {
                    qPos.add(className);
                }

                if (!pagination) {
                    list = (List<FilterScope>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<FilterScope>(list);
                } else {
                    list = (List<FilterScope>) QueryUtil.list(q, getDialect(),
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
     * Returns the first filter scope in the ordered set where className = &#63;.
     *
     * @param className the class name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching filter scope
     * @throws com.liferay.portal.ext.NoSuchFilterScopeException if a matching filter scope could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope findByClassName_First(String className,
        OrderByComparator orderByComparator)
        throws NoSuchFilterScopeException, SystemException {
        FilterScope filterScope = fetchByClassName_First(className,
                orderByComparator);

        if (filterScope != null) {
            return filterScope;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("className=");
        msg.append(className);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFilterScopeException(msg.toString());
    }

    /**
     * Returns the first filter scope in the ordered set where className = &#63;.
     *
     * @param className the class name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching filter scope, or <code>null</code> if a matching filter scope could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope fetchByClassName_First(String className,
        OrderByComparator orderByComparator) throws SystemException {
        List<FilterScope> list = findByClassName(className, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last filter scope in the ordered set where className = &#63;.
     *
     * @param className the class name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching filter scope
     * @throws com.liferay.portal.ext.NoSuchFilterScopeException if a matching filter scope could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope findByClassName_Last(String className,
        OrderByComparator orderByComparator)
        throws NoSuchFilterScopeException, SystemException {
        FilterScope filterScope = fetchByClassName_Last(className,
                orderByComparator);

        if (filterScope != null) {
            return filterScope;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("className=");
        msg.append(className);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFilterScopeException(msg.toString());
    }

    /**
     * Returns the last filter scope in the ordered set where className = &#63;.
     *
     * @param className the class name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching filter scope, or <code>null</code> if a matching filter scope could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope fetchByClassName_Last(String className,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByClassName(className);

        if (count == 0) {
            return null;
        }

        List<FilterScope> list = findByClassName(className, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the filter scopes before and after the current filter scope in the ordered set where className = &#63;.
     *
     * @param filterScopeId the primary key of the current filter scope
     * @param className the class name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next filter scope
     * @throws com.liferay.portal.ext.NoSuchFilterScopeException if a filter scope with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope[] findByClassName_PrevAndNext(long filterScopeId,
        String className, OrderByComparator orderByComparator)
        throws NoSuchFilterScopeException, SystemException {
        FilterScope filterScope = findByPrimaryKey(filterScopeId);

        Session session = null;

        try {
            session = openSession();

            FilterScope[] array = new FilterScopeImpl[3];

            array[0] = getByClassName_PrevAndNext(session, filterScope,
                    className, orderByComparator, true);

            array[1] = filterScope;

            array[2] = getByClassName_PrevAndNext(session, filterScope,
                    className, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected FilterScope getByClassName_PrevAndNext(Session session,
        FilterScope filterScope, String className,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FILTERSCOPE_WHERE);

        boolean bindClassName = false;

        if (className == null) {
            query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_1);
        } else if (className.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_3);
        } else {
            bindClassName = true;

            query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_2);
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
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
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
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(FilterScopeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindClassName) {
            qPos.add(className);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(filterScope);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<FilterScope> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the filter scopes where className = &#63; from the database.
     *
     * @param className the class name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByClassName(String className) throws SystemException {
        for (FilterScope filterScope : findByClassName(className,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(filterScope);
        }
    }

    /**
     * Returns the number of filter scopes where className = &#63;.
     *
     * @param className the class name
     * @return the number of matching filter scopes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByClassName(String className) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CLASSNAME;

        Object[] finderArgs = new Object[] { className };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FILTERSCOPE_WHERE);

            boolean bindClassName = false;

            if (className == null) {
                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_1);
            } else if (className.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_3);
            } else {
                bindClassName = true;

                query.append(_FINDER_COLUMN_CLASSNAME_CLASSNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindClassName) {
                    qPos.add(className);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the filter scope in the entity cache if it is enabled.
     *
     * @param filterScope the filter scope
     */
    @Override
    public void cacheResult(FilterScope filterScope) {
        EntityCacheUtil.putResult(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
            FilterScopeImpl.class, filterScope.getPrimaryKey(), filterScope);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FC,
            new Object[] { filterScope.getClassName(), filterScope.getFilterName() },
            filterScope);

        filterScope.resetOriginalValues();
    }

    /**
     * Caches the filter scopes in the entity cache if it is enabled.
     *
     * @param filterScopes the filter scopes
     */
    @Override
    public void cacheResult(List<FilterScope> filterScopes) {
        for (FilterScope filterScope : filterScopes) {
            if (EntityCacheUtil.getResult(
                        FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
                        FilterScopeImpl.class, filterScope.getPrimaryKey()) == null) {
                cacheResult(filterScope);
            } else {
                filterScope.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all filter scopes.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(FilterScopeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(FilterScopeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the filter scope.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(FilterScope filterScope) {
        EntityCacheUtil.removeResult(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
            FilterScopeImpl.class, filterScope.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(filterScope);
    }

    @Override
    public void clearCache(List<FilterScope> filterScopes) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (FilterScope filterScope : filterScopes) {
            EntityCacheUtil.removeResult(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
                FilterScopeImpl.class, filterScope.getPrimaryKey());

            clearUniqueFindersCache(filterScope);
        }
    }

    protected void cacheUniqueFindersCache(FilterScope filterScope) {
        if (filterScope.isNew()) {
            Object[] args = new Object[] {
                    filterScope.getClassName(), filterScope.getFilterName()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FC, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FC, args, filterScope);
        } else {
            FilterScopeModelImpl filterScopeModelImpl = (FilterScopeModelImpl) filterScope;

            if ((filterScopeModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_FC.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        filterScope.getClassName(), filterScope.getFilterName()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FC, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_FC, args,
                    filterScope);
            }
        }
    }

    protected void clearUniqueFindersCache(FilterScope filterScope) {
        FilterScopeModelImpl filterScopeModelImpl = (FilterScopeModelImpl) filterScope;

        Object[] args = new Object[] {
                filterScope.getClassName(), filterScope.getFilterName()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FC, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FC, args);

        if ((filterScopeModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_FC.getColumnBitmask()) != 0) {
            args = new Object[] {
                    filterScopeModelImpl.getOriginalClassName(),
                    filterScopeModelImpl.getOriginalFilterName()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FC, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_FC, args);
        }
    }

    /**
     * Creates a new filter scope with the primary key. Does not add the filter scope to the database.
     *
     * @param filterScopeId the primary key for the new filter scope
     * @return the new filter scope
     */
    @Override
    public FilterScope create(long filterScopeId) {
        FilterScope filterScope = new FilterScopeImpl();

        filterScope.setNew(true);
        filterScope.setPrimaryKey(filterScopeId);

        return filterScope;
    }

    /**
     * Removes the filter scope with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param filterScopeId the primary key of the filter scope
     * @return the filter scope that was removed
     * @throws com.liferay.portal.ext.NoSuchFilterScopeException if a filter scope with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope remove(long filterScopeId)
        throws NoSuchFilterScopeException, SystemException {
        return remove((Serializable) filterScopeId);
    }

    /**
     * Removes the filter scope with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the filter scope
     * @return the filter scope that was removed
     * @throws com.liferay.portal.ext.NoSuchFilterScopeException if a filter scope with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope remove(Serializable primaryKey)
        throws NoSuchFilterScopeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            FilterScope filterScope = (FilterScope) session.get(FilterScopeImpl.class,
                    primaryKey);

            if (filterScope == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchFilterScopeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(filterScope);
        } catch (NoSuchFilterScopeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected FilterScope removeImpl(FilterScope filterScope)
        throws SystemException {
        filterScope = toUnwrappedModel(filterScope);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(filterScope)) {
                filterScope = (FilterScope) session.get(FilterScopeImpl.class,
                        filterScope.getPrimaryKeyObj());
            }

            if (filterScope != null) {
                session.delete(filterScope);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (filterScope != null) {
            clearCache(filterScope);
        }

        return filterScope;
    }

    @Override
    public FilterScope updateImpl(
        com.liferay.portal.ext.model.FilterScope filterScope)
        throws SystemException {
        filterScope = toUnwrappedModel(filterScope);

        boolean isNew = filterScope.isNew();

        FilterScopeModelImpl filterScopeModelImpl = (FilterScopeModelImpl) filterScope;

        Session session = null;

        try {
            session = openSession();

            if (filterScope.isNew()) {
                session.save(filterScope);

                filterScope.setNew(false);
            } else {
                session.merge(filterScope);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !FilterScopeModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((filterScopeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        filterScopeModelImpl.getOriginalClassName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAME,
                    args);

                args = new Object[] { filterScopeModelImpl.getClassName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAME,
                    args);
            }
        }

        EntityCacheUtil.putResult(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
            FilterScopeImpl.class, filterScope.getPrimaryKey(), filterScope);

        clearUniqueFindersCache(filterScope);
        cacheUniqueFindersCache(filterScope);

        return filterScope;
    }

    protected FilterScope toUnwrappedModel(FilterScope filterScope) {
        if (filterScope instanceof FilterScopeImpl) {
            return filterScope;
        }

        FilterScopeImpl filterScopeImpl = new FilterScopeImpl();

        filterScopeImpl.setNew(filterScope.isNew());
        filterScopeImpl.setPrimaryKey(filterScope.getPrimaryKey());

        filterScopeImpl.setFilterScopeId(filterScope.getFilterScopeId());
        filterScopeImpl.setFilterName(filterScope.getFilterName());
        filterScopeImpl.setClassName(filterScope.getClassName());

        return filterScopeImpl;
    }

    /**
     * Returns the filter scope with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the filter scope
     * @return the filter scope
     * @throws com.liferay.portal.ext.NoSuchFilterScopeException if a filter scope with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope findByPrimaryKey(Serializable primaryKey)
        throws NoSuchFilterScopeException, SystemException {
        FilterScope filterScope = fetchByPrimaryKey(primaryKey);

        if (filterScope == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchFilterScopeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return filterScope;
    }

    /**
     * Returns the filter scope with the primary key or throws a {@link com.liferay.portal.ext.NoSuchFilterScopeException} if it could not be found.
     *
     * @param filterScopeId the primary key of the filter scope
     * @return the filter scope
     * @throws com.liferay.portal.ext.NoSuchFilterScopeException if a filter scope with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope findByPrimaryKey(long filterScopeId)
        throws NoSuchFilterScopeException, SystemException {
        return findByPrimaryKey((Serializable) filterScopeId);
    }

    /**
     * Returns the filter scope with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the filter scope
     * @return the filter scope, or <code>null</code> if a filter scope with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        FilterScope filterScope = (FilterScope) EntityCacheUtil.getResult(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
                FilterScopeImpl.class, primaryKey);

        if (filterScope == _nullFilterScope) {
            return null;
        }

        if (filterScope == null) {
            Session session = null;

            try {
                session = openSession();

                filterScope = (FilterScope) session.get(FilterScopeImpl.class,
                        primaryKey);

                if (filterScope != null) {
                    cacheResult(filterScope);
                } else {
                    EntityCacheUtil.putResult(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
                        FilterScopeImpl.class, primaryKey, _nullFilterScope);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(FilterScopeModelImpl.ENTITY_CACHE_ENABLED,
                    FilterScopeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return filterScope;
    }

    /**
     * Returns the filter scope with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param filterScopeId the primary key of the filter scope
     * @return the filter scope, or <code>null</code> if a filter scope with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterScope fetchByPrimaryKey(long filterScopeId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) filterScopeId);
    }

    /**
     * Returns all the filter scopes.
     *
     * @return the filter scopes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterScope> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the filter scopes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterScopeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of filter scopes
     * @param end the upper bound of the range of filter scopes (not inclusive)
     * @return the range of filter scopes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterScope> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the filter scopes.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterScopeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of filter scopes
     * @param end the upper bound of the range of filter scopes (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of filter scopes
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterScope> findAll(int start, int end,
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

        List<FilterScope> list = (List<FilterScope>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_FILTERSCOPE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_FILTERSCOPE;

                if (pagination) {
                    sql = sql.concat(FilterScopeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<FilterScope>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<FilterScope>(list);
                } else {
                    list = (List<FilterScope>) QueryUtil.list(q, getDialect(),
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
     * Removes all the filter scopes from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (FilterScope filterScope : findAll()) {
            remove(filterScope);
        }
    }

    /**
     * Returns the number of filter scopes.
     *
     * @return the number of filter scopes
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

                Query q = session.createQuery(_SQL_COUNT_FILTERSCOPE);

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
     * Initializes the filter scope persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.portal.util.PropsUtil.get(
                        "value.object.listener.com.liferay.portal.ext.model.FilterScope")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<FilterScope>> listenersList = new ArrayList<ModelListener<FilterScope>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<FilterScope>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(FilterScopeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
