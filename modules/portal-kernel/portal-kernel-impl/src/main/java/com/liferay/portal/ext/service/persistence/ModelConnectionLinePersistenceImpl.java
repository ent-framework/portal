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

import com.liferay.portal.ext.NoSuchModelConnectionLineException;
import com.liferay.portal.ext.model.ModelConnectionLine;
import com.liferay.portal.ext.model.impl.ModelConnectionLineImpl;
import com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl;
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
 * The persistence implementation for the model connection line service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see ModelConnectionLinePersistence
 * @see ModelConnectionLineUtil
 * @generated
 */
public class ModelConnectionLinePersistenceImpl extends BasePersistenceImpl<ModelConnectionLine>
	implements ModelConnectionLinePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ModelConnectionLineUtil} to access the model connection line persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ModelConnectionLineImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionLineModelImpl.FINDER_CACHE_ENABLED,
			ModelConnectionLineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionLineModelImpl.FINDER_CACHE_ENABLED,
			ModelConnectionLineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionLineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_C_C = new FinderPath(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionLineModelImpl.FINDER_CACHE_ENABLED,
			ModelConnectionLineImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByC_C",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C = new FinderPath(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionLineModelImpl.FINDER_CACHE_ENABLED,
			ModelConnectionLineImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByC_C",
			new String[] { Long.class.getName(), Long.class.getName() },
			ModelConnectionLineModelImpl.CLASSNAMEID_COLUMN_BITMASK |
			ModelConnectionLineModelImpl.CLASSPK_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C = new FinderPath(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionLineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_C",
			new String[] { Long.class.getName(), Long.class.getName() });

	/**
	 * Returns all the model connection lines where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @return the matching model connection lines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionLine> findByC_C(long classNameId, long classPK)
		throws SystemException {
		return findByC_C(classNameId, classPK, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the model connection lines where classNameId = &#63; and classPK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param start the lower bound of the range of model connection lines
	 * @param end the upper bound of the range of model connection lines (not inclusive)
	 * @return the range of matching model connection lines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionLine> findByC_C(long classNameId, long classPK,
		int start, int end) throws SystemException {
		return findByC_C(classNameId, classPK, start, end, null);
	}

	/**
	 * Returns an ordered range of all the model connection lines where classNameId = &#63; and classPK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param start the lower bound of the range of model connection lines
	 * @param end the upper bound of the range of model connection lines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching model connection lines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionLine> findByC_C(long classNameId, long classPK,
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

		List<ModelConnectionLine> list = (List<ModelConnectionLine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (ModelConnectionLine modelConnectionLine : list) {
				if ((classNameId != modelConnectionLine.getClassNameId()) ||
						(classPK != modelConnectionLine.getClassPK())) {
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

			query.append(_SQL_SELECT_MODELCONNECTIONLINE_WHERE);

			query.append(_FINDER_COLUMN_C_C_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_CLASSPK_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ModelConnectionLineModelImpl.ORDER_BY_JPQL);
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
					list = (List<ModelConnectionLine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ModelConnectionLine>(list);
				}
				else {
					list = (List<ModelConnectionLine>)QueryUtil.list(q,
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
	 * Returns the first model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching model connection line
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a matching model connection line could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine findByC_C_First(long classNameId, long classPK,
		OrderByComparator orderByComparator)
		throws NoSuchModelConnectionLineException, SystemException {
		ModelConnectionLine modelConnectionLine = fetchByC_C_First(classNameId,
				classPK, orderByComparator);

		if (modelConnectionLine != null) {
			return modelConnectionLine;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("classNameId=");
		msg.append(classNameId);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchModelConnectionLineException(msg.toString());
	}

	/**
	 * Returns the first model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching model connection line, or <code>null</code> if a matching model connection line could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine fetchByC_C_First(long classNameId, long classPK,
		OrderByComparator orderByComparator) throws SystemException {
		List<ModelConnectionLine> list = findByC_C(classNameId, classPK, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching model connection line
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a matching model connection line could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine findByC_C_Last(long classNameId, long classPK,
		OrderByComparator orderByComparator)
		throws NoSuchModelConnectionLineException, SystemException {
		ModelConnectionLine modelConnectionLine = fetchByC_C_Last(classNameId,
				classPK, orderByComparator);

		if (modelConnectionLine != null) {
			return modelConnectionLine;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("classNameId=");
		msg.append(classNameId);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchModelConnectionLineException(msg.toString());
	}

	/**
	 * Returns the last model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching model connection line, or <code>null</code> if a matching model connection line could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine fetchByC_C_Last(long classNameId, long classPK,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByC_C(classNameId, classPK);

		if (count == 0) {
			return null;
		}

		List<ModelConnectionLine> list = findByC_C(classNameId, classPK,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the model connection lines before and after the current model connection line in the ordered set where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param lineId the primary key of the current model connection line
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next model connection line
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a model connection line with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine[] findByC_C_PrevAndNext(long lineId,
		long classNameId, long classPK, OrderByComparator orderByComparator)
		throws NoSuchModelConnectionLineException, SystemException {
		ModelConnectionLine modelConnectionLine = findByPrimaryKey(lineId);

		Session session = null;

		try {
			session = openSession();

			ModelConnectionLine[] array = new ModelConnectionLineImpl[3];

			array[0] = getByC_C_PrevAndNext(session, modelConnectionLine,
					classNameId, classPK, orderByComparator, true);

			array[1] = modelConnectionLine;

			array[2] = getByC_C_PrevAndNext(session, modelConnectionLine,
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

	protected ModelConnectionLine getByC_C_PrevAndNext(Session session,
		ModelConnectionLine modelConnectionLine, long classNameId,
		long classPK, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MODELCONNECTIONLINE_WHERE);

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
			query.append(ModelConnectionLineModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(classNameId);

		qPos.add(classPK);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(modelConnectionLine);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ModelConnectionLine> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the model connection lines where classNameId = &#63; and classPK = &#63; from the database.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByC_C(long classNameId, long classPK)
		throws SystemException {
		for (ModelConnectionLine modelConnectionLine : findByC_C(classNameId,
				classPK, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(modelConnectionLine);
		}
	}

	/**
	 * Returns the number of model connection lines where classNameId = &#63; and classPK = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @return the number of matching model connection lines
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

			query.append(_SQL_COUNT_MODELCONNECTIONLINE_WHERE);

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

	private static final String _FINDER_COLUMN_C_C_CLASSNAMEID_2 = "modelConnectionLine.classNameId = ? AND ";
	private static final String _FINDER_COLUMN_C_C_CLASSPK_2 = "modelConnectionLine.classPK = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_C_C_LG = new FinderPath(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionLineModelImpl.FINDER_CACHE_ENABLED,
			ModelConnectionLineImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByC_C_LG",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			},
			ModelConnectionLineModelImpl.CLASSNAMEID_COLUMN_BITMASK |
			ModelConnectionLineModelImpl.CLASSPK_COLUMN_BITMASK |
			ModelConnectionLineModelImpl.LINEGROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_C_C_LG = new FinderPath(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionLineModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByC_C_LG",
			new String[] {
				Long.class.getName(), Long.class.getName(), Long.class.getName()
			});

	/**
	 * Returns the model connection line where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63; or throws a {@link com.liferay.portal.ext.NoSuchModelConnectionLineException} if it could not be found.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param lineGroupId the line group ID
	 * @return the matching model connection line
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a matching model connection line could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine findByC_C_LG(long classNameId, long classPK,
		long lineGroupId)
		throws NoSuchModelConnectionLineException, SystemException {
		ModelConnectionLine modelConnectionLine = fetchByC_C_LG(classNameId,
				classPK, lineGroupId);

		if (modelConnectionLine == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("classNameId=");
			msg.append(classNameId);

			msg.append(", classPK=");
			msg.append(classPK);

			msg.append(", lineGroupId=");
			msg.append(lineGroupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchModelConnectionLineException(msg.toString());
		}

		return modelConnectionLine;
	}

	/**
	 * Returns the model connection line where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param lineGroupId the line group ID
	 * @return the matching model connection line, or <code>null</code> if a matching model connection line could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine fetchByC_C_LG(long classNameId, long classPK,
		long lineGroupId) throws SystemException {
		return fetchByC_C_LG(classNameId, classPK, lineGroupId, true);
	}

	/**
	 * Returns the model connection line where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param lineGroupId the line group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching model connection line, or <code>null</code> if a matching model connection line could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine fetchByC_C_LG(long classNameId, long classPK,
		long lineGroupId, boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { classNameId, classPK, lineGroupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_C_C_LG,
					finderArgs, this);
		}

		if (result instanceof ModelConnectionLine) {
			ModelConnectionLine modelConnectionLine = (ModelConnectionLine)result;

			if ((classNameId != modelConnectionLine.getClassNameId()) ||
					(classPK != modelConnectionLine.getClassPK()) ||
					(lineGroupId != modelConnectionLine.getLineGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_MODELCONNECTIONLINE_WHERE);

			query.append(_FINDER_COLUMN_C_C_LG_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_LG_CLASSPK_2);

			query.append(_FINDER_COLUMN_C_C_LG_LINEGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				qPos.add(lineGroupId);

				List<ModelConnectionLine> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_LG,
						finderArgs, list);
				}
				else {
					ModelConnectionLine modelConnectionLine = list.get(0);

					result = modelConnectionLine;

					cacheResult(modelConnectionLine);

					if ((modelConnectionLine.getClassNameId() != classNameId) ||
							(modelConnectionLine.getClassPK() != classPK) ||
							(modelConnectionLine.getLineGroupId() != lineGroupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_LG,
							finderArgs, modelConnectionLine);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_C_LG,
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
			return (ModelConnectionLine)result;
		}
	}

	/**
	 * Removes the model connection line where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63; from the database.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param lineGroupId the line group ID
	 * @return the model connection line that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine removeByC_C_LG(long classNameId, long classPK,
		long lineGroupId)
		throws NoSuchModelConnectionLineException, SystemException {
		ModelConnectionLine modelConnectionLine = findByC_C_LG(classNameId,
				classPK, lineGroupId);

		return remove(modelConnectionLine);
	}

	/**
	 * Returns the number of model connection lines where classNameId = &#63; and classPK = &#63; and lineGroupId = &#63;.
	 *
	 * @param classNameId the class name ID
	 * @param classPK the class p k
	 * @param lineGroupId the line group ID
	 * @return the number of matching model connection lines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByC_C_LG(long classNameId, long classPK, long lineGroupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_C_C_LG;

		Object[] finderArgs = new Object[] { classNameId, classPK, lineGroupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_MODELCONNECTIONLINE_WHERE);

			query.append(_FINDER_COLUMN_C_C_LG_CLASSNAMEID_2);

			query.append(_FINDER_COLUMN_C_C_LG_CLASSPK_2);

			query.append(_FINDER_COLUMN_C_C_LG_LINEGROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(classNameId);

				qPos.add(classPK);

				qPos.add(lineGroupId);

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

	private static final String _FINDER_COLUMN_C_C_LG_CLASSNAMEID_2 = "modelConnectionLine.classNameId = ? AND ";
	private static final String _FINDER_COLUMN_C_C_LG_CLASSPK_2 = "modelConnectionLine.classPK = ? AND ";
	private static final String _FINDER_COLUMN_C_C_LG_LINEGROUPID_2 = "modelConnectionLine.lineGroupId = ?";

	public ModelConnectionLinePersistenceImpl() {
		setModelClass(ModelConnectionLine.class);
	}

	/**
	 * Caches the model connection line in the entity cache if it is enabled.
	 *
	 * @param modelConnectionLine the model connection line
	 */
	@Override
	public void cacheResult(ModelConnectionLine modelConnectionLine) {
		EntityCacheUtil.putResult(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionLineImpl.class, modelConnectionLine.getPrimaryKey(),
			modelConnectionLine);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_LG,
			new Object[] {
				modelConnectionLine.getClassNameId(),
				modelConnectionLine.getClassPK(),
				modelConnectionLine.getLineGroupId()
			}, modelConnectionLine);

		modelConnectionLine.resetOriginalValues();
	}

	/**
	 * Caches the model connection lines in the entity cache if it is enabled.
	 *
	 * @param modelConnectionLines the model connection lines
	 */
	@Override
	public void cacheResult(List<ModelConnectionLine> modelConnectionLines) {
		for (ModelConnectionLine modelConnectionLine : modelConnectionLines) {
			if (EntityCacheUtil.getResult(
						ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
						ModelConnectionLineImpl.class,
						modelConnectionLine.getPrimaryKey()) == null) {
				cacheResult(modelConnectionLine);
			}
			else {
				modelConnectionLine.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all model connection lines.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ModelConnectionLineImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ModelConnectionLineImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the model connection line.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ModelConnectionLine modelConnectionLine) {
		EntityCacheUtil.removeResult(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionLineImpl.class, modelConnectionLine.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(modelConnectionLine);
	}

	@Override
	public void clearCache(List<ModelConnectionLine> modelConnectionLines) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ModelConnectionLine modelConnectionLine : modelConnectionLines) {
			EntityCacheUtil.removeResult(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
				ModelConnectionLineImpl.class,
				modelConnectionLine.getPrimaryKey());

			clearUniqueFindersCache(modelConnectionLine);
		}
	}

	protected void cacheUniqueFindersCache(
		ModelConnectionLine modelConnectionLine) {
		if (modelConnectionLine.isNew()) {
			Object[] args = new Object[] {
					modelConnectionLine.getClassNameId(),
					modelConnectionLine.getClassPK(),
					modelConnectionLine.getLineGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_C_LG, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_LG, args,
				modelConnectionLine);
		}
		else {
			ModelConnectionLineModelImpl modelConnectionLineModelImpl = (ModelConnectionLineModelImpl)modelConnectionLine;

			if ((modelConnectionLineModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_C_C_LG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						modelConnectionLine.getClassNameId(),
						modelConnectionLine.getClassPK(),
						modelConnectionLine.getLineGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_C_C_LG, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_C_C_LG, args,
					modelConnectionLine);
			}
		}
	}

	protected void clearUniqueFindersCache(
		ModelConnectionLine modelConnectionLine) {
		ModelConnectionLineModelImpl modelConnectionLineModelImpl = (ModelConnectionLineModelImpl)modelConnectionLine;

		Object[] args = new Object[] {
				modelConnectionLine.getClassNameId(),
				modelConnectionLine.getClassPK(),
				modelConnectionLine.getLineGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C_LG, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_C_LG, args);

		if ((modelConnectionLineModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_C_C_LG.getColumnBitmask()) != 0) {
			args = new Object[] {
					modelConnectionLineModelImpl.getOriginalClassNameId(),
					modelConnectionLineModelImpl.getOriginalClassPK(),
					modelConnectionLineModelImpl.getOriginalLineGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C_LG, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_C_C_LG, args);
		}
	}

	/**
	 * Creates a new model connection line with the primary key. Does not add the model connection line to the database.
	 *
	 * @param lineId the primary key for the new model connection line
	 * @return the new model connection line
	 */
	@Override
	public ModelConnectionLine create(long lineId) {
		ModelConnectionLine modelConnectionLine = new ModelConnectionLineImpl();

		modelConnectionLine.setNew(true);
		modelConnectionLine.setPrimaryKey(lineId);

		return modelConnectionLine;
	}

	/**
	 * Removes the model connection line with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param lineId the primary key of the model connection line
	 * @return the model connection line that was removed
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a model connection line with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine remove(long lineId)
		throws NoSuchModelConnectionLineException, SystemException {
		return remove((Serializable)lineId);
	}

	/**
	 * Removes the model connection line with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the model connection line
	 * @return the model connection line that was removed
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a model connection line with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine remove(Serializable primaryKey)
		throws NoSuchModelConnectionLineException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ModelConnectionLine modelConnectionLine = (ModelConnectionLine)session.get(ModelConnectionLineImpl.class,
					primaryKey);

			if (modelConnectionLine == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchModelConnectionLineException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(modelConnectionLine);
		}
		catch (NoSuchModelConnectionLineException nsee) {
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
	protected ModelConnectionLine removeImpl(
		ModelConnectionLine modelConnectionLine) throws SystemException {
		modelConnectionLine = toUnwrappedModel(modelConnectionLine);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(modelConnectionLine)) {
				modelConnectionLine = (ModelConnectionLine)session.get(ModelConnectionLineImpl.class,
						modelConnectionLine.getPrimaryKeyObj());
			}

			if (modelConnectionLine != null) {
				session.delete(modelConnectionLine);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (modelConnectionLine != null) {
			clearCache(modelConnectionLine);
		}

		return modelConnectionLine;
	}

	@Override
	public ModelConnectionLine updateImpl(
		com.liferay.portal.ext.model.ModelConnectionLine modelConnectionLine)
		throws SystemException {
		modelConnectionLine = toUnwrappedModel(modelConnectionLine);

		boolean isNew = modelConnectionLine.isNew();

		ModelConnectionLineModelImpl modelConnectionLineModelImpl = (ModelConnectionLineModelImpl)modelConnectionLine;

		Session session = null;

		try {
			session = openSession();

			if (modelConnectionLine.isNew()) {
				session.save(modelConnectionLine);

				modelConnectionLine.setNew(false);
			}
			else {
				session.merge(modelConnectionLine);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ModelConnectionLineModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((modelConnectionLineModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						modelConnectionLineModelImpl.getOriginalClassNameId(),
						modelConnectionLineModelImpl.getOriginalClassPK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C,
					args);

				args = new Object[] {
						modelConnectionLineModelImpl.getClassNameId(),
						modelConnectionLineModelImpl.getClassPK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_C_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_C_C,
					args);
			}
		}

		EntityCacheUtil.putResult(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
			ModelConnectionLineImpl.class, modelConnectionLine.getPrimaryKey(),
			modelConnectionLine);

		clearUniqueFindersCache(modelConnectionLine);
		cacheUniqueFindersCache(modelConnectionLine);

		return modelConnectionLine;
	}

	protected ModelConnectionLine toUnwrappedModel(
		ModelConnectionLine modelConnectionLine) {
		if (modelConnectionLine instanceof ModelConnectionLineImpl) {
			return modelConnectionLine;
		}

		ModelConnectionLineImpl modelConnectionLineImpl = new ModelConnectionLineImpl();

		modelConnectionLineImpl.setNew(modelConnectionLine.isNew());
		modelConnectionLineImpl.setPrimaryKey(modelConnectionLine.getPrimaryKey());

		modelConnectionLineImpl.setLineId(modelConnectionLine.getLineId());
		modelConnectionLineImpl.setUserId(modelConnectionLine.getUserId());
		modelConnectionLineImpl.setUserName(modelConnectionLine.getUserName());
		modelConnectionLineImpl.setCreateDate(modelConnectionLine.getCreateDate());
		modelConnectionLineImpl.setModifiedDate(modelConnectionLine.getModifiedDate());
		modelConnectionLineImpl.setLineGroupId(modelConnectionLine.getLineGroupId());
		modelConnectionLineImpl.setClassNameId(modelConnectionLine.getClassNameId());
		modelConnectionLineImpl.setClassPK(modelConnectionLine.getClassPK());

		return modelConnectionLineImpl;
	}

	/**
	 * Returns the model connection line with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the model connection line
	 * @return the model connection line
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a model connection line with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelConnectionLineException, SystemException {
		ModelConnectionLine modelConnectionLine = fetchByPrimaryKey(primaryKey);

		if (modelConnectionLine == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchModelConnectionLineException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return modelConnectionLine;
	}

	/**
	 * Returns the model connection line with the primary key or throws a {@link com.liferay.portal.ext.NoSuchModelConnectionLineException} if it could not be found.
	 *
	 * @param lineId the primary key of the model connection line
	 * @return the model connection line
	 * @throws com.liferay.portal.ext.NoSuchModelConnectionLineException if a model connection line with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine findByPrimaryKey(long lineId)
		throws NoSuchModelConnectionLineException, SystemException {
		return findByPrimaryKey((Serializable)lineId);
	}

	/**
	 * Returns the model connection line with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the model connection line
	 * @return the model connection line, or <code>null</code> if a model connection line with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		ModelConnectionLine modelConnectionLine = (ModelConnectionLine)EntityCacheUtil.getResult(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
				ModelConnectionLineImpl.class, primaryKey);

		if (modelConnectionLine == _nullModelConnectionLine) {
			return null;
		}

		if (modelConnectionLine == null) {
			Session session = null;

			try {
				session = openSession();

				modelConnectionLine = (ModelConnectionLine)session.get(ModelConnectionLineImpl.class,
						primaryKey);

				if (modelConnectionLine != null) {
					cacheResult(modelConnectionLine);
				}
				else {
					EntityCacheUtil.putResult(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
						ModelConnectionLineImpl.class, primaryKey,
						_nullModelConnectionLine);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ModelConnectionLineModelImpl.ENTITY_CACHE_ENABLED,
					ModelConnectionLineImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return modelConnectionLine;
	}

	/**
	 * Returns the model connection line with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param lineId the primary key of the model connection line
	 * @return the model connection line, or <code>null</code> if a model connection line with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ModelConnectionLine fetchByPrimaryKey(long lineId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)lineId);
	}

	/**
	 * Returns all the model connection lines.
	 *
	 * @return the model connection lines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionLine> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the model connection lines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of model connection lines
	 * @param end the upper bound of the range of model connection lines (not inclusive)
	 * @return the range of model connection lines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionLine> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the model connection lines.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.ext.model.impl.ModelConnectionLineModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of model connection lines
	 * @param end the upper bound of the range of model connection lines (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of model connection lines
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<ModelConnectionLine> findAll(int start, int end,
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

		List<ModelConnectionLine> list = (List<ModelConnectionLine>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MODELCONNECTIONLINE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MODELCONNECTIONLINE;

				if (pagination) {
					sql = sql.concat(ModelConnectionLineModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ModelConnectionLine>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<ModelConnectionLine>(list);
				}
				else {
					list = (List<ModelConnectionLine>)QueryUtil.list(q,
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
	 * Removes all the model connection lines from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (ModelConnectionLine modelConnectionLine : findAll()) {
			remove(modelConnectionLine);
		}
	}

	/**
	 * Returns the number of model connection lines.
	 *
	 * @return the number of model connection lines
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

				Query q = session.createQuery(_SQL_COUNT_MODELCONNECTIONLINE);

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
	 * Initializes the model connection line persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.portal.util.PropsUtil.get(
						"value.object.listener.com.liferay.portal.ext.model.ModelConnectionLine")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ModelConnectionLine>> listenersList = new ArrayList<ModelListener<ModelConnectionLine>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ModelConnectionLine>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ModelConnectionLineImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MODELCONNECTIONLINE = "SELECT modelConnectionLine FROM ModelConnectionLine modelConnectionLine";
	private static final String _SQL_SELECT_MODELCONNECTIONLINE_WHERE = "SELECT modelConnectionLine FROM ModelConnectionLine modelConnectionLine WHERE ";
	private static final String _SQL_COUNT_MODELCONNECTIONLINE = "SELECT COUNT(modelConnectionLine) FROM ModelConnectionLine modelConnectionLine";
	private static final String _SQL_COUNT_MODELCONNECTIONLINE_WHERE = "SELECT COUNT(modelConnectionLine) FROM ModelConnectionLine modelConnectionLine WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "modelConnectionLine.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ModelConnectionLine exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ModelConnectionLine exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = com.liferay.portal.util.PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE;
	private static Log _log = LogFactoryUtil.getLog(ModelConnectionLinePersistenceImpl.class);
	private static ModelConnectionLine _nullModelConnectionLine = new ModelConnectionLineImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ModelConnectionLine> toCacheModel() {
				return _nullModelConnectionLineCacheModel;
			}
		};

	private static CacheModel<ModelConnectionLine> _nullModelConnectionLineCacheModel =
		new CacheModel<ModelConnectionLine>() {
			@Override
			public ModelConnectionLine toEntityModel() {
				return _nullModelConnectionLine;
			}
		};
}