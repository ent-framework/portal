package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UserGroupRoleService}.
 *
 * @author Brian Wing Shun Chan
 * @see UserGroupRoleService
 * @generated
 */
@ProviderType
public class UserGroupRoleServiceWrapper implements UserGroupRoleService,
    ServiceWrapper<UserGroupRoleService> {
    private UserGroupRoleService _userGroupRoleService;

    public UserGroupRoleServiceWrapper(
        UserGroupRoleService userGroupRoleService) {
        _userGroupRoleService = userGroupRoleService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _userGroupRoleService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _userGroupRoleService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public void addUserGroupRoles(long userId, long groupId, long[] roleIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _userGroupRoleService.addUserGroupRoles(userId, groupId, roleIds);
    }

    @Override
    public void addUserGroupRoles(long[] userIds, long groupId, long roleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _userGroupRoleService.addUserGroupRoles(userIds, groupId, roleId);
    }

    @Override
    public void deleteUserGroupRoles(long userId, long groupId, long[] roleIds)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _userGroupRoleService.deleteUserGroupRoles(userId, groupId, roleIds);
    }

    @Override
    public void deleteUserGroupRoles(long[] userIds, long groupId, long roleId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _userGroupRoleService.deleteUserGroupRoles(userIds, groupId, roleId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UserGroupRoleService getWrappedUserGroupRoleService() {
        return _userGroupRoleService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUserGroupRoleService(
        UserGroupRoleService userGroupRoleService) {
        _userGroupRoleService = userGroupRoleService;
    }

    @Override
    public UserGroupRoleService getWrappedService() {
        return _userGroupRoleService;
    }

    @Override
    public void setWrappedService(UserGroupRoleService userGroupRoleService) {
        _userGroupRoleService = userGroupRoleService;
    }
}
