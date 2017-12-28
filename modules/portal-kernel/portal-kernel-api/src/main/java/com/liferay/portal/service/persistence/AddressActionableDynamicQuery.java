package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Address;
import com.liferay.portal.service.AddressLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AddressActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AddressActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AddressLocalServiceUtil.getService());
        setClass(Address.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("addressId");
    }
}
