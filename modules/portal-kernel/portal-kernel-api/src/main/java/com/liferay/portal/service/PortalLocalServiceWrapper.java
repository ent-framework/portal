package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PortalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PortalLocalService
 * @generated
 */
@ProviderType
public class PortalLocalServiceWrapper implements PortalLocalService,
    ServiceWrapper<PortalLocalService> {
    private PortalLocalService _portalLocalService;

    public PortalLocalServiceWrapper(PortalLocalService portalLocalService) {
        _portalLocalService = portalLocalService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _portalLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _portalLocalService.setBeanIdentifier(beanIdentifier);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PortalLocalService getWrappedPortalLocalService() {
        return _portalLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPortalLocalService(
        PortalLocalService portalLocalService) {
        _portalLocalService = portalLocalService;
    }

    @Override
    public PortalLocalService getWrappedService() {
        return _portalLocalService;
    }

    @Override
    public void setWrappedService(PortalLocalService portalLocalService) {
        _portalLocalService = portalLocalService;
    }
}
