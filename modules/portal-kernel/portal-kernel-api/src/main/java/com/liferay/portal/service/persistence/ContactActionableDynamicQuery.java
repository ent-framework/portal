package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Contact;
import com.liferay.portal.service.ContactLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ContactActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ContactActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ContactLocalServiceUtil.getService());
        setClass(Contact.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("contactId");
    }
}
