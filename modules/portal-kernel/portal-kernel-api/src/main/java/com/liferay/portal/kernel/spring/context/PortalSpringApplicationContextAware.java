package com.liferay.portal.kernel.spring.context;


import java.util.Collection;

/**
 * Created by jeff_qian on 9/9/16.
 */
public interface PortalSpringApplicationContextAware  {
    public <T> Collection<T> getBeans(Class<T> cls);
}
