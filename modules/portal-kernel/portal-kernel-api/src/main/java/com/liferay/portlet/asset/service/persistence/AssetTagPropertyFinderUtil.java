package com.liferay.portlet.asset.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class AssetTagPropertyFinderUtil {
    private static AssetTagPropertyFinder _finder;

    public static int countByG_K(long groupId, java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByG_K(groupId, key);
    }

    public static java.util.List<com.liferay.portlet.asset.model.AssetTagProperty> findByG_K(
        long groupId, java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByG_K(groupId, key);
    }

    public static java.util.List<com.liferay.portlet.asset.model.AssetTagProperty> findByG_K(
        long groupId, java.lang.String key, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByG_K(groupId, key, start, end);
    }

    public static AssetTagPropertyFinder getFinder() {
        if (_finder == null) {
            _finder = (AssetTagPropertyFinder) PortalBeanLocatorUtil.locate(AssetTagPropertyFinder.class.getName());

            ReferenceRegistry.registerReference(AssetTagPropertyFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(AssetTagPropertyFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(AssetTagPropertyFinderUtil.class,
            "_finder");
    }
}
