package com.liferay.mail.service.persistence;

import com.liferay.mail.model.CyrusUser;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the cyrus user service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CyrusUserPersistenceImpl
 * @see CyrusUserUtil
 * @generated
 */
public interface CyrusUserPersistence extends BasePersistence<CyrusUser> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CyrusUserUtil} to access the cyrus user persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the cyrus user in the entity cache if it is enabled.
    *
    * @param cyrusUser the cyrus user
    */
    public void cacheResult(com.liferay.mail.model.CyrusUser cyrusUser);

    /**
    * Caches the cyrus users in the entity cache if it is enabled.
    *
    * @param cyrusUsers the cyrus users
    */
    public void cacheResult(
        java.util.List<com.liferay.mail.model.CyrusUser> cyrusUsers);

    /**
    * Creates a new cyrus user with the primary key. Does not add the cyrus user to the database.
    *
    * @param userId the primary key for the new cyrus user
    * @return the new cyrus user
    */
    public com.liferay.mail.model.CyrusUser create(java.lang.String userId);

    /**
    * Removes the cyrus user with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the cyrus user
    * @return the cyrus user that was removed
    * @throws com.liferay.mail.NoSuchCyrusUserException if a cyrus user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mail.model.CyrusUser remove(java.lang.String userId)
        throws com.liferay.mail.NoSuchCyrusUserException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.mail.model.CyrusUser updateImpl(
        com.liferay.mail.model.CyrusUser cyrusUser)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the cyrus user with the primary key or throws a {@link com.liferay.mail.NoSuchCyrusUserException} if it could not be found.
    *
    * @param userId the primary key of the cyrus user
    * @return the cyrus user
    * @throws com.liferay.mail.NoSuchCyrusUserException if a cyrus user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mail.model.CyrusUser findByPrimaryKey(
        java.lang.String userId)
        throws com.liferay.mail.NoSuchCyrusUserException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the cyrus user with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the cyrus user
    * @return the cyrus user, or <code>null</code> if a cyrus user with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mail.model.CyrusUser fetchByPrimaryKey(
        java.lang.String userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the cyrus users.
    *
    * @return the cyrus users
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.mail.model.CyrusUser> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.mail.model.CyrusUser> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.mail.model.CyrusUser> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the cyrus users from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of cyrus users.
    *
    * @return the number of cyrus users
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
