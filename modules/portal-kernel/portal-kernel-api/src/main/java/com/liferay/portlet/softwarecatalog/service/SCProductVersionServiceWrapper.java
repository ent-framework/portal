package com.liferay.portlet.softwarecatalog.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SCProductVersionService}.
 *
 * @author Brian Wing Shun Chan
 * @see SCProductVersionService
 * @generated
 */
@ProviderType
public class SCProductVersionServiceWrapper implements SCProductVersionService,
    ServiceWrapper<SCProductVersionService> {
    private SCProductVersionService _scProductVersionService;

    public SCProductVersionServiceWrapper(
        SCProductVersionService scProductVersionService) {
        _scProductVersionService = scProductVersionService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _scProductVersionService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _scProductVersionService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portlet.softwarecatalog.model.SCProductVersion addProductVersion(
        long productEntryId, java.lang.String version,
        java.lang.String changeLog, java.lang.String downloadPageURL,
        java.lang.String directDownloadURL, boolean testDirectDownloadURL,
        boolean repoStoreArtifact, long[] frameworkVersionIds,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _scProductVersionService.addProductVersion(productEntryId,
            version, changeLog, downloadPageURL, directDownloadURL,
            testDirectDownloadURL, repoStoreArtifact, frameworkVersionIds,
            serviceContext);
    }

    @Override
    public void deleteProductVersion(long productVersionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _scProductVersionService.deleteProductVersion(productVersionId);
    }

    @Override
    public com.liferay.portlet.softwarecatalog.model.SCProductVersion getProductVersion(
        long productVersionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _scProductVersionService.getProductVersion(productVersionId);
    }

    @Override
    public java.util.List<com.liferay.portlet.softwarecatalog.model.SCProductVersion> getProductVersions(
        long productEntryId, int start, int end)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _scProductVersionService.getProductVersions(productEntryId,
            start, end);
    }

    @Override
    public int getProductVersionsCount(long productEntryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _scProductVersionService.getProductVersionsCount(productEntryId);
    }

    @Override
    public com.liferay.portlet.softwarecatalog.model.SCProductVersion updateProductVersion(
        long productVersionId, java.lang.String version,
        java.lang.String changeLog, java.lang.String downloadPageURL,
        java.lang.String directDownloadURL, boolean testDirectDownloadURL,
        boolean repoStoreArtifact, long[] frameworkVersionIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _scProductVersionService.updateProductVersion(productVersionId,
            version, changeLog, downloadPageURL, directDownloadURL,
            testDirectDownloadURL, repoStoreArtifact, frameworkVersionIds);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SCProductVersionService getWrappedSCProductVersionService() {
        return _scProductVersionService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSCProductVersionService(
        SCProductVersionService scProductVersionService) {
        _scProductVersionService = scProductVersionService;
    }

    @Override
    public SCProductVersionService getWrappedService() {
        return _scProductVersionService;
    }

    @Override
    public void setWrappedService(
        SCProductVersionService scProductVersionService) {
        _scProductVersionService = scProductVersionService;
    }
}
