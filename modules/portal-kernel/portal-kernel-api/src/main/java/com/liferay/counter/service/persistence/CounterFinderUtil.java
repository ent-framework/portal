package com.liferay.counter.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class CounterFinderUtil {
    private static CounterFinder _finder;

    public static void afterPropertiesSet() {
        getFinder().afterPropertiesSet();
    }

    public static java.util.List<java.lang.String> getNames()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().getNames();
    }

    public static java.lang.String getRegistryName() {
        return getFinder().getRegistryName();
    }

    public static long increment()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().increment();
    }

    public static long increment(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().increment(name);
    }

    public static long increment(java.lang.String name, int size)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder().increment(name, size);
    }

    public static void invalidate() {
        getFinder().invalidate();
    }

    public static void rename(java.lang.String oldName, java.lang.String newName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getFinder().rename(oldName, newName);
    }

    public static void reset(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        getFinder().reset(name);
    }

    public static void reset(java.lang.String name, long size)
        throws com.liferay.portal.kernel.exception.SystemException {
        getFinder().reset(name, size);
    }

    public static CounterFinder getFinder() {
        if (_finder == null) {
            _finder = (CounterFinder) PortalBeanLocatorUtil.locate(CounterFinder.class.getName());

            ReferenceRegistry.registerReference(CounterFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(CounterFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(CounterFinderUtil.class, "_finder");
    }
}
