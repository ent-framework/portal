package com.liferay.portlet.expando.service.http;

import com.liferay.portlet.expando.service.ExpandoColumnServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portlet.expando.service.ExpandoColumnServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portlet.expando.model.ExpandoColumnSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portlet.expando.model.ExpandoColumn}, that is translated to a
 * {@link com.liferay.portlet.expando.model.ExpandoColumnSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
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
 * @see ExpandoColumnServiceHttp
 * @see com.liferay.portlet.expando.model.ExpandoColumnSoap
 * @see com.liferay.portlet.expando.service.ExpandoColumnServiceUtil
 * @generated
 */
public class ExpandoColumnServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(ExpandoColumnServiceSoap.class);

    public static com.liferay.portlet.expando.model.ExpandoColumnSoap addColumn(
        long tableId, java.lang.String name, int type)
        throws RemoteException {
        try {
            com.liferay.portlet.expando.model.ExpandoColumn returnValue = ExpandoColumnServiceUtil.addColumn(tableId,
                    name, type);

            return com.liferay.portlet.expando.model.ExpandoColumnSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portlet.expando.model.ExpandoColumnSoap addColumn(
        long tableId, java.lang.String name, int type,
        java.lang.Object defaultData) throws RemoteException {
        try {
            com.liferay.portlet.expando.model.ExpandoColumn returnValue = ExpandoColumnServiceUtil.addColumn(tableId,
                    name, type, defaultData);

            return com.liferay.portlet.expando.model.ExpandoColumnSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void deleteColumn(long columnId) throws RemoteException {
        try {
            ExpandoColumnServiceUtil.deleteColumn(columnId);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portlet.expando.model.ExpandoColumnSoap updateColumn(
        long columnId, java.lang.String name, int type)
        throws RemoteException {
        try {
            com.liferay.portlet.expando.model.ExpandoColumn returnValue = ExpandoColumnServiceUtil.updateColumn(columnId,
                    name, type);

            return com.liferay.portlet.expando.model.ExpandoColumnSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portlet.expando.model.ExpandoColumnSoap updateColumn(
        long columnId, java.lang.String name, int type,
        java.lang.Object defaultData) throws RemoteException {
        try {
            com.liferay.portlet.expando.model.ExpandoColumn returnValue = ExpandoColumnServiceUtil.updateColumn(columnId,
                    name, type, defaultData);

            return com.liferay.portlet.expando.model.ExpandoColumnSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portlet.expando.model.ExpandoColumnSoap updateTypeSettings(
        long columnId, java.lang.String typeSettings) throws RemoteException {
        try {
            com.liferay.portlet.expando.model.ExpandoColumn returnValue = ExpandoColumnServiceUtil.updateTypeSettings(columnId,
                    typeSettings);

            return com.liferay.portlet.expando.model.ExpandoColumnSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
