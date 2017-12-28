package com.liferay.portlet.asset.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.asset.model.AssetLink;
import com.liferay.portlet.asset.service.AssetLinkLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AssetLinkActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AssetLinkActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AssetLinkLocalServiceUtil.getService());
        setClass(AssetLink.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("linkId");
    }
}
