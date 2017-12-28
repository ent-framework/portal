package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.LayoutSet;
import com.liferay.portal.service.LayoutSetLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LayoutSetActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LayoutSetActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LayoutSetLocalServiceUtil.getService());
        setClass(LayoutSet.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("layoutSetId");
    }
}
