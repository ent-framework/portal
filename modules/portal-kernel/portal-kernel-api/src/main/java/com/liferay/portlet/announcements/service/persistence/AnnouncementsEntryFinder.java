package com.liferay.portlet.announcements.service.persistence;

public interface AnnouncementsEntryFinder {
    public int countByScope(long userId, long classNameId, long[] classPKs,
        int displayDateMonth, int displayDateDay, int displayDateYear,
        int displayDateHour, int displayDateMinute, int expirationDateMonth,
        int expirationDateDay, int expirationDateYear, int expirationDateHour,
        int expirationDateMinute, boolean alert, int flagValue)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByScopes(long userId,
        java.util.LinkedHashMap<java.lang.Long, long[]> scopes,
        int displayDateMonth, int displayDateDay, int displayDateYear,
        int displayDateHour, int displayDateMinute, int expirationDateMonth,
        int expirationDateDay, int expirationDateYear, int expirationDateHour,
        int expirationDateMinute, boolean alert, int flagValue)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.announcements.model.AnnouncementsEntry> findByDisplayDate(
        java.util.Date displayDateLT, java.util.Date displayDateGT)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.announcements.model.AnnouncementsEntry> findByScope(
        long userId, long classNameId, long[] classPKs, int displayDateMonth,
        int displayDateDay, int displayDateYear, int displayDateHour,
        int displayDateMinute, int expirationDateMonth, int expirationDateDay,
        int expirationDateYear, int expirationDateHour,
        int expirationDateMinute, boolean alert, int flagValue, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.announcements.model.AnnouncementsEntry> findByScopes(
        long userId, java.util.LinkedHashMap<java.lang.Long, long[]> scopes,
        int displayDateMonth, int displayDateDay, int displayDateYear,
        int displayDateHour, int displayDateMinute, int expirationDateMonth,
        int expirationDateDay, int expirationDateYear, int expirationDateHour,
        int expirationDateMinute, boolean alert, int flagValue, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;
}
