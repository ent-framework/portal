package com.liferay.portal.ext.service.persistence;

import com.liferay.portal.ext.model.FilterScope;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the filter scope service. This utility wraps {@link FilterScopePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Jeff Qian
 * @see FilterScopePersistence
 * @see FilterScopePersistenceImpl
 * @generated
 */
public class FilterScopeUtil {
    private static FilterScopePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(FilterScope filterScope) {
        getPersistence().clearCache(filterScope);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<FilterScope> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<FilterScope> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<FilterScope> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static FilterScope update(FilterScope filterScope)
        throws SystemException {
        return getPersistence().update(filterScope);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static FilterScope update(FilterScope filterScope,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(filterScope, serviceContext);
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
    public static com.liferay.portal.ext.model.FilterScope findByFC(
        java.lang.String className, java.lang.String filterName)
        throws com.liferay.portal.ext.NoSuchFilterScopeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFC(className, filterName);
    }

    /**
    * Returns the filter scope where className = &#63; and filterName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param className the class name
    * @param filterName the filter name
    * @return the matching filter scope, or <code>null</code> if a matching filter scope could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.ext.model.FilterScope fetchByFC(
        java.lang.String className, java.lang.String filterName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByFC(className, filterName);
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
    public static com.liferay.portal.ext.model.FilterScope fetchByFC(
        java.lang.String className, java.lang.String filterName,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFC(className, filterName, retrieveFromCache);
    }

    /**
    * Removes the filter scope where className = &#63; and filterName = &#63; from the database.
    *
    * @param className the class name
    * @param filterName the filter name
    * @return the filter scope that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.ext.model.FilterScope removeByFC(
        java.lang.String className, java.lang.String filterName)
        throws com.liferay.portal.ext.NoSuchFilterScopeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByFC(className, filterName);
    }

    /**
    * Returns the number of filter scopes where className = &#63; and filterName = &#63;.
    *
    * @param className the class name
    * @param filterName the filter name
    * @return the number of matching filter scopes
    * @throws SystemException if a system exception occurred
    */
    public static int countByFC(java.lang.String className,
        java.lang.String filterName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByFC(className, filterName);
    }

    /**
    * Returns all the filter scopes where className = &#63;.
    *
    * @param className the class name
    * @return the matching filter scopes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portal.ext.model.FilterScope> findByClassName(
        java.lang.String className)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByClassName(className);
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
    public static java.util.List<com.liferay.portal.ext.model.FilterScope> findByClassName(
        java.lang.String className, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByClassName(className, start, end);
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
    public static java.util.List<com.liferay.portal.ext.model.FilterScope> findByClassName(
        java.lang.String className, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassName(className, start, end, orderByComparator);
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
    public static com.liferay.portal.ext.model.FilterScope findByClassName_First(
        java.lang.String className,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.ext.NoSuchFilterScopeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassName_First(className, orderByComparator);
    }

    /**
    * Returns the first filter scope in the ordered set where className = &#63;.
    *
    * @param className the class name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching filter scope, or <code>null</code> if a matching filter scope could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.ext.model.FilterScope fetchByClassName_First(
        java.lang.String className,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassName_First(className, orderByComparator);
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
    public static com.liferay.portal.ext.model.FilterScope findByClassName_Last(
        java.lang.String className,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.ext.NoSuchFilterScopeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassName_Last(className, orderByComparator);
    }

    /**
    * Returns the last filter scope in the ordered set where className = &#63;.
    *
    * @param className the class name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching filter scope, or <code>null</code> if a matching filter scope could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.ext.model.FilterScope fetchByClassName_Last(
        java.lang.String className,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassName_Last(className, orderByComparator);
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
    public static com.liferay.portal.ext.model.FilterScope[] findByClassName_PrevAndNext(
        long filterScopeId, java.lang.String className,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.ext.NoSuchFilterScopeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassName_PrevAndNext(filterScopeId, className,
            orderByComparator);
    }

    /**
    * Removes all the filter scopes where className = &#63; from the database.
    *
    * @param className the class name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByClassName(java.lang.String className)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByClassName(className);
    }

    /**
    * Returns the number of filter scopes where className = &#63;.
    *
    * @param className the class name
    * @return the number of matching filter scopes
    * @throws SystemException if a system exception occurred
    */
    public static int countByClassName(java.lang.String className)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByClassName(className);
    }

    /**
    * Caches the filter scope in the entity cache if it is enabled.
    *
    * @param filterScope the filter scope
    */
    public static void cacheResult(
        com.liferay.portal.ext.model.FilterScope filterScope) {
        getPersistence().cacheResult(filterScope);
    }

    /**
    * Caches the filter scopes in the entity cache if it is enabled.
    *
    * @param filterScopes the filter scopes
    */
    public static void cacheResult(
        java.util.List<com.liferay.portal.ext.model.FilterScope> filterScopes) {
        getPersistence().cacheResult(filterScopes);
    }

    /**
    * Creates a new filter scope with the primary key. Does not add the filter scope to the database.
    *
    * @param filterScopeId the primary key for the new filter scope
    * @return the new filter scope
    */
    public static com.liferay.portal.ext.model.FilterScope create(
        long filterScopeId) {
        return getPersistence().create(filterScopeId);
    }

    /**
    * Removes the filter scope with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param filterScopeId the primary key of the filter scope
    * @return the filter scope that was removed
    * @throws com.liferay.portal.ext.NoSuchFilterScopeException if a filter scope with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.ext.model.FilterScope remove(
        long filterScopeId)
        throws com.liferay.portal.ext.NoSuchFilterScopeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(filterScopeId);
    }

    public static com.liferay.portal.ext.model.FilterScope updateImpl(
        com.liferay.portal.ext.model.FilterScope filterScope)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(filterScope);
    }

    /**
    * Returns the filter scope with the primary key or throws a {@link com.liferay.portal.ext.NoSuchFilterScopeException} if it could not be found.
    *
    * @param filterScopeId the primary key of the filter scope
    * @return the filter scope
    * @throws com.liferay.portal.ext.NoSuchFilterScopeException if a filter scope with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.ext.model.FilterScope findByPrimaryKey(
        long filterScopeId)
        throws com.liferay.portal.ext.NoSuchFilterScopeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(filterScopeId);
    }

    /**
    * Returns the filter scope with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param filterScopeId the primary key of the filter scope
    * @return the filter scope, or <code>null</code> if a filter scope with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.portal.ext.model.FilterScope fetchByPrimaryKey(
        long filterScopeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(filterScopeId);
    }

    /**
    * Returns all the filter scopes.
    *
    * @return the filter scopes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.portal.ext.model.FilterScope> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.liferay.portal.ext.model.FilterScope> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<com.liferay.portal.ext.model.FilterScope> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the filter scopes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of filter scopes.
    *
    * @return the number of filter scopes
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static FilterScopePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (FilterScopePersistence) PortalBeanLocatorUtil.locate(FilterScopePersistence.class.getName());

            ReferenceRegistry.registerReference(FilterScopeUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(FilterScopePersistence persistence) {
    }
}
