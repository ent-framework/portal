package com.liferay.portal.boot.config.portal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

@Configuration
public class PortalServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        log.info("PortalServletContainerInitializer Start Up");
    }

    private final Logger log = LoggerFactory.getLogger(PortalServletContainerInitializer.class);

}
