package com.liferay.portal.boot.config;

import com.liferay.portal.cluster.EurekaJgroupsConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(EurekaJgroupsConfiguration.class)
@AutoConfigureBefore(value = { WebConfigurer.class})
public class JGroupsConfiguration {
}
