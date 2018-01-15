package com.liferay.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RegionService}.
 *
 * @author Brian Wing Shun Chan
 * @see RegionService
 * @generated
 */
public class RegionServiceWrapper implements RegionService,
    ServiceWrapper<RegionService> {
    private RegionService _regionService;

    public RegionServiceWrapper(RegionService regionService) {
        _regionService = regionService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _regionService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _regionService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portal.model.Region addRegion(long countryId,
        java.lang.String regionCode, java.lang.String name, boolean active)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _regionService.addRegion(countryId, regionCode, name, active);
    }

    @Override
    public com.liferay.portal.model.Region fetchRegion(long countryId,
        java.lang.String regionCode)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionService.fetchRegion(countryId, regionCode);
    }

    @Override
    public com.liferay.portal.model.Region getRegion(long regionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _regionService.getRegion(regionId);
    }

    @Override
    public com.liferay.portal.model.Region getRegion(long countryId,
        java.lang.String regionCode)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _regionService.getRegion(countryId, regionCode);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Region> getRegions()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionService.getRegions();
    }

    @Override
    public java.util.List<com.liferay.portal.model.Region> getRegions(
        boolean active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionService.getRegions(active);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Region> getRegions(
        long countryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionService.getRegions(countryId);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Region> getRegions(
        long countryId, boolean active)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _regionService.getRegions(countryId, active);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RegionService getWrappedRegionService() {
        return _regionService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRegionService(RegionService regionService) {
        _regionService = regionService;
    }

    @Override
    public RegionService getWrappedService() {
        return _regionService;
    }

    @Override
    public void setWrappedService(RegionService regionService) {
        _regionService = regionService;
    }
}
