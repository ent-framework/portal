package com.liferay.portlet.social.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.social.model.SocialActivityCounter;
import com.liferay.portlet.social.service.SocialActivityCounterLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SocialActivityCounterActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SocialActivityCounterActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(SocialActivityCounterLocalServiceUtil.getService());
        setClass(SocialActivityCounter.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("activityCounterId");
    }
}
