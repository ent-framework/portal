package com.acn.portal.web.config.portal;

import com.liferay.portal.spring.context.PortalApplicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;



/**
 * Created by jeff on 25/12/2017.
 */
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class PortalWebApplicationInitializer {


    public void onStartup(ServletContext servletContext) throws ServletException {

    		//servletContext.setInitParameter("contextClass", "com.liferay.portal.spring.context.PortalApplicationContext");
      
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
//    class PortalSpringConfigs {}
}
