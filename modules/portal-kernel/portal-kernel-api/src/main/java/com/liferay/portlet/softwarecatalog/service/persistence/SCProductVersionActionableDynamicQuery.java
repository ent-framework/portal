package com.liferay.portlet.softwarecatalog.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.softwarecatalog.model.SCProductVersion;
import com.liferay.portlet.softwarecatalog.service.SCProductVersionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SCProductVersionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SCProductVersionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SCProductVersionLocalServiceUtil.getService());
        setClass(SCProductVersion.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("productVersionId");
    }
}
