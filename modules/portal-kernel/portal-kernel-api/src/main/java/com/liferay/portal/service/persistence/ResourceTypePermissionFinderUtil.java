package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class ResourceTypePermissionFinderUtil {
    private static ResourceTypePermissionFinder _finder;

    public static java.util.List<com.liferay.portal.model.ResourceTypePermission> findByEitherScopeC_G_N(
        long companyId, long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByEitherScopeC_G_N(companyId, groupId, name);
    }

    public static java.util.List<com.liferay.portal.model.ResourceTypePermission> findByGroupScopeC_N_R(
        long companyId, java.lang.String name, long roleId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByGroupScopeC_N_R(companyId, name, roleId);
    }

    public static ResourceTypePermissionFinder getFinder() {
        if (_finder == null) {
            _finder = (ResourceTypePermissionFinder) PortalBeanLocatorUtil.locate(ResourceTypePermissionFinder.class.getName());

            ReferenceRegistry.registerReference(ResourceTypePermissionFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(ResourceTypePermissionFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(ResourceTypePermissionFinderUtil.class,
            "_finder");
    }
}
