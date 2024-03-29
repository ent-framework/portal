package com.liferay.portlet.documentlibrary.service.http;

import com.liferay.portlet.documentlibrary.service.DLFileShortcutServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portlet.documentlibrary.service.DLFileShortcutServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portlet.documentlibrary.model.DLFileShortcutSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portlet.documentlibrary.model.DLFileShortcut}, that is translated to a
 * {@link com.liferay.portlet.documentlibrary.model.DLFileShortcutSoap}. Methods that SOAP cannot
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
 * @see DLFileShortcutServiceHttp
 * @see com.liferay.portlet.documentlibrary.model.DLFileShortcutSoap
 * @see com.liferay.portlet.documentlibrary.service.DLFileShortcutServiceUtil
 * @generated
 */
public class DLFileShortcutServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(DLFileShortcutServiceSoap.class);

    public static com.liferay.portlet.documentlibrary.model.DLFileShortcutSoap addFileShortcut(
        long groupId, long folderId, long toFileEntryId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            com.liferay.portlet.documentlibrary.model.DLFileShortcut returnValue =
                DLFileShortcutServiceUtil.addFileShortcut(groupId, folderId,
                    toFileEntryId, serviceContext);

            return com.liferay.portlet.documentlibrary.model.DLFileShortcutSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void deleteFileShortcut(long fileShortcutId)
        throws RemoteException {
        try {
            DLFileShortcutServiceUtil.deleteFileShortcut(fileShortcutId);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portlet.documentlibrary.model.DLFileShortcutSoap getFileShortcut(
        long fileShortcutId) throws RemoteException {
        try {
            com.liferay.portlet.documentlibrary.model.DLFileShortcut returnValue =
                DLFileShortcutServiceUtil.getFileShortcut(fileShortcutId);

            return com.liferay.portlet.documentlibrary.model.DLFileShortcutSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portlet.documentlibrary.model.DLFileShortcutSoap updateFileShortcut(
        long fileShortcutId, long folderId, long toFileEntryId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            com.liferay.portlet.documentlibrary.model.DLFileShortcut returnValue =
                DLFileShortcutServiceUtil.updateFileShortcut(fileShortcutId,
                    folderId, toFileEntryId, serviceContext);

            return com.liferay.portlet.documentlibrary.model.DLFileShortcutSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
