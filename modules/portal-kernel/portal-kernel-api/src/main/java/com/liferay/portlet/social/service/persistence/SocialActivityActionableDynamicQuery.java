package com.liferay.portlet.social.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.social.model.SocialActivity;
import com.liferay.portlet.social.service.SocialActivityLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SocialActivityActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SocialActivityActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SocialActivityLocalServiceUtil.getService());
        setClass(SocialActivity.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("activityId");
    }
}
