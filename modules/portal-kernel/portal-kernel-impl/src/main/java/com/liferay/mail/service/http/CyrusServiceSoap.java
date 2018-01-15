package com.liferay.mail.service.http;

import com.liferay.mail.service.CyrusServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.mail.service.CyrusServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
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
 * @see CyrusServiceHttp
 * @see com.liferay.mail.service.CyrusServiceUtil
 * @generated
 */
public class CyrusServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(CyrusServiceSoap.class);

    public static void addUser(long userId, java.lang.String emailAddress,
        java.lang.String password) throws RemoteException {
        try {
            CyrusServiceUtil.addUser(userId, emailAddress, password);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void deleteEmailAddress(long companyId, long userId)
        throws RemoteException {
        try {
            CyrusServiceUtil.deleteEmailAddress(companyId, userId);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void deleteUser(long userId) throws RemoteException {
        try {
            CyrusServiceUtil.deleteUser(userId);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void updateEmailAddress(long companyId, long userId,
        java.lang.String emailAddress) throws RemoteException {
        try {
            CyrusServiceUtil.updateEmailAddress(companyId, userId, emailAddress);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void updatePassword(long companyId, long userId,
        java.lang.String password) throws RemoteException {
        try {
            CyrusServiceUtil.updatePassword(companyId, userId, password);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
