package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.ClusterGroup;
import com.liferay.portal.service.ClusterGroupLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ClusterGroupActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ClusterGroupActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ClusterGroupLocalServiceUtil.getService());
        setClass(ClusterGroup.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("clusterGroupId");
    }
}
