package com.liferay.portal.service.http;

import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.MembershipRequestServiceUtil;
import com.liferay.portal.service.http.TunnelUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Provides the HTTP utility for the
 * {@link com.liferay.portal.service.MembershipRequestServiceUtil} service utility. The
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
 * @see MembershipRequestServiceSoap
 * @see com.liferay.portal.security.auth.HttpPrincipal
 * @see com.liferay.portal.service.MembershipRequestServiceUtil
 * @generated
 */
public class MembershipRequestServiceHttp {
    private static final Logger _log = LoggerFactory.getLogger(MembershipRequestServiceHttp.class);
    private static final Class<?>[] _addMembershipRequestParameterTypes0 = new Class[] {
            long.class, java.lang.String.class,
            com.liferay.portal.service.ServiceContext.class
        };
    private static final Class<?>[] _deleteMembershipRequestsParameterTypes1 = new Class[] {
            long.class, int.class
        };
    private static final Class<?>[] _getMembershipRequestParameterTypes2 = new Class[] {
            long.class
        };
    private static final Class<?>[] _updateStatusParameterTypes3 = new Class[] {
            long.class, java.lang.String.class, int.class,
            com.liferay.portal.service.ServiceContext.class
        };

    public static com.liferay.portal.model.MembershipRequest addMembershipRequest(
        HttpPrincipal httpPrincipal, long groupId, java.lang.String comments,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(MembershipRequestServiceUtil.class,
                    "addMembershipRequest", _addMembershipRequestParameterTypes0);

            MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
                    comments, serviceContext);

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

            return (com.liferay.portal.model.MembershipRequest) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void deleteMembershipRequests(HttpPrincipal httpPrincipal,
        long groupId, int statusId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(MembershipRequestServiceUtil.class,
                    "deleteMembershipRequests",
                    _deleteMembershipRequestsParameterTypes1);

            MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
                    statusId);

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

    public static com.liferay.portal.model.MembershipRequest getMembershipRequest(
        HttpPrincipal httpPrincipal, long membershipRequestId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(MembershipRequestServiceUtil.class,
                    "getMembershipRequest", _getMembershipRequestParameterTypes2);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    membershipRequestId);

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

            return (com.liferay.portal.model.MembershipRequest) returnObj;
        } catch (com.liferay.portal.kernel.exception.SystemException se) {
            _log.error(se.getMessage(), se);

            throw se;
        }
    }

    public static void updateStatus(HttpPrincipal httpPrincipal,
        long membershipRequestId, java.lang.String reviewComments,
        int statusId, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        try {
            MethodKey methodKey = new MethodKey(MembershipRequestServiceUtil.class,
                    "updateStatus", _updateStatusParameterTypes3);

            MethodHandler methodHandler = new MethodHandler(methodKey,
                    membershipRequestId, reviewComments, statusId,
                    serviceContext);

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
}
