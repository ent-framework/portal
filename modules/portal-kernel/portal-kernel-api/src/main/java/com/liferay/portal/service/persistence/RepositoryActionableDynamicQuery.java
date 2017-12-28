package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.Repository;
import com.liferay.portal.service.RepositoryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RepositoryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RepositoryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RepositoryLocalServiceUtil.getService());
        setClass(Repository.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("repositoryId");
    }
}
