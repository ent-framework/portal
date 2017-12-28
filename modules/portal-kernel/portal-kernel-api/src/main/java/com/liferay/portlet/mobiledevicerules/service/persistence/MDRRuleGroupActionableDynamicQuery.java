package com.liferay.portlet.mobiledevicerules.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup;
import com.liferay.portlet.mobiledevicerules.service.MDRRuleGroupLocalServiceUtil;

/**
 * @author Edward C. Han
 * @generated
 */
public abstract class MDRRuleGroupActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MDRRuleGroupActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MDRRuleGroupLocalServiceUtil.getService());
        setClass(MDRRuleGroup.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("ruleGroupId");
    }
}
