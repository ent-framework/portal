package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PluginSettingService}.
 *
 * @author Brian Wing Shun Chan
 * @see PluginSettingService
 * @generated
 */
@ProviderType
public class PluginSettingServiceWrapper implements PluginSettingService,
    ServiceWrapper<PluginSettingService> {
    private PluginSettingService _pluginSettingService;

    public PluginSettingServiceWrapper(
        PluginSettingService pluginSettingService) {
        _pluginSettingService = pluginSettingService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _pluginSettingService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _pluginSettingService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public com.liferay.portal.model.PluginSetting updatePluginSetting(
        long companyId, java.lang.String pluginId, java.lang.String pluginType,
        java.lang.String roles, boolean active)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pluginSettingService.updatePluginSetting(companyId, pluginId,
            pluginType, roles, active);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PluginSettingService getWrappedPluginSettingService() {
        return _pluginSettingService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPluginSettingService(
        PluginSettingService pluginSettingService) {
        _pluginSettingService = pluginSettingService;
    }

    @Override
    public PluginSettingService getWrappedService() {
        return _pluginSettingService;
    }

    @Override
    public void setWrappedService(PluginSettingService pluginSettingService) {
        _pluginSettingService = pluginSettingService;
    }
}
