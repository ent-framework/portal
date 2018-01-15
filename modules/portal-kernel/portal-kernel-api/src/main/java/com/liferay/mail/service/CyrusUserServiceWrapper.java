package com.liferay.mail.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CyrusUserService}.
 *
 * @author Brian Wing Shun Chan
 * @see CyrusUserService
 * @generated
 */
public class CyrusUserServiceWrapper implements CyrusUserService,
    ServiceWrapper<CyrusUserService> {
    private CyrusUserService _cyrusUserService;

    public CyrusUserServiceWrapper(CyrusUserService cyrusUserService) {
        _cyrusUserService = cyrusUserService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _cyrusUserService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _cyrusUserService.setBeanIdentifier(beanIdentifier);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CyrusUserService getWrappedCyrusUserService() {
        return _cyrusUserService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCyrusUserService(CyrusUserService cyrusUserService) {
        _cyrusUserService = cyrusUserService;
    }

    @Override
    public CyrusUserService getWrappedService() {
        return _cyrusUserService;
    }

    @Override
    public void setWrappedService(CyrusUserService cyrusUserService) {
        _cyrusUserService = cyrusUserService;
    }
}
