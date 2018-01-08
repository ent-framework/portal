package com.liferay.mail.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for Mail. This utility wraps
 * {@link com.liferay.mail.service.impl.MailServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see MailService
 * @see com.liferay.mail.service.base.MailServiceBaseImpl
 * @see com.liferay.mail.service.impl.MailServiceImpl
 * @generated
 */
@ProviderType
public class MailServiceUtil {
    private static MailService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.mail.service.impl.MailServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

    public static void addForward(long companyId, long userId,
        java.util.List<com.liferay.mail.model.Filter> filters,
        java.util.List<java.lang.String> emailAddresses, boolean leaveCopy) {
        getService()
            .addForward(companyId, userId, filters, emailAddresses, leaveCopy);
    }

    public static void addUser(long companyId, long userId,
        java.lang.String password, java.lang.String firstName,
        java.lang.String middleName, java.lang.String lastName,
        java.lang.String emailAddress) {
        getService()
            .addUser(companyId, userId, password, firstName, middleName,
            lastName, emailAddress);
    }

    public static void addVacationMessage(long companyId, long userId,
        java.lang.String emailAddress, java.lang.String vacationMessage) {
        getService()
            .addVacationMessage(companyId, userId, emailAddress, vacationMessage);
    }

    public static void clearSession() {
        getService().clearSession();
    }

    public static void deleteEmailAddress(long companyId, long userId) {
        getService().deleteEmailAddress(companyId, userId);
    }

    public static void deleteUser(long companyId, long userId) {
        getService().deleteUser(companyId, userId);
    }

    public static javax.mail.Session getSession()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSession();
    }

    public static void sendEmail(
        com.liferay.portal.kernel.mail.MailMessage mailMessage) {
        getService().sendEmail(mailMessage);
    }

    public static void updateBlocked(long companyId, long userId,
        java.util.List<java.lang.String> blocked) {
        getService().updateBlocked(companyId, userId, blocked);
    }

    public static void updateEmailAddress(long companyId, long userId,
        java.lang.String emailAddress) {
        getService().updateEmailAddress(companyId, userId, emailAddress);
    }

    public static void updatePassword(long companyId, long userId,
        java.lang.String password) {
        getService().updatePassword(companyId, userId, password);
    }

    public static MailService getService() {
        if (_service == null) {
            _service = (MailService) PortalBeanLocatorUtil.locate(MailService.class.getName());

            ReferenceRegistry.registerReference(MailServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(MailService service) {
    }
}
