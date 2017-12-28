package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CMISRepositoryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CMISRepositoryLocalService
 * @generated
 */
@ProviderType
public class CMISRepositoryLocalServiceWrapper
    implements CMISRepositoryLocalService,
        ServiceWrapper<CMISRepositoryLocalService> {
    private CMISRepositoryLocalService _cmisRepositoryLocalService;

    public CMISRepositoryLocalServiceWrapper(
        CMISRepositoryLocalService cmisRepositoryLocalService) {
        _cmisRepositoryLocalService = cmisRepositoryLocalService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _cmisRepositoryLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _cmisRepositoryLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object getSession(long repositoryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _cmisRepositoryLocalService.getSession(repositoryId);
    }

    @Override
    public com.liferay.portal.kernel.repository.model.FileEntry toFileEntry(
        long repositoryId, java.lang.Object object)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _cmisRepositoryLocalService.toFileEntry(repositoryId, object);
    }

    @Override
    public com.liferay.portal.kernel.repository.model.FileVersion toFileVersion(
        long repositoryId, java.lang.Object object)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _cmisRepositoryLocalService.toFileVersion(repositoryId, object);
    }

    @Override
    public com.liferay.portal.kernel.repository.model.Folder toFolder(
        long repositoryId, java.lang.Object object)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _cmisRepositoryLocalService.toFolder(repositoryId, object);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CMISRepositoryLocalService getWrappedCMISRepositoryLocalService() {
        return _cmisRepositoryLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCMISRepositoryLocalService(
        CMISRepositoryLocalService cmisRepositoryLocalService) {
        _cmisRepositoryLocalService = cmisRepositoryLocalService;
    }

    @Override
    public CMISRepositoryLocalService getWrappedService() {
        return _cmisRepositoryLocalService;
    }

    @Override
    public void setWrappedService(
        CMISRepositoryLocalService cmisRepositoryLocalService) {
        _cmisRepositoryLocalService = cmisRepositoryLocalService;
    }
}
