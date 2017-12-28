package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Shard;
import com.liferay.portal.service.ShardLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ShardActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ShardActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ShardLocalServiceUtil.getService());
        setClass(Shard.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("shardId");
    }
}
