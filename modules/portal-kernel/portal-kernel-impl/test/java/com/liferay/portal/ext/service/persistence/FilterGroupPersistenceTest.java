package com.liferay.portal.ext.service.persistence;

import com.liferay.portal.ext.NoSuchFilterGroupException;
import com.liferay.portal.ext.model.FilterGroup;
import com.liferay.portal.ext.model.impl.FilterGroupModelImpl;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.liferay.portal.kernel.test.ExecutionTestListeners;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.ServiceTestUtil;
import com.liferay.portal.service.persistence.BasePersistence;
import com.liferay.portal.service.persistence.PersistenceExecutionTestListener;
import com.liferay.portal.test.LiferayPersistenceIntegrationJUnitTestRunner;
import com.liferay.portal.test.persistence.TransactionalPersistenceAdvice;
import com.liferay.portal.util.PropsValues;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;


@ExecutionTestListeners(listeners =  {
    PersistenceExecutionTestListener.class}
)
@RunWith(LiferayPersistenceIntegrationJUnitTestRunner.class)
public class FilterGroupPersistenceTest {
    private static final Logger _log = LoggerFactory.getLogger(FilterGroupPersistenceTest.class);
    private FilterGroupPersistence _persistence = (FilterGroupPersistence) PortalBeanLocatorUtil.locate(FilterGroupPersistence.class.getName());
    private TransactionalPersistenceAdvice _transactionalPersistenceAdvice = (TransactionalPersistenceAdvice) PortalBeanLocatorUtil.locate(TransactionalPersistenceAdvice.class.getName());

    @After
    public void tearDown() throws Exception {
        Map<Serializable, BasePersistence<?>> basePersistences = _transactionalPersistenceAdvice.getBasePersistences();

        Set<Serializable> primaryKeys = basePersistences.keySet();

        for (Serializable primaryKey : primaryKeys) {
            BasePersistence<?> basePersistence = basePersistences.get(primaryKey);

            try {
                basePersistence.remove(primaryKey);
            } catch (Exception e) {
                if (_log.isDebugEnabled()) {
                    _log.debug("The model with primary key " + primaryKey +
                        " was already deleted");
                }
            }
        }

        _transactionalPersistenceAdvice.reset();
    }

    @Test
    public void testCreate() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        FilterGroup filterGroup = _persistence.create(pk);

        Assert.assertNotNull(filterGroup);

        Assert.assertEquals(filterGroup.getPrimaryKey(), pk);
    }

    @Test
    public void testRemove() throws Exception {
        FilterGroup newFilterGroup = addFilterGroup();

        _persistence.remove(newFilterGroup);

        FilterGroup existingFilterGroup = _persistence.fetchByPrimaryKey(newFilterGroup.getPrimaryKey());

        Assert.assertNull(existingFilterGroup);
    }

    @Test
    public void testUpdateNew() throws Exception {
        addFilterGroup();
    }

    @Test
    public void testUpdateExisting() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        FilterGroup newFilterGroup = _persistence.create(pk);

        newFilterGroup.setUuid(ServiceTestUtil.randomString());

        newFilterGroup.setUserId(ServiceTestUtil.nextLong());

        newFilterGroup.setUserName(ServiceTestUtil.randomString());

        newFilterGroup.setCreateDate(ServiceTestUtil.nextDate());

        newFilterGroup.setModifiedDate(ServiceTestUtil.nextDate());

        newFilterGroup.setGroupId(ServiceTestUtil.nextLong());

        newFilterGroup.setFilterScopeId(ServiceTestUtil.nextLong());

        _persistence.update(newFilterGroup);

        FilterGroup existingFilterGroup = _persistence.findByPrimaryKey(newFilterGroup.getPrimaryKey());

        Assert.assertEquals(existingFilterGroup.getUuid(),
            newFilterGroup.getUuid());
        Assert.assertEquals(existingFilterGroup.getFilterGroupId(),
            newFilterGroup.getFilterGroupId());
        Assert.assertEquals(existingFilterGroup.getUserId(),
            newFilterGroup.getUserId());
        Assert.assertEquals(existingFilterGroup.getUserName(),
            newFilterGroup.getUserName());
        Assert.assertEquals(Time.getShortTimestamp(
                existingFilterGroup.getCreateDate()),
            Time.getShortTimestamp(newFilterGroup.getCreateDate()));
        Assert.assertEquals(Time.getShortTimestamp(
                existingFilterGroup.getModifiedDate()),
            Time.getShortTimestamp(newFilterGroup.getModifiedDate()));
        Assert.assertEquals(existingFilterGroup.getGroupId(),
            newFilterGroup.getGroupId());
        Assert.assertEquals(existingFilterGroup.getFilterScopeId(),
            newFilterGroup.getFilterScopeId());
    }

    @Test
    public void testFindByPrimaryKeyExisting() throws Exception {
        FilterGroup newFilterGroup = addFilterGroup();

        FilterGroup existingFilterGroup = _persistence.findByPrimaryKey(newFilterGroup.getPrimaryKey());

        Assert.assertEquals(existingFilterGroup, newFilterGroup);
    }

    @Test
    public void testFindByPrimaryKeyMissing() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        try {
            _persistence.findByPrimaryKey(pk);

            Assert.fail(
                "Missing entity did not throw NoSuchFilterGroupException");
        } catch (NoSuchFilterGroupException nsee) {
        }
    }

    @Test
    public void testFindAll() throws Exception {
        try {
            _persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
                getOrderByComparator());
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    protected OrderByComparator getOrderByComparator() {
        return OrderByComparatorFactoryUtil.create("FilterGroup", "uuid", true,
            "filterGroupId", true, "userId", true, "userName", true,
            "createDate", true, "modifiedDate", true, "groupId", true,
            "filterScopeId", true);
    }

    @Test
    public void testFetchByPrimaryKeyExisting() throws Exception {
        FilterGroup newFilterGroup = addFilterGroup();

        FilterGroup existingFilterGroup = _persistence.fetchByPrimaryKey(newFilterGroup.getPrimaryKey());

        Assert.assertEquals(existingFilterGroup, newFilterGroup);
    }

    @Test
    public void testFetchByPrimaryKeyMissing() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        FilterGroup missingFilterGroup = _persistence.fetchByPrimaryKey(pk);

        Assert.assertNull(missingFilterGroup);
    }

    @Test
    public void testActionableDynamicQuery() throws Exception {
        final IntegerWrapper count = new IntegerWrapper();

        ActionableDynamicQuery actionableDynamicQuery = new FilterGroupActionableDynamicQuery() {
                @Override
                protected void performAction(Object object) {
                    FilterGroup filterGroup = (FilterGroup) object;

                    Assert.assertNotNull(filterGroup);

                    count.increment();
                }
            };

        actionableDynamicQuery.performActions();

        Assert.assertEquals(count.getValue(), _persistence.countAll());
    }

    @Test
    public void testDynamicQueryByPrimaryKeyExisting()
        throws Exception {
        FilterGroup newFilterGroup = addFilterGroup();

        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(FilterGroup.class,
                FilterGroup.class.getClassLoader());

        dynamicQuery.add(RestrictionsFactoryUtil.eq("filterGroupId",
                newFilterGroup.getFilterGroupId()));

        List<FilterGroup> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(1, result.size());

        FilterGroup existingFilterGroup = result.get(0);

        Assert.assertEquals(existingFilterGroup, newFilterGroup);
    }

    @Test
    public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(FilterGroup.class,
                FilterGroup.class.getClassLoader());

        dynamicQuery.add(RestrictionsFactoryUtil.eq("filterGroupId",
                ServiceTestUtil.nextLong()));

        List<FilterGroup> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testDynamicQueryByProjectionExisting()
        throws Exception {
        FilterGroup newFilterGroup = addFilterGroup();

        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(FilterGroup.class,
                FilterGroup.class.getClassLoader());

        dynamicQuery.setProjection(ProjectionFactoryUtil.property(
                "filterGroupId"));

        Object newFilterGroupId = newFilterGroup.getFilterGroupId();

        dynamicQuery.add(RestrictionsFactoryUtil.in("filterGroupId",
                new Object[] { newFilterGroupId }));

        List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(1, result.size());

        Object existingFilterGroupId = result.get(0);

        Assert.assertEquals(existingFilterGroupId, newFilterGroupId);
    }

    @Test
    public void testDynamicQueryByProjectionMissing() throws Exception {
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(FilterGroup.class,
                FilterGroup.class.getClassLoader());

        dynamicQuery.setProjection(ProjectionFactoryUtil.property(
                "filterGroupId"));

        dynamicQuery.add(RestrictionsFactoryUtil.in("filterGroupId",
                new Object[] { ServiceTestUtil.nextLong() }));

        List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testResetOriginalValues() throws Exception {
        if (!PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            return;
        }

        FilterGroup newFilterGroup = addFilterGroup();

        _persistence.clearCache();

        FilterGroupModelImpl existingFilterGroupModelImpl = (FilterGroupModelImpl) _persistence.findByPrimaryKey(newFilterGroup.getPrimaryKey());

        Assert.assertTrue(Validator.equals(
                existingFilterGroupModelImpl.getUuid(),
                existingFilterGroupModelImpl.getOriginalUuid()));
        Assert.assertEquals(existingFilterGroupModelImpl.getGroupId(),
            existingFilterGroupModelImpl.getOriginalGroupId());

        Assert.assertEquals(existingFilterGroupModelImpl.getGroupId(),
            existingFilterGroupModelImpl.getOriginalGroupId());
        Assert.assertEquals(existingFilterGroupModelImpl.getFilterScopeId(),
            existingFilterGroupModelImpl.getOriginalFilterScopeId());
    }

    protected FilterGroup addFilterGroup() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        FilterGroup filterGroup = _persistence.create(pk);

        filterGroup.setUuid(ServiceTestUtil.randomString());

        filterGroup.setUserId(ServiceTestUtil.nextLong());

        filterGroup.setUserName(ServiceTestUtil.randomString());

        filterGroup.setCreateDate(ServiceTestUtil.nextDate());

        filterGroup.setModifiedDate(ServiceTestUtil.nextDate());

        filterGroup.setGroupId(ServiceTestUtil.nextLong());

        filterGroup.setFilterScopeId(ServiceTestUtil.nextLong());

        _persistence.update(filterGroup);

        return filterGroup;
    }
}
