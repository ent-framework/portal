package com.liferay.portlet.softwarecatalog.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion;
import com.liferay.portlet.softwarecatalog.service.SCFrameworkVersionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SCFrameworkVersionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SCFrameworkVersionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SCFrameworkVersionLocalServiceUtil.getService());
        setClass(SCFrameworkVersion.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("frameworkVersionId");
    }
}
