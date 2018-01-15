package com.liferay.portlet.announcements.service.http;

import com.liferay.portlet.announcements.service.AnnouncementsEntryServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portlet.announcements.service.AnnouncementsEntryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portlet.announcements.model.AnnouncementsEntrySoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portlet.announcements.model.AnnouncementsEntry}, that is translated to a
 * {@link com.liferay.portlet.announcements.model.AnnouncementsEntrySoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AnnouncementsEntryServiceHttp
 * @see com.liferay.portlet.announcements.model.AnnouncementsEntrySoap
 * @see com.liferay.portlet.announcements.service.AnnouncementsEntryServiceUtil
 * @generated
 */
public class AnnouncementsEntryServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(AnnouncementsEntryServiceSoap.class);

    public static com.liferay.portlet.announcements.model.AnnouncementsEntrySoap addEntry(
        long plid, long classNameId, long classPK, java.lang.String title,
        java.lang.String content, java.lang.String url, java.lang.String type,
        int displayDateMonth, int displayDateDay, int displayDateYear,
        int displayDateHour, int displayDateMinute, boolean displayImmediately,
        int expirationDateMonth, int expirationDateDay, int expirationDateYear,
        int expirationDateHour, int expirationDateMinute, int priority,
        boolean alert) throws RemoteException {
        try {
            com.liferay.portlet.announcements.model.AnnouncementsEntry returnValue =
                AnnouncementsEntryServiceUtil.addEntry(plid, classNameId,
                    classPK, title, content, url, type, displayDateMonth,
                    displayDateDay, displayDateYear, displayDateHour,
                    displayDateMinute, displayImmediately, expirationDateMonth,
                    expirationDateDay, expirationDateYear, expirationDateHour,
                    expirationDateMinute, priority, alert);

            return com.liferay.portlet.announcements.model.AnnouncementsEntrySoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * @deprecated As of 6.2.0, replaced by {@link #addEntry(long, long, long,
    String, String, String, String, int, int, int, int, int,
    boolean, int, int, int, int, int, int, boolean)}
    */
    public static com.liferay.portlet.announcements.model.AnnouncementsEntrySoap addEntry(
        long plid, long classNameId, long classPK, java.lang.String title,
        java.lang.String content, java.lang.String url, java.lang.String type,
        int displayDateMonth, int displayDateDay, int displayDateYear,
        int displayDateHour, int displayDateMinute, int expirationDateMonth,
        int expirationDateDay, int expirationDateYear, int expirationDateHour,
        int expirationDateMinute, int priority, boolean alert)
        throws RemoteException {
        try {
            com.liferay.portlet.announcements.model.AnnouncementsEntry returnValue =
                AnnouncementsEntryServiceUtil.addEntry(plid, classNameId,
                    classPK, title, content, url, type, displayDateMonth,
                    displayDateDay, displayDateYear, displayDateHour,
                    displayDateMinute, expirationDateMonth, expirationDateDay,
                    expirationDateYear, expirationDateHour,
                    expirationDateMinute, priority, alert);

            return com.liferay.portlet.announcements.model.AnnouncementsEntrySoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void deleteEntry(long entryId) throws RemoteException {
        try {
            AnnouncementsEntryServiceUtil.deleteEntry(entryId);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portlet.announcements.model.AnnouncementsEntrySoap getEntry(
        long entryId) throws RemoteException {
        try {
            com.liferay.portlet.announcements.model.AnnouncementsEntry returnValue =
                AnnouncementsEntryServiceUtil.getEntry(entryId);

            return com.liferay.portlet.announcements.model.AnnouncementsEntrySoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portlet.announcements.model.AnnouncementsEntrySoap updateEntry(
        long entryId, java.lang.String title, java.lang.String content,
        java.lang.String url, java.lang.String type, int displayDateMonth,
        int displayDateDay, int displayDateYear, int displayDateHour,
        int displayDateMinute, boolean displayImmediately,
        int expirationDateMonth, int expirationDateDay, int expirationDateYear,
        int expirationDateHour, int expirationDateMinute, int priority)
        throws RemoteException {
        try {
            com.liferay.portlet.announcements.model.AnnouncementsEntry returnValue =
                AnnouncementsEntryServiceUtil.updateEntry(entryId, title,
                    content, url, type, displayDateMonth, displayDateDay,
                    displayDateYear, displayDateHour, displayDateMinute,
                    displayImmediately, expirationDateMonth, expirationDateDay,
                    expirationDateYear, expirationDateHour,
                    expirationDateMinute, priority);

            return com.liferay.portlet.announcements.model.AnnouncementsEntrySoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
