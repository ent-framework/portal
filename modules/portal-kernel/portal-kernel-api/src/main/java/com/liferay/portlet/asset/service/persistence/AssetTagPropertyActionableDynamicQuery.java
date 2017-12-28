package com.liferay.portlet.asset.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.asset.model.AssetTagProperty;
import com.liferay.portlet.asset.service.AssetTagPropertyLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AssetTagPropertyActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AssetTagPropertyActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AssetTagPropertyLocalServiceUtil.getService());
        setClass(AssetTagProperty.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("tagPropertyId");
    }
}
