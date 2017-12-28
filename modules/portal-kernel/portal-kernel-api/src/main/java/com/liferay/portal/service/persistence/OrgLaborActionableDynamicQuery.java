package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.OrgLabor;
import com.liferay.portal.service.OrgLaborLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class OrgLaborActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public OrgLaborActionableDynamicQuery() throws SystemException {
        setBaseLocalService(OrgLaborLocalServiceUtil.getService());
        setClass(OrgLabor.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("orgLaborId");
    }
}
