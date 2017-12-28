package com.liferay.portlet.softwarecatalog.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for SCLicense. This utility wraps
 * {@link com.liferay.portlet.softwarecatalog.service.impl.SCLicenseServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see SCLicenseService
 * @see com.liferay.portlet.softwarecatalog.service.base.SCLicenseServiceBaseImpl
 * @see com.liferay.portlet.softwarecatalog.service.impl.SCLicenseServiceImpl
 * @generated
 */
@ProviderType
public class SCLicenseServiceUtil {
    private static SCLicenseService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.softwarecatalog.service.impl.SCLicenseServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static com.liferay.portlet.softwarecatalog.model.SCLicense addLicense(
        java.lang.String name, java.lang.String url, boolean openSource,
        boolean active, boolean recommended)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addLicense(name, url, openSource, active, recommended);
    }

    public static void deleteLicense(long licenseId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteLicense(licenseId);
    }

    public static com.liferay.portlet.softwarecatalog.model.SCLicense getLicense(
        long licenseId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getLicense(licenseId);
    }

    public static com.liferay.portlet.softwarecatalog.model.SCLicense updateLicense(
        long licenseId, java.lang.String name, java.lang.String url,
        boolean openSource, boolean active, boolean recommended)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateLicense(licenseId, name, url, openSource, active,
            recommended);
    }

    public static SCLicenseService getService() {
        if (_service == null) {
            _service = (SCLicenseService) PortalBeanLocatorUtil.locate(SCLicenseService.class.getName());

            ReferenceRegistry.registerReference(SCLicenseServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(SCLicenseService service) {
    }
}
