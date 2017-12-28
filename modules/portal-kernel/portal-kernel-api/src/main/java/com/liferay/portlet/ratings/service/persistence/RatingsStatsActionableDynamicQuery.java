package com.liferay.portlet.ratings.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.ratings.model.RatingsStats;
import com.liferay.portlet.ratings.service.RatingsStatsLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RatingsStatsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RatingsStatsActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RatingsStatsLocalServiceUtil.getService());
        setClass(RatingsStats.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("statsId");
    }
}
