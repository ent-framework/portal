package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class ResourceBlockFinderUtil {
    private static ResourceBlockFinder _finder;

    public static com.liferay.portal.security.permission.ResourceBlockIdsBag findByC_G_N_R(
        long companyId, long groupId, java.lang.String name, long[] roleIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByC_G_N_R(companyId, groupId, name, roleIds);
    }

    public static ResourceBlockFinder getFinder() {
        if (_finder == null) {
            _finder = (ResourceBlockFinder) PortalBeanLocatorUtil.locate(ResourceBlockFinder.class.getName());

            ReferenceRegistry.registerReference(ResourceBlockFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(ResourceBlockFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(ResourceBlockFinderUtil.class,
            "_finder");
    }
}
