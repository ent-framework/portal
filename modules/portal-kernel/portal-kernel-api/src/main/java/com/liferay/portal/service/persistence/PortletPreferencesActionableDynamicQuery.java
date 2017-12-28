package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.PortletPreferences;
import com.liferay.portal.service.PortletPreferencesLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PortletPreferencesActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PortletPreferencesActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PortletPreferencesLocalServiceUtil.getService());
        setClass(PortletPreferences.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("portletPreferencesId");
    }
}
