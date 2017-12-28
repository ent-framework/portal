package com.liferay.portlet.documentlibrary.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.documentlibrary.model.DLContent;
import com.liferay.portlet.documentlibrary.service.DLContentLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DLContentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DLContentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DLContentLocalServiceUtil.getService());
        setClass(DLContent.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("contentId");
    }
}
