package com.liferay.portlet.social.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.social.model.SocialActivityLimit;
import com.liferay.portlet.social.service.SocialActivityLimitLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SocialActivityLimitActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SocialActivityLimitActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(SocialActivityLimitLocalServiceUtil.getService());
        setClass(SocialActivityLimit.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("activityLimitId");
    }
}
