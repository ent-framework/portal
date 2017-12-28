package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.RepositoryEntry;
import com.liferay.portal.service.RepositoryEntryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RepositoryEntryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RepositoryEntryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RepositoryEntryLocalServiceUtil.getService());
        setClass(RepositoryEntry.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("repositoryEntryId");
    }
}
