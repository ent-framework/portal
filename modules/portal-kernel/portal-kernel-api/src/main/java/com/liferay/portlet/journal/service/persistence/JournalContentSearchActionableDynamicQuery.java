package com.liferay.portlet.journal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.journal.model.JournalContentSearch;
import com.liferay.portlet.journal.service.JournalContentSearchLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class JournalContentSearchActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public JournalContentSearchActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(JournalContentSearchLocalServiceUtil.getService());
        setClass(JournalContentSearch.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("contentSearchId");
    }
}
