package com.liferay.mail.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CyrusService}.
 *
 * @author Brian Wing Shun Chan
 * @see CyrusService
 * @generated
 */
@ProviderType
public class CyrusServiceWrapper implements CyrusService,
    ServiceWrapper<CyrusService> {
    private CyrusService _cyrusService;

    public CyrusServiceWrapper(CyrusService cyrusService) {
        _cyrusService = cyrusService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _cyrusService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _cyrusService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public void addUser(long userId, java.lang.String emailAddress,
        java.lang.String password)
        throws com.liferay.portal.kernel.exception.SystemException {
        _cyrusService.addUser(userId, emailAddress, password);
    }

    @Override
    public void deleteEmailAddress(long companyId, long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _cyrusService.deleteEmailAddress(companyId, userId);
    }

    @Override
    public void deleteUser(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _cyrusService.deleteUser(userId);
    }

    @Override
    public void updateEmailAddress(long companyId, long userId,
        java.lang.String emailAddress)
        throws com.liferay.portal.kernel.exception.SystemException {
        _cyrusService.updateEmailAddress(companyId, userId, emailAddress);
    }

    @Override
    public void updatePassword(long companyId, long userId,
        java.lang.String password)
        throws com.liferay.portal.kernel.exception.SystemException {
        _cyrusService.updatePassword(companyId, userId, password);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CyrusService getWrappedCyrusService() {
        return _cyrusService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCyrusService(CyrusService cyrusService) {
        _cyrusService = cyrusService;
    }

    @Override
    public CyrusService getWrappedService() {
        return _cyrusService;
    }

    @Override
    public void setWrappedService(CyrusService cyrusService) {
        _cyrusService = cyrusService;
    }
}
