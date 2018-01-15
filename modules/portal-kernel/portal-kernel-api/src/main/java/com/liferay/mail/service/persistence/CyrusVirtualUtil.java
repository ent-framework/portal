package com.liferay.mail.service.persistence;

import com.liferay.mail.model.CyrusVirtual;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the cyrus virtual service. This utility wraps {@link CyrusVirtualPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CyrusVirtualPersistence
 * @see CyrusVirtualPersistenceImpl
 * @generated
 */
public class CyrusVirtualUtil {
    private static CyrusVirtualPersistence _persistence;

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
    public static void clearCache(CyrusVirtual cyrusVirtual) {
        getPersistence().clearCache(cyrusVirtual);
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
    public static List<CyrusVirtual> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<CyrusVirtual> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<CyrusVirtual> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static CyrusVirtual update(CyrusVirtual cyrusVirtual)
        throws SystemException {
        return getPersistence().update(cyrusVirtual);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static CyrusVirtual update(CyrusVirtual cyrusVirtual,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(cyrusVirtual, serviceContext);
    }

    /**
    * Caches the cyrus virtual in the entity cache if it is enabled.
    *
    * @param cyrusVirtual the cyrus virtual
    */
    public static void cacheResult(
        com.liferay.mail.model.CyrusVirtual cyrusVirtual) {
        getPersistence().cacheResult(cyrusVirtual);
    }

    /**
    * Caches the cyrus virtuals in the entity cache if it is enabled.
    *
    * @param cyrusVirtuals the cyrus virtuals
    */
    public static void cacheResult(
        java.util.List<com.liferay.mail.model.CyrusVirtual> cyrusVirtuals) {
        getPersistence().cacheResult(cyrusVirtuals);
    }

    /**
    * Creates a new cyrus virtual with the primary key. Does not add the cyrus virtual to the database.
    *
    * @param emailAddress the primary key for the new cyrus virtual
    * @return the new cyrus virtual
    */
    public static com.liferay.mail.model.CyrusVirtual create(
        java.lang.String emailAddress) {
        return getPersistence().create(emailAddress);
    }

    /**
    * Removes the cyrus virtual with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param emailAddress the primary key of the cyrus virtual
    * @return the cyrus virtual that was removed
    * @throws com.liferay.mail.NoSuchCyrusVirtualException if a cyrus virtual with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.mail.model.CyrusVirtual remove(
        java.lang.String emailAddress)
        throws com.liferay.mail.NoSuchCyrusVirtualException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(emailAddress);
    }

    public static com.liferay.mail.model.CyrusVirtual updateImpl(
        com.liferay.mail.model.CyrusVirtual cyrusVirtual)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(cyrusVirtual);
    }

    /**
    * Returns the cyrus virtual with the primary key or throws a {@link com.liferay.mail.NoSuchCyrusVirtualException} if it could not be found.
    *
    * @param emailAddress the primary key of the cyrus virtual
    * @return the cyrus virtual
    * @throws com.liferay.mail.NoSuchCyrusVirtualException if a cyrus virtual with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.mail.model.CyrusVirtual findByPrimaryKey(
        java.lang.String emailAddress)
        throws com.liferay.mail.NoSuchCyrusVirtualException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(emailAddress);
    }

    /**
    * Returns the cyrus virtual with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param emailAddress the primary key of the cyrus virtual
    * @return the cyrus virtual, or <code>null</code> if a cyrus virtual with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.mail.model.CyrusVirtual fetchByPrimaryKey(
        java.lang.String emailAddress)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(emailAddress);
    }

    /**
    * Returns all the cyrus virtuals.
    *
    * @return the cyrus virtuals
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.mail.model.CyrusVirtual> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.liferay.mail.model.CyrusVirtual> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<com.liferay.mail.model.CyrusVirtual> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the cyrus virtuals from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of cyrus virtuals.
    *
    * @return the number of cyrus virtuals
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static CyrusVirtualPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (CyrusVirtualPersistence) PortalBeanLocatorUtil.locate(CyrusVirtualPersistence.class.getName());

            ReferenceRegistry.registerReference(CyrusVirtualUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(CyrusVirtualPersistence persistence) {
    }
}
