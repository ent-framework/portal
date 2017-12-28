package com.liferay.portlet.asset.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.asset.model.AssetTagStats;
import com.liferay.portlet.asset.service.AssetTagStatsLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AssetTagStatsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AssetTagStatsActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AssetTagStatsLocalServiceUtil.getService());
        setClass(AssetTagStats.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("tagStatsId");
    }
}
