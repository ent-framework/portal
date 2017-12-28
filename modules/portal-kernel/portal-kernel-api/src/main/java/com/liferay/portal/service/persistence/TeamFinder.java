package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface TeamFinder {
    public int countByG_N_D(long groupId, java.lang.String name,
        java.lang.String description,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Team> findByG_N_D(
        long groupId, java.lang.String name, java.lang.String description,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;
}
