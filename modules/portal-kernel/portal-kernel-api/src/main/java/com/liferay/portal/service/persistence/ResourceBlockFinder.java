package com.liferay.portal.service.persistence;

public interface ResourceBlockFinder {
    public com.liferay.portal.security.permission.ResourceBlockIdsBag findByC_G_N_R(
        long companyId, long groupId, java.lang.String name, long[] roleIds)
        throws com.liferay.portal.kernel.exception.SystemException;
}
