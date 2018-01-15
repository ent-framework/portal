package com.liferay.mail.service.http;

import com.liferay.mail.service.MailServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.mail.service.MailServiceUtil} service utility. The
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
 * @see MailServiceHttp
 * @see com.liferay.mail.service.MailServiceUtil
 * @generated
 */
public class MailServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(MailServiceSoap.class);

    public static void addForward(long companyId, long userId,
        java.util.List<com.liferay.mail.model.Filter> filters,
        java.util.List<java.lang.String> emailAddresses, boolean leaveCopy)
        throws RemoteException {
        try {
            MailServiceUtil.addForward(companyId, userId, filters,
                emailAddresses, leaveCopy);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void addUser(long companyId, long userId,
        java.lang.String password, java.lang.String firstName,
        java.lang.String middleName, java.lang.String lastName,
        java.lang.String emailAddress) throws RemoteException {
        try {
            MailServiceUtil.addUser(companyId, userId, password, firstName,
                middleName, lastName, emailAddress);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void addVacationMessage(long companyId, long userId,
        java.lang.String emailAddress, java.lang.String vacationMessage)
        throws RemoteException {
        try {
            MailServiceUtil.addVacationMessage(companyId, userId, emailAddress,
                vacationMessage);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void clearSession() throws RemoteException {
        try {
            MailServiceUtil.clearSession();
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void deleteEmailAddress(long companyId, long userId)
        throws RemoteException {
        try {
            MailServiceUtil.deleteEmailAddress(companyId, userId);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void deleteUser(long companyId, long userId)
        throws RemoteException {
        try {
            MailServiceUtil.deleteUser(companyId, userId);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void sendEmail(
        com.liferay.portal.kernel.mail.MailMessage mailMessage)
        throws RemoteException {
        try {
            MailServiceUtil.sendEmail(mailMessage);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void setBeanIdentifier(java.lang.String beanIdentifier)
        throws RemoteException {
        try {
            MailServiceUtil.setBeanIdentifier(beanIdentifier);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void updateBlocked(long companyId, long userId,
        java.util.List<java.lang.String> blocked) throws RemoteException {
        try {
            MailServiceUtil.updateBlocked(companyId, userId, blocked);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void updateEmailAddress(long companyId, long userId,
        java.lang.String emailAddress) throws RemoteException {
        try {
            MailServiceUtil.updateEmailAddress(companyId, userId, emailAddress);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void updatePassword(long companyId, long userId,
        java.lang.String password) throws RemoteException {
        try {
            MailServiceUtil.updatePassword(companyId, userId, password);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
