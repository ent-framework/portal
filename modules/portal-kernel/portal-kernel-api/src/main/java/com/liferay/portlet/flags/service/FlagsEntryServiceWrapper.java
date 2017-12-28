package com.liferay.portlet.flags.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FlagsEntryService}.
 *
 * @author Brian Wing Shun Chan
 * @see FlagsEntryService
 * @generated
 */
@ProviderType
public class FlagsEntryServiceWrapper implements FlagsEntryService,
    ServiceWrapper<FlagsEntryService> {
    private FlagsEntryService _flagsEntryService;

    public FlagsEntryServiceWrapper(FlagsEntryService flagsEntryService) {
        _flagsEntryService = flagsEntryService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _flagsEntryService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _flagsEntryService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public void addEntry(java.lang.String className, long classPK,
        java.lang.String reporterEmailAddress, long reportedUserId,
        java.lang.String contentTitle, java.lang.String contentURL,
        java.lang.String reason,
        com.liferay.portal.service.ServiceContext serviceContext) {
        _flagsEntryService.addEntry(className, classPK, reporterEmailAddress,
            reportedUserId, contentTitle, contentURL, reason, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public FlagsEntryService getWrappedFlagsEntryService() {
        return _flagsEntryService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFlagsEntryService(FlagsEntryService flagsEntryService) {
        _flagsEntryService = flagsEntryService;
    }

    @Override
    public FlagsEntryService getWrappedService() {
        return _flagsEntryService;
    }

    @Override
    public void setWrappedService(FlagsEntryService flagsEntryService) {
        _flagsEntryService = flagsEntryService;
    }
}
