package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface PortletPreferencesFinder {
    public long countByO_O_P(long ownerId, int ownerType,
        java.lang.String portletId, boolean excludeDefaultPreferences)
        throws com.liferay.portal.kernel.exception.SystemException;

    public long countByO_O_P_P_P(long ownerId, int ownerType, long plid,
        java.lang.String portletId, boolean excludeDefaultPreferences)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.PortletPreferences> findByPortletId(
        java.lang.String portletId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.PortletPreferences> findByC_G_O_O_P_P(
        long companyId, long groupId, long ownerId, int ownerType,
        java.lang.String portletId, boolean privateLayout)
        throws com.liferay.portal.kernel.exception.SystemException;
}
