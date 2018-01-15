package com.liferay.portal.service.persistence;

public interface LayoutFinder {
    public java.util.List<com.liferay.portal.model.Layout> findByNoPermissions(
        long roleId) throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Layout> findByNullFriendlyURL()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Layout> findByScopeGroup(
        long groupId, boolean privateLayout)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.LayoutReference> findByC_P_P(
        long companyId, java.lang.String portletId,
        java.lang.String preferencesKey, java.lang.String preferencesValue)
        throws com.liferay.portal.kernel.exception.SystemException;
}
