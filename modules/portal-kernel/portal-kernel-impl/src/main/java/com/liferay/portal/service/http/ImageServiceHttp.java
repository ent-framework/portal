package com.liferay.portal.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.ImageServiceUtil;
import com.liferay.portal.service.http.TunnelUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portal.service.ImageServiceUtil} service utility. The
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
 * @see ImageServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portal.service.ImageServiceUtil
 * @generated
 */
public class ImageServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(ImageServiceHttp.class);
    private static final Class<?>[] _getImageParameterTypes0 = new Class[] {
            long.class
        };

    public static com.liferay.portal.model.Image getImage(
        HttpPrincipal httpPrincipal, long imageId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(ImageServiceUtil.class,
                    "getImage", _getImageParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey, imageId);

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

            return (com.liferay.portal.model.Image) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }
}
