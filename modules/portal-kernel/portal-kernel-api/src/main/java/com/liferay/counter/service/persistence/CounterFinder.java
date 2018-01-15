package com.liferay.counter.service.persistence;

public interface CounterFinder {
    public void afterPropertiesSet();

    public java.util.List<java.lang.String> getNames()
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.lang.String getRegistryName();

    public long increment()
        throws com.liferay.portal.kernel.exception.SystemException;

    public long increment(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public long increment(java.lang.String name, int size)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void invalidate();

    public void rename(java.lang.String oldName, java.lang.String newName)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void reset(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void reset(java.lang.String name, long size)
        throws com.liferay.portal.kernel.exception.SystemException;
}
