package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.WorkflowDefinitionLink;
import com.liferay.portal.service.WorkflowDefinitionLinkLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class WorkflowDefinitionLinkActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public WorkflowDefinitionLinkActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(WorkflowDefinitionLinkLocalServiceUtil.getService());
        setClass(WorkflowDefinitionLink.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("workflowDefinitionLinkId");
    }
}
