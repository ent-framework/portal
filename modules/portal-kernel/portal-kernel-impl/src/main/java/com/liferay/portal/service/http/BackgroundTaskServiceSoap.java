package com.liferay.portal.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.BackgroundTaskServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.service.BackgroundTaskServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portal.model.BackgroundTaskSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portal.model.BackgroundTask}, that is translated to a
 * {@link com.liferay.portal.model.BackgroundTaskSoap}. Methods that SOAP cannot
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
 * @see BackgroundTaskServiceHttp
 * @see com.liferay.portal.model.BackgroundTaskSoap
 * @see com.liferay.portal.service.BackgroundTaskServiceUtil
 * @generated
 */
@ProviderType
public class BackgroundTaskServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(BackgroundTaskServiceSoap.class);

    public static int getBackgroundTasksCount(long groupId,
        java.lang.String taskExecutorClassName, java.lang.String completed)
        throws RemoteException {
        try {
            int returnValue = BackgroundTaskServiceUtil.getBackgroundTasksCount(groupId,
                    taskExecutorClassName, completed);

            return returnValue;
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static java.lang.String getBackgroundTaskStatusJSON(
        long backgroundTaskId) throws RemoteException {
        try {
            java.lang.String returnValue = BackgroundTaskServiceUtil.getBackgroundTaskStatusJSON(backgroundTaskId);

            return returnValue;
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
