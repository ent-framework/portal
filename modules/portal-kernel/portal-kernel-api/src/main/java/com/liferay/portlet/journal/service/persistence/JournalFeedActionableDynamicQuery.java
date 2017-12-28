package com.liferay.portlet.journal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.journal.model.JournalFeed;
import com.liferay.portlet.journal.service.JournalFeedLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class JournalFeedActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public JournalFeedActionableDynamicQuery() throws SystemException {
        setBaseLocalService(JournalFeedLocalServiceUtil.getService());
        setClass(JournalFeed.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
