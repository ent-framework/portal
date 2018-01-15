package com.liferay.portal.service.persistence;

public interface ResourcePermissionFinder {
    public int countByR_S(long roleId, int[] scopes)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_N_S_P_R_A(long companyId, java.lang.String name,
        int scope, java.lang.String primKey, long[] roleIds, long actionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.ResourcePermission> findByResource(
        long companyId, long groupId, java.lang.String name,
        java.lang.String primKey)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.ResourcePermission> findByR_S(
        long roleId, int[] scopes, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
