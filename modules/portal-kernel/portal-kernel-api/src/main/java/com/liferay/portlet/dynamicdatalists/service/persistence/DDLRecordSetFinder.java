package com.liferay.portlet.dynamicdatalists.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface DDLRecordSetFinder {
    public int countByKeywords(long companyId, long groupId,
        java.lang.String keywords, int scope)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_G_N_D_S(long companyId, long groupId,
        java.lang.String name, java.lang.String description, int scope,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountByKeywords(long companyId, long groupId,
        java.lang.String keywords, int scope)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int filterCountByC_G_N_D_S(long companyId, long groupId,
        java.lang.String name, java.lang.String description, int scope,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> filterFindByKeywords(
        long companyId, long groupId, java.lang.String keywords, int scope,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> filterFindByC_G_N_D_S(
        long companyId, long groupId, java.lang.String name,
        java.lang.String description, int scope, boolean andOperator,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> filterFindByC_G_N_D_S(
        long companyId, long groupId, java.lang.String[] names,
        java.lang.String[] descriptions, int scope, boolean andOperator,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findByKeywords(
        long companyId, long groupId, java.lang.String keywords, int scope,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findByC_G_N_D_S(
        long companyId, long groupId, java.lang.String name,
        java.lang.String description, int scope, boolean andOperator,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecordSet> findByC_G_N_D_S(
        long companyId, long groupId, java.lang.String[] names,
        java.lang.String[] descriptions, int scope, boolean andOperator,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;
}
