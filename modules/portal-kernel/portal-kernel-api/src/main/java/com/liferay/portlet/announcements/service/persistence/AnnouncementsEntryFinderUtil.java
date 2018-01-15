package com.liferay.portlet.announcements.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class AnnouncementsEntryFinderUtil {
    private static AnnouncementsEntryFinder _finder;

    public static int countByScope(long userId, long classNameId,
        long[] classPKs, int displayDateMonth, int displayDateDay,
        int displayDateYear, int displayDateHour, int displayDateMinute,
        int expirationDateMonth, int expirationDateDay, int expirationDateYear,
        int expirationDateHour, int expirationDateMinute, boolean alert,
        int flagValue)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByScope(userId, classNameId, classPKs,
            displayDateMonth, displayDateDay, displayDateYear, displayDateHour,
            displayDateMinute, expirationDateMonth, expirationDateDay,
            expirationDateYear, expirationDateHour, expirationDateMinute,
            alert, flagValue);
    }

    public static int countByScopes(long userId,
        java.util.LinkedHashMap<java.lang.Long, long[]> scopes,
        int displayDateMonth, int displayDateDay, int displayDateYear,
        int displayDateHour, int displayDateMinute, int expirationDateMonth,
        int expirationDateDay, int expirationDateYear, int expirationDateHour,
        int expirationDateMinute, boolean alert, int flagValue)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByScopes(userId, scopes, displayDateMonth,
            displayDateDay, displayDateYear, displayDateHour,
            displayDateMinute, expirationDateMonth, expirationDateDay,
            expirationDateYear, expirationDateHour, expirationDateMinute,
            alert, flagValue);
    }

    public static java.util.List<com.liferay.portlet.announcements.model.AnnouncementsEntry> findByDisplayDate(
        java.util.Date displayDateLT, java.util.Date displayDateGT)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByDisplayDate(displayDateLT, displayDateGT);
    }

    public static java.util.List<com.liferay.portlet.announcements.model.AnnouncementsEntry> findByScope(
        long userId, long classNameId, long[] classPKs, int displayDateMonth,
        int displayDateDay, int displayDateYear, int displayDateHour,
        int displayDateMinute, int expirationDateMonth, int expirationDateDay,
        int expirationDateYear, int expirationDateHour,
        int expirationDateMinute, boolean alert, int flagValue, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByScope(userId, classNameId, classPKs,
            displayDateMonth, displayDateDay, displayDateYear, displayDateHour,
            displayDateMinute, expirationDateMonth, expirationDateDay,
            expirationDateYear, expirationDateHour, expirationDateMinute,
            alert, flagValue, start, end);
    }

    public static java.util.List<com.liferay.portlet.announcements.model.AnnouncementsEntry> findByScopes(
        long userId, java.util.LinkedHashMap<java.lang.Long, long[]> scopes,
        int displayDateMonth, int displayDateDay, int displayDateYear,
        int displayDateHour, int displayDateMinute, int expirationDateMonth,
        int expirationDateDay, int expirationDateYear, int expirationDateHour,
        int expirationDateMinute, boolean alert, int flagValue, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByScopes(userId, scopes, displayDateMonth,
            displayDateDay, displayDateYear, displayDateHour,
            displayDateMinute, expirationDateMonth, expirationDateDay,
            expirationDateYear, expirationDateHour, expirationDateMinute,
            alert, flagValue, start, end);
    }

    public static AnnouncementsEntryFinder getFinder() {
        if (_finder == null) {
            _finder = (AnnouncementsEntryFinder) PortalBeanLocatorUtil.locate(AnnouncementsEntryFinder.class.getName());

            ReferenceRegistry.registerReference(AnnouncementsEntryFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(AnnouncementsEntryFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(AnnouncementsEntryFinderUtil.class,
            "_finder");
    }
}
