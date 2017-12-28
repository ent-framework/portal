package com.liferay.portlet.asset.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class AssetTagPropertyKeyFinderUtil {
    private static AssetTagPropertyKeyFinder _finder;

    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByGroupId(groupId);
    }

    public static java.lang.String[] findByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByGroupId(groupId);
    }

    public static java.lang.String[] findByGroupId(long groupId, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByGroupId(groupId, start, end);
    }

    public static AssetTagPropertyKeyFinder getFinder() {
        if (_finder == null) {
            _finder = (AssetTagPropertyKeyFinder) PortalBeanLocatorUtil.locate(AssetTagPropertyKeyFinder.class.getName());

            ReferenceRegistry.registerReference(AssetTagPropertyKeyFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(AssetTagPropertyKeyFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(AssetTagPropertyKeyFinderUtil.class,
            "_finder");
    }
}
