package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.LayoutBranch;
import com.liferay.portal.service.LayoutBranchLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LayoutBranchActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LayoutBranchActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LayoutBranchLocalServiceUtil.getService());
        setClass(LayoutBranch.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("LayoutBranchId");
    }
}
