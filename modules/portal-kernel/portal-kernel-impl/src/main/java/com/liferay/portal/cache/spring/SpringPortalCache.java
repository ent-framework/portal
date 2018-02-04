package com.liferay.portal.cache.spring;

import com.hazelcast.core.IMap;
import com.hazelcast.spring.cache.HazelcastCache;
import com.liferay.portal.kernel.cache.CacheListener;
import com.liferay.portal.kernel.cache.CacheListenerScope;
import com.liferay.portal.kernel.cache.PortalCache;
import com.liferay.portal.kernel.concurrent.ConcurrentHashSet;
import org.springframework.cache.Cache;

import java.io.Serializable;
import java.util.*;

public class SpringPortalCache<K extends Serializable, V> implements PortalCache<K, V> {

    private final Cache cache;

    public SpringPortalCache(Cache cache) {
        this.cache = cache;
    }

    @Override
    public void destroy() {
        this.removeAll();
    }

    @Override
    public Collection<V> get(Collection<K> keys) {
        Collection<V> results = new ArrayList<>();
        keys.stream().forEach(s -> {
            V value = this.get(s);
            if (value!=null) results.add(value);
        });
        return results;
    }

    @Override
    public V get(K key) {
        Cache.ValueWrapper wrapper = this.cache.get(key);
        if (wrapper!=null) {
            return (V)wrapper.get();
        }
        return null;
    }

    @Override
    public List<K> getKeys() {
        List<K> keys = new ArrayList<>();
        if (this.cache instanceof HazelcastCache) {
            HazelcastCache hazelcastCache = (HazelcastCache) this.cache;
            IMap<Object, Object> map  = (IMap<Object, Object>)hazelcastCache.getNativeCache();
            Set<Map.Entry<Object, Object>> entries = map.entrySet();
            for (Map.Entry<Object, Object> entry : entries) {
                keys.add((K)entry.getKey());
            }
        }
        return keys;
    }

    @Override
    public String getName() {
        return this.cache.getName();
    }

    @Override
    public void put(K key, V value) {
        this.cache.put(key, value);
    }

    @Override
    public void put(K key, V value, int timeToLive) {
        this.put(key, value);
    }

    @Override
    public void registerCacheListener(CacheListener<K, V> cacheListener) {

    }

    @Override
    public void registerCacheListener(CacheListener<K, V> cacheListener, CacheListenerScope cacheListenerScope) {

    }

    @Override
    public void remove(K key) {
        this.cache.evict(key);
    }

    @Override
    public void removeAll() {
        this.cache.clear();
    }

    @Override
    public void unregisterCacheListener(CacheListener<K, V> cacheListener) {

    }

    @Override
    public void unregisterCacheListeners() {

    }

}
