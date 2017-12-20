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

import com.liferay.portal.ext.NoSuchModelConnectionEntryException;
import com.liferay.portal.ext.model.ModelConnectionEntry;
import com.liferay.portal.ext.model.impl.ModelConnectionEntryImpl;
import com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl;
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
 * The persistence implementation for the model connection entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ModelConnectionEntryPersistence
 * @see ModelConnectionEntryUtil
 * @generated
 */
public class ModelConnectionEntryPersistenceImpl extends BasePersistenceImpl<ModelConnectionEntry>
	implements ModelConnectionEntryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ModelConnectionEntryUtil} to access the model connection entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ModelConnectionEntryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionEntryModelImpl.FINDER_CACHE_ENABLED,
			ModelConnectionEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionEntryModelImpl.FINDER_CACHE_ENABLED,
			ModelConnectionEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_C = new FinderPath(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionEntryModelImpl.FINDER_CACHE_ENABLED,
			ModelConnectionEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C = new FinderPath(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionEntryModelImpl.FINDER_CACHE_ENABLED,
			ModelConnectionEntryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_C",
			new String[] { Long.class.getName(), Long.class.getName() },
			ModelConnectionEntryModelImpl.CLASSNAMEID_COLUMN_BITMASK |
			ModelConnectionEntryModelImpl.CLASSPK_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C = new FinderPath(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_C",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the model connection entries where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @return the matching model connection entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionEntry> findByC_C(long classNameId, long classPK)
		throws SystemException {
		return findByC_C(classNameId, classPK, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the model connection entries where classNameId = &#63; and classPK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param start the lower bound of the range of model connection entries
	 * @param end the upper bound of the range of model connection entries (not inclusive)
	 * @return the range of matching model connection entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionEntry> findByC_C(long classNameId, long classPK,
		int start, int end) throws SystemException {
		return findByC_C(classNameId, classPK, start, end, null);
	}

	/**
	 * Returns an ordered range of all the model connection entries where classNameId = &#63; and classPK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param start the lower bound of the range of model connection entries
	 * @param end the upper bound of the range of model connection entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching model connection entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionEntry> findByC_C(long classNameId, long classPK,
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

		List<ModelConnectionEntry> list = (List<ModelConnectionEntry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ModelConnectionEntry modelConnectionEntry : list) {
				if ((classNameId != modelConnectionEntry.getClassNameId()) ||
						(classPK != modelConnectionEntry.getClassPK())) {
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

			query.append(_SQL_SELECT_MODELCONNECTIONENTRY_WHERE);

			query.append(_FINDER_COLUMN_C_C_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_CLASSPK_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ModelConnectionEntryModelImpl.ORDER_BY_JPQL);
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
					list = (List<ModelConnectionEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ModelConnectionEntry>(list);
				}
				else {
					list = (List<ModelConnectionEntry>)QueryUtil.list(q,
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
	 * Returns the first model connection entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching model connection entry
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a matching model connection entry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry findByC_C_First(long classNameId, long classPK,
		OrderByComparator orderByComparator)
		throws NoSuchModelConnectionEntryException, SystemException {
		ModelConnectionEntry modelConnectionEntry = fetchByC_C_First(classNameId,
				classPK, orderByComparator);

		if (modelConnectionEntry != null) {
			return modelConnectionEntry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("classNameId=");
		msg.append(classNameId);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchModelConnectionEntryException(msg.toString());
	}

	/**
	 * Returns the first model connection entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching model connection entry, or <code>null</code> if a matching model connection entry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry fetchByC_C_First(long classNameId,
		long classPK, OrderByComparator orderByComparator)
		throws SystemException {
		List<ModelConnectionEntry> list = findByC_C(classNameId, classPK, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last model connection entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching model connection entry
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a matching model connection entry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry findByC_C_Last(long classNameId, long classPK,
		OrderByComparator orderByComparator)
		throws NoSuchModelConnectionEntryException, SystemException {
		ModelConnectionEntry modelConnectionEntry = fetchByC_C_Last(classNameId,
				classPK, orderByComparator);

		if (modelConnectionEntry != null) {
			return modelConnectionEntry;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("classNameId=");
		msg.append(classNameId);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchModelConnectionEntryException(msg.toString());
	}

	/**
	 * Returns the last model connection entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching model connection entry, or <code>null</code> if a matching model connection entry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry fetchByC_C_Last(long classNameId, long classPK,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_C(classNameId, classPK);

		if (count == 0) {
			return null;
		}

		List<ModelConnectionEntry> list = findByC_C(classNameId, classPK,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the model connection entries before and after the current model connection entry in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param entryId the primary key of the current model connection entry
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next model connection entry
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a model connection entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry[] findByC_C_PrevAndNext(long entryId,
		long classNameId, long classPK, OrderByComparator orderByComparator)
		throws NoSuchModelConnectionEntryException, SystemException {
		ModelConnectionEntry modelConnectionEntry = findByPrimaryKey(entryId);

		Session session = null;

		try {
			session = openSession();

			ModelConnectionEntry[] array = new ModelConnectionEntryImpl[3];

			array[0] = getByC_C_PrevAndNext(session, modelConnectionEntry,
					classNameId, classPK, orderByComparator, true);

			array[1] = modelConnectionEntry;

			array[2] = getByC_C_PrevAndNext(session, modelConnectionEntry,
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

	protected ModelConnectionEntry getByC_C_PrevAndNext(Session session,
		ModelConnectionEntry modelConnectionEntry, long classNameId,
		long classPK, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MODELCONNECTIONENTRY_WHERE);

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
			query.append(ModelConnectionEntryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(classNameId);

		qPos.add(classPK);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(modelConnectionEntry);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ModelConnectionEntry> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the model connection entries where classNameId = &#63; and classPK = &#63; from the database.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_C(long classNameId, long classPK)
		throws SystemException {
		for (ModelConnectionEntry modelConnectionEntry : findByC_C(
				classNameId, classPK, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(modelConnectionEntry);
		}
	}

	/**
	 * Returns the number of model connection entries where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @return the number of matching model connection entries
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

			query.append(_SQL_COUNT_MODELCONNECTIONENTRY_WHERE);

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

	private static final String _FINDER_COLUMN_C_C_CLASSNAMEID_2 = "modelConnectionEntry.classNameId = ? AND ";
	private static final String _FINDER_COLUMN_C_C_CLASSPK_2 = "modelConnectionEntry.classPK = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_C_EG = new FinderPath(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionEntryModelImpl.FINDER_CACHE_ENABLED,
			ModelConnectionEntryImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByC_C_EG",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			ModelConnectionEntryModelImpl.CLASSNAMEID_COLUMN_BITMASK |
			ModelConnectionEntryModelImpl.CLASSPK_COLUMN_BITMASK |
			ModelConnectionEntryModelImpl.ENTRYGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C_EG = new FinderPath(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionEntryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_C_EG",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the model connection entry where classNameId = &#63; and classPK = &#63; and entryGroupId = &#63; or throws a {@link com.liferay.portal.ext.NoSuchModelConnectionEntryException} if it could not be found.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param entryGroupId the entry group ID
	 * @return the matching model connection entry
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a matching model connection entry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry findByC_C_EG(long classNameId, long classPK,
		long entryGroupId)
		throws NoSuchModelConnectionEntryException, SystemException {
		ModelConnectionEntry modelConnectionEntry = fetchByC_C_EG(classNameId,
				classPK, entryGroupId);

		if (modelConnectionEntry == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("classNameId=");
			msg.append(classNameId);

			msg.append(", classPK=");
			msg.append(classPK);

			msg.append(", entryGroupId=");
			msg.append(entryGroupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchModelConnectionEntryException(msg.toString());
		}

		return modelConnectionEntry;
	}

	/**
	 * Returns the model connection entry where classNameId = &#63; and classPK = &#63; and entryGroupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param entryGroupId the entry group ID
	 * @return the matching model connection entry, or <code>null</code> if a matching model connection entry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry fetchByC_C_EG(long classNameId, long classPK,
		long entryGroupId) throws SystemException {
		return fetchByC_C_EG(classNameId, classPK, entryGroupId, true);
	}

	/**
	 * Returns the model connection entry where classNameId = &#63; and classPK = &#63; and entryGroupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param entryGroupId the entry group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching model connection entry, or <code>null</code> if a matching model connection entry could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry fetchByC_C_EG(long classNameId, long classPK,
		long entryGroupId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { classNameId, classPK, entryGroupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_C_EG,
					finderArgs, this);
		}

		if (result instanceof ModelConnectionEntry) {
			ModelConnectionEntry modelConnectionEntry = (ModelConnectionEntry)result;

			if ((classNameId != modelConnectionEntry.getClassNameId()) ||
					(classPK != modelConnectionEntry.getClassPK()) ||
					(entryGroupId != modelConnectionEntry.getEntryGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_MODELCONNECTIONENTRY_WHERE);

			query.append(_FINDER_COLUMN_C_C_EG_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_EG_CLASSPK_2);

			query.append(_FINDER_COLUMN_C_C_EG_ENTRYGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				qPos.add(entryGroupId);

				List<ModelConnectionEntry> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_EG,
						finderArgs, list);
				}
				else {
					ModelConnectionEntry modelConnectionEntry = list.get(0);

					result = modelConnectionEntry;

					cacheResult(modelConnectionEntry);

					if ((modelConnectionEntry.getClassNameId() != classNameId) ||
							(modelConnectionEntry.getClassPK() != classPK) ||
							(modelConnectionEntry.getEntryGroupId() != entryGroupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_EG,
							finderArgs, modelConnectionEntry);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_C_EG,
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
			return (ModelConnectionEntry)result;
		}
	}

	/**
	 * Removes the model connection entry where classNameId = &#63; and classPK = &#63; and entryGroupId = &#63; from the database.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param entryGroupId the entry group ID
	 * @return the model connection entry that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry removeByC_C_EG(long classNameId, long classPK,
		long entryGroupId)
		throws NoSuchModelConnectionEntryException, SystemException {
		ModelConnectionEntry modelConnectionEntry = findByC_C_EG(classNameId,
				classPK, entryGroupId);

		return remove(modelConnectionEntry);
	}

	/**
	 * Returns the number of model connection entries where classNameId = &#63; and classPK = &#63; and entryGroupId = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param entryGroupId the entry group ID
	 * @return the number of matching model connection entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_C_EG(long classNameId, long classPK, long entryGroupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_C_EG;

		Object[] finderArgs = new Object[] { classNameId, classPK, entryGroupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_MODELCONNECTIONENTRY_WHERE);

			query.append(_FINDER_COLUMN_C_C_EG_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_EG_CLASSPK_2);

			query.append(_FINDER_COLUMN_C_C_EG_ENTRYGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				qPos.add(entryGroupId);

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

	private static final String _FINDER_COLUMN_C_C_EG_CLASSNAMEID_2 = "modelConnectionEntry.classNameId = ? AND ";
	private static final String _FINDER_COLUMN_C_C_EG_CLASSPK_2 = "modelConnectionEntry.classPK = ? AND ";
	private static final String _FINDER_COLUMN_C_C_EG_ENTRYGROUPID_2 = "modelConnectionEntry.entryGroupId = ?";

	public ModelConnectionEntryPersistenceImpl() {
		setModelClass(ModelConnectionEntry.class);
	}

	/**
	 * Caches the model connection entry in the entity cache if it is enabled.
	 *
	 * @param modelConnectionEntry the model connection entry
	 */
	@Override
	public void cacheResult(ModelConnectionEntry modelConnectionEntry) {
		EntityCacheUtil.putResult(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionEntryImpl.class,
			modelConnectionEntry.getPrimaryKey(), modelConnectionEntry);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_EG,
			new Object[] {
				modelConnectionEntry.getClassNameId(),
				modelConnectionEntry.getClassPK(),
				modelConnectionEntry.getEntryGroupId()
			}, modelConnectionEntry);

		modelConnectionEntry.resetOriginalValues();
	}

	/**
	 * Caches the model connection entries in the entity cache if it is enabled.
	 *
	 * @param modelConnectionEntries the model connection entries
	 */
	@Override
	public void cacheResult(List<ModelConnectionEntry> modelConnectionEntries) {
		for (ModelConnectionEntry modelConnectionEntry : modelConnectionEntries) {
			if (EntityCacheUtil.getResult(
						ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
						ModelConnectionEntryImpl.class,
						modelConnectionEntry.getPrimaryKey()) == null) {
				cacheResult(modelConnectionEntry);
			}
			else {
				modelConnectionEntry.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all model connection entries.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ModelConnectionEntryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ModelConnectionEntryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the model connection entry.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ModelConnectionEntry modelConnectionEntry) {
		EntityCacheUtil.removeResult(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionEntryImpl.class, modelConnectionEntry.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(modelConnectionEntry);
	}

	@Override
	public void clearCache(List<ModelConnectionEntry> modelConnectionEntries) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ModelConnectionEntry modelConnectionEntry : modelConnectionEntries) {
			EntityCacheUtil.removeResult(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
				ModelConnectionEntryImpl.class,
				modelConnectionEntry.getPrimaryKey());

			clearUniqueFindersCache(modelConnectionEntry);
		}
	}

	protected void cacheUniqueFindersCache(
		ModelConnectionEntry modelConnectionEntry) {
		if (modelConnectionEntry.isNew()) {
			Object[] args = new Object[] {
					modelConnectionEntry.getClassNameId(),
					modelConnectionEntry.getClassPK(),
					modelConnectionEntry.getEntryGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_C_EG, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_EG, args,
				modelConnectionEntry);
		}
		else {
			ModelConnectionEntryModelImpl modelConnectionEntryModelImpl = (ModelConnectionEntryModelImpl)modelConnectionEntry;

			if ((modelConnectionEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_C_EG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						modelConnectionEntry.getClassNameId(),
						modelConnectionEntry.getClassPK(),
						modelConnectionEntry.getEntryGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_C_EG, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_EG, args,
					modelConnectionEntry);
			}
		}
	}

	protected void clearUniqueFindersCache(
		ModelConnectionEntry modelConnectionEntry) {
		ModelConnectionEntryModelImpl modelConnectionEntryModelImpl = (ModelConnectionEntryModelImpl)modelConnectionEntry;

		Object[] args = new Object[] {
				modelConnectionEntry.getClassNameId(),
				modelConnectionEntry.getClassPK(),
				modelConnectionEntry.getEntryGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C_EG, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_C_EG, args);

		if ((modelConnectionEntryModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_C_EG.getColumnBitmask()) != 0) {
			args = new Object[] {
					modelConnectionEntryModelImpl.getOriginalClassNameId(),
					modelConnectionEntryModelImpl.getOriginalClassPK(),
					modelConnectionEntryModelImpl.getOriginalEntryGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C_EG, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_C_EG, args);
		}
	}

	/**
	 * Creates a new model connection entry with the primary key. Does not add the model connection entry to the database.
	 *
	 * @param entryId the primary key for the new model connection entry
	 * @return the new model connection entry
	 */
	@Override
	public ModelConnectionEntry create(long entryId) {
		ModelConnectionEntry modelConnectionEntry = new ModelConnectionEntryImpl();

		modelConnectionEntry.setNew(true);
		modelConnectionEntry.setPrimaryKey(entryId);

		return modelConnectionEntry;
	}

	/**
	 * Removes the model connection entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entryId the primary key of the model connection entry
	 * @return the model connection entry that was removed
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a model connection entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry remove(long entryId)
		throws NoSuchModelConnectionEntryException, SystemException {
		return remove((Serializable)entryId);
	}

	/**
	 * Removes the model connection entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the model connection entry
	 * @return the model connection entry that was removed
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a model connection entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry remove(Serializable primaryKey)
		throws NoSuchModelConnectionEntryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ModelConnectionEntry modelConnectionEntry = (ModelConnectionEntry)session.get(ModelConnectionEntryImpl.class,
					primaryKey);

			if (modelConnectionEntry == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchModelConnectionEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(modelConnectionEntry);
		}
		catch (NoSuchModelConnectionEntryException nsee) {
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
	protected ModelConnectionEntry removeImpl(
		ModelConnectionEntry modelConnectionEntry) throws SystemException {
		modelConnectionEntry = toUnwrappedModel(modelConnectionEntry);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(modelConnectionEntry)) {
				modelConnectionEntry = (ModelConnectionEntry)session.get(ModelConnectionEntryImpl.class,
						modelConnectionEntry.getPrimaryKeyObj());
			}

			if (modelConnectionEntry != null) {
				session.delete(modelConnectionEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (modelConnectionEntry != null) {
			clearCache(modelConnectionEntry);
		}

		return modelConnectionEntry;
	}

	@Override
	public ModelConnectionEntry updateImpl(
		com.liferay.portal.ext.model.ModelConnectionEntry modelConnectionEntry)
		throws SystemException {
		modelConnectionEntry = toUnwrappedModel(modelConnectionEntry);

		boolean isNew = modelConnectionEntry.isNew();

		ModelConnectionEntryModelImpl modelConnectionEntryModelImpl = (ModelConnectionEntryModelImpl)modelConnectionEntry;

		Session session = null;

		try {
			session = openSession();

			if (modelConnectionEntry.isNew()) {
				session.save(modelConnectionEntry);

				modelConnectionEntry.setNew(false);
			}
			else {
				session.merge(modelConnectionEntry);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ModelConnectionEntryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((modelConnectionEntryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						modelConnectionEntryModelImpl.getOriginalClassNameId(),
						modelConnectionEntryModelImpl.getOriginalClassPK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C,
					args);

				args = new Object[] {
						modelConnectionEntryModelImpl.getClassNameId(),
						modelConnectionEntryModelImpl.getClassPK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C,
					args);
			}
		}

		EntityCacheUtil.putResult(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionEntryImpl.class,
			modelConnectionEntry.getPrimaryKey(), modelConnectionEntry);

		clearUniqueFindersCache(modelConnectionEntry);
		cacheUniqueFindersCache(modelConnectionEntry);

		return modelConnectionEntry;
	}

	protected ModelConnectionEntry toUnwrappedModel(
		ModelConnectionEntry modelConnectionEntry) {
		if (modelConnectionEntry instanceof ModelConnectionEntryImpl) {
			return modelConnectionEntry;
		}

		ModelConnectionEntryImpl modelConnectionEntryImpl = new ModelConnectionEntryImpl();

		modelConnectionEntryImpl.setNew(modelConnectionEntry.isNew());
		modelConnectionEntryImpl.setPrimaryKey(modelConnectionEntry.getPrimaryKey());

		modelConnectionEntryImpl.setEntryId(modelConnectionEntry.getEntryId());
		modelConnectionEntryImpl.setCompanyId(modelConnectionEntry.getCompanyId());
		modelConnectionEntryImpl.setEntryGroupId(modelConnectionEntry.getEntryGroupId());
		modelConnectionEntryImpl.setUserId(modelConnectionEntry.getUserId());
		modelConnectionEntryImpl.setUserName(modelConnectionEntry.getUserName());
		modelConnectionEntryImpl.setCreateDate(modelConnectionEntry.getCreateDate());
		modelConnectionEntryImpl.setModifiedDate(modelConnectionEntry.getModifiedDate());
		modelConnectionEntryImpl.setClassNameId(modelConnectionEntry.getClassNameId());
		modelConnectionEntryImpl.setClassPK(modelConnectionEntry.getClassPK());

		return modelConnectionEntryImpl;
	}

	/**
	 * Returns the model connection entry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the model connection entry
	 * @return the model connection entry
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a model connection entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelConnectionEntryException, SystemException {
		ModelConnectionEntry modelConnectionEntry = fetchByPrimaryKey(primaryKey);

		if (modelConnectionEntry == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchModelConnectionEntryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return modelConnectionEntry;
	}

	/**
	 * Returns the model connection entry with the primary key or throws a {@link com.liferay.portal.ext.NoSuchModelConnectionEntryException} if it could not be found.
	 *
	 * @param entryId the primary key of the model connection entry
	 * @return the model connection entry
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionEntryException if a model connection entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry findByPrimaryKey(long entryId)
		throws NoSuchModelConnectionEntryException, SystemException {
		return findByPrimaryKey((Serializable)entryId);
	}

	/**
	 * Returns the model connection entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the model connection entry
	 * @return the model connection entry, or <code>null</code> if a model connection entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ModelConnectionEntry modelConnectionEntry = (ModelConnectionEntry)EntityCacheUtil.getResult(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
				ModelConnectionEntryImpl.class, primaryKey);

		if (modelConnectionEntry == _nullModelConnectionEntry) {
			return null;
		}

		if (modelConnectionEntry == null) {
			Session session = null;

			try {
				session = openSession();

				modelConnectionEntry = (ModelConnectionEntry)session.get(ModelConnectionEntryImpl.class,
						primaryKey);

				if (modelConnectionEntry != null) {
					cacheResult(modelConnectionEntry);
				}
				else {
					EntityCacheUtil.putResult(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
						ModelConnectionEntryImpl.class, primaryKey,
						_nullModelConnectionEntry);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ModelConnectionEntryModelImpl.ENTITY_CACHE_ENABLED,
					ModelConnectionEntryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return modelConnectionEntry;
	}

	/**
	 * Returns the model connection entry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param entryId the primary key of the model connection entry
	 * @return the model connection entry, or <code>null</code> if a model connection entry with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionEntry fetchByPrimaryKey(long entryId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)entryId);
	}

	/**
	 * Returns all the model connection entries.
	 *
	 * @return the model connection entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionEntry> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the model connection entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of model connection entries
	 * @param end the upper bound of the range of model connection entries (not inclusive)
	 * @return the range of model connection entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionEntry> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the model connection entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of model connection entries
	 * @param end the upper bound of the range of model connection entries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of model connection entries
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionEntry> findAll(int start, int end,
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

		List<ModelConnectionEntry> list = (List<ModelConnectionEntry>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MODELCONNECTIONENTRY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MODELCONNECTIONENTRY;

				if (pagination) {
					sql = sql.concat(ModelConnectionEntryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ModelConnectionEntry>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ModelConnectionEntry>(list);
				}
				else {
					list = (List<ModelConnectionEntry>)QueryUtil.list(q,
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
	 * Removes all the model connection entries from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ModelConnectionEntry modelConnectionEntry : findAll()) {
			remove(modelConnectionEntry);
		}
	}

	/**
	 * Returns the number of model connection entries.
	 *
	 * @return the number of model connection entries
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

				Query q = session.createQuery(_SQL_COUNT_MODELCONNECTIONENTRY);

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
	 * Initializes the model connection entry persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.portal.util.PropsUtil.get(
						"value.object.listener.com.liferay.portal.ext.model.ModelConnectionEntry")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ModelConnectionEntry>> listenersList = new ArrayList<ModelListener<ModelConnectionEntry>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ModelConnectionEntry>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ModelConnectionEntryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MODELCONNECTIONENTRY = "SELECT modelConnectionEntry FROM ModelConnectionEntry modelConnectionEntry";
	private static final String _SQL_SELECT_MODELCONNECTIONENTRY_WHERE = "SELECT modelConnectionEntry FROM ModelConnectionEntry modelConnectionEntry WHERE ";
	private static final String _SQL_COUNT_MODELCONNECTIONENTRY = "SELECT COUNT(modelConnectionEntry) FROM ModelConnectionEntry modelConnectionEntry";
	private static final String _SQL_COUNT_MODELCONNECTIONENTRY_WHERE = "SELECT COUNT(modelConnectionEntry) FROM ModelConnectionEntry modelConnectionEntry WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "modelConnectionEntry.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ModelConnectionEntry exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ModelConnectionEntry exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
	private static Log _log = LogFactoryUtil.getLog(ModelConnectionEntryPersistenceImpl.class);
	private static ModelConnectionEntry _nullModelConnectionEntry = new ModelConnectionEntryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ModelConnectionEntry> toCacheModel() {
				return _nullModelConnectionEntryCacheModel;
			}
		};

	private static CacheModel<ModelConnectionEntry> _nullModelConnectionEntryCacheModel =
		new CacheModel<ModelConnectionEntry>() {
			@Override
			public ModelConnectionEntry toEntityModel() {
				return _nullModelConnectionEntry;
			}
		};
}