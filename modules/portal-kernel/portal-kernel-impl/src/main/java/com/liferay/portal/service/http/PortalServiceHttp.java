package com.liferay.portal.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.PortalServiceUtil;
import com.liferay.portal.service.http.TunnelUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portal.service.PortalServiceUtil} service utility. The
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
 * @see PortalServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portal.service.PortalServiceUtil
 * @generated
 */
public class PortalServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(PortalServiceHttp.class);
    private static final Class<?>[] _getBuildNumberParameterTypes0 = new Class[] {
            
        };
    private static final Class<?>[] _testAddClassName_RollbackParameterTypes1 = new Class[] {
            java.lang.String.class
        };
    private static final Class<?>[] _testAddClassName_SuccessParameterTypes2 = new Class[] {
            java.lang.String.class
        };
    private static final Class<?>[] _testAddClassNameAndTestTransactionPortletBar_PortalRollbackParameterTypes3 =
        new Class[] { java.lang.String.class };
    private static final Class<?>[] _testAddClassNameAndTestTransactionPortletBar_PortletRollbackParameterTypes4 =
        new Class[] { java.lang.String.class };
    private static final Class<?>[] _testAddClassNameAndTestTransactionPortletBar_SuccessParameterTypes5 =
        new Class[] { java.lang.String.class };
    private static final Class<?>[] _testAutoSyncHibernateSessionStateOnTxCreationParameterTypes6 =
        new Class[] {  };
    private static final Class<?>[] _testDeleteClassNameParameterTypes7 = new Class[] {
            
        };
    private static final Class<?>[] _testGetBuildNumberParameterTypes8 = new Class[] {
            
        };
    private static final Class<?>[] _testGetUserIdParameterTypes9 = new Class[] {  };
    private static final Class<?>[] _testHasClassNameParameterTypes10 = new Class[] {
            
        };

    public static int getBuildNumber(HttpPrincipal httpPrincipal)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PortalServiceUtil.class,
                    "getBuildNumber", _getBuildNumberParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return ((Integer) returnObj).intValue();
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void testAddClassName_Rollback(HttpPrincipal httpPrincipal,
        java.lang.String classNameValue)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PortalServiceUtil.class,
                    "testAddClassName_Rollback",
                    _testAddClassName_RollbackParameterTypes1);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    classNameValue);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void testAddClassName_Success(HttpPrincipal httpPrincipal,
        java.lang.String classNameValue)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PortalServiceUtil.class,
                    "testAddClassName_Success",
                    _testAddClassName_SuccessParameterTypes2);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    classNameValue);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void testAddClassNameAndTestTransactionPortletBar_PortalRollback(
        HttpPrincipal httpPrincipal, java.lang.String transactionPortletBarText)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PortalServiceUtil.class,
                    "testAddClassNameAndTestTransactionPortletBar_PortalRollback",
                    _testAddClassNameAndTestTransactionPortletBar_PortalRollbackParameterTypes3);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    transactionPortletBarText);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void testAddClassNameAndTestTransactionPortletBar_PortletRollback(
        HttpPrincipal httpPrincipal, java.lang.String transactionPortletBarText)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PortalServiceUtil.class,
                    "testAddClassNameAndTestTransactionPortletBar_PortletRollback",
                    _testAddClassNameAndTestTransactionPortletBar_PortletRollbackParameterTypes4);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    transactionPortletBarText);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void testAddClassNameAndTestTransactionPortletBar_Success(
        HttpPrincipal httpPrincipal, java.lang.String transactionPortletBarText)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PortalServiceUtil.class,
                    "testAddClassNameAndTestTransactionPortletBar_Success",
                    _testAddClassNameAndTestTransactionPortletBar_SuccessParameterTypes5);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    transactionPortletBarText);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void testAutoSyncHibernateSessionStateOnTxCreation(
        HttpPrincipal httpPrincipal)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PortalServiceUtil.class,
                    "testAutoSyncHibernateSessionStateOnTxCreation",
                    _testAutoSyncHibernateSessionStateOnTxCreationParameterTypes6);

            MethodHandler methodHandler = new MethodHandler(methodKey);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void testDeleteClassName(HttpPrincipal httpPrincipal)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PortalServiceUtil.class,
                    "testDeleteClassName", _testDeleteClassNameParameterTypes7);

            MethodHandler methodHandler = new MethodHandler(methodKey);

            try {
                TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
                    throw (com.liferay.portal.kernel.exception.PortalException) e;
                }

                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static int testGetBuildNumber(HttpPrincipal httpPrincipal)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PortalServiceUtil.class,
                    "testGetBuildNumber", _testGetBuildNumberParameterTypes8);

            MethodHandler methodHandler = new MethodHandler(methodKey);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return ((Integer) returnObj).intValue();
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void testGetUserId(HttpPrincipal httpPrincipal)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PortalServiceUtil.class,
                    "testGetUserId", _testGetUserIdParameterTypes9);

            MethodHandler methodHandler = new MethodHandler(methodKey);

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

    public static boolean testHasClassName(HttpPrincipal httpPrincipal)
        throws com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(PortalServiceUtil.class,
                    "testHasClassName", _testHasClassNameParameterTypes10);

            MethodHandler methodHandler = new MethodHandler(methodKey);

            Object returnObj = null;

            try {
                returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
            } catch (Exception e) {
                if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
                    throw (com.liferay.portal.kernel.exception.SystemException) e;
                }

                throw new com.liferay.portal.kernel.exception.SystemException(e);
            }

            return ((Boolean) returnObj).booleanValue();
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }
}
