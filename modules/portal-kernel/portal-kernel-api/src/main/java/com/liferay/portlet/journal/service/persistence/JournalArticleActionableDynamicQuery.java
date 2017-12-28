package com.liferay.portlet.journal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.portlet.journal.service.JournalArticleLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class JournalArticleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public JournalArticleActionableDynamicQuery() throws SystemException {
        setBaseLocalService(JournalArticleLocalServiceUtil.getService());
        setClass(JournalArticle.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("id");
    }
}
