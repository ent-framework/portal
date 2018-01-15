package com.liferay.portlet.social.service.persistence;

public interface SocialActivityCounterFinder {
    public int countU_ByG_N(long groupId, java.lang.String[] names)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivityCounter> findAC_ByG_N_S_E_1(
        long groupId, java.lang.String name, int startPeriod, int endPeriod,
        int periodLength)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivityCounter> findAC_ByG_N_S_E_2(
        long groupId, java.lang.String counterName, int startPeriod,
        int endPeriod, int periodLength)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.social.model.SocialActivityCounter> findAC_By_G_C_C_N_S_E(
        long groupId, java.util.List<java.lang.Long> userIds,
        java.lang.String[] names, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Long> findU_ByG_N(long groupId,
        java.lang.String[] names, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
