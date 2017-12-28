package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class TeamFinderUtil {
    private static TeamFinder _finder;

    public static int countByG_N_D(long groupId, java.lang.String name,
        java.lang.String description,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByG_N_D(groupId, name, description, params);
    }

    public static java.util.List<com.liferay.portal.model.Team> findByG_N_D(
        long groupId, java.lang.String name, java.lang.String description,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByG_N_D(groupId, name, description, params, start, end,
            obc);
    }

    public static TeamFinder getFinder() {
        if (_finder == null) {
            _finder = (TeamFinder) PortalBeanLocatorUtil.locate(TeamFinder.class.getName());

            ReferenceRegistry.registerReference(TeamFinderUtil.class, "_finder");
        }

        return _finder;
    }

    public void setFinder(TeamFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(TeamFinderUtil.class, "_finder");
    }
}
