package com.liferay.portlet.documentlibrary.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.documentlibrary.model.DLFileShortcut;
import com.liferay.portlet.documentlibrary.service.DLFileShortcutLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DLFileShortcutActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DLFileShortcutActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DLFileShortcutLocalServiceUtil.getService());
        setClass(DLFileShortcut.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("fileShortcutId");
    }
}
