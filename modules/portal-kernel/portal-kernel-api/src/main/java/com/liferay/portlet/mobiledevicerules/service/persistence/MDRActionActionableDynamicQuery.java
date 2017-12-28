package com.liferay.portlet.mobiledevicerules.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

import com.liferay.portlet.mobiledevicerules.model.MDRAction;
import com.liferay.portlet.mobiledevicerules.service.MDRActionLocalServiceUtil;

/**
 * @author Edward C. Han
 * @generated
 */
public abstract class MDRActionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public MDRActionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(MDRActionLocalServiceUtil.getService());
        setClass(MDRAction.class);

        setClassLoader(PortalClassLoaderUtil.getClassLoader());

        setPrimaryKeyPropertyName("actionId");
    }
}
