package com.liferay.portlet.social.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.social.model.SocialActivityAchievement;
import com.liferay.portlet.social.service.SocialActivityAchievementLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SocialActivityAchievementActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SocialActivityAchievementActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(SocialActivityAchievementLocalServiceUtil.getService());
        setClass(SocialActivityAchievement.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("activityAchievementId");
    }
}
