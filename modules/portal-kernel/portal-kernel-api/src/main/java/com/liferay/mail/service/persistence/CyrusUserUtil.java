package com.liferay.mail.service.persistence;

import com.liferay.mail.model.CyrusUser;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the cyrus user service. This utility wraps {@link CyrusUserPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CyrusUserPersistence
 * @see CyrusUserPersistenceImpl
 * @generated
 */
public class CyrusUserUtil {
    private static CyrusUserPersistence _persistence;

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
    public static void clearCache(CyrusUser cyrusUser) {
        getPersistence().clearCache(cyrusUser);
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
    public static List<CyrusUser> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<CyrusUser> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<CyrusUser> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static CyrusUser update(CyrusUser cyrusUser)
        throws SystemException {
        return getPersistence().update(cyrusUser);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static CyrusUser update(CyrusUser cyrusUser,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(cyrusUser, serviceContext);
    }

    /**
    * Caches the cyrus user in the entity cache if it is enabled.
    *
    * @param cyrusUser the cyrus user
    */
    public static void cacheResult(com.liferay.mail.model.CyrusUser cyrusUser) {
        getPersistence().cacheResult(cyrusUser);
    }

    /**
    * Caches the cyrus users in the entity cache if it is enabled.
    *
    * @param cyrusUsers the cyrus users
    */
    public static void cacheResult(
        java.util.List<com.liferay.mail.model.CyrusUser> cyrusUsers) {
        getPersistence().cacheResult(cyrusUsers);
    }

    /**
    * Creates a new cyrus user with the primary key. Does not add the cyrus user to the database.
    *
    * @param userId the primary key for the new cyrus user
    * @return the new cyrus user
    */
    public static com.liferay.mail.model.CyrusUser create(
        java.lang.String userId) {
        return getPersistence().create(userId);
    }

    /**
    * Removes the cyrus user with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the cyrus user
    * @return the cyrus user that was removed
    * @throws com.liferay.mail.NoSuchCyrusUserException if a cyrus user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.mail.model.CyrusUser remove(
        java.lang.String userId)
        throws com.liferay.mail.NoSuchCyrusUserException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(userId);
    }

    public static com.liferay.mail.model.CyrusUser updateImpl(
        com.liferay.mail.model.CyrusUser cyrusUser)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(cyrusUser);
    }

    /**
    * Returns the cyrus user with the primary key or throws a {@link com.liferay.mail.NoSuchCyrusUserException} if it could not be found.
    *
    * @param userId the primary key of the cyrus user
    * @return the cyrus user
    * @throws com.liferay.mail.NoSuchCyrusUserException if a cyrus user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.mail.model.CyrusUser findByPrimaryKey(
        java.lang.String userId)
        throws com.liferay.mail.NoSuchCyrusUserException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(userId);
    }

    /**
    * Returns the cyrus user with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the cyrus user
    * @return the cyrus user, or <code>null</code> if a cyrus user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.mail.model.CyrusUser fetchByPrimaryKey(
        java.lang.String userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(userId);
    }

    /**
    * Returns all the cyrus users.
    *
    * @return the cyrus users
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.mail.model.CyrusUser> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.liferay.mail.model.CyrusUser> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<com.liferay.mail.model.CyrusUser> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the cyrus users from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of cyrus users.
    *
    * @return the number of cyrus users
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static CyrusUserPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (CyrusUserPersistence) PortalBeanLocatorUtil.locate(CyrusUserPersistence.class.getName());

            ReferenceRegistry.registerReference(CyrusUserUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(CyrusUserPersistence persistence) {
    }
}
