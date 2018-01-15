package com.liferay.mail.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MailService}.
 *
 * @author Brian Wing Shun Chan
 * @see MailService
 * @generated
 */
public class MailServiceWrapper implements MailService,
    ServiceWrapper<MailService> {
    private MailService _mailService;

    public MailServiceWrapper(MailService mailService) {
        _mailService = mailService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _mailService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _mailService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public void addForward(long companyId, long userId,
        java.util.List<com.liferay.mail.model.Filter> filters,
        java.util.List<java.lang.String> emailAddresses, boolean leaveCopy) {
        _mailService.addForward(companyId, userId, filters, emailAddresses,
            leaveCopy);
    }

    @Override
    public void addUser(long companyId, long userId, java.lang.String password,
        java.lang.String firstName, java.lang.String middleName,
        java.lang.String lastName, java.lang.String emailAddress) {
        _mailService.addUser(companyId, userId, password, firstName,
            middleName, lastName, emailAddress);
    }

    @Override
    public void addVacationMessage(long companyId, long userId,
        java.lang.String emailAddress, java.lang.String vacationMessage) {
        _mailService.addVacationMessage(companyId, userId, emailAddress,
            vacationMessage);
    }

    @Override
    public void clearSession() {
        _mailService.clearSession();
    }

    @Override
    public void deleteEmailAddress(long companyId, long userId) {
        _mailService.deleteEmailAddress(companyId, userId);
    }

    @Override
    public void deleteUser(long companyId, long userId) {
        _mailService.deleteUser(companyId, userId);
    }

    @Override
    public javax.mail.Session getSession()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _mailService.getSession();
    }

    @Override
    public void sendEmail(
        com.liferay.portal.kernel.mail.MailMessage mailMessage) {
        _mailService.sendEmail(mailMessage);
    }

    @Override
    public void updateBlocked(long companyId, long userId,
        java.util.List<java.lang.String> blocked) {
        _mailService.updateBlocked(companyId, userId, blocked);
    }

    @Override
    public void updateEmailAddress(long companyId, long userId,
        java.lang.String emailAddress) {
        _mailService.updateEmailAddress(companyId, userId, emailAddress);
    }

    @Override
    public void updatePassword(long companyId, long userId,
        java.lang.String password) {
        _mailService.updatePassword(companyId, userId, password);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public MailService getWrappedMailService() {
        return _mailService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedMailService(MailService mailService) {
        _mailService = mailService;
    }

    @Override
    public MailService getWrappedService() {
        return _mailService;
    }

    @Override
    public void setWrappedService(MailService mailService) {
        _mailService = mailService;
    }
}
