package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class UserGroupRoleFinderUtil {
    private static UserGroupRoleFinder _finder;

    public static java.util.List<com.liferay.portal.model.UserGroupGroupRole> findByUserGroupsUsers(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByUserGroupsUsers(userId);
    }

    public static java.util.List<com.liferay.portal.model.UserGroupRole> findByUserUserGroupGroupRole(
        long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByUserUserGroupGroupRole(userId, groupId);
    }

    public static UserGroupRoleFinder getFinder() {
        if (_finder == null) {
            _finder = (UserGroupRoleFinder) PortalBeanLocatorUtil.locate(UserGroupRoleFinder.class.getName());

            ReferenceRegistry.registerReference(UserGroupRoleFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(UserGroupRoleFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(UserGroupRoleFinderUtil.class,
            "_finder");
    }
}
