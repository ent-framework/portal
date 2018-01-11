package com.liferay.portal.boot.config.portal;

import com.liferay.portal.bean.BeanLocatorImpl;
import com.liferay.portal.kernel.bean.BeanLocator;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.util.ClassLoaderUtil;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by jeff on 26/12/2017.
 */
public class PortalApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        //InitUtil.init();


//        List<String> configLocations = ListUtil.fromArray(PropsUtil.getArray(PropsKeys.SPRING_CONFIGS));
//
//        if (StringUtil.equalsIgnoreCase(
//            PropsValues.PERSISTENCE_PROVIDER, "jpa")) {
//
//            configLocations.remove("META-INF/hibernate-spring.xml");
//        } else {
//            configLocations.remove("META-INF/jpa-spring.xml");
//        }
//
//        AbstractApplicationContext portalContext = new ArrayApplicationContext(configLocations.toArray(new String[configLocations.size()]));
//
//        portalContext.setParent(applicationContext);

        //applicationContext.refresh();

        BeanLocator beanLocator = new BeanLocatorImpl(ClassLoaderUtil.getPortalClassLoader(), applicationContext);

        PortalBeanLocatorUtil.setBeanLocator(beanLocator);


//        PortalBeanLocatorUtil.locate(FilterScopeLocalService.class.getName());
//
//        try {
//            UserLocalServiceUtil.getUsersCount();
//
//            ClassNameLocalServiceUtil.checkClassNames();
//
//            CounterLocalServiceUtil.increment(User.class.getName());
//
//        } catch (SystemException e) {
//            e.printStackTrace();
//        }

        //InitUtil.initWithSpring();

    }
}
