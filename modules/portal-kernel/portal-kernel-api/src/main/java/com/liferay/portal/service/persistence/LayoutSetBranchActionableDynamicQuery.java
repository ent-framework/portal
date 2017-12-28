package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.LayoutSetBranch;
import com.liferay.portal.service.LayoutSetBranchLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LayoutSetBranchActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LayoutSetBranchActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LayoutSetBranchLocalServiceUtil.getService());
        setClass(LayoutSetBranch.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("layoutSetBranchId");
    }
}
