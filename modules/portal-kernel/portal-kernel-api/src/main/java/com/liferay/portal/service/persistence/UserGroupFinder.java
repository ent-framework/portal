package com.liferay.portal.service.persistence;

public interface UserGroupFinder {
    public int countByKeywords(long companyId, java.lang.String keywords,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_N_D(long companyId, java.lang.String name,
        java.lang.String description,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_N_D(long companyId, java.lang.String[] names,
        java.lang.String[] descriptions,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.UserGroup> findByKeywords(
        long companyId, java.lang.String keywords,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.UserGroup findByC_N(long companyId,
        java.lang.String name)
        throws com.liferay.portal.NoSuchUserGroupException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.UserGroup> findByC_N_D(
        long companyId, java.lang.String name, java.lang.String description,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.UserGroup> findByC_N_D(
        long companyId, java.lang.String[] names,
        java.lang.String[] descriptions,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;
}
