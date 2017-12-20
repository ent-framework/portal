package com.liferay.portal.kernel.jsonwebservice.cache;

import com.liferay.portal.kernel.cache.PortalCache;
import com.liferay.portal.kernel.cache.SingleVMPool;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;


public class WebServiceCacheImpl implements WebServiceCache {

	public void afterPropertiesSet() {
		//使用SingleVMPoolUtil
		_portalCache =  (PortalCache<String, Object>)_singleVMPool.getCache(_CACHE_NAME);
	}
	
	@Override
	public void clearCache() {
		_portalCache.removeAll();
	}

	@Override
	public Object getResult(String key, Object[] args) {

		String cacheKey = getCacheKey(key, args);
		
		Object result = _portalCache.get(cacheKey);
		
		if (_log.isDebugEnabled()) {
			_log.debug(
				"try to get result from cache, cache key :" + cacheKey + ", result :" + result==null?"null" : result.toString());
			
		}
		return result;
	}

	@Override
	public void putResult(String key, Object[] args, Object result, int secondsToLive) {

		String cacheKey = getCacheKey(key, args);

		_portalCache.put(cacheKey, result, secondsToLive);

		if (_log.isDebugEnabled()) {
			_log.debug(
				"put result into cache, cache key :" + cacheKey + ", secondsToLive :"+secondsToLive+", result :" + result==null?"null" : result.toString());
			
		}
	}

	private String getCacheKey(String methodName, Object[] args) {
		StringBundler sb = new StringBundler(args.length * 2 + 3);

		sb.append(methodName);
		sb.append(_ARGS_SEPARATOR);

		for (Object arg : args) {
			sb.append(StringPool.PERIOD);
			sb.append(String.valueOf(arg));
		}
		return sb.toString();		
	}	
	
	
	public void setSingleVMPool(SingleVMPool singleVMPool) {
		_singleVMPool = singleVMPool;
	}
	
	private static final String _CACHE_NAME = WebServiceCacheImpl.class.getName();
	
	private static final String _ARGS_SEPARATOR = "_A_";
	
	private static Log _log = LogFactoryUtil.getLog(WebServiceCacheImpl.class);

	private PortalCache<String, Object> _portalCache;
	private SingleVMPool _singleVMPool;
	
}
