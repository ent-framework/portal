package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.WebDAVProps;
import com.liferay.portal.service.WebDAVPropsLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class WebDAVPropsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public WebDAVPropsActionableDynamicQuery() throws SystemException {
        setBaseLocalService(WebDAVPropsLocalServiceUtil.getService());
        setClass(WebDAVProps.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("webDavPropsId");
    }
}
