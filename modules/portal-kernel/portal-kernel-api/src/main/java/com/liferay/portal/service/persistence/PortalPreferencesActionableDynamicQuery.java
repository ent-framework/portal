package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.PortalPreferences;
import com.liferay.portal.service.PortalPreferencesLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PortalPreferencesActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PortalPreferencesActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PortalPreferencesLocalServiceUtil.getService());
        setClass(PortalPreferences.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("portalPreferencesId");
    }
}
