package com.liferay.portal.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.ThemeServiceUtil;
import com.liferay.portal.service.http.TunnelUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portal.service.ThemeServiceUtil} service utility. The
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
 * @see ThemeServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portal.service.ThemeServiceUtil
 * @generated
 */
public class ThemeServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(ThemeServiceHttp.class);
    private static final Class<?>[] _getThemesParameterTypes0 = new Class[] {
            long.class
        };
    private static final Class<?>[] _getWARThemesParameterTypes1 = new Class[] {  };

    public static java.util.List<com.liferay.portal.model.Theme> getThemes(
        HttpPrincipal httpPrincipal, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(ThemeServiceUtil.class,
                    "getThemes", _getThemesParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey, companyId);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return (java.util.List<com.liferay.portal.model.Theme>) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static com.liferay.portal.kernel.json.JSONArray getWARThemes(
        HttpPrincipal httpPrincipal)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(ThemeServiceUtil.class,
                    "getWARThemes", _getWARThemesParameterTypes1);

            MethodHandler methodHandler = new MethodHandler(methodKey);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return (com.liferay.portal.kernel.json.JSONArray) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }
}
