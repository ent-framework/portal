package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.PasswordPolicyRel;
import com.liferay.portal.service.PasswordPolicyRelLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PasswordPolicyRelActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PasswordPolicyRelActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PasswordPolicyRelLocalServiceUtil.getService());
        setClass(PasswordPolicyRel.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("passwordPolicyRelId");
    }
}
