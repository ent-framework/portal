package com.liferay.portlet.documentlibrary.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.documentlibrary.model.DLSyncEvent;
import com.liferay.portlet.documentlibrary.service.DLSyncEventLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DLSyncEventActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DLSyncEventActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DLSyncEventLocalServiceUtil.getService());
        setClass(DLSyncEvent.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("syncEventId");
    }
}
