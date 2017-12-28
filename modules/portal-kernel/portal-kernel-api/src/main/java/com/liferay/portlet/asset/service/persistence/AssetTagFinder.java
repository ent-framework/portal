package com.liferay.portlet.asset.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface AssetTagFinder {
    public int countByG_C_N(long groupId, long classNameId,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByG_N_P(long groupId, java.lang.String name,
        java.lang.String[] tagProperties)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountByG_N(long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountByG_C_N(long groupId, long classNameId,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountByG_N_P(long groupId, java.lang.String name,
        java.lang.String[] tagProperties)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.asset.model.AssetTag filterFindByG_N(
        long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.asset.NoSuchTagException;

    public java.util.List<com.liferay.portlet.asset.model.AssetTag> filterFindByG_C_N(
        long groupId, long classNameId, java.lang.String name, int start,
        int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetTag> filterFindByG_N_P(
        long[] groupIds, java.lang.String name,
        java.lang.String[] tagProperties, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.asset.model.AssetTag findByG_N(long groupId,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.asset.NoSuchTagException;

    public java.util.List<com.liferay.portlet.asset.model.AssetTag> findByG_C_N(
        long groupId, long classNameId, java.lang.String name, int start,
        int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetTag> findByG_N_P(
        long[] groupIds, java.lang.String name,
        java.lang.String[] tagProperties, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetTag> findByG_N_S_E(
        long groupId, java.lang.String name, int startPeriod, int endPeriod,
        int periodLength)
        throws com.liferay.portal.kernel.exception.SystemException;
}
