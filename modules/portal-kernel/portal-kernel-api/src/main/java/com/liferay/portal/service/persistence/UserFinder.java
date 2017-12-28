package com.liferay.portal.service.persistence;

import aQute.bnd.annotation.ProviderType;


@ProviderType
public interface UserFinder {
    public int countByUser(long userId,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByKeywords(long companyId, java.lang.String keywords,
        int status,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_FN_MN_LN_SN_EA_S(long companyId,
        java.lang.String firstName, java.lang.String middleName,
        java.lang.String lastName, java.lang.String screenName,
        java.lang.String emailAddress, int status,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_FN_MN_LN_SN_EA_S(long companyId,
        java.lang.String[] firstNames, java.lang.String[] middleNames,
        java.lang.String[] lastNames, java.lang.String[] screenNames,
        java.lang.String[] emailAddresses, int status,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.User> findByKeywords(
        long companyId, java.lang.String keywords, int status,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.User> findByNoAnnouncementsDeliveries(
        java.lang.String type)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.User> findByNoContacts()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.User> findByNoGroups()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.User> findByC_FN_MN_LN_SN_EA_S(
        long companyId, java.lang.String firstName,
        java.lang.String middleName, java.lang.String lastName,
        java.lang.String screenName, java.lang.String emailAddress, int status,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.User> findByC_FN_MN_LN_SN_EA_S(
        long companyId, java.lang.String[] firstNames,
        java.lang.String[] middleNames, java.lang.String[] lastNames,
        java.lang.String[] screenNames, java.lang.String[] emailAddresses,
        int status,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;
}
