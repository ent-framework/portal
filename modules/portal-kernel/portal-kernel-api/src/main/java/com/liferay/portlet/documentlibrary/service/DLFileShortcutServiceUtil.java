package com.liferay.portlet.documentlibrary.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for DLFileShortcut. This utility wraps
 * {@link com.liferay.portlet.documentlibrary.service.impl.DLFileShortcutServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see DLFileShortcutService
 * @see com.liferay.portlet.documentlibrary.service.base.DLFileShortcutServiceBaseImpl
 * @see com.liferay.portlet.documentlibrary.service.impl.DLFileShortcutServiceImpl
 * @generated
 */
public class DLFileShortcutServiceUtil {
    private static DLFileShortcutService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.documentlibrary.service.impl.DLFileShortcutServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static com.liferay.portlet.documentlibrary.model.DLFileShortcut addFileShortcut(
        long groupId, long folderId, long toFileEntryId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addFileShortcut(groupId, folderId, toFileEntryId,
            serviceContext);
    }

    public static void deleteFileShortcut(long fileShortcutId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteFileShortcut(fileShortcutId);
    }

    public static com.liferay.portlet.documentlibrary.model.DLFileShortcut getFileShortcut(
        long fileShortcutId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getFileShortcut(fileShortcutId);
    }

    public static com.liferay.portlet.documentlibrary.model.DLFileShortcut updateFileShortcut(
        long fileShortcutId, long folderId, long toFileEntryId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateFileShortcut(fileShortcutId, folderId, toFileEntryId,
            serviceContext);
    }

    public static DLFileShortcutService getService() {
        if (_service == null) {
            _service = (DLFileShortcutService) PortalBeanLocatorUtil.locate(DLFileShortcutService.class.getName());

            ReferenceRegistry.registerReference(DLFileShortcutServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(DLFileShortcutService service) {
    }
}
