package com.liferay.portal.service.http;

import com.liferay.portal.service.AddressServiceUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.portal.service.AddressServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.portal.model.AddressSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.portal.model.Address}, that is translated to a
 * {@link com.liferay.portal.model.AddressSoap}. Methods that SOAP cannot
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
 * @see AddressServiceHttp
 * @see com.liferay.portal.model.AddressSoap
 * @see com.liferay.portal.service.AddressServiceUtil
 * @generated
 */
public class AddressServiceSoap {
    private static final Logger _log = LoggerFactory.getLogger(AddressServiceSoap.class);

    /**
    * @deprecated As of 6.2.0, replaced by {@link #addAddress( String, long,
    String, String, String, String, String, long, long, int,
    boolean, boolean, ServiceContext)}
    */
    public static com.liferay.portal.model.AddressSoap addAddress(
        java.lang.String className, long classPK, java.lang.String street1,
        java.lang.String street2, java.lang.String street3,
        java.lang.String city, java.lang.String zip, long regionId,
        long countryId, int typeId, boolean mailing, boolean primary)
        throws RemoteException {
        try {
            com.liferay.portal.model.Address returnValue = AddressServiceUtil.addAddress(className,
                    classPK, street1, street2, street3, city, zip, regionId,
                    countryId, typeId, mailing, primary);

            return com.liferay.portal.model.AddressSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.AddressSoap addAddress(
        java.lang.String className, long classPK, java.lang.String street1,
        java.lang.String street2, java.lang.String street3,
        java.lang.String city, java.lang.String zip, long regionId,
        long countryId, int typeId, boolean mailing, boolean primary,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws RemoteException {
        try {
            com.liferay.portal.model.Address returnValue = AddressServiceUtil.addAddress(className,
                    classPK, street1, street2, street3, city, zip, regionId,
                    countryId, typeId, mailing, primary, serviceContext);

            return com.liferay.portal.model.AddressSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static void deleteAddress(long addressId) throws RemoteException {
        try {
            AddressServiceUtil.deleteAddress(addressId);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.AddressSoap getAddress(
        long addressId) throws RemoteException {
        try {
            com.liferay.portal.model.Address returnValue = AddressServiceUtil.getAddress(addressId);

            return com.liferay.portal.model.AddressSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.AddressSoap[] getAddresses(
        java.lang.String className, long classPK) throws RemoteException {
        try {
            java.util.List<com.liferay.portal.model.Address> returnValue = AddressServiceUtil.getAddresses(className,
                    classPK);

            return com.liferay.portal.model.AddressSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static com.liferay.portal.model.AddressSoap updateAddress(
        long addressId, java.lang.String street1, java.lang.String street2,
        java.lang.String street3, java.lang.String city, java.lang.String zip,
        long regionId, long countryId, int typeId, boolean mailing,
        boolean primary) throws RemoteException {
        try {
            com.liferay.portal.model.Address returnValue = AddressServiceUtil.updateAddress(addressId,
                    street1, street2, street3, city, zip, regionId, countryId,
                    typeId, mailing, primary);

            return com.liferay.portal.model.AddressSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e.getMessage(), e);

            throw new RemoteException(e.getMessage());
        }
    }
}
