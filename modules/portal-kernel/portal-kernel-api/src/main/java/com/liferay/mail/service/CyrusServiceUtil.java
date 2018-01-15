package com.liferay.mail.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for Cyrus. This utility wraps
 * {@link com.liferay.mail.service.impl.CyrusServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CyrusService
 * @see com.liferay.mail.service.base.CyrusServiceBaseImpl
 * @see com.liferay.mail.service.impl.CyrusServiceImpl
 * @generated
 */
public class CyrusServiceUtil {
    private static CyrusService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.mail.service.impl.CyrusServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static void addUser(long userId, java.lang.String emailAddress,
        java.lang.String password)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addUser(userId, emailAddress, password);
    }

    public static void deleteEmailAddress(long companyId, long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteEmailAddress(companyId, userId);
    }

    public static void deleteUser(long userId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deleteUser(userId);
    }

    public static void updateEmailAddress(long companyId, long userId,
        java.lang.String emailAddress)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().updateEmailAddress(companyId, userId, emailAddress);
    }

    public static void updatePassword(long companyId, long userId,
        java.lang.String password)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().updatePassword(companyId, userId, password);
    }

    public static CyrusService getService() {
        if (_service == null) {
            _service = (CyrusService) PortalBeanLocatorUtil.locate(CyrusService.class.getName());

            ReferenceRegistry.registerReference(CyrusServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(CyrusService service) {
    }
}
