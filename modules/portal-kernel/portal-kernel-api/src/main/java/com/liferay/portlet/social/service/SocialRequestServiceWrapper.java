package com.liferay.portlet.social.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SocialRequestService}.
 *
 * @author Brian Wing Shun Chan
 * @see SocialRequestService
 * @generated
 */
public class SocialRequestServiceWrapper implements SocialRequestService,
    ServiceWrapper<SocialRequestService> {
    private SocialRequestService _socialRequestService;

    public SocialRequestServiceWrapper(
        SocialRequestService socialRequestService) {
        _socialRequestService = socialRequestService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _socialRequestService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _socialRequestService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portlet.social.model.SocialRequest updateRequest(
        long requestId, int status,
        com.liferay.portal.theme.ThemeDisplay themeDisplay)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _socialRequestService.updateRequest(requestId, status,
            themeDisplay);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SocialRequestService getWrappedSocialRequestService() {
        return _socialRequestService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSocialRequestService(
        SocialRequestService socialRequestService) {
        _socialRequestService = socialRequestService;
    }

    @Override
    public SocialRequestService getWrappedService() {
        return _socialRequestService;
    }

    @Override
    public void setWrappedService(SocialRequestService socialRequestService) {
        _socialRequestService = socialRequestService;
    }
}
