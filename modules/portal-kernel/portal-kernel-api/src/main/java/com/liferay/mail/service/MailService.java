package com.liferay.mail.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.*;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.service.BaseService;

/**
 * Provides the remote service interface for Mail. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see MailServiceUtil
 * @see com.liferay.mail.service.base.MailServiceBaseImpl
 * @see com.liferay.mail.service.impl.MailServiceImpl
 * @generated
 */
@ProviderType
@AccessControlled
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface MailService extends BaseService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MailServiceUtil} to access the mail remote service. Add custom service methods to {@link com.liferay.mail.service.impl.MailServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    public void addForward(long companyId, long userId,
        java.util.List<com.liferay.mail.model.Filter> filters,
        java.util.List<java.lang.String> emailAddresses, boolean leaveCopy);

    public void addUser(long companyId, long userId, java.lang.String password,
        java.lang.String firstName, java.lang.String middleName,
        java.lang.String lastName, java.lang.String emailAddress);

    public void addVacationMessage(long companyId, long userId,
        java.lang.String emailAddress, java.lang.String vacationMessage);

    public void clearSession();

    public void deleteEmailAddress(long companyId, long userId);

    public void deleteUser(long companyId, long userId);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public javax.mail.Session getSession()
        throws com.liferay.portal.kernel.exception.SystemException;

    public void sendEmail(
        com.liferay.portal.kernel.mail.MailMessage mailMessage);

    public void updateBlocked(long companyId, long userId,
        java.util.List<java.lang.String> blocked);

    public void updateEmailAddress(long companyId, long userId,
        java.lang.String emailAddress);

    public void updatePassword(long companyId, long userId,
        java.lang.String password);
}
