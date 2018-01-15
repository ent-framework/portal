package com.liferay.portal.service.persistence;

public interface RoleFinder {
    public int countByR_U(long roleId, long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByU_G_R(long userId, long groupId, long roleId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_N_D_T(long companyId, java.lang.String name,
        java.lang.String description, java.lang.Integer[] types,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_N_D_T(long companyId, java.lang.String[] names,
        java.lang.String[] descriptions, java.lang.Integer[] types,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByKeywords(long companyId, java.lang.String keywords,
        java.lang.Integer[] types)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByKeywords(long companyId, java.lang.String keywords,
        java.lang.Integer[] types,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findBySystem(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findByUserGroupGroupRole(
        long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findByUserGroupRole(
        long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.Role findByC_N(long companyId,
        java.lang.String name)
        throws com.liferay.portal.NoSuchRoleException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findByU_G(
        long userId, java.util.List<com.liferay.portal.model.Group> groups)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findByU_G(
        long userId, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findByU_G(
        long userId, long[] groupIds)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findByR_N_A(
        long resourceBlockId, java.lang.String className,
        java.lang.String actionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findByC_N_D_T(
        long companyId, java.lang.String name, java.lang.String description,
        java.lang.Integer[] types,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findByC_N_D_T(
        long companyId, java.lang.String[] names,
        java.lang.String[] descriptions, java.lang.Integer[] types,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> findByC_N_S_P(
        long companyId, java.lang.String name, int scope,
        java.lang.String primKey)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findByC_N_S_P_A(
        long companyId, java.lang.String name, int scope,
        java.lang.String primKey, java.lang.String actionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findByKeywords(
        long companyId, java.lang.String keywords, java.lang.Integer[] types,
        int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Role> findByKeywords(
        long companyId, java.lang.String keywords, java.lang.Integer[] types,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;
}
