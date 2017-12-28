package com.liferay.portlet.softwarecatalog.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.softwarecatalog.model.SCProductEntry;
import com.liferay.portlet.softwarecatalog.service.SCProductEntryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SCProductEntryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SCProductEntryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SCProductEntryLocalServiceUtil.getService());
        setClass(SCProductEntry.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("productEntryId");
    }
}
