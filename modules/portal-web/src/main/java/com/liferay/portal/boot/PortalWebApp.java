package com.liferay.portal.boot;

import com.liferay.portal.boot.config.ApplicationProperties;
import com.liferay.portal.boot.config.DefaultProfileUtil;
import com.liferay.portal.boot.config.portal.EnableSpringSiteAutoConfiguration;
import com.liferay.portal.boot.config.portal.PortalApplicationContextInitializer;
import com.liferay.portal.spring.transaction.AnnotationTransactionAttributeSource;
import com.liferay.portal.util.InitUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.EndpointMBeanExportAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.MetricFilterAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.MetricRepositoryAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.hazelcast.HazelcastAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionAttributeSource;

import java.net.InetAddress;
import java.net.UnknownHostException;

//@ComponentScan
@EnableAutoConfiguration(exclude = {MetricFilterAutoConfiguration.class, MetricRepositoryAutoConfiguration.class,
    HazelcastAutoConfiguration.class, SecurityAutoConfiguration.class, FreeMarkerAutoConfiguration.class,
    DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class, TransactionAutoConfiguration.class,
    //WebMvcAutoConfiguration.class,
    EndpointMBeanExportAutoConfiguration.class
})
//@EnableConfigurationProperties({LiquibaseProperties.class, ApplicationProperties.class})
@SpringBootApplication
public class PortalWebApp {

    private static final Logger log = LoggerFactory.getLogger(PortalWebApp.class);

    private final Environment env;

    public PortalWebApp(Environment env) {
        this.env = env;
    }

    @Configuration
    @EnableSpringSiteAutoConfiguration
    public class PortlSpringConfiguration {}

    /**
     * Main method, used to run the application.
     *
     * @param args the command line arguments
     * @throws UnknownHostException if the local host name could not be resolved into an address
     */
    public static void main(String[] args) throws UnknownHostException {
        InitUtil.init();

        SpringApplication app = new SpringApplication(PortalWebApp.class);
        DefaultProfileUtil.addDefaultProfile(app);
        app.addInitializers(new PortalApplicationContextInitializer());
        Environment env = app.run(args).getEnvironment();
        String protocol = "http";
        if (env.getProperty("server.ssl.key-store") != null) {
            protocol = "https";
        }
        log.info("\n----------------------------------------------------------\n\t" +
                "Application '{}' is running! Access URLs:\n\t" +
                "Local: \t\t{}://localhost:{}\n\t" +
                "External: \t{}://{}:{}\n\t" +
                "Profile(s): \t{}\n----------------------------------------------------------",
            env.getProperty("spring.application.name"),
            protocol,
            env.getProperty("server.port"),
            protocol,
            InetAddress.getLocalHost().getHostAddress(),
            env.getProperty("server.port"),
            env.getActiveProfiles());
    }
}
