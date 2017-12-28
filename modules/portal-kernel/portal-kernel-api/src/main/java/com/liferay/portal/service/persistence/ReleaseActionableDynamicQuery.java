package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Release;
import com.liferay.portal.service.ReleaseLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ReleaseActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ReleaseActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ReleaseLocalServiceUtil.getService());
        setClass(Release.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("releaseId");
    }
}
