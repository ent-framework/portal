package com.acn.portal.web.config.portal;

import java.util.List;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.liferay.portal.bean.BeanLocatorImpl;
import com.liferay.portal.kernel.bean.BeanLocator;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.context.ArrayApplicationContext;
import com.liferay.portal.spring.context.PortalApplicationContext;
import com.liferay.portal.util.ClassLoaderUtil;
import com.liferay.portal.util.InitUtil;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portal.util.PropsValues;

/**
 * Created by jeff on 26/12/2017.
 */
public class PortalApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

    		System.out.println("PortalApplicationContextInitializer:" + Thread.currentThread().getContextClassLoader().getClass().getName());

    		InitUtil.init();
    		
    		BeanLocator beanLocator = new BeanLocatorImpl(ClassLoaderUtil.getPortalClassLoader(), applicationContext);

    		PortalBeanLocatorUtil.setBeanLocator(beanLocator);
    		
    		List<String> configLocations = ListUtil.fromArray(PropsUtil.getArray(PropsKeys.SPRING_CONFIGS));
    		
    		if (StringUtil.equalsIgnoreCase(
    				PropsValues.PERSISTENCE_PROVIDER, "jpa")) {

    			configLocations.remove("META-INF/hibernate-spring.xml");
    		}
    		else {
    			configLocations.remove("META-INF/jpa-spring.xml");
    		}

    		AbstractApplicationContext portalContext =
    			new ArrayApplicationContext(
    				configLocations.toArray(new String[configLocations.size()]), applicationContext);


 

    		//InitUtil.initWithSpring();

    }
}
