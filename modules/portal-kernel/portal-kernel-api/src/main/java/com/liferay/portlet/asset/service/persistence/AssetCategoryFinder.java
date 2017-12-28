package com.liferay.portlet.asset.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface AssetCategoryFinder {
    public int countByG_C_N(long groupId, long classNameId,
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByG_N_P(long groupId, java.lang.String name,
        java.lang.String[] categoryProperties)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Long> findByG_L(
        java.lang.Long parentCategoryId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portlet.asset.model.AssetCategory findByG_N(
        long groupId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.liferay.portlet.asset.NoSuchCategoryException;

    public java.util.List<com.liferay.portlet.asset.model.AssetCategory> findByG_N_P(
        long groupId, java.lang.String name,
        java.lang.String[] categoryProperties)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetCategory> findByG_N_P(
        long groupId, java.lang.String name,
        java.lang.String[] categoryProperties, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
