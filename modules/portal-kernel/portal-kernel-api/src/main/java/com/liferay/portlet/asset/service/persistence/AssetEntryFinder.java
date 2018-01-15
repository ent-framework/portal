package com.liferay.portlet.asset.service.persistence;

public interface AssetEntryFinder {
    public int countEntries(
        com.liferay.portlet.asset.service.persistence.AssetEntryQuery entryQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.asset.model.AssetEntry> findEntries(
        com.liferay.portlet.asset.service.persistence.AssetEntryQuery entryQuery)
        throws com.liferay.portal.kernel.exception.SystemException;
}
