package com.liferay.portal.kernel.spring.util;


import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.core.io.Resource;
import org.w3c.dom.Document;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * Ensures that any beans registered using this reader have a lower precedence than any beans defined in {@literal @}Configuration
 * classes, which otherwise have a lesser /priority than XML resources. This should be used anywhere that Broadleaf framework beans
 * are registered via XML to allow bean overriding in userland {@literal @}Configuration classes.
 *
 * <p>
 * Note: this is a stop-gap measure as a pre-cursor to removing any relience on bean id overriding, which is officially an unsupported
 * feature in Spring.
 *
 * @author Jeff Fischer
 * @author Phillip Verheyden (phillipuniverse)
 */
public class PortalXmlBeanDefinitionReader extends MergeXmlBeanDefinitionReader {

    public PortalXmlBeanDefinitionReader(BeanDefinitionRegistry registry) {
        super(registry);
    }

    @Override
    public int registerBeanDefinitions(Document doc, Resource resource) throws BeanDefinitionStoreException {
        // First compile any @Bean definitions that have already been registered via @Configuration classes (which happen prior
        // to the XML bean definition import).
        Map<String, BeanDefinition> implementationBeanDefinitions = new HashMap<>();
        for (String name : getRegistry().getBeanDefinitionNames()) {
            BeanDefinition definition = getRegistry().getBeanDefinition(name);

            if (isConfigurationClassBean(definition)) {
                implementationBeanDefinitions.put(name, definition);
            }
        }

        // Now register the bean definitions in this XML file, which overrides any bean definitions defined previously
        int processedCount = super.registerBeanDefinitions(doc, resource);

        // Now mark framework xml beans with ROLE_SUPPORT so that later configuration class beans can override them.
        for (String beanName : getRegistry().getBeanDefinitionNames()) {
            BeanDefinition beanDefinition = getRegistry().getBeanDefinition(beanName);
            if (isXMLBean(beanDefinition)) {
                ((GenericBeanDefinition) beanDefinition).setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
                beanDefinition.setPrimary(true);
                //beanDefinition.setLazyInit(false);
            }
            beanDefinition.setLazyInit(false);
        }



        // Now that all beans in this XML file (and any <import>s from this XML file) have been registered, go ahead and re-apply
        // the ones that were defined _prior_ to importing this XML file, which actualy registers the same beans a 3rd time.
        // But, since we are registering these beans at the Framework level, anything defined previously should take precedence
        for (Map.Entry<String, BeanDefinition> entry : implementationBeanDefinitions.entrySet()) {
            BeanDefinition registeredBeanDefinition = getRegistry().getBeanDefinition(entry.getKey());
            if (registeredBeanDefinition == null || !Objects.equals(registeredBeanDefinition, entry.getValue())) {
                getRegistry().registerBeanDefinition(entry.getKey(), entry.getValue());
            }
        }

        return processedCount;
    }

    protected boolean isConfigurationClassBean(BeanDefinition definition) {
        // there is a somewhat loose assumption here that anything that is not a GenericBeanDefinition
        // is actually a ConfigurationClassBeanDefinition. I can't use ConfigurationClassBeanDefinition here
        // directly (which would be ideal) because it's a private class defined within org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader
        return !(definition instanceof GenericBeanDefinition);
    }

}