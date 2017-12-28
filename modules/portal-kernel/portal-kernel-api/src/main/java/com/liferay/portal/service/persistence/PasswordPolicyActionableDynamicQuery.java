package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.PasswordPolicy;
import com.liferay.portal.service.PasswordPolicyLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PasswordPolicyActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PasswordPolicyActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PasswordPolicyLocalServiceUtil.getService());
        setClass(PasswordPolicy.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("passwordPolicyId");
    }
}
