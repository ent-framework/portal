package com.liferay.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StagingService}.
 *
 * @author Brian Wing Shun Chan
 * @see StagingService
 * @generated
 */
public class StagingServiceWrapper implements StagingService,
    ServiceWrapper<StagingService> {
    private StagingService _stagingService;

    public StagingServiceWrapper(StagingService stagingService) {
        _stagingService = stagingService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _stagingService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _stagingService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public void cleanUpStagingRequest(long stagingRequestId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _stagingService.cleanUpStagingRequest(stagingRequestId);
    }

    @Override
    public long createStagingRequest(long groupId, java.lang.String checksum)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _stagingService.createStagingRequest(groupId, checksum);
    }

    @Override
    public void publishStagingRequest(long stagingRequestId,
        boolean privateLayout,
        java.util.Map<java.lang.String, java.lang.String[]> parameterMap)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _stagingService.publishStagingRequest(stagingRequestId, privateLayout,
            parameterMap);
    }

    @Override
    public void updateStagingRequest(long stagingRequestId,
        java.lang.String fileName, byte[] bytes)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _stagingService.updateStagingRequest(stagingRequestId, fileName, bytes);
    }

    @Override
    public com.liferay.portal.kernel.lar.MissingReferences validateStagingRequest(
        long stagingRequestId, boolean privateLayout,
        java.util.Map<java.lang.String, java.lang.String[]> parameterMap)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _stagingService.validateStagingRequest(stagingRequestId,
            privateLayout, parameterMap);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public StagingService getWrappedStagingService() {
        return _stagingService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStagingService(StagingService stagingService) {
        _stagingService = stagingService;
    }

    @Override
    public StagingService getWrappedService() {
        return _stagingService;
    }

    @Override
    public void setWrappedService(StagingService stagingService) {
        _stagingService = stagingService;
    }
}
