package com.liferay.portlet.asset.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class AssetEntryFinderUtil {
    private static AssetEntryFinder _finder;

    public static int countEntries(
        com.liferay.portlet.asset.service.persistence.AssetEntryQuery entryQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countEntries(entryQuery);
    }

    public static java.util.List<com.liferay.portlet.asset.model.AssetEntry> findEntries(
        com.liferay.portlet.asset.service.persistence.AssetEntryQuery entryQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findEntries(entryQuery);
    }

    public static AssetEntryFinder getFinder() {
        if (_finder == null) {
            _finder = (AssetEntryFinder) PortalBeanLocatorUtil.locate(AssetEntryFinder.class.getName());

            ReferenceRegistry.registerReference(AssetEntryFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(AssetEntryFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(AssetEntryFinderUtil.class,
            "_finder");
    }
}
