package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Account;
import com.liferay.portal.service.AccountLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AccountActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AccountActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AccountLocalServiceUtil.getService());
        setClass(Account.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("accountId");
    }
}
