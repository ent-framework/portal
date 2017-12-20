package com.liferay.portal.kernel.jsonwebservice.cache;

/**
 * 
 * Util 类，必须在ext-spring.xml 中定义
 * 
 * @author baojian.qian
 *
 */
public class WebServiceCacheUtil {

	public static void clearCache(){
		getWebServiceCache().clearCache();
	}

	public static Object getResult(String key, Object[] args) {
		return getWebServiceCache().getResult(key, args);
	}

	public static void putResult(String key, Object[] args, Object result, int secondsToLive) {
		getWebServiceCache().putResult(key, args, result, secondsToLive);
	}
	
	
	public static WebServiceCache getWebServiceCache() {
		return _webServiceCache;
	}

	public  void setWebServiceCache(WebServiceCache webServiceCache) {
		_webServiceCache = webServiceCache;
	}


	public static WebServiceCache _webServiceCache;
}
