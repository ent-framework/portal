package com.liferay.portlet.dynamicdatamapping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.dynamicdatamapping.model.DDMStructure;
import com.liferay.portlet.dynamicdatamapping.service.DDMStructureLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DDMStructureActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DDMStructureActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DDMStructureLocalServiceUtil.getService());
        setClass(DDMStructure.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("structureId");
    }
}
