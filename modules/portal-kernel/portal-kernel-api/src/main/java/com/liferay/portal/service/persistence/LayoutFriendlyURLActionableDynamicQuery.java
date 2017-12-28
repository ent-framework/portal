package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.LayoutFriendlyURL;
import com.liferay.portal.service.LayoutFriendlyURLLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LayoutFriendlyURLActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LayoutFriendlyURLActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LayoutFriendlyURLLocalServiceUtil.getService());
        setClass(LayoutFriendlyURL.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("layoutFriendlyURLId");
    }
}
