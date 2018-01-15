package com.liferay.portlet.documentlibrary.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DLFileShortcutService}.
 *
 * @author Brian Wing Shun Chan
 * @see DLFileShortcutService
 * @generated
 */
public class DLFileShortcutServiceWrapper implements DLFileShortcutService,
    ServiceWrapper<DLFileShortcutService> {
    private DLFileShortcutService _dlFileShortcutService;

    public DLFileShortcutServiceWrapper(
        DLFileShortcutService dlFileShortcutService) {
        _dlFileShortcutService = dlFileShortcutService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _dlFileShortcutService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _dlFileShortcutService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portlet.documentlibrary.model.DLFileShortcut addFileShortcut(
        long groupId, long folderId, long toFileEntryId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _dlFileShortcutService.addFileShortcut(groupId, folderId,
            toFileEntryId, serviceContext);
    }

    @Override
    public void deleteFileShortcut(long fileShortcutId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _dlFileShortcutService.deleteFileShortcut(fileShortcutId);
    }

    @Override
    public com.liferay.portlet.documentlibrary.model.DLFileShortcut getFileShortcut(
        long fileShortcutId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _dlFileShortcutService.getFileShortcut(fileShortcutId);
    }

    @Override
    public com.liferay.portlet.documentlibrary.model.DLFileShortcut updateFileShortcut(
        long fileShortcutId, long folderId, long toFileEntryId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _dlFileShortcutService.updateFileShortcut(fileShortcutId,
            folderId, toFileEntryId, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public DLFileShortcutService getWrappedDLFileShortcutService() {
        return _dlFileShortcutService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedDLFileShortcutService(
        DLFileShortcutService dlFileShortcutService) {
        _dlFileShortcutService = dlFileShortcutService;
    }

    @Override
    public DLFileShortcutService getWrappedService() {
        return _dlFileShortcutService;
    }

    @Override
    public void setWrappedService(DLFileShortcutService dlFileShortcutService) {
        _dlFileShortcutService = dlFileShortcutService;
    }
}
