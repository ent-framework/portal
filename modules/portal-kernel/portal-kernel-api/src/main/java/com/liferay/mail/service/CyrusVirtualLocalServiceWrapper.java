package com.liferay.mail.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CyrusVirtualLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CyrusVirtualLocalService
 * @generated
 */
@ProviderType
public class CyrusVirtualLocalServiceWrapper implements CyrusVirtualLocalService,
    ServiceWrapper<CyrusVirtualLocalService> {
    private CyrusVirtualLocalService _cyrusVirtualLocalService;

    public CyrusVirtualLocalServiceWrapper(
        CyrusVirtualLocalService cyrusVirtualLocalService) {
        _cyrusVirtualLocalService = cyrusVirtualLocalService;
    }

    /**
    * Adds the cyrus virtual to the database. Also notifies the appropriate model listeners.
    *
    * @param cyrusVirtual the cyrus virtual
    * @return the cyrus virtual that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.mail.model.CyrusVirtual addCyrusVirtual(
        com.liferay.mail.model.CyrusVirtual cyrusVirtual)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.addCyrusVirtual(cyrusVirtual);
    }

    /**
    * Creates a new cyrus virtual with the primary key. Does not add the cyrus virtual to the database.
    *
    * @param emailAddress the primary key for the new cyrus virtual
    * @return the new cyrus virtual
    */
    @Override
    public com.liferay.mail.model.CyrusVirtual createCyrusVirtual(
        java.lang.String emailAddress) {
        return _cyrusVirtualLocalService.createCyrusVirtual(emailAddress);
    }

    /**
    * Deletes the cyrus virtual with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param emailAddress the primary key of the cyrus virtual
    * @return the cyrus virtual that was removed
    * @throws PortalException if a cyrus virtual with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.mail.model.CyrusVirtual deleteCyrusVirtual(
        java.lang.String emailAddress)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.deleteCyrusVirtual(emailAddress);
    }

    /**
    * Deletes the cyrus virtual from the database. Also notifies the appropriate model listeners.
    *
    * @param cyrusVirtual the cyrus virtual
    * @return the cyrus virtual that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.mail.model.CyrusVirtual deleteCyrusVirtual(
        com.liferay.mail.model.CyrusVirtual cyrusVirtual)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.deleteCyrusVirtual(cyrusVirtual);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _cyrusVirtualLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mail.model.impl.CyrusVirtualModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mail.model.impl.CyrusVirtualModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.liferay.mail.model.CyrusVirtual fetchCyrusVirtual(
        java.lang.String emailAddress)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.fetchCyrusVirtual(emailAddress);
    }

    /**
    * Returns the cyrus virtual with the primary key.
    *
    * @param emailAddress the primary key of the cyrus virtual
    * @return the cyrus virtual
    * @throws PortalException if a cyrus virtual with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.mail.model.CyrusVirtual getCyrusVirtual(
        java.lang.String emailAddress)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.getCyrusVirtual(emailAddress);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.liferay.mail.model.CyrusVirtual> getCyrusVirtuals(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.getCyrusVirtuals(start, end);
    }

    /**
    * Returns the number of cyrus virtuals.
    *
    * @return the number of cyrus virtuals
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getCyrusVirtualsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.getCyrusVirtualsCount();
    }

    /**
    * Updates the cyrus virtual in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param cyrusVirtual the cyrus virtual
    * @return the cyrus virtual that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.mail.model.CyrusVirtual updateCyrusVirtual(
        com.liferay.mail.model.CyrusVirtual cyrusVirtual)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _cyrusVirtualLocalService.updateCyrusVirtual(cyrusVirtual);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _cyrusVirtualLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _cyrusVirtualLocalService.setBeanIdentifier(beanIdentifier);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CyrusVirtualLocalService getWrappedCyrusVirtualLocalService() {
        return _cyrusVirtualLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCyrusVirtualLocalService(
        CyrusVirtualLocalService cyrusVirtualLocalService) {
        _cyrusVirtualLocalService = cyrusVirtualLocalService;
    }

    @Override
    public CyrusVirtualLocalService getWrappedService() {
        return _cyrusVirtualLocalService;
    }

    @Override
    public void setWrappedService(
        CyrusVirtualLocalService cyrusVirtualLocalService) {
        _cyrusVirtualLocalService = cyrusVirtualLocalService;
    }
}
