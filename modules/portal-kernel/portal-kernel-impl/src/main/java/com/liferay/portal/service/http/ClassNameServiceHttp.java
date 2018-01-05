package com.liferay.portal.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.ClassNameServiceUtil;
import com.liferay.portal.service.http.TunnelUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portal.service.ClassNameServiceUtil} service utility. The
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
 * @see ClassNameServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portal.service.ClassNameServiceUtil
 * @generated
 */
public class ClassNameServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(ClassNameServiceHttp.class);
    private static final Class<?>[] _fetchClassNameParameterTypes0 = new Class[] {
            java.lang.String.class
        };
    private static final Class<?>[] _fetchClassNameIdParameterTypes1 = new Class[] {
            java.lang.Class.class
        };
    private static final Class<?>[] _fetchClassNameIdParameterTypes2 = new Class[] {
            java.lang.String.class
        };

    public static com.liferay.portal.model.ClassName fetchClassName(
        HttpPrincipal httpPrincipal, java.lang.String value)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(ClassNameServiceUtil.class,
                    "fetchClassName", _fetchClassNameParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey, value);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return (com.liferay.portal.model.ClassName) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static long fetchClassNameId(HttpPrincipal httpPrincipal,
        java.lang.Class<?> clazz)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(ClassNameServiceUtil.class,
                    "fetchClassNameId", _fetchClassNameIdParameterTypes1);

            MethodHandler methodHandler = new MethodHandler(methodKey, clazz);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return ((Long) returnObj).longValue();
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static long fetchClassNameId(HttpPrincipal httpPrincipal,
        java.lang.String value)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(ClassNameServiceUtil.class,
                    "fetchClassNameId", _fetchClassNameIdParameterTypes2);

            MethodHandler methodHandler = new MethodHandler(methodKey, value);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return ((Long) returnObj).longValue();
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }
}
