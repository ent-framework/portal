package com.liferay.portal.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for Region. This utility wraps
 * {@link com.liferay.portal.service.impl.RegionServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see RegionService
 * @see com.liferay.portal.service.base.RegionServiceBaseImpl
 * @see com.liferay.portal.service.impl.RegionServiceImpl
 * @generated
 */
public class RegionServiceUtil {
    private static RegionService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.portal.service.impl.RegionServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static com.liferay.portal.model.Region addRegion(long countryId,
        java.lang.String regionCode, java.lang.String name, boolean active)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addRegion(countryId, regionCode, name, active);
    }

    public static com.liferay.portal.model.Region fetchRegion(long countryId,
        java.lang.String regionCode)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchRegion(countryId, regionCode);
    }

    public static com.liferay.portal.model.Region getRegion(long regionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRegion(regionId);
    }

    public static com.liferay.portal.model.Region getRegion(long countryId,
        java.lang.String regionCode)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getRegion(countryId, regionCode);
    }

    public static java.util.List<com.liferay.portal.model.Region> getRegions()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRegions();
    }

    public static java.util.List<com.liferay.portal.model.Region> getRegions(
        boolean active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRegions(active);
    }

    public static java.util.List<com.liferay.portal.model.Region> getRegions(
        long countryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRegions(countryId);
    }

    public static java.util.List<com.liferay.portal.model.Region> getRegions(
        long countryId, boolean active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getRegions(countryId, active);
    }

    public static RegionService getService() {
        if (_service == null) {
            _service = (RegionService) PortalBeanLocatorUtil.locate(RegionService.class.getName());

            ReferenceRegistry.registerReference(RegionServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(RegionService service) {
    }
}
