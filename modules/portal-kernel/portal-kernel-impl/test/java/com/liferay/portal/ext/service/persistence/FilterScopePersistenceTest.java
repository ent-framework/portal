package com.liferay.portal.ext.service.persistence;

import com.liferay.portal.ext.NoSuchFilterScopeException;
import com.liferay.portal.ext.model.FilterScope;
import com.liferay.portal.ext.model.impl.FilterScopeModelImpl;
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
public class FilterScopePersistenceTest {
    private static final Logger _log = LoggerFactory.getLogger(FilterScopePersistenceTest.class);
    private FilterScopePersistence _persistence = (FilterScopePersistence) PortalBeanLocatorUtil.locate(FilterScopePersistence.class.getName());
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

        FilterScope filterScope = _persistence.create(pk);

        Assert.assertNotNull(filterScope);

        Assert.assertEquals(filterScope.getPrimaryKey(), pk);
    }

    @Test
    public void testRemove() throws Exception {
        FilterScope newFilterScope = addFilterScope();

        _persistence.remove(newFilterScope);

        FilterScope existingFilterScope = _persistence.fetchByPrimaryKey(newFilterScope.getPrimaryKey());

        Assert.assertNull(existingFilterScope);
    }

    @Test
    public void testUpdateNew() throws Exception {
        addFilterScope();
    }

    @Test
    public void testUpdateExisting() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        FilterScope newFilterScope = _persistence.create(pk);

        newFilterScope.setFilterName(ServiceTestUtil.randomString());

        newFilterScope.setClassName(ServiceTestUtil.randomString());

        _persistence.update(newFilterScope);

        FilterScope existingFilterScope = _persistence.findByPrimaryKey(newFilterScope.getPrimaryKey());

        Assert.assertEquals(existingFilterScope.getFilterScopeId(),
            newFilterScope.getFilterScopeId());
        Assert.assertEquals(existingFilterScope.getFilterName(),
            newFilterScope.getFilterName());
        Assert.assertEquals(existingFilterScope.getClassName(),
            newFilterScope.getClassName());
    }

    @Test
    public void testFindByPrimaryKeyExisting() throws Exception {
        FilterScope newFilterScope = addFilterScope();

        FilterScope existingFilterScope = _persistence.findByPrimaryKey(newFilterScope.getPrimaryKey());

        Assert.assertEquals(existingFilterScope, newFilterScope);
    }

    @Test
    public void testFindByPrimaryKeyMissing() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        try {
            _persistence.findByPrimaryKey(pk);

            Assert.fail(
                "Missing entity did not throw NoSuchFilterScopeException");
        } catch (NoSuchFilterScopeException nsee) {
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
        return OrderByComparatorFactoryUtil.create("FilterScope",
            "filterScopeId", true, "filterName", true, "className", true);
    }

    @Test
    public void testFetchByPrimaryKeyExisting() throws Exception {
        FilterScope newFilterScope = addFilterScope();

        FilterScope existingFilterScope = _persistence.fetchByPrimaryKey(newFilterScope.getPrimaryKey());

        Assert.assertEquals(existingFilterScope, newFilterScope);
    }

    @Test
    public void testFetchByPrimaryKeyMissing() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        FilterScope missingFilterScope = _persistence.fetchByPrimaryKey(pk);

        Assert.assertNull(missingFilterScope);
    }

    @Test
    public void testActionableDynamicQuery() throws Exception {
        final IntegerWrapper count = new IntegerWrapper();

        ActionableDynamicQuery actionableDynamicQuery = new FilterScopeActionableDynamicQuery() {
                @Override
                protected void performAction(Object object) {
                    FilterScope filterScope = (FilterScope) object;

                    Assert.assertNotNull(filterScope);

                    count.increment();
                }
            };

        actionableDynamicQuery.performActions();

        Assert.assertEquals(count.getValue(), _persistence.countAll());
    }

    @Test
    public void testDynamicQueryByPrimaryKeyExisting()
        throws Exception {
        FilterScope newFilterScope = addFilterScope();

        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(FilterScope.class,
                FilterScope.class.getClassLoader());

        dynamicQuery.add(RestrictionsFactoryUtil.eq("filterScopeId",
                newFilterScope.getFilterScopeId()));

        List<FilterScope> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(1, result.size());

        FilterScope existingFilterScope = result.get(0);

        Assert.assertEquals(existingFilterScope, newFilterScope);
    }

    @Test
    public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(FilterScope.class,
                FilterScope.class.getClassLoader());

        dynamicQuery.add(RestrictionsFactoryUtil.eq("filterScopeId",
                ServiceTestUtil.nextLong()));

        List<FilterScope> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testDynamicQueryByProjectionExisting()
        throws Exception {
        FilterScope newFilterScope = addFilterScope();

        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(FilterScope.class,
                FilterScope.class.getClassLoader());

        dynamicQuery.setProjection(ProjectionFactoryUtil.property(
                "filterScopeId"));

        Object newFilterScopeId = newFilterScope.getFilterScopeId();

        dynamicQuery.add(RestrictionsFactoryUtil.in("filterScopeId",
                new Object[] { newFilterScopeId }));

        List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(1, result.size());

        Object existingFilterScopeId = result.get(0);

        Assert.assertEquals(existingFilterScopeId, newFilterScopeId);
    }

    @Test
    public void testDynamicQueryByProjectionMissing() throws Exception {
        DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(FilterScope.class,
                FilterScope.class.getClassLoader());

        dynamicQuery.setProjection(ProjectionFactoryUtil.property(
                "filterScopeId"));

        dynamicQuery.add(RestrictionsFactoryUtil.in("filterScopeId",
                new Object[] { ServiceTestUtil.nextLong() }));

        List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testResetOriginalValues() throws Exception {
        if (!PropsValues.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            return;
        }

        FilterScope newFilterScope = addFilterScope();

        _persistence.clearCache();

        FilterScopeModelImpl existingFilterScopeModelImpl = (FilterScopeModelImpl) _persistence.findByPrimaryKey(newFilterScope.getPrimaryKey());

        Assert.assertTrue(Validator.equals(
                existingFilterScopeModelImpl.getClassName(),
                existingFilterScopeModelImpl.getOriginalClassName()));
        Assert.assertTrue(Validator.equals(
                existingFilterScopeModelImpl.getFilterName(),
                existingFilterScopeModelImpl.getOriginalFilterName()));
    }

    protected FilterScope addFilterScope() throws Exception {
        long pk = ServiceTestUtil.nextLong();

        FilterScope filterScope = _persistence.create(pk);

        filterScope.setFilterName(ServiceTestUtil.randomString());

        filterScope.setClassName(ServiceTestUtil.randomString());

        _persistence.update(filterScope);

        return filterScope;
    }
}
