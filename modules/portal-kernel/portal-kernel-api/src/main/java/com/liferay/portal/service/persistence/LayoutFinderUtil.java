package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class LayoutFinderUtil {
    private static LayoutFinder _finder;

    public static java.util.List<com.liferay.portal.model.Layout> findByNoPermissions(
        long roleId) throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByNoPermissions(roleId);
    }

    public static java.util.List<com.liferay.portal.model.Layout> findByNullFriendlyURL()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByNullFriendlyURL();
    }

    public static java.util.List<com.liferay.portal.model.Layout> findByScopeGroup(
        long groupId, boolean privateLayout)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByScopeGroup(groupId, privateLayout);
    }

    public static java.util.List<com.liferay.portal.model.LayoutReference> findByC_P_P(
        long companyId, java.lang.String portletId,
        java.lang.String preferencesKey, java.lang.String preferencesValue)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByC_P_P(companyId, portletId, preferencesKey,
            preferencesValue);
    }

    public static LayoutFinder getFinder() {
        if (_finder == null) {
            _finder = (LayoutFinder) PortalBeanLocatorUtil.locate(LayoutFinder.class.getName());

            ReferenceRegistry.registerReference(LayoutFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(LayoutFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(LayoutFinderUtil.class, "_finder");
    }
}
