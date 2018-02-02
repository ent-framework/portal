package com.liferay.portal.boot.config;

import com.liferay.portal.bean.BeanLocatorImpl;
import com.liferay.portal.kernel.bean.BeanLocator;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.util.ClassLoaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by jeff on 26/12/2017.
 */
public class PortalApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    private final Logger log = LoggerFactory.getLogger(PortalApplicationContextInitializer.class);

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        log.info("PortalApplicationContextInitializer start");

        BeanLocator beanLocator = new BeanLocatorImpl(ClassLoaderUtil.getPortalClassLoader(), applicationContext);

        PortalBeanLocatorUtil.setBeanLocator(beanLocator);

    }
}
