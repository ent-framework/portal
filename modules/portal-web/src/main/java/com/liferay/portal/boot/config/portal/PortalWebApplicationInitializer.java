package com.liferay.portal.boot.config.portal;

import com.liferay.portal.jsonwebservice.JSONWebServiceServlet;
import com.liferay.portal.kernel.bean.Util;
import com.liferay.portal.kernel.servlet.PortletSessionListenerManager;
import com.liferay.portal.kernel.servlet.SerializableSessionAttributeListener;
import com.liferay.portal.kernel.servlet.filters.invoker.InvokerFilter;
import com.liferay.portal.servlet.*;
import com.liferay.portal.spring.context.PortalContextLoaderListener;
import com.liferay.portal.webserver.DynamicResourceServlet;
import com.liferay.portal.webserver.WebServerServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Created by jeff on 25/12/2017.
 */
@Configuration
public class PortalWebApplicationInitializer implements ServletContextInitializer {

    private final Logger log = LoggerFactory.getLogger(PortalWebApplicationInitializer.class);

    public void onStartup(ServletContext servletContext) throws ServletException {

        //servletContext.setInitParameter("contextClass", "com.liferay.portal.spring.context.PortalApplicationContext");

        log.info("PortalWebApplicationInitializer Start Up");

        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);

        //load
        applicationContext.getBeansWithAnnotation(Util.class);

        initPortalListeners(servletContext);
        initInvokerFilters(servletContext, false);
        initServlets(servletContext);
    }

    private void initPortalListeners(ServletContext servletContext) {
        servletContext.addListener(new PortalContextLoaderListener());
        servletContext.addListener(new PortalSessionListener());
        servletContext.addListener(new PortletSessionListenerManager());
        servletContext.addListener(new SerializableSessionAttributeListener());
        servletContext.addListener(new SharedSessionAttributeListener());
    }

    private void initInvokerFilters(ServletContext servletContext, boolean asyncSupported) {
        FilterRegistration.Dynamic invokerFilter = servletContext.addFilter("InvokerFilter-ERROR", new InvokerFilter());
        EnumSet<DispatcherType> disps = EnumSet.of(DispatcherType.ERROR, DispatcherType.ASYNC);
        Map<String, String> parameters = new HashMap<>();
        parameters.put("register-portal-lifecycle", "false");
        parameters.put("dispatcher", "ERROR");
        invokerFilter.setInitParameters(parameters);
        invokerFilter.addMappingForUrlPatterns(disps, true, "/*");
        invokerFilter.setAsyncSupported(asyncSupported);


        invokerFilter = servletContext.addFilter("InvokerFilter-FORWARD", new InvokerFilter());
        disps = EnumSet.of(DispatcherType.FORWARD, DispatcherType.ASYNC);
        parameters = new HashMap<>();
        parameters.put("register-portal-lifecycle", "false");
        parameters.put("dispatcher", "FORWARD");
        invokerFilter.setInitParameters(parameters);
        invokerFilter.addMappingForUrlPatterns(disps, true, "/*");
        invokerFilter.setAsyncSupported(asyncSupported);

        invokerFilter = servletContext.addFilter("InvokerFilter-INCLUDE", new InvokerFilter());
        disps = EnumSet.of(DispatcherType.INCLUDE, DispatcherType.ASYNC);
        parameters = new HashMap<>();
        parameters.put("register-portal-lifecycle", "false");
        parameters.put("dispatcher", "INCLUDE");
        invokerFilter.setInitParameters(parameters);
        invokerFilter.addMappingForUrlPatterns(disps, true, "/*");
        invokerFilter.setAsyncSupported(asyncSupported);

        invokerFilter = servletContext.addFilter("InvokerFilter-REQUEST", new InvokerFilter());
        disps = EnumSet.of(DispatcherType.REQUEST, DispatcherType.ASYNC);
        parameters = new HashMap<>();
        parameters.put("register-portal-lifecycle", "false");
        parameters.put("dispatcher", "REQUEST");
        invokerFilter.setInitParameters(parameters);
        invokerFilter.addMappingForUrlPatterns(disps, true, "/*");
        invokerFilter.setAsyncSupported(asyncSupported);

    }

    private void initServlets(ServletContext servletContext) {

        ServletRegistration.Dynamic mainServlet = servletContext.addServlet("MainServlet", new MainServlet());
        Map<String, String> parameters = new HashMap<>();
        parameters.put("config", "portal-config/struts-config.xml, portal-config/struts-config-ext.xml");
        parameters.put("debug", "0");
        parameters.put("detail", "0");
        mainServlet.addMapping("/c/*");
        mainServlet.setInitParameters(parameters);
        mainServlet.setLoadOnStartup(0);
        mainServlet.setAsyncSupported(false);

        ServletRegistration.Dynamic i18nServlet = servletContext.addServlet("I18nServlet", new I18nServlet());
        Set<String> languageIds = I18nServlet.getLanguageIds();
        for (String lang : languageIds) {
            i18nServlet.addMapping("/" + lang + "/*");
        }
        i18nServlet.setLoadOnStartup(1);
        i18nServlet.setAsyncSupported(false);

        ServletRegistration.Dynamic privateGroupFriendlyURLServlet = servletContext.addServlet("PrivateGroupFriendlyURLServlet", new FriendlyURLServlet());
        parameters = new HashMap<>();
        parameters.put("private", "true");
        parameters.put("user", "false");
        privateGroupFriendlyURLServlet.setInitParameters(parameters);
        privateGroupFriendlyURLServlet.addMapping("/group/*");
        privateGroupFriendlyURLServlet.setLoadOnStartup(1);
        privateGroupFriendlyURLServlet.setAsyncSupported(false);

        ServletRegistration.Dynamic privateUserFriendlyURLServlet = servletContext.addServlet("PrivateUserFriendlyURLServlet", new FriendlyURLServlet());
        parameters = new HashMap<>();
        parameters.put("private", "true");
        parameters.put("user", "true");
        privateUserFriendlyURLServlet.setInitParameters(parameters);
        privateUserFriendlyURLServlet.addMapping("/user/*");
        privateUserFriendlyURLServlet.setLoadOnStartup(1);
        privateUserFriendlyURLServlet.setAsyncSupported(false);

        ServletRegistration.Dynamic publicFriendlyURLServlet = servletContext.addServlet("PublicFriendlyURLServlet", new FriendlyURLServlet());
        parameters = new HashMap<>();
        parameters.put("private", "false");
        publicFriendlyURLServlet.setInitParameters(parameters);
        publicFriendlyURLServlet.addMapping("/web/*");
        publicFriendlyURLServlet.setLoadOnStartup(1);
        publicFriendlyURLServlet.setAsyncSupported(false);

        ServletRegistration.Dynamic comboServlet = servletContext.addServlet("ComboServlet", new ComboServlet());
        comboServlet.addMapping("/combo/*");
        comboServlet.setLoadOnStartup(1);
        comboServlet.setAsyncSupported(false);

        ServletRegistration.Dynamic dynamicResourceServlet = servletContext.addServlet("DynamicResourceServlet", new DynamicResourceServlet());
        dynamicResourceServlet.addMapping("/sprite/*");
        dynamicResourceServlet.setLoadOnStartup(1);
        dynamicResourceServlet.setAsyncSupported(false);

        ServletRegistration.Dynamic webServerServlet = servletContext.addServlet("WebServerServlet", new WebServerServlet());
        parameters = new HashMap<>();
        parameters.put("last_modified", "true");
        webServerServlet.setInitParameters(parameters);
        webServerServlet.addMapping("/documents/*");
        webServerServlet.addMapping("/image/*");
        webServerServlet.setLoadOnStartup(1);
        webServerServlet.setAsyncSupported(false);

        ServletRegistration.Dynamic jsonWebServiceServlet = servletContext.addServlet("JSONWebServiceServlet", new JSONWebServiceServlet());
        jsonWebServiceServlet.addMapping("/api/jsonws/*");
        jsonWebServiceServlet.setLoadOnStartup(1);
        jsonWebServiceServlet.setAsyncSupported(false);

    }
}
