package com.liferay.portlet.asset.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.asset.model.AssetCategory;
import com.liferay.portlet.asset.service.AssetCategoryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AssetCategoryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AssetCategoryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AssetCategoryLocalServiceUtil.getService());
        setClass(AssetCategory.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("categoryId");
    }
}
