package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class PortletPreferencesFinderUtil {
    private static PortletPreferencesFinder _finder;

    public static long countByO_O_P(long ownerId, int ownerType,
        java.lang.String portletId, boolean excludeDefaultPreferences)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByO_O_P(ownerId, ownerType, portletId,
            excludeDefaultPreferences);
    }

    public static long countByO_O_P_P_P(long ownerId, int ownerType, long plid,
        java.lang.String portletId, boolean excludeDefaultPreferences)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByO_O_P_P_P(ownerId, ownerType, plid, portletId,
            excludeDefaultPreferences);
    }

    public static java.util.List<com.liferay.portal.model.PortletPreferences> findByPortletId(
        java.lang.String portletId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByPortletId(portletId);
    }

    public static java.util.List<com.liferay.portal.model.PortletPreferences> findByC_G_O_O_P_P(
        long companyId, long groupId, long ownerId, int ownerType,
        java.lang.String portletId, boolean privateLayout)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByC_G_O_O_P_P(companyId, groupId, ownerId, ownerType,
            portletId, privateLayout);
    }

    public static PortletPreferencesFinder getFinder() {
        if (_finder == null) {
            _finder = (PortletPreferencesFinder) PortalBeanLocatorUtil.locate(PortletPreferencesFinder.class.getName());

            ReferenceRegistry.registerReference(PortletPreferencesFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(PortletPreferencesFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(PortletPreferencesFinderUtil.class,
            "_finder");
    }
}
