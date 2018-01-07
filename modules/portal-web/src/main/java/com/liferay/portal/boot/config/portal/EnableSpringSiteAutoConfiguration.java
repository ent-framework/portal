package com.liferay.portal.boot.config.portal;

import com.liferay.portal.kernel.spring.util.PortalXmlBeanDefinitionReader;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import com.liferay.portal.boot.config.portal.EnableSpringSiteAutoConfiguration.PortalSpringConfiguration;
import org.springframework.context.annotation.Lazy;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({
	PortalSpringConfiguration.class
})
@Lazy(false)
public @interface EnableSpringSiteAutoConfiguration {

    @Lazy(false)
	@ImportResource(value = {
		"classpath:/META-INF/portal-spring-config.xml",
		"classpath*:/META-INF/ext-spring.xml"
		}, reader = PortalXmlBeanDefinitionReader.class)
    class PortalSpringConfiguration {}
}
