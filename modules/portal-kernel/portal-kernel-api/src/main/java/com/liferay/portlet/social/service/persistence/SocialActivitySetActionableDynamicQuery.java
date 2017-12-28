package com.liferay.portlet.social.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.social.model.SocialActivitySet;
import com.liferay.portlet.social.service.SocialActivitySetLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SocialActivitySetActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SocialActivitySetActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SocialActivitySetLocalServiceUtil.getService());
        setClass(SocialActivitySet.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("activitySetId");
    }
}
