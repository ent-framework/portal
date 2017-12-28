package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface OrganizationFinder {
    public int countByKeywords(long companyId, long parentOrganizationId,
        java.lang.String parentOrganizationIdComparator,
        java.lang.String keywords, java.lang.String type,
        java.lang.Long regionId, java.lang.Long countryId,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByO_U(long organizationId, long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_PO_N_T_S_C_Z_R_C(long companyId,
        long parentOrganizationId,
        java.lang.String parentOrganizationIdComparator, java.lang.String name,
        java.lang.String type, java.lang.String street, java.lang.String city,
        java.lang.String zip, java.lang.Long regionId,
        java.lang.Long countryId,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_PO_N_T_S_C_Z_R_C(long companyId,
        long parentOrganizationId,
        java.lang.String parentOrganizationIdComparator,
        java.lang.String[] names, java.lang.String type,
        java.lang.String[] streets, java.lang.String[] cities,
        java.lang.String[] zips, java.lang.Long regionId,
        java.lang.Long countryId,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Organization> findByKeywords(
        long companyId, long parentOrganizationId,
        java.lang.String parentOrganizationIdComparator,
        java.lang.String keywords, java.lang.String type,
        java.lang.Long regionId, java.lang.Long countryId,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Organization> findByNoAssets()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Long> findByC_P(long companyId,
        long parentOrganizationId, long previousOrganizationId, int size)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Organization> findByC_PO_N_T_S_C_Z_R_C(
        long companyId, long parentOrganizationId,
        java.lang.String parentOrganizationIdComparator, java.lang.String name,
        java.lang.String type, java.lang.String street, java.lang.String city,
        java.lang.String zip, java.lang.Long regionId,
        java.lang.Long countryId,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Organization> findByC_PO_N_T_S_C_Z_R_C(
        long companyId, long parentOrganizationId,
        java.lang.String parentOrganizationIdComparator,
        java.lang.String[] names, java.lang.String type,
        java.lang.String[] streets, java.lang.String[] cities,
        java.lang.String[] zips, java.lang.Long regionId,
        java.lang.Long countryId,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;
}
