package com.liferay.portal.ext.service.persistence;

import com.liferay.portal.ext.NoSuchFilterGroupException;
import com.liferay.portal.ext.model.FilterGroup;
import com.liferay.portal.ext.model.impl.FilterGroupImpl;
import com.liferay.portal.ext.model.impl.FilterGroupModelImpl;
import com.liferay.portal.ext.service.persistence.FilterGroupPersistence;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the filter group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see FilterGroupPersistence
 * @see FilterGroupUtil
 * @generated
 */
public class FilterGroupPersistenceImpl extends BasePersistenceImpl<FilterGroup>
    implements FilterGroupPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link FilterGroupUtil} to access the filter group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = FilterGroupImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, FilterGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, FilterGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, FilterGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, FilterGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            FilterGroupModelImpl.UUID_COLUMN_BITMASK |
            FilterGroupModelImpl.CREATEDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "filterGroup.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "filterGroup.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(filterGroup.uuid IS NULL OR filterGroup.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, FilterGroupImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            FilterGroupModelImpl.UUID_COLUMN_BITMASK |
            FilterGroupModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "filterGroup.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "filterGroup.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(filterGroup.uuid IS NULL OR filterGroup.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "filterGroup.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, FilterGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, FilterGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            FilterGroupModelImpl.GROUPID_COLUMN_BITMASK |
            FilterGroupModelImpl.CREATEDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "filterGroup.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FILTERSCOPEID =
        new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, FilterGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFilterScopeId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILTERSCOPEID =
        new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, FilterGroupImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFilterScopeId",
            new String[] { Long.class.getName() },
            FilterGroupModelImpl.FILTERSCOPEID_COLUMN_BITMASK |
            FilterGroupModelImpl.CREATEDATE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_FILTERSCOPEID = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFilterScopeId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_FILTERSCOPEID_FILTERSCOPEID_2 = "filterGroup.filterScopeId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_F_G = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, FilterGroupImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByF_G",
            new String[] { Long.class.getName(), Long.class.getName() },
            FilterGroupModelImpl.GROUPID_COLUMN_BITMASK |
            FilterGroupModelImpl.FILTERSCOPEID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_F_G = new FinderPath(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByF_G",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_F_G_GROUPID_2 = "filterGroup.groupId = ? AND ";
    private static final String _FINDER_COLUMN_F_G_FILTERSCOPEID_2 = "filterGroup.filterScopeId = ?";
    private static final String _SQL_SELECT_FILTERGROUP = "SELECT filterGroup FROM FilterGroup filterGroup";
    private static final String _SQL_SELECT_FILTERGROUP_WHERE = "SELECT filterGroup FROM FilterGroup filterGroup WHERE ";
    private static final String _SQL_COUNT_FILTERGROUP = "SELECT COUNT(filterGroup) FROM FilterGroup filterGroup";
    private static final String _SQL_COUNT_FILTERGROUP_WHERE = "SELECT COUNT(filterGroup) FROM FilterGroup filterGroup WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "filterGroup.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FilterGroup exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FilterGroup exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
    private static final Logger _log = LoggerFactory.getLogger(FilterGroupPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static FilterGroup _nullFilterGroup = new FilterGroupImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<FilterGroup> toCacheModel() {
                return _nullFilterGroupCacheModel;
            }
        };

    private static CacheModel<FilterGroup> _nullFilterGroupCacheModel = new CacheModel<FilterGroup>() {
            @Override
            public FilterGroup toEntityModel() {
                return _nullFilterGroup;
            }
        };

    public FilterGroupPersistenceImpl() {
        setModelClass(FilterGroup.class);
    }

    /**
     * Returns all the filter groups where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the filter groups where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of filter groups
     * @param end the upper bound of the range of filter groups (not inclusive)
     * @return the range of matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the filter groups where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of filter groups
     * @param end the upper bound of the range of filter groups (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<FilterGroup> list = (List<FilterGroup>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (FilterGroup filterGroup : list) {
                if (!Validator.equals(uuid, filterGroup.getUuid())) {
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

            query.append(_SQL_SELECT_FILTERGROUP_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FilterGroupModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<FilterGroup>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<FilterGroup>(list);
                } else {
                    list = (List<FilterGroup>) QueryUtil.list(q, getDialect(),
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
     * Returns the first filter group in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = fetchByUuid_First(uuid, orderByComparator);

        if (filterGroup != null) {
            return filterGroup;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFilterGroupException(msg.toString());
    }

    /**
     * Returns the first filter group in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching filter group, or <code>null</code> if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<FilterGroup> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last filter group in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = fetchByUuid_Last(uuid, orderByComparator);

        if (filterGroup != null) {
            return filterGroup;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFilterGroupException(msg.toString());
    }

    /**
     * Returns the last filter group in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching filter group, or <code>null</code> if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<FilterGroup> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the filter groups before and after the current filter group in the ordered set where uuid = &#63;.
     *
     * @param filterGroupId the primary key of the current filter group
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup[] findByUuid_PrevAndNext(long filterGroupId,
        String uuid, OrderByComparator orderByComparator)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = findByPrimaryKey(filterGroupId);

        Session session = null;

        try {
            session = openSession();

            FilterGroup[] array = new FilterGroupImpl[3];

            array[0] = getByUuid_PrevAndNext(session, filterGroup, uuid,
                    orderByComparator, true);

            array[1] = filterGroup;

            array[2] = getByUuid_PrevAndNext(session, filterGroup, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected FilterGroup getByUuid_PrevAndNext(Session session,
        FilterGroup filterGroup, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FILTERGROUP_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
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
            query.append(FilterGroupModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(filterGroup);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<FilterGroup> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the filter groups where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (FilterGroup filterGroup : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(filterGroup);
        }
    }

    /**
     * Returns the number of filter groups where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FILTERGROUP_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
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
     * Returns the filter group where uuid = &#63; and groupId = &#63; or throws a {@link com.liferay.portal.ext.NoSuchFilterGroupException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup findByUUID_G(String uuid, long groupId)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = fetchByUUID_G(uuid, groupId);

        if (filterGroup == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchFilterGroupException(msg.toString());
        }

        return filterGroup;
    }

    /**
     * Returns the filter group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching filter group, or <code>null</code> if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the filter group where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching filter group, or <code>null</code> if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof FilterGroup) {
            FilterGroup filterGroup = (FilterGroup) result;

            if (!Validator.equals(uuid, filterGroup.getUuid()) ||
                    (groupId != filterGroup.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_FILTERGROUP_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<FilterGroup> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    FilterGroup filterGroup = list.get(0);

                    result = filterGroup;

                    cacheResult(filterGroup);

                    if ((filterGroup.getUuid() == null) ||
                            !filterGroup.getUuid().equals(uuid) ||
                            (filterGroup.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, filterGroup);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (FilterGroup) result;
        }
    }

    /**
     * Removes the filter group where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the filter group that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup removeByUUID_G(String uuid, long groupId)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = findByUUID_G(uuid, groupId);

        return remove(filterGroup);
    }

    /**
     * Returns the number of filter groups where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FILTERGROUP_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

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
     * Returns all the filter groups where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the filter groups where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of filter groups
     * @param end the upper bound of the range of filter groups (not inclusive)
     * @return the range of matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the filter groups where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of filter groups
     * @param end the upper bound of the range of filter groups (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<FilterGroup> list = (List<FilterGroup>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (FilterGroup filterGroup : list) {
                if ((groupId != filterGroup.getGroupId())) {
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

            query.append(_SQL_SELECT_FILTERGROUP_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FilterGroupModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<FilterGroup>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<FilterGroup>(list);
                } else {
                    list = (List<FilterGroup>) QueryUtil.list(q, getDialect(),
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
     * Returns the first filter group in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = fetchByGroupId_First(groupId,
                orderByComparator);

        if (filterGroup != null) {
            return filterGroup;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFilterGroupException(msg.toString());
    }

    /**
     * Returns the first filter group in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching filter group, or <code>null</code> if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<FilterGroup> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last filter group in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = fetchByGroupId_Last(groupId, orderByComparator);

        if (filterGroup != null) {
            return filterGroup;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFilterGroupException(msg.toString());
    }

    /**
     * Returns the last filter group in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching filter group, or <code>null</code> if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<FilterGroup> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the filter groups before and after the current filter group in the ordered set where groupId = &#63;.
     *
     * @param filterGroupId the primary key of the current filter group
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup[] findByGroupId_PrevAndNext(long filterGroupId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = findByPrimaryKey(filterGroupId);

        Session session = null;

        try {
            session = openSession();

            FilterGroup[] array = new FilterGroupImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, filterGroup, groupId,
                    orderByComparator, true);

            array[1] = filterGroup;

            array[2] = getByGroupId_PrevAndNext(session, filterGroup, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected FilterGroup getByGroupId_PrevAndNext(Session session,
        FilterGroup filterGroup, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FILTERGROUP_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
            query.append(FilterGroupModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(filterGroup);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<FilterGroup> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the filter groups where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (FilterGroup filterGroup : findByGroupId(groupId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(filterGroup);
        }
    }

    /**
     * Returns the number of filter groups where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FILTERGROUP_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

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
     * Returns all the filter groups where filterScopeId = &#63;.
     *
     * @param filterScopeId the filter scope ID
     * @return the matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findByFilterScopeId(long filterScopeId)
        throws SystemException {
        return findByFilterScopeId(filterScopeId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the filter groups where filterScopeId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param filterScopeId the filter scope ID
     * @param start the lower bound of the range of filter groups
     * @param end the upper bound of the range of filter groups (not inclusive)
     * @return the range of matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findByFilterScopeId(long filterScopeId, int start,
        int end) throws SystemException {
        return findByFilterScopeId(filterScopeId, start, end, null);
    }

    /**
     * Returns an ordered range of all the filter groups where filterScopeId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param filterScopeId the filter scope ID
     * @param start the lower bound of the range of filter groups
     * @param end the upper bound of the range of filter groups (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findByFilterScopeId(long filterScopeId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILTERSCOPEID;
            finderArgs = new Object[] { filterScopeId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FILTERSCOPEID;
            finderArgs = new Object[] {
                    filterScopeId,
                    
                    start, end, orderByComparator
                };
        }

        List<FilterGroup> list = (List<FilterGroup>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (FilterGroup filterGroup : list) {
                if ((filterScopeId != filterGroup.getFilterScopeId())) {
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

            query.append(_SQL_SELECT_FILTERGROUP_WHERE);

            query.append(_FINDER_COLUMN_FILTERSCOPEID_FILTERSCOPEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(FilterGroupModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(filterScopeId);

                if (!pagination) {
                    list = (List<FilterGroup>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<FilterGroup>(list);
                } else {
                    list = (List<FilterGroup>) QueryUtil.list(q, getDialect(),
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
     * Returns the first filter group in the ordered set where filterScopeId = &#63;.
     *
     * @param filterScopeId the filter scope ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup findByFilterScopeId_First(long filterScopeId,
        OrderByComparator orderByComparator)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = fetchByFilterScopeId_First(filterScopeId,
                orderByComparator);

        if (filterGroup != null) {
            return filterGroup;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("filterScopeId=");
        msg.append(filterScopeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFilterGroupException(msg.toString());
    }

    /**
     * Returns the first filter group in the ordered set where filterScopeId = &#63;.
     *
     * @param filterScopeId the filter scope ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching filter group, or <code>null</code> if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByFilterScopeId_First(long filterScopeId,
        OrderByComparator orderByComparator) throws SystemException {
        List<FilterGroup> list = findByFilterScopeId(filterScopeId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last filter group in the ordered set where filterScopeId = &#63;.
     *
     * @param filterScopeId the filter scope ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup findByFilterScopeId_Last(long filterScopeId,
        OrderByComparator orderByComparator)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = fetchByFilterScopeId_Last(filterScopeId,
                orderByComparator);

        if (filterGroup != null) {
            return filterGroup;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("filterScopeId=");
        msg.append(filterScopeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchFilterGroupException(msg.toString());
    }

    /**
     * Returns the last filter group in the ordered set where filterScopeId = &#63;.
     *
     * @param filterScopeId the filter scope ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching filter group, or <code>null</code> if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByFilterScopeId_Last(long filterScopeId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByFilterScopeId(filterScopeId);

        if (count == 0) {
            return null;
        }

        List<FilterGroup> list = findByFilterScopeId(filterScopeId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the filter groups before and after the current filter group in the ordered set where filterScopeId = &#63;.
     *
     * @param filterGroupId the primary key of the current filter group
     * @param filterScopeId the filter scope ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup[] findByFilterScopeId_PrevAndNext(long filterGroupId,
        long filterScopeId, OrderByComparator orderByComparator)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = findByPrimaryKey(filterGroupId);

        Session session = null;

        try {
            session = openSession();

            FilterGroup[] array = new FilterGroupImpl[3];

            array[0] = getByFilterScopeId_PrevAndNext(session, filterGroup,
                    filterScopeId, orderByComparator, true);

            array[1] = filterGroup;

            array[2] = getByFilterScopeId_PrevAndNext(session, filterGroup,
                    filterScopeId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected FilterGroup getByFilterScopeId_PrevAndNext(Session session,
        FilterGroup filterGroup, long filterScopeId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_FILTERGROUP_WHERE);

        query.append(_FINDER_COLUMN_FILTERSCOPEID_FILTERSCOPEID_2);

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
            query.append(FilterGroupModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(filterScopeId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(filterGroup);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<FilterGroup> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the filter groups where filterScopeId = &#63; from the database.
     *
     * @param filterScopeId the filter scope ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByFilterScopeId(long filterScopeId)
        throws SystemException {
        for (FilterGroup filterGroup : findByFilterScopeId(filterScopeId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(filterGroup);
        }
    }

    /**
     * Returns the number of filter groups where filterScopeId = &#63;.
     *
     * @param filterScopeId the filter scope ID
     * @return the number of matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByFilterScopeId(long filterScopeId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_FILTERSCOPEID;

        Object[] finderArgs = new Object[] { filterScopeId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_FILTERGROUP_WHERE);

            query.append(_FINDER_COLUMN_FILTERSCOPEID_FILTERSCOPEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(filterScopeId);

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
     * Returns the filter group where groupId = &#63; and filterScopeId = &#63; or throws a {@link com.liferay.portal.ext.NoSuchFilterGroupException} if it could not be found.
     *
     * @param groupId the group ID
     * @param filterScopeId the filter scope ID
     * @return the matching filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup findByF_G(long groupId, long filterScopeId)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = fetchByF_G(groupId, filterScopeId);

        if (filterGroup == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("groupId=");
            msg.append(groupId);

            msg.append(", filterScopeId=");
            msg.append(filterScopeId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchFilterGroupException(msg.toString());
        }

        return filterGroup;
    }

    /**
     * Returns the filter group where groupId = &#63; and filterScopeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param groupId the group ID
     * @param filterScopeId the filter scope ID
     * @return the matching filter group, or <code>null</code> if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByF_G(long groupId, long filterScopeId)
        throws SystemException {
        return fetchByF_G(groupId, filterScopeId, true);
    }

    /**
     * Returns the filter group where groupId = &#63; and filterScopeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param groupId the group ID
     * @param filterScopeId the filter scope ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching filter group, or <code>null</code> if a matching filter group could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByF_G(long groupId, long filterScopeId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { groupId, filterScopeId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_F_G,
                    finderArgs, this);
        }

        if (result instanceof FilterGroup) {
            FilterGroup filterGroup = (FilterGroup) result;

            if ((groupId != filterGroup.getGroupId()) ||
                    (filterScopeId != filterGroup.getFilterScopeId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_FILTERGROUP_WHERE);

            query.append(_FINDER_COLUMN_F_G_GROUPID_2);

            query.append(_FINDER_COLUMN_F_G_FILTERSCOPEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(filterScopeId);

                List<FilterGroup> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_G,
                        finderArgs, list);
                } else {
                    FilterGroup filterGroup = list.get(0);

                    result = filterGroup;

                    cacheResult(filterGroup);

                    if ((filterGroup.getGroupId() != groupId) ||
                            (filterGroup.getFilterScopeId() != filterScopeId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_G,
                            finderArgs, filterGroup);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (FilterGroup) result;
        }
    }

    /**
     * Removes the filter group where groupId = &#63; and filterScopeId = &#63; from the database.
     *
     * @param groupId the group ID
     * @param filterScopeId the filter scope ID
     * @return the filter group that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup removeByF_G(long groupId, long filterScopeId)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = findByF_G(groupId, filterScopeId);

        return remove(filterGroup);
    }

    /**
     * Returns the number of filter groups where groupId = &#63; and filterScopeId = &#63;.
     *
     * @param groupId the group ID
     * @param filterScopeId the filter scope ID
     * @return the number of matching filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByF_G(long groupId, long filterScopeId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_F_G;

        Object[] finderArgs = new Object[] { groupId, filterScopeId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_FILTERGROUP_WHERE);

            query.append(_FINDER_COLUMN_F_G_GROUPID_2);

            query.append(_FINDER_COLUMN_F_G_FILTERSCOPEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(filterScopeId);

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
     * Caches the filter group in the entity cache if it is enabled.
     *
     * @param filterGroup the filter group
     */
    @Override
    public void cacheResult(FilterGroup filterGroup) {
        EntityCacheUtil.putResult(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupImpl.class, filterGroup.getPrimaryKey(), filterGroup);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { filterGroup.getUuid(), filterGroup.getGroupId() },
            filterGroup);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_G,
            new Object[] {
                filterGroup.getGroupId(), filterGroup.getFilterScopeId()
            }, filterGroup);

        filterGroup.resetOriginalValues();
    }

    /**
     * Caches the filter groups in the entity cache if it is enabled.
     *
     * @param filterGroups the filter groups
     */
    @Override
    public void cacheResult(List<FilterGroup> filterGroups) {
        for (FilterGroup filterGroup : filterGroups) {
            if (EntityCacheUtil.getResult(
                        FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
                        FilterGroupImpl.class, filterGroup.getPrimaryKey()) == null) {
                cacheResult(filterGroup);
            } else {
                filterGroup.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all filter groups.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(FilterGroupImpl.class.getName());
        }

        EntityCacheUtil.clearCache(FilterGroupImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the filter group.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(FilterGroup filterGroup) {
        EntityCacheUtil.removeResult(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupImpl.class, filterGroup.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(filterGroup);
    }

    @Override
    public void clearCache(List<FilterGroup> filterGroups) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (FilterGroup filterGroup : filterGroups) {
            EntityCacheUtil.removeResult(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
                FilterGroupImpl.class, filterGroup.getPrimaryKey());

            clearUniqueFindersCache(filterGroup);
        }
    }

    protected void cacheUniqueFindersCache(FilterGroup filterGroup) {
        if (filterGroup.isNew()) {
            Object[] args = new Object[] {
                    filterGroup.getUuid(), filterGroup.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                filterGroup);

            args = new Object[] {
                    filterGroup.getGroupId(), filterGroup.getFilterScopeId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_G, args,
                filterGroup);
        } else {
            FilterGroupModelImpl filterGroupModelImpl = (FilterGroupModelImpl) filterGroup;

            if ((filterGroupModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        filterGroup.getUuid(), filterGroup.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    filterGroup);
            }

            if ((filterGroupModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_F_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        filterGroup.getGroupId(), filterGroup.getFilterScopeId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_F_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_F_G, args,
                    filterGroup);
            }
        }
    }

    protected void clearUniqueFindersCache(FilterGroup filterGroup) {
        FilterGroupModelImpl filterGroupModelImpl = (FilterGroupModelImpl) filterGroup;

        Object[] args = new Object[] {
                filterGroup.getUuid(), filterGroup.getGroupId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((filterGroupModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    filterGroupModelImpl.getOriginalUuid(),
                    filterGroupModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }

        args = new Object[] {
                filterGroup.getGroupId(), filterGroup.getFilterScopeId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_G, args);

        if ((filterGroupModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_F_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    filterGroupModelImpl.getOriginalGroupId(),
                    filterGroupModelImpl.getOriginalFilterScopeId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_F_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_F_G, args);
        }
    }

    /**
     * Creates a new filter group with the primary key. Does not add the filter group to the database.
     *
     * @param filterGroupId the primary key for the new filter group
     * @return the new filter group
     */
    @Override
    public FilterGroup create(long filterGroupId) {
        FilterGroup filterGroup = new FilterGroupImpl();

        filterGroup.setNew(true);
        filterGroup.setPrimaryKey(filterGroupId);

        String uuid = PortalUUIDUtil.generate();

        filterGroup.setUuid(uuid);

        return filterGroup;
    }

    /**
     * Removes the filter group with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param filterGroupId the primary key of the filter group
     * @return the filter group that was removed
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup remove(long filterGroupId)
        throws NoSuchFilterGroupException, SystemException {
        return remove((Serializable) filterGroupId);
    }

    /**
     * Removes the filter group with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the filter group
     * @return the filter group that was removed
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup remove(Serializable primaryKey)
        throws NoSuchFilterGroupException, SystemException {
        Session session = null;

        try {
            session = openSession();

            FilterGroup filterGroup = (FilterGroup) session.get(FilterGroupImpl.class,
                    primaryKey);

            if (filterGroup == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchFilterGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(filterGroup);
        } catch (NoSuchFilterGroupException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected FilterGroup removeImpl(FilterGroup filterGroup)
        throws SystemException {
        filterGroup = toUnwrappedModel(filterGroup);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(filterGroup)) {
                filterGroup = (FilterGroup) session.get(FilterGroupImpl.class,
                        filterGroup.getPrimaryKeyObj());
            }

            if (filterGroup != null) {
                session.delete(filterGroup);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (filterGroup != null) {
            clearCache(filterGroup);
        }

        return filterGroup;
    }

    @Override
    public FilterGroup updateImpl(
        com.liferay.portal.ext.model.FilterGroup filterGroup)
        throws SystemException {
        filterGroup = toUnwrappedModel(filterGroup);

        boolean isNew = filterGroup.isNew();

        FilterGroupModelImpl filterGroupModelImpl = (FilterGroupModelImpl) filterGroup;

        if (Validator.isNull(filterGroup.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            filterGroup.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (filterGroup.isNew()) {
                session.save(filterGroup);

                filterGroup.setNew(false);
            } else {
                session.merge(filterGroup);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !FilterGroupModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((filterGroupModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        filterGroupModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { filterGroupModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((filterGroupModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        filterGroupModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { filterGroupModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((filterGroupModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILTERSCOPEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        filterGroupModelImpl.getOriginalFilterScopeId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILTERSCOPEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILTERSCOPEID,
                    args);

                args = new Object[] { filterGroupModelImpl.getFilterScopeId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILTERSCOPEID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILTERSCOPEID,
                    args);
            }
        }

        EntityCacheUtil.putResult(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
            FilterGroupImpl.class, filterGroup.getPrimaryKey(), filterGroup);

        clearUniqueFindersCache(filterGroup);
        cacheUniqueFindersCache(filterGroup);

        return filterGroup;
    }

    protected FilterGroup toUnwrappedModel(FilterGroup filterGroup) {
        if (filterGroup instanceof FilterGroupImpl) {
            return filterGroup;
        }

        FilterGroupImpl filterGroupImpl = new FilterGroupImpl();

        filterGroupImpl.setNew(filterGroup.isNew());
        filterGroupImpl.setPrimaryKey(filterGroup.getPrimaryKey());

        filterGroupImpl.setUuid(filterGroup.getUuid());
        filterGroupImpl.setFilterGroupId(filterGroup.getFilterGroupId());
        filterGroupImpl.setUserId(filterGroup.getUserId());
        filterGroupImpl.setUserName(filterGroup.getUserName());
        filterGroupImpl.setCreateDate(filterGroup.getCreateDate());
        filterGroupImpl.setModifiedDate(filterGroup.getModifiedDate());
        filterGroupImpl.setGroupId(filterGroup.getGroupId());
        filterGroupImpl.setFilterScopeId(filterGroup.getFilterScopeId());

        return filterGroupImpl;
    }

    /**
     * Returns the filter group with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the filter group
     * @return the filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup findByPrimaryKey(Serializable primaryKey)
        throws NoSuchFilterGroupException, SystemException {
        FilterGroup filterGroup = fetchByPrimaryKey(primaryKey);

        if (filterGroup == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchFilterGroupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return filterGroup;
    }

    /**
     * Returns the filter group with the primary key or throws a {@link com.liferay.portal.ext.NoSuchFilterGroupException} if it could not be found.
     *
     * @param filterGroupId the primary key of the filter group
     * @return the filter group
     * @throws com.liferay.portal.ext.NoSuchFilterGroupException if a filter group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup findByPrimaryKey(long filterGroupId)
        throws NoSuchFilterGroupException, SystemException {
        return findByPrimaryKey((Serializable) filterGroupId);
    }

    /**
     * Returns the filter group with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the filter group
     * @return the filter group, or <code>null</code> if a filter group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        FilterGroup filterGroup = (FilterGroup) EntityCacheUtil.getResult(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
                FilterGroupImpl.class, primaryKey);

        if (filterGroup == _nullFilterGroup) {
            return null;
        }

        if (filterGroup == null) {
            Session session = null;

            try {
                session = openSession();

                filterGroup = (FilterGroup) session.get(FilterGroupImpl.class,
                        primaryKey);

                if (filterGroup != null) {
                    cacheResult(filterGroup);
                } else {
                    EntityCacheUtil.putResult(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
                        FilterGroupImpl.class, primaryKey, _nullFilterGroup);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(FilterGroupModelImpl.ENTITY_CACHE_ENABLED,
                    FilterGroupImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return filterGroup;
    }

    /**
     * Returns the filter group with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param filterGroupId the primary key of the filter group
     * @return the filter group, or <code>null</code> if a filter group with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public FilterGroup fetchByPrimaryKey(long filterGroupId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) filterGroupId);
    }

    /**
     * Returns all the filter groups.
     *
     * @return the filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the filter groups.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of filter groups
     * @param end the upper bound of the range of filter groups (not inclusive)
     * @return the range of filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the filter groups.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.FilterGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of filter groups
     * @param end the upper bound of the range of filter groups (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of filter groups
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<FilterGroup> findAll(int start, int end,
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

        List<FilterGroup> list = (List<FilterGroup>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_FILTERGROUP);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_FILTERGROUP;

                if (pagination) {
                    sql = sql.concat(FilterGroupModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<FilterGroup>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<FilterGroup>(list);
                } else {
                    list = (List<FilterGroup>) QueryUtil.list(q, getDialect(),
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
     * Removes all the filter groups from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (FilterGroup filterGroup : findAll()) {
            remove(filterGroup);
        }
    }

    /**
     * Returns the number of filter groups.
     *
     * @return the number of filter groups
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

                Query q = session.createQuery(_SQL_COUNT_FILTERGROUP);

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
     * Initializes the filter group persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.portal.util.PropsUtil.get(
                        "value.object.listener.com.liferay.portal.ext.model.FilterGroup")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<FilterGroup>> listenersList = new ArrayList<ModelListener<FilterGroup>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<FilterGroup>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e.getMessage());
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(FilterGroupImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
