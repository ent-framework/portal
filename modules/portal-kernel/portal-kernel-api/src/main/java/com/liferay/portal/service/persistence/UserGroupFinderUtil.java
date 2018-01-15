package com.liferay.portal.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class UserGroupFinderUtil {
    private static UserGroupFinder _finder;

    public static int countByKeywords(long companyId,
        java.lang.String keywords,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().countByKeywords(companyId, keywords, params);
    }

    public static int countByC_N_D(long companyId, java.lang.String name,
        java.lang.String description,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByC_N_D(companyId, name, description, params,
            andOperator);
    }

    public static int countByC_N_D(long companyId, java.lang.String[] names,
        java.lang.String[] descriptions,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .countByC_N_D(companyId, names, descriptions, params,
            andOperator);
    }

    public static java.util.List<com.liferay.portal.model.UserGroup> findByKeywords(
        long companyId, java.lang.String keywords,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByKeywords(companyId, keywords, params, start, end, obc);
    }

    public static com.liferay.portal.model.UserGroup findByC_N(long companyId,
        java.lang.String name)
        throws com.liferay.portal.NoSuchUserGroupException,
            com.liferay.portal.kernel.exception.SystemException {
        return getFinder().findByC_N(companyId, name);
    }

    public static java.util.List<com.liferay.portal.model.UserGroup> findByC_N_D(
        long companyId, java.lang.String name, java.lang.String description,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByC_N_D(companyId, name, description, params,
            andOperator, start, end, obc);
    }

    public static java.util.List<com.liferay.portal.model.UserGroup> findByC_N_D(
        long companyId, java.lang.String[] names,
        java.lang.String[] descriptions,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findByC_N_D(companyId, names, descriptions, params,
            andOperator, start, end, obc);
    }

    public static UserGroupFinder getFinder() {
        if (_finder == null) {
            _finder = (UserGroupFinder) PortalBeanLocatorUtil.locate(UserGroupFinder.class.getName());

            ReferenceRegistry.registerReference(UserGroupFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(UserGroupFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(UserGroupFinderUtil.class, "_finder");
    }
}
