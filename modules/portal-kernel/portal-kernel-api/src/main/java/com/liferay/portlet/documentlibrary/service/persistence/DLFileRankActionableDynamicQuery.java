package com.liferay.portlet.documentlibrary.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.documentlibrary.model.DLFileRank;
import com.liferay.portlet.documentlibrary.service.DLFileRankLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DLFileRankActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DLFileRankActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DLFileRankLocalServiceUtil.getService());
        setClass(DLFileRank.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("fileRankId");
    }
}
