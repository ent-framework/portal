package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.MembershipRequest;
import com.liferay.portal.service.MembershipRequestLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class MembershipRequestActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MembershipRequestActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MembershipRequestLocalServiceUtil.getService());
        setClass(MembershipRequest.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("membershipRequestId");
    }
}
