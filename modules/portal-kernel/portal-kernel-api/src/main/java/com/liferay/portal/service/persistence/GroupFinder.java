package com.liferay.portal.service.persistence;

public interface GroupFinder {
    public int countByLayouts(long companyId, long parentGroupId, boolean site)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByG_U(long groupId, long userId, boolean inherit)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countByC_C_PG_N_D(long companyId, long[] classNameIds,
        long parentGroupId, java.lang.String[] names,
        java.lang.String[] descriptions,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Group> findByLayouts(
        long companyId, long parentGroupId, boolean site, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Group> findByLayouts(
        long companyId, long parentGroupId, boolean site, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Group> findByLiveGroups()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Group> findByNoLayouts(
        long classNameId, boolean privateLayout, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Group> findByNullFriendlyURL()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Group> findBySystem(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Group> findByCompanyId(
        long companyId,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<java.lang.Long> findByC_P(long companyId,
        long parentGroupId, long previousGroupId, int size)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.model.Group findByC_N(long companyId,
        java.lang.String name)
        throws com.liferay.portal.NoSuchGroupException,
            com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.Group> findByC_C_PG_N_D(
        long companyId, long[] classNameIds, long parentGroupId,
        java.lang.String[] names, java.lang.String[] descriptions,
        java.util.LinkedHashMap<java.lang.String, java.lang.Object> params,
        boolean andOperator, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;
}
