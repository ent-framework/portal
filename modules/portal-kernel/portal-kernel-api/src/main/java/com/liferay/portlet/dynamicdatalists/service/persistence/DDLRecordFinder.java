package com.liferay.portlet.dynamicdatalists.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface DDLRecordFinder {
    public int countByR_S(long recordSetId, int status)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_S_S(long companyId, int status, int scope)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecord> findByR_S(
        long recordSetId, int status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecord> findByC_S_S(
        long companyId, int status, int scope, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.Long[] findByC_S_S_MinAndMax(long companyId, int status,
        int scope) throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portlet.dynamicdatalists.model.DDLRecord> findByC_S_S_MinAndMax(
        long companyId, int status, int scope, long minRecordId,
        long maxRecordId)
        throws com.liferay.portal.kernel.exception.SystemException;
}
