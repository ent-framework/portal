package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AccountService}.
 *
 * @author Brian Wing Shun Chan
 * @see AccountService
 * @generated
 */
@ProviderType
public class AccountServiceWrapper implements AccountService,
    ServiceWrapper<AccountService> {
    private AccountService _accountService;

    public AccountServiceWrapper(AccountService accountService) {
        _accountService = accountService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _accountService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _accountService.setBeanIdentifier(beanIdentifier);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AccountService getWrappedAccountService() {
        return _accountService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAccountService(AccountService accountService) {
        _accountService = accountService;
    }

    @Override
    public AccountService getWrappedService() {
        return _accountService;
    }

    @Override
    public void setWrappedService(AccountService accountService) {
        _accountService = accountService;
    }
}
