package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.EmailAddress;
import com.liferay.portal.service.EmailAddressLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EmailAddressActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EmailAddressActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EmailAddressLocalServiceUtil.getService());
        setClass(EmailAddress.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("emailAddressId");
    }
}
