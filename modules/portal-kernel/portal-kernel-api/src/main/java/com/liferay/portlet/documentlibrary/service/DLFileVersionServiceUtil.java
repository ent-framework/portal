package com.liferay.portlet.documentlibrary.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for DLFileVersion. This utility wraps
 * {@link com.liferay.portlet.documentlibrary.service.impl.DLFileVersionServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see DLFileVersionService
 * @see com.liferay.portlet.documentlibrary.service.base.DLFileVersionServiceBaseImpl
 * @see com.liferay.portlet.documentlibrary.service.impl.DLFileVersionServiceImpl
 * @generated
 */
@ProviderType
public class DLFileVersionServiceUtil {
    private static DLFileVersionService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.documentlibrary.service.impl.DLFileVersionServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static com.liferay.portlet.documentlibrary.model.DLFileVersion getFileVersion(
        long fileVersionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getFileVersion(fileVersionId);
    }

    public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileVersion> getFileVersions(
        long fileEntryId, int status)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getFileVersions(fileEntryId, status);
    }

    public static int getFileVersionsCount(long fileEntryId, int status)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getFileVersionsCount(fileEntryId, status);
    }

    public static com.liferay.portlet.documentlibrary.model.DLFileVersion getLatestFileVersion(
        long fileEntryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLatestFileVersion(fileEntryId);
    }

    public static DLFileVersionService getService() {
        if (_service == null) {
            _service = (DLFileVersionService) PortalBeanLocatorUtil.locate(DLFileVersionService.class.getName());

            ReferenceRegistry.registerReference(DLFileVersionServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(DLFileVersionService service) {
    }
}
