package com.liferay.portlet.ratings.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.ratings.model.RatingsEntry;
import com.liferay.portlet.ratings.service.RatingsEntryLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class RatingsEntryActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RatingsEntryActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RatingsEntryLocalServiceUtil.getService());
        setClass(RatingsEntry.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("entryId");
    }
}
