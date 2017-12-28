package com.liferay.portlet.dynamicdatalists.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.dynamicdatalists.model.DDLRecordSet;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordSetLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DDLRecordSetActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DDLRecordSetActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DDLRecordSetLocalServiceUtil.getService());
        setClass(DDLRecordSet.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("recordSetId");
    }
}
