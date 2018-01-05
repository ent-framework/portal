package com.liferay.portlet.flags.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.http.TunnelUtil;

import com.liferay.portlet.flags.service.FlagsEntryServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portlet.flags.service.FlagsEntryServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link com.liferay.portal.security.auth.HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FlagsEntryServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portlet.flags.service.FlagsEntryServiceUtil
 * @generated
 */
public class FlagsEntryServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(FlagsEntryServiceHttp.class);
    private static final Class<?>[] _addEntryParameterTypes0 = new Class[] {
            java.lang.String.class, long.class, java.lang.String.class,
            long.class, java.lang.String.class, java.lang.String.class,
            java.lang.String.class,
            com.liferay.portal.service.ServiceContext.class
        };

    public static void addEntry(HttpPrincipal httpPrincipal,
        java.lang.String className, long classPK,
        java.lang.String reporterEmailAddress, long reportedUserId,
        java.lang.String contentTitle, java.lang.String contentURL,
        java.lang.String reason,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(FlagsEntryServiceUtil.class,
                    "addEntry", _addEntryParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    className, classPK, reporterEmailAddress, reportedUserId,
                    contentTitle, contentURL, reason, serviceContext);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }
}
