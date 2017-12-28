package com.liferay.portlet.mobiledevicerules.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.mobiledevicerules.model.MDRRule;
import com.liferay.portlet.mobiledevicerules.service.MDRRuleLocalServiceUtil;

/**
 * @author Edward C. Han
 * @generated
 */
public abstract class MDRRuleActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MDRRuleActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MDRRuleLocalServiceUtil.getService());
        setClass(MDRRule.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("ruleId");
    }
}
