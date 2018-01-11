package com.liferay.portal.boot.config.portal;

import com.liferay.portal.boot.config.portal.EnableSpringSiteAutoConfiguration.PortalSpringConfiguration;
import com.liferay.portal.kernel.spring.util.PortalXmlBeanDefinitionReader;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({
    PortalSpringConfiguration.class
})
public @interface EnableSpringSiteAutoConfiguration {

    @ImportResource(value = {
        "classpath:/META-INF/portal-spring-config.xml",
        "classpath*:/META-INF/ext-spring.xml"
    }, reader = PortalXmlBeanDefinitionReader.class)
    class PortalSpringConfiguration {
    }
}
