package com.liferay.portal.cache.spring;

import com.liferay.portal.kernel.cache.PortalCache;
import com.liferay.portal.kernel.cache.PortalCacheException;
import com.liferay.portal.kernel.cache.PortalCacheManager;
import com.liferay.portal.kernel.exception.PortalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

import java.io.Serializable;
import java.net.URL;

public class SpringPortalCacheManager<K extends Serializable,V> implements PortalCacheManager<K, V> {

    private CacheManager cacheManager;

    @Autowired
    public void setCacheManager(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Override
    public void clearAll() throws PortalCacheException {
        getCacheManager().getCacheNames().stream().forEach(s -> cacheManager.getCache(s).clear());
    }

    @Override
    public PortalCache<K, V> getCache(String name) throws PortalCacheException {
        Cache cache = getCacheManager().getCache(name);
        if (cache == null) {
            throw new PortalCacheException("can't get cache from cacheManager : " + this.cacheManager!=null ? this.cacheManager.getClass().getName():"");
        }
        return new SpringPortalCache<K, V>(cache);
    }

    @Override
    public PortalCache<K, V> getCache(String name, boolean blocking) throws PortalCacheException {
        return this.getCache(name);
    }

    @Override
    public void reconfigureCaches(URL configurationURL) {

    }

    @Override
    public void removeCache(String name) {
    }

    public CacheManager getCacheManager() throws PortalCacheException {
        if (cacheManager==null) {
            throw new PortalCacheException("CacheManager is not set");
        }
        return cacheManager;
    }
}
