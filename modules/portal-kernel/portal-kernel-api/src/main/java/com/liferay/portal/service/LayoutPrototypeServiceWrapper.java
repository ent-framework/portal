package com.liferay.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LayoutPrototypeService}.
 *
 * @author Brian Wing Shun Chan
 * @see LayoutPrototypeService
 * @generated
 */
public class LayoutPrototypeServiceWrapper implements LayoutPrototypeService,
    ServiceWrapper<LayoutPrototypeService> {
    private LayoutPrototypeService _layoutPrototypeService;

    public LayoutPrototypeServiceWrapper(
        LayoutPrototypeService layoutPrototypeService) {
        _layoutPrototypeService = layoutPrototypeService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _layoutPrototypeService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _layoutPrototypeService.setBeanIdentifier(beanIdentifier);
    }

    /**
    * @deprecated As of 6.2.0, replaced by {@link #addLayoutPrototype(Map,
    String, boolean, ServiceContext)}
    */
    @Override
    public com.liferay.portal.model.LayoutPrototype addLayoutPrototype(
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.lang.String description, boolean active)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _layoutPrototypeService.addLayoutPrototype(nameMap, description,
            active);
    }

    @Override
    public com.liferay.portal.model.LayoutPrototype addLayoutPrototype(
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.lang.String description, boolean active,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _layoutPrototypeService.addLayoutPrototype(nameMap, description,
            active, serviceContext);
    }

    @Override
    public void deleteLayoutPrototype(long layoutPrototypeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _layoutPrototypeService.deleteLayoutPrototype(layoutPrototypeId);
    }

    @Override
    public com.liferay.portal.model.LayoutPrototype getLayoutPrototype(
        long layoutPrototypeId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _layoutPrototypeService.getLayoutPrototype(layoutPrototypeId);
    }

    @Override
    public java.util.List<com.liferay.portal.model.LayoutPrototype> search(
        long companyId, java.lang.Boolean active,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _layoutPrototypeService.search(companyId, active, obc);
    }

    /**
    * @deprecated As of 6.2.0, replaced by {@link #updateLayoutPrototype(long,
    Map, String, boolean, ServiceContext)}
    */
    @Override
    public com.liferay.portal.model.LayoutPrototype updateLayoutPrototype(
        long layoutPrototypeId,
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.lang.String description, boolean active)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _layoutPrototypeService.updateLayoutPrototype(layoutPrototypeId,
            nameMap, description, active);
    }

    @Override
    public com.liferay.portal.model.LayoutPrototype updateLayoutPrototype(
        long layoutPrototypeId,
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.lang.String description, boolean active,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _layoutPrototypeService.updateLayoutPrototype(layoutPrototypeId,
            nameMap, description, active, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LayoutPrototypeService getWrappedLayoutPrototypeService() {
        return _layoutPrototypeService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLayoutPrototypeService(
        LayoutPrototypeService layoutPrototypeService) {
        _layoutPrototypeService = layoutPrototypeService;
    }

    @Override
    public LayoutPrototypeService getWrappedService() {
        return _layoutPrototypeService;
    }

    @Override
    public void setWrappedService(LayoutPrototypeService layoutPrototypeService) {
        _layoutPrototypeService = layoutPrototypeService;
    }
}
