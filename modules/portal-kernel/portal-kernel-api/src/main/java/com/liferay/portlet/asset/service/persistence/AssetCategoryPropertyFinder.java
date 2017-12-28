package com.liferay.portlet.asset.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface AssetCategoryPropertyFinder {
    public int countByG_K(long groupId, java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetCategoryProperty> findByG_K(
        long groupId, java.lang.String key)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetCategoryProperty> findByG_K(
        long groupId, java.lang.String key, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
