package com.liferay.portal.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.LayoutRevisionServiceUtil;
import com.liferay.portal.service.http.TunnelUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portal.service.LayoutRevisionServiceUtil} service utility. The
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
 * @see LayoutRevisionServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portal.service.LayoutRevisionServiceUtil
 * @generated
 */
public class LayoutRevisionServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(LayoutRevisionServiceHttp.class);
    private static final Class<?>[] _addLayoutRevisionParameterTypes0 = new Class[] {
            long.class, long.class, long.class, long.class, boolean.class,
            long.class, long.class, boolean.class, java.lang.String.class,
            java.lang.String.class, java.lang.String.class,
            java.lang.String.class, java.lang.String.class,
            java.lang.String.class, boolean.class, long.class,
            java.lang.String.class, java.lang.String.class,
            java.lang.String.class, java.lang.String.class,
            java.lang.String.class,
            com.liferay.portal.service.ServiceContext.class
        };

    public static com.liferay.portal.model.LayoutRevision addLayoutRevision(
        HttpPrincipal httpPrincipal, long userId, long layoutSetBranchId,
        long layoutBranchId, long parentLayoutRevisionId, boolean head,
        long plid, long portletPreferencesPlid, boolean privateLayout,
        java.lang.String name, java.lang.String title,
        java.lang.String description, java.lang.String keywords,
        java.lang.String robots, java.lang.String typeSettings,
        boolean iconImage, long iconImageId, java.lang.String themeId,
        java.lang.String colorSchemeId, java.lang.String wapThemeId,
        java.lang.String wapColorSchemeId, java.lang.String css,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(LayoutRevisionServiceUtil.class,
                    "addLayoutRevision", _addLayoutRevisionParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey, userId,
                    layoutSetBranchId, layoutBranchId, parentLayoutRevisionId,
                    head, plid, portletPreferencesPlid, privateLayout, name,
                    title, description, keywords, robots, typeSettings,
                    iconImage, iconImageId, themeId, colorSchemeId, wapThemeId,
                    wapColorSchemeId, css, serviceContext);

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

            return (com.liferay.portal.model.LayoutRevision) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }
}
