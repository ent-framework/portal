package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link QuartzLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see QuartzLocalService
 * @generated
 */
@ProviderType
public class QuartzLocalServiceWrapper implements QuartzLocalService,
    ServiceWrapper<QuartzLocalService> {
    private QuartzLocalService _quartzLocalService;

    public QuartzLocalServiceWrapper(QuartzLocalService quartzLocalService) {
        _quartzLocalService = quartzLocalService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _quartzLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _quartzLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public void checkQuartzTables()
        throws com.liferay.portal.kernel.exception.SystemException {
        _quartzLocalService.checkQuartzTables();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public QuartzLocalService getWrappedQuartzLocalService() {
        return _quartzLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedQuartzLocalService(
        QuartzLocalService quartzLocalService) {
        _quartzLocalService = quartzLocalService;
    }

    @Override
    public QuartzLocalService getWrappedService() {
        return _quartzLocalService;
    }

    @Override
    public void setWrappedService(QuartzLocalService quartzLocalService) {
        _quartzLocalService = quartzLocalService;
    }
}
