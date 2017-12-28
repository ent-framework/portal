package com.liferay.portlet.softwarecatalog.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.softwarecatalog.model.SCLicense;
import com.liferay.portlet.softwarecatalog.service.SCLicenseLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SCLicenseActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SCLicenseActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SCLicenseLocalServiceUtil.getService());
        setClass(SCLicense.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("licenseId");
    }
}
