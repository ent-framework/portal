package com.liferay.portlet.asset.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.asset.model.AssetTag;
import com.liferay.portlet.asset.service.AssetTagLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AssetTagActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AssetTagActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AssetTagLocalServiceUtil.getService());
        setClass(AssetTag.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("tagId");
    }
}
