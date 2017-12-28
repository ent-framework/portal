package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.model.WorkflowInstanceLink;
import com.liferay.portal.service.WorkflowInstanceLinkLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class WorkflowInstanceLinkActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public WorkflowInstanceLinkActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(WorkflowInstanceLinkLocalServiceUtil.getService());
        setClass(WorkflowInstanceLink.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("workflowInstanceLinkId");
    }
}
