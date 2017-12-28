package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface ResourceTypePermissionFinder {
    public java.util.List<com.liferay.portal.model.ResourceTypePermission> findByEitherScopeC_G_N(
        long companyId, long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.ResourceTypePermission> findByGroupScopeC_N_R(
        long companyId, java.lang.String name, long roleId)
        throws com.liferay.portal.kernel.exception.SystemException;
}
