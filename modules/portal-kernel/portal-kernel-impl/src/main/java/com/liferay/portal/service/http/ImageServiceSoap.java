package com.liferay.portal.service.http;

import com.liferay.portal.service.ImageServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.service.ImageServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portal.model.ImageSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portal.model.Image}, that is translated to a
 * {@link com.liferay.portal.model.ImageSoap}. Methods that SOAP cannot
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
 * @see ImageServiceHttp
 * @see com.liferay.portal.model.ImageSoap
 * @see com.liferay.portal.service.ImageServiceUtil
 * @generated
 */
public class ImageServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(ImageServiceSoap.class);

    public static com.liferay.portal.model.ImageSoap getImage(long imageId)
        throws RemoteException {
        try {
            com.liferay.portal.model.Image returnValue = ImageServiceUtil.getImage(imageId);

            return com.liferay.portal.model.ImageSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
