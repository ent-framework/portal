package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.PluginSetting;
import com.liferay.portal.service.PluginSettingLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PluginSettingActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PluginSettingActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PluginSettingLocalServiceUtil.getService());
        setClass(PluginSetting.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("pluginSettingId");
    }
}
