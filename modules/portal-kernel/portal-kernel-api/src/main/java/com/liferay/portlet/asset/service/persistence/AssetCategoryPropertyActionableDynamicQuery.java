package com.liferay.portlet.asset.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.asset.model.AssetCategoryProperty;
import com.liferay.portlet.asset.service.AssetCategoryPropertyLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AssetCategoryPropertyActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AssetCategoryPropertyActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(AssetCategoryPropertyLocalServiceUtil.getService());
        setClass(AssetCategoryProperty.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("categoryPropertyId");
    }
}
