package com.liferay.portal.boot.config;


import com.liferay.portal.boot.gateway.accesscontrol.AccessControlFilter;
import com.liferay.portal.kernel.config.LiferayPortalProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {


    @Configuration
    public static class AccessControlFilterConfiguration {

        @Bean
        public AccessControlFilter accessControlFilter(RouteLocator routeLocator, LiferayPortalProperties liferayPortalProperties){
            return new AccessControlFilter(routeLocator, liferayPortalProperties);
        }
    }
}
