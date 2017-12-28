package com.liferay.portlet.social.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.social.model.SocialRelation;
import com.liferay.portlet.social.service.SocialRelationLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SocialRelationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SocialRelationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SocialRelationLocalServiceUtil.getService());
        setClass(SocialRelation.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("relationId");
    }
}
