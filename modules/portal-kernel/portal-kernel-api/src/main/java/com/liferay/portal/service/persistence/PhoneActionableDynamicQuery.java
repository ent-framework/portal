package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Phone;
import com.liferay.portal.service.PhoneLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PhoneActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PhoneActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PhoneLocalServiceUtil.getService());
        setClass(Phone.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("phoneId");
    }
}
