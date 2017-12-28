package com.liferay.portlet.journal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.journal.model.JournalArticleImage;
import com.liferay.portlet.journal.service.JournalArticleImageLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class JournalArticleImageActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public JournalArticleImageActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(JournalArticleImageLocalServiceUtil.getService());
        setClass(JournalArticleImage.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("articleImageId");
    }
}
