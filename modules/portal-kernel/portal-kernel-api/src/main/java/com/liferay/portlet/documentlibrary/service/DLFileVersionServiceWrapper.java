package com.liferay.portlet.documentlibrary.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DLFileVersionService}.
 *
 * @author Brian Wing Shun Chan
 * @see DLFileVersionService
 * @generated
 */
@ProviderType
public class DLFileVersionServiceWrapper implements DLFileVersionService,
    ServiceWrapper<DLFileVersionService> {
    private DLFileVersionService _dlFileVersionService;

    public DLFileVersionServiceWrapper(
        DLFileVersionService dlFileVersionService) {
        _dlFileVersionService = dlFileVersionService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _dlFileVersionService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _dlFileVersionService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portlet.documentlibrary.model.DLFileVersion getFileVersion(
        long fileVersionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _dlFileVersionService.getFileVersion(fileVersionId);
    }

    @Override
    public java.util.List<com.liferay.portlet.documentlibrary.model.DLFileVersion> getFileVersions(
        long fileEntryId, int status)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _dlFileVersionService.getFileVersions(fileEntryId, status);
    }

    @Override
    public int getFileVersionsCount(long fileEntryId, int status)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _dlFileVersionService.getFileVersionsCount(fileEntryId, status);
    }

    @Override
    public com.liferay.portlet.documentlibrary.model.DLFileVersion getLatestFileVersion(
        long fileEntryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _dlFileVersionService.getLatestFileVersion(fileEntryId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DLFileVersionService getWrappedDLFileVersionService() {
        return _dlFileVersionService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDLFileVersionService(
        DLFileVersionService dlFileVersionService) {
        _dlFileVersionService = dlFileVersionService;
    }

    @Override
    public DLFileVersionService getWrappedService() {
        return _dlFileVersionService;
    }

    @Override
    public void setWrappedService(DLFileVersionService dlFileVersionService) {
        _dlFileVersionService = dlFileVersionService;
    }
}
