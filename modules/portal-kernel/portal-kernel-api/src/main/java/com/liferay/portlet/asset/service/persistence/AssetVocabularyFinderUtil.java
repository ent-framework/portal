package com.liferay.portlet.asset.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class AssetVocabularyFinderUtil {
    private static AssetVocabularyFinder _finder;

    public static int countByG_N(long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByG_N(groupId, name);
    }

    public static int filterCountByG_N(long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().filterCountByG_N(groupId, name);
    }

    public static java.util.List<com.liferay.portlet.asset.model.AssetVocabulary> filterFindByG_N(
        long groupId, java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().filterFindByG_N(groupId, name, start, end, obc);
    }

    public static java.util.List<com.liferay.portlet.asset.model.AssetVocabulary> findByG_N(
        long groupId, java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByG_N(groupId, name, start, end, obc);
    }

    public static AssetVocabularyFinder getFinder() {
        if (_finder == null) {
            _finder = (AssetVocabularyFinder) PortalBeanLocatorUtil.locate(AssetVocabularyFinder.class.getName());

            ReferenceRegistry.registerReference(AssetVocabularyFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(AssetVocabularyFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(AssetVocabularyFinderUtil.class,
            "_finder");
    }
}
