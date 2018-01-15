package com.liferay.portlet.calendar.service.persistence;

public interface CalEventFinder {
    public int countByG_SD_T(long groupId, java.util.Date startDateGT,
        java.util.Date startDateLT, boolean timeZoneSensitive,
        java.lang.String[] types)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.calendar.model.CalEvent> findByFutureReminders()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.calendar.model.CalEvent> findByNoAssets()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.calendar.model.CalEvent> findByG_SD_T(
        long groupId, java.util.Date startDateGT, java.util.Date startDateLT,
        boolean timeZoneSensitive, java.lang.String[] types)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.calendar.model.CalEvent> findByG_SD_T(
        long groupId, java.util.Date startDateGT, java.util.Date startDateLT,
        boolean timeZoneSensitive, java.lang.String[] types, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;
}
