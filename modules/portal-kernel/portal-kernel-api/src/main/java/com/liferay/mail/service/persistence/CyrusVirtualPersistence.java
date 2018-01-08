package com.liferay.mail.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.mail.model.CyrusVirtual;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the cyrus virtual service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CyrusVirtualPersistenceImpl
 * @see CyrusVirtualUtil
 * @generated
 */
@ProviderType
public interface CyrusVirtualPersistence extends BasePersistence<CyrusVirtual> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CyrusVirtualUtil} to access the cyrus virtual persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the cyrus virtual in the entity cache if it is enabled.
    *
    * @param cyrusVirtual the cyrus virtual
    */
    public void cacheResult(com.liferay.mail.model.CyrusVirtual cyrusVirtual);

    /**
    * Caches the cyrus virtuals in the entity cache if it is enabled.
    *
    * @param cyrusVirtuals the cyrus virtuals
    */
    public void cacheResult(
        java.util.List<com.liferay.mail.model.CyrusVirtual> cyrusVirtuals);

    /**
    * Creates a new cyrus virtual with the primary key. Does not add the cyrus virtual to the database.
    *
    * @param emailAddress the primary key for the new cyrus virtual
    * @return the new cyrus virtual
    */
    public com.liferay.mail.model.CyrusVirtual create(
        java.lang.String emailAddress);

    /**
    * Removes the cyrus virtual with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param emailAddress the primary key of the cyrus virtual
    * @return the cyrus virtual that was removed
    * @throws com.liferay.mail.NoSuchCyrusVirtualException if a cyrus virtual with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mail.model.CyrusVirtual remove(
        java.lang.String emailAddress)
        throws com.liferay.mail.NoSuchCyrusVirtualException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.mail.model.CyrusVirtual updateImpl(
        com.liferay.mail.model.CyrusVirtual cyrusVirtual)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the cyrus virtual with the primary key or throws a {@link com.liferay.mail.NoSuchCyrusVirtualException} if it could not be found.
    *
    * @param emailAddress the primary key of the cyrus virtual
    * @return the cyrus virtual
    * @throws com.liferay.mail.NoSuchCyrusVirtualException if a cyrus virtual with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mail.model.CyrusVirtual findByPrimaryKey(
        java.lang.String emailAddress)
        throws com.liferay.mail.NoSuchCyrusVirtualException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the cyrus virtual with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param emailAddress the primary key of the cyrus virtual
    * @return the cyrus virtual, or <code>null</code> if a cyrus virtual with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.mail.model.CyrusVirtual fetchByPrimaryKey(
        java.lang.String emailAddress)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the cyrus virtuals.
    *
    * @return the cyrus virtuals
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.mail.model.CyrusVirtual> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.mail.model.CyrusVirtual> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.mail.model.CyrusVirtual> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the cyrus virtuals from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of cyrus virtuals.
    *
    * @return the number of cyrus virtuals
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
