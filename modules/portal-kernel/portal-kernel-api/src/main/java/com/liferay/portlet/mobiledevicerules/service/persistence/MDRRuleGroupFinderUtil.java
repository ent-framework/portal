package com.liferay.portlet.mobiledevicerules.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


@ProviderType
public class MDRRuleGroupFinderUtil {
    private static MDRRuleGroupFinder _finder;

    public static int countByKeywords(long groupId, java.lang.String keywords,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByKeywords(groupId, keywords, params);
    }

    public static int countByG_N(long groupId, java.lang.String name,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByG_N(groupId, name, params, andOperator);
    }

    public static int countByG_N(long groupId, java.lang.String[] names,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByG_N(groupId, names, params, andOperator);
    }

    public static java.util.List<com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup> findByKeywords(
        long groupId, java.lang.String keywords,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByKeywords(groupId, keywords, params, start, end);
    }

    public static java.util.List<com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup> findByG_N(
        long groupId, java.lang.String name,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByG_N(groupId, name, params, andOperator);
    }

    public static java.util.List<com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup> findByG_N(
        long groupId, java.lang.String name,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByG_N(groupId, name, params, andOperator, start, end);
    }

    public static java.util.List<com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup> findByG_N(
        long groupId, java.lang.String[] names,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByG_N(groupId, names, params, andOperator, start, end);
    }

    public static MDRRuleGroupFinder getFinder() {
        if (_finder == null) {
            _finder = (MDRRuleGroupFinder) PortalBeanLocatorUtil.locate(MDRRuleGroupFinder.class.getName());

            ReferenceRegistry.registerReference(MDRRuleGroupFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(MDRRuleGroupFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(MDRRuleGroupFinderUtil.class,
            "_finder");
    }
}
