package com.liferay.portlet.softwarecatalog.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.softwarecatalog.model.SCProductScreenshot;
import com.liferay.portlet.softwarecatalog.service.SCProductScreenshotLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SCProductScreenshotActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SCProductScreenshotActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(SCProductScreenshotLocalServiceUtil.getService());
        setClass(SCProductScreenshot.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("productScreenshotId");
    }
}
