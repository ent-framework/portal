package com.liferay.portal.kernel.jsonwebservice.cache;


public interface WebServiceCache {

	public void clearCache();

	public Object getResult(String key, Object[] args);

	public void putResult(String key, Object[] args, Object result, int secondsToLive);

}
