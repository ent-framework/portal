package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.LayoutRevision;
import com.liferay.portal.service.LayoutRevisionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class LayoutRevisionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LayoutRevisionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LayoutRevisionLocalServiceUtil.getService());
        setClass(LayoutRevision.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("layoutRevisionId");
    }
}
