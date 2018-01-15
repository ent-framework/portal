package com.liferay.portal.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for OrgLabor. This utility wraps
 * {@link com.liferay.portal.service.impl.OrgLaborServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see OrgLaborService
 * @see com.liferay.portal.service.base.OrgLaborServiceBaseImpl
 * @see com.liferay.portal.service.impl.OrgLaborServiceImpl
 * @generated
 */
public class OrgLaborServiceUtil {
    private static OrgLaborService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.OrgLaborServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static com.liferay.portal.model.OrgLabor addOrgLabor(
        long organizationId, int typeId, int sunOpen, int sunClose,
        int monOpen, int monClose, int tueOpen, int tueClose, int wedOpen,
        int wedClose, int thuOpen, int thuClose, int friOpen, int friClose,
        int satOpen, int satClose)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addOrgLabor(organizationId, typeId, sunOpen, sunClose,
            monOpen, monClose, tueOpen, tueClose, wedOpen, wedClose, thuOpen,
            thuClose, friOpen, friClose, satOpen, satClose);
    }

    public static void deleteOrgLabor(long orgLaborId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteOrgLabor(orgLaborId);
    }

    public static com.liferay.portal.model.OrgLabor getOrgLabor(long orgLaborId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getOrgLabor(orgLaborId);
    }

    public static java.util.List<com.liferay.portal.model.OrgLabor> getOrgLabors(
        long organizationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getOrgLabors(organizationId);
    }

    public static com.liferay.portal.model.OrgLabor updateOrgLabor(
        long orgLaborId, int typeId, int sunOpen, int sunClose, int monOpen,
        int monClose, int tueOpen, int tueClose, int wedOpen, int wedClose,
        int thuOpen, int thuClose, int friOpen, int friClose, int satOpen,
        int satClose)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateOrgLabor(orgLaborId, typeId, sunOpen, sunClose,
            monOpen, monClose, tueOpen, tueClose, wedOpen, wedClose, thuOpen,
            thuClose, friOpen, friClose, satOpen, satClose);
    }

    public static OrgLaborService getService() {
        if (_service == null) {
            _service = (OrgLaborService) PortalBeanLocatorUtil.locate(OrgLaborService.class.getName());

            ReferenceRegistry.registerReference(OrgLaborServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(OrgLaborService service) {
    }
}
