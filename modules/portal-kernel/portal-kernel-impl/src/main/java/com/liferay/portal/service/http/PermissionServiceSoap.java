package com.liferay.portal.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.PermissionServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.service.PermissionServiceUtil} service utility. The
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
 * @see PermissionServiceHttp
 * @see com.liferay.portal.service.PermissionServiceUtil
 * @generated
 */
@ProviderType
public class PermissionServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(PermissionServiceSoap.class);

    /**
    * Checks to see if the group has permission to the service.
    *
    * @param groupId the primary key of the group
    * @param name the service name
    * @param primKey the primary key of the service
    * @throws PortalException if the group did not have permission to the
    service, if a group with the primary key could not be found or if
    the permission information was invalid
    * @throws SystemException if a system exception occurred
    */
    public static void checkPermission(long groupId, java.lang.String name,
        long primKey) throws RemoteException {
        try {
            PermissionServiceUtil.checkPermission(groupId, name, primKey);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    /**
    * Checks to see if the group has permission to the service.
    *
    * @param groupId the primary key of the group
    * @param name the service name
    * @param primKey the primary key of the service
    * @throws PortalException if the group did not have permission to the
    service, if a group with the primary key could not be found or if
    the permission information was invalid
    * @throws SystemException if a system exception occurred
    */
    public static void checkPermission(long groupId, java.lang.String name,
        java.lang.String primKey) throws RemoteException {
        try {
            PermissionServiceUtil.checkPermission(groupId, name, primKey);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
