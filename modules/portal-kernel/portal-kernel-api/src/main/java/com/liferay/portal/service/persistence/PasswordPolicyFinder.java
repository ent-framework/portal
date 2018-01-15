package com.liferay.portal.service.persistence;

public interface PasswordPolicyFinder {
    public int countByC_N(long companyId, java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.liferay.portal.model.PasswordPolicy> findByC_N(
        long companyId, java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator obc)
        throws com.liferay.portal.kernel.exception.SystemException;
}
