package com.liferay.portlet.documentlibrary.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portlet.documentlibrary.service.DLFileVersionServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portlet.documentlibrary.service.DLFileVersionServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portlet.documentlibrary.model.DLFileVersionSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portlet.documentlibrary.model.DLFileVersion}, that is translated to a
 * {@link com.liferay.portlet.documentlibrary.model.DLFileVersionSoap}. Methods that SOAP cannot
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
 * @see DLFileVersionServiceHttp
 * @see com.liferay.portlet.documentlibrary.model.DLFileVersionSoap
 * @see com.liferay.portlet.documentlibrary.service.DLFileVersionServiceUtil
 * @generated
 */
@ProviderType
public class DLFileVersionServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(DLFileVersionServiceSoap.class);

    public static com.liferay.portlet.documentlibrary.model.DLFileVersionSoap getFileVersion(
        long fileVersionId) throws RemoteException {
        try {
            com.liferay.portlet.documentlibrary.model.DLFileVersion returnValue = DLFileVersionServiceUtil.getFileVersion(fileVersionId);

            return com.liferay.portlet.documentlibrary.model.DLFileVersionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portlet.documentlibrary.model.DLFileVersionSoap[] getFileVersions(
        long fileEntryId, int status) throws RemoteException {
        try {
            java.util.List<com.liferay.portlet.documentlibrary.model.DLFileVersion> returnValue =
                DLFileVersionServiceUtil.getFileVersions(fileEntryId, status);

            return com.liferay.portlet.documentlibrary.model.DLFileVersionSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static int getFileVersionsCount(long fileEntryId, int status)
        throws RemoteException {
        try {
            int returnValue = DLFileVersionServiceUtil.getFileVersionsCount(fileEntryId,
                    status);

            return returnValue;
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portlet.documentlibrary.model.DLFileVersionSoap getLatestFileVersion(
        long fileEntryId) throws RemoteException {
        try {
            com.liferay.portlet.documentlibrary.model.DLFileVersion returnValue = DLFileVersionServiceUtil.getLatestFileVersion(fileEntryId);

            return com.liferay.portlet.documentlibrary.model.DLFileVersionSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
