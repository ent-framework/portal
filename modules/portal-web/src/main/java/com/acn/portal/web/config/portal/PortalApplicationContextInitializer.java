package com.acn.portal.web.config.portal;

import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.ext.service.FilterScopeLocalService;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ClassNameLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
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
public class PortalApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        InitUtil.init();


//    		BeanLocator beanLocator = new BeanLocatorImpl(ClassLoaderUtil.getPortalClassLoader(), applicationContext);
//
//    		PortalBeanLocatorUtil.setBeanLocator(beanLocator);

        List<String> configLocations = ListUtil.fromArray(PropsUtil.getArray(PropsKeys.SPRING_CONFIGS));

        if (StringUtil.equalsIgnoreCase(
            PropsValues.PERSISTENCE_PROVIDER, "jpa")) {

            configLocations.remove("META-INF/hibernate-spring.xml");
        } else {
            configLocations.remove("META-INF/jpa-spring.xml");
        }

        AbstractApplicationContext portalContext = new ArrayApplicationContext(configLocations.toArray(new String[configLocations.size()]));

        portalContext.setParent(applicationContext);

        BeanLocator beanLocator = new BeanLocatorImpl(ClassLoaderUtil.getPortalClassLoader(), portalContext);

        PortalBeanLocatorUtil.setBeanLocator(beanLocator);

        PortalBeanLocatorUtil.locate(FilterScopeLocalService.class.getName());

        try {
//            UserLocalServiceUtil.getUsersCount();
//
//            ClassNameLocalServiceUtil.checkClassNames();

            CounterLocalServiceUtil.increment(User.class.getName());

        } catch (SystemException e) {
            e.printStackTrace();
        }

        //InitUtil.initWithSpring();

    }
}
