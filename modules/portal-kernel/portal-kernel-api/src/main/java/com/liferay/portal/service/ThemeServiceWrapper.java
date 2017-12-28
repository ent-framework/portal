package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ThemeService}.
 *
 * @author Brian Wing Shun Chan
 * @see ThemeService
 * @generated
 */
@ProviderType
public class ThemeServiceWrapper implements ThemeService,
    ServiceWrapper<ThemeService> {
    private ThemeService _themeService;

    public ThemeServiceWrapper(ThemeService themeService) {
        _themeService = themeService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _themeService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _themeService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.util.List<com.liferay.portal.model.Theme> getThemes(
        long companyId) {
        return _themeService.getThemes(companyId);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONArray getWARThemes() {
        return _themeService.getWARThemes();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ThemeService getWrappedThemeService() {
        return _themeService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedThemeService(ThemeService themeService) {
        _themeService = themeService;
    }

    @Override
    public ThemeService getWrappedService() {
        return _themeService;
    }

    @Override
    public void setWrappedService(ThemeService themeService) {
        _themeService = themeService;
    }
}
