package com.liferay.portlet.asset.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class AssetCategoryFinderUtil {
    private static AssetCategoryFinder _finder;

    public static int countByG_C_N(long groupId, long classNameId,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByG_C_N(groupId, classNameId, name);
    }

    public static int countByG_N_P(long groupId, java.lang.String name,
        java.lang.String[] categoryProperties)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByG_N_P(groupId, name, categoryProperties);
    }

    public static java.util.List<java.lang.Long> findByG_L(
        java.lang.Long parentCategoryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByG_L(parentCategoryId);
    }

    public static com.liferay.portlet.asset.model.AssetCategory findByG_N(
        long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.asset.NoSuchCategoryException {
        return getFinder().findByG_N(groupId, name);
    }

    public static java.util.List<com.liferay.portlet.asset.model.AssetCategory> findByG_N_P(
        long groupId, java.lang.String name,
        java.lang.String[] categoryProperties)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByG_N_P(groupId, name, categoryProperties);
    }

    public static java.util.List<com.liferay.portlet.asset.model.AssetCategory> findByG_N_P(
        long groupId, java.lang.String name,
        java.lang.String[] categoryProperties, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByG_N_P(groupId, name, categoryProperties, start, end);
    }

    public static AssetCategoryFinder getFinder() {
        if (_finder == null) {
            _finder = (AssetCategoryFinder) PortalBeanLocatorUtil.locate(AssetCategoryFinder.class.getName());

            ReferenceRegistry.registerReference(AssetCategoryFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(AssetCategoryFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(AssetCategoryFinderUtil.class,
            "_finder");
    }
}
