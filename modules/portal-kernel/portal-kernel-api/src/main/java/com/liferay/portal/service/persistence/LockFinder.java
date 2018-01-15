package com.liferay.portal.service.persistence;

public interface LockFinder {
    public com.liferay.portal.model.Lock fetchByC_K(
        java.lang.String className, java.lang.String key,
        com.liferay.portal.kernel.dao.orm.LockMode lockMode)
        throws com.liferay.portal.kernel.exception.SystemException;
}
