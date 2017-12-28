package com.liferay.portlet.mobiledevicerules.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance;
import com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupInstanceLocalServiceUtil;

/**
 * @author Edward C. Han
 * @generated
 */
public abstract class MDRRuleGroupInstanceActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MDRRuleGroupInstanceActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(MDRRuleGroupInstanceLocalServiceUtil.getService());
        setClass(MDRRuleGroupInstance.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("ruleGroupInstanceId");
    }
}
