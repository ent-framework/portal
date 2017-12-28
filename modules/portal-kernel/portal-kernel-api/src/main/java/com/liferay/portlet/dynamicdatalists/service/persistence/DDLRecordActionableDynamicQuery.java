package com.liferay.portlet.dynamicdatalists.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.dynamicdatalists.model.DDLRecord;
import com.liferay.portlet.dynamicdatalists.service.DDLRecordLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DDLRecordActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DDLRecordActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DDLRecordLocalServiceUtil.getService());
        setClass(DDLRecord.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("recordId");
    }
}
