package com.liferay.portlet.asset.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface AssetTagPropertyKeyFinder {
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String[] findByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String[] findByGroupId(long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
