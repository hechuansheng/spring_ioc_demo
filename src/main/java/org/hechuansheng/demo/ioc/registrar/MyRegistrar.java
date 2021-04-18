package org.hechuansheng.demo.ioc.registrar;

import org.hechuansheng.demo.ioc.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author : hechuansheng
 * @description :
 * @date : 2021/4/18  21:00
 */
public class MyRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry,
                                        BeanNameGenerator importBeanNameGenerator) {
        if (registry.containsBeanDefinition("myApplication4TestImport")) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Person.class);
            registry.registerBeanDefinition("lisi", beanDefinition);
        }

    }
}
