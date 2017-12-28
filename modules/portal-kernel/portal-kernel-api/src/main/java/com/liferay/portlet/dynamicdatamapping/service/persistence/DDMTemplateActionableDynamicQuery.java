package com.liferay.portlet.dynamicdatamapping.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.dynamicdatamapping.model.DDMTemplate;
import com.liferay.portlet.dynamicdatamapping.service.DDMTemplateLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class DDMTemplateActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DDMTemplateActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DDMTemplateLocalServiceUtil.getService());
        setClass(DDMTemplate.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("templateId");
    }
}
