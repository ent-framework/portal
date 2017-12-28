package com.liferay.portlet.social.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.social.model.SocialActivitySetting;
import com.liferay.portlet.social.service.SocialActivitySettingLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SocialActivitySettingActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SocialActivitySettingActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(SocialActivitySettingLocalServiceUtil.getService());
        setClass(SocialActivitySetting.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("activitySettingId");
    }
}
