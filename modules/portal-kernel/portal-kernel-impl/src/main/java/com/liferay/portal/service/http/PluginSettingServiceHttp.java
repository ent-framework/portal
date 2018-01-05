package com.liferay.portal.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.PluginSettingServiceUtil;
import com.liferay.portal.service.http.TunnelUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portal.service.PluginSettingServiceUtil} service utility. The
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
 * @see PluginSettingServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portal.service.PluginSettingServiceUtil
 * @generated
 */
public class PluginSettingServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(PluginSettingServiceHttp.class);
    private static final Class<?>[] _updatePluginSettingParameterTypes0 = new Class[] {
            long.class, java.lang.String.class, java.lang.String.class,
            java.lang.String.class, boolean.class
        };

    public static com.liferay.portal.model.PluginSetting updatePluginSetting(
        HttpPrincipal httpPrincipal, long companyId, java.lang.String pluginId,
        java.lang.String pluginType, java.lang.String roles, boolean active)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PluginSettingServiceUtil.class,
                    "updatePluginSetting", _updatePluginSettingParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    companyId, pluginId, pluginType, roles, active);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
                    throw (com.liferay.portal.kernel.exception.PortalException) e;
                }

                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return (com.liferay.portal.model.PluginSetting) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }
}
