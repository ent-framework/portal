package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface UserGroupRoleFinder {
    public java.util.List<com.liferay.portal.model.UserGroupGroupRole> findByUserGroupsUsers(
        long userId) throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.UserGroupRole> findByUserUserGroupGroupRole(
        long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;
}
