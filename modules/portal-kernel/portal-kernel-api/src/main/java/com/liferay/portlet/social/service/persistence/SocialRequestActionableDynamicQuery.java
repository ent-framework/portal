package com.liferay.portlet.social.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.social.model.SocialRequest;
import com.liferay.portlet.social.service.SocialRequestLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SocialRequestActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SocialRequestActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SocialRequestLocalServiceUtil.getService());
        setClass(SocialRequest.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("requestId");
    }
}
