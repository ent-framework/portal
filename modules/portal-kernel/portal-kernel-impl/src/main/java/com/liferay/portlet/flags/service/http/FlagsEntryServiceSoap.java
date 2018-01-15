package com.liferay.portlet.flags.service.http;

import com.liferay.portlet.flags.service.FlagsEntryServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portlet.flags.service.FlagsEntryServiceUtil} service utility. The
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
 * @see FlagsEntryServiceHttp
 * @see com.liferay.portlet.flags.service.FlagsEntryServiceUtil
 * @generated
 */
public class FlagsEntryServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(FlagsEntryServiceSoap.class);

    public static void addEntry(java.lang.String className, long classPK,
        java.lang.String reporterEmailAddress, long reportedUserId,
        java.lang.String contentTitle, java.lang.String contentURL,
        java.lang.String reason,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            FlagsEntryServiceUtil.addEntry(className, classPK,
                reporterEmailAddress, reportedUserId, contentTitle, contentURL,
                reason, serviceContext);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
