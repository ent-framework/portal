package com.liferay.portlet.journal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.journal.model.JournalArticleResource;
import com.liferay.portlet.journal.service.JournalArticleResourceLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class JournalArticleResourceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public JournalArticleResourceActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(JournalArticleResourceLocalServiceUtil.getService());
        setClass(JournalArticleResource.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("resourcePrimKey");
    }
}
