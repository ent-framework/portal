package com.acn.portal.web.config.portal;

import com.acn.portal.web.config.WebConfigurer;
import com.liferay.portal.bean.BeanLocatorImpl;
import com.liferay.portal.kernel.bean.BeanLocator;
import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.servlet.PortletSessionListenerManager;
import com.liferay.portal.kernel.servlet.SerializableSessionAttributeListener;
import com.liferay.portal.kernel.servlet.filters.invoker.InvokerFilter;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.servlet.PortalSessionListener;
import com.liferay.portal.servlet.SharedSessionAttributeListener;
import com.liferay.portal.spring.context.ArrayApplicationContext;
import com.liferay.portal.spring.context.PortalApplicationContext;
import com.liferay.portal.spring.context.PortalContextLoaderListener;
import com.liferay.portal.util.ClassLoaderUtil;
import com.liferay.portal.util.PropsUtil;
import com.liferay.portal.util.PropsValues;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.*;

import javax.servlet.*;


/**
 * Created by jeff on 25/12/2017.
 */
@Configuration
@Order(0)
public class PortalWebApplicationInitializer implements ServletContextInitializer {

    private final Logger log = LoggerFactory.getLogger(PortalWebApplicationInitializer.class);

    public void onStartup(ServletContext servletContext) throws ServletException {

    		//servletContext.setInitParameter("contextClass", "com.liferay.portal.spring.context.PortalApplicationContext");

		log.info("PortalWebApplicationInitializer Start Up");
//
//		ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
//
//
//		BeanLocator beanLocator = new BeanLocatorImpl(ClassLoaderUtil.getPortalClassLoader(), applicationContext);
//
//		PortalBeanLocatorUtil.setBeanLocator(beanLocator);
//
//		List<String> configLocations = ListUtil.fromArray(PropsUtil.getArray(PropsKeys.SPRING_CONFIGS));
//
//		if (StringUtil.equalsIgnoreCase(
//				PropsValues.PERSISTENCE_PROVIDER, "jpa")) {
//
//			configLocations.remove("META-INF/hibernate-spring.xml");
//		}
//		else {
//			configLocations.remove("META-INF/jpa-spring.xml");
//		}
//
//		AbstractApplicationContext portalContext = new ArrayApplicationContext(configLocations.toArray(new String[configLocations.size()]), applicationContext);


        initPortalListeners(servletContext);
        initInvokerFilters(servletContext);

        //initServlets(servletContext);
    }

    private void initPortalListeners(ServletContext servletContext) {
        servletContext.addListener(new PortalContextLoaderListener());
        servletContext.addListener(new PortalSessionListener());
        servletContext.addListener(new PortletSessionListenerManager());
        servletContext.addListener(new SerializableSessionAttributeListener());
        servletContext.addListener(new SharedSessionAttributeListener());
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
        registrationBean.setFilter(struts);
        registrationBean.setOrder(1);
        List urlPatterns = new ArrayList();
        urlPatterns.add("/c/*");
        registrationBean.setUrlPatterns(urlPatterns);
        return registrationBean;
    }

    private void initInvokerFilters(ServletContext servletContext) {
        FilterRegistration.Dynamic invokerFilter = servletContext.addFilter("InvokerFilter-ERROR", new InvokerFilter());
        EnumSet<DispatcherType> disps = EnumSet.of(DispatcherType.ERROR,  DispatcherType.ASYNC);
        Map<String, String> parameters = new HashMap<>();
        parameters.put("register-portal-lifecycle","false");
        parameters.put("dispatcher", "ERROR");
        invokerFilter.setInitParameters(parameters);
        invokerFilter.addMappingForUrlPatterns(disps, true, "/*");
        invokerFilter.setAsyncSupported(true);

        invokerFilter = servletContext.addFilter("InvokerFilter-FORWARD", new InvokerFilter());
        disps = EnumSet.of(DispatcherType.FORWARD, DispatcherType.ASYNC);
        parameters = new HashMap<>();
        parameters.put("register-portal-lifecycle","false");
        parameters.put("dispatcher", "FORWARD");
        invokerFilter.setInitParameters(parameters);
        invokerFilter.addMappingForUrlPatterns(disps, true, "/*");
        invokerFilter.setAsyncSupported(true);

        invokerFilter = servletContext.addFilter("InvokerFilter-INCLUDE", new InvokerFilter());
        disps = EnumSet.of(DispatcherType.INCLUDE,  DispatcherType.ASYNC);
        parameters = new HashMap<>();
        parameters.put("register-portal-lifecycle","false");
        parameters.put("dispatcher", "INCLUDE");
        invokerFilter.setInitParameters(parameters);
        invokerFilter.addMappingForUrlPatterns(disps, true, "/*");
        invokerFilter.setAsyncSupported(true);

        invokerFilter = servletContext.addFilter("InvokerFilter-REQUEST", new InvokerFilter());
        disps = EnumSet.of(DispatcherType.REQUEST,  DispatcherType.ASYNC);
        parameters = new HashMap<>();
        parameters.put("register-portal-lifecycle","false");
        parameters.put("dispatcher", "REQUEST");
        invokerFilter.setInitParameters(parameters);
        invokerFilter.addMappingForUrlPatterns(disps, true, "/*");
        invokerFilter.setAsyncSupported(true);

    }

    private void initServlets(ServletContext servletContext) {

        ServletRegistration.Dynamic mainServlet = servletContext.addServlet("MainServlet", com.liferay.portal.servlet.MainServlet.class);
        Map<String, String> parameters = new HashMap<>();
        parameters.put("config", "struts-config.xml, struts-config-ext.xml");
        parameters.put("debug", "0");
        parameters.put("detail", "0");
        mainServlet.addMapping("/c/*");
        mainServlet.setInitParameters(parameters);
        mainServlet.setLoadOnStartup(0);
        mainServlet.setAsyncSupported(false);
    }

//    @ImportResource({"META-INF/base-spring.xml",
//        "META-INF/hibernate-spring.xml",
//        "META-INF/infrastructure-spring.xml",
//        "META-INF/management-spring.xml",
//        "META-INF/util-spring.xml",
//       // "META-INF/jpa-spring.xml",
//        "META-INF/executor-spring.xml",
//        "META-INF/audit-spring.xml",
//        "META-INF/cluster-spring.xml",
//        "META-INF/editor-spring.xml",
//       // "META-INF/jcr-spring.xml",
//        "META-INF/ldap-spring.xml",
//        "META-INF/messaging-core-spring.xml",
//        "META-INF/messaging-misc-spring.xml",
//        "META-INF/mobile-device-spring.xml",
//        "META-INF/notifications-spring.xml",
//        "META-INF/poller-spring.xml",
//        "META-INF/rules-spring.xml",
//        "META-INF/scheduler-spring.xml",
//        "META-INF/search-spring.xml",
//        "META-INF/workflow-spring.xml",
//        "META-INF/counter-spring.xml",
//        "META-INF/mail-spring.xml",
//        "META-INF/portal-spring.xml",
//        "META-INF/portlet-container-spring.xml",
//        "META-INF/staging-spring.xml",
//        "META-INF/virtual-layouts-spring.xml",
//        "META-INF/monitoring-spring.xml",
//        "META-INF/dynamic-data-source-spring.xml",
//        "META-INF/shard-data-source-spring.xml",
//        "META-INF/memcached-spring.xml",
//        "classpath*:META-INF/ext-spring.xml"
//    })
    class PortalSpringConfigs {}
}
