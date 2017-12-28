package com.liferay.portlet.polls.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PollsChoiceService}.
 *
 * @author Brian Wing Shun Chan
 * @see PollsChoiceService
 * @generated
 */
@ProviderType
public class PollsChoiceServiceWrapper implements PollsChoiceService,
    ServiceWrapper<PollsChoiceService> {
    private PollsChoiceService _pollsChoiceService;

    public PollsChoiceServiceWrapper(PollsChoiceService pollsChoiceService) {
        _pollsChoiceService = pollsChoiceService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _pollsChoiceService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _pollsChoiceService.setBeanIdentifier(beanIdentifier);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PollsChoiceService getWrappedPollsChoiceService() {
        return _pollsChoiceService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPollsChoiceService(
        PollsChoiceService pollsChoiceService) {
        _pollsChoiceService = pollsChoiceService;
    }

    @Override
    public PollsChoiceService getWrappedService() {
        return _pollsChoiceService;
    }

    @Override
    public void setWrappedService(PollsChoiceService pollsChoiceService) {
        _pollsChoiceService = pollsChoiceService;
    }
}
