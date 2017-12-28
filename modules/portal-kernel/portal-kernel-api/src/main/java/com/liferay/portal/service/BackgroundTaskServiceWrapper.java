package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BackgroundTaskService}.
 *
 * @author Brian Wing Shun Chan
 * @see BackgroundTaskService
 * @generated
 */
@ProviderType
public class BackgroundTaskServiceWrapper implements BackgroundTaskService,
    ServiceWrapper<BackgroundTaskService> {
    private BackgroundTaskService _backgroundTaskService;

    public BackgroundTaskServiceWrapper(
        BackgroundTaskService backgroundTaskService) {
        _backgroundTaskService = backgroundTaskService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _backgroundTaskService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _backgroundTaskService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public int getBackgroundTasksCount(long groupId,
        java.lang.String taskExecutorClassName, java.lang.String completed)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _backgroundTaskService.getBackgroundTasksCount(groupId,
            taskExecutorClassName, completed);
    }

    @Override
    public java.lang.String getBackgroundTaskStatusJSON(long backgroundTaskId) {
        return _backgroundTaskService.getBackgroundTaskStatusJSON(backgroundTaskId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BackgroundTaskService getWrappedBackgroundTaskService() {
        return _backgroundTaskService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBackgroundTaskService(
        BackgroundTaskService backgroundTaskService) {
        _backgroundTaskService = backgroundTaskService;
    }

    @Override
    public BackgroundTaskService getWrappedService() {
        return _backgroundTaskService;
    }

    @Override
    public void setWrappedService(BackgroundTaskService backgroundTaskService) {
        _backgroundTaskService = backgroundTaskService;
    }
}
