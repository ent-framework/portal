package com.liferay.portlet.dynamicdatamapping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink;
import com.liferay.portlet.dynamicdatamapping.service.DDMStructureLinkLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DDMStructureLinkActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DDMStructureLinkActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DDMStructureLinkLocalServiceUtil.getService());
        setClass(DDMStructureLink.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("structureLinkId");
    }
}
