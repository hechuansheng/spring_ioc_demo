package org.hechuansheng.test.ioc;

import org.hechuansheng.demo.ioc.bean.Person;
import org.hechuansheng.demo.ioc.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author : hechuansheng
 * @description : TODO
 * @date : 2021/4/18  16:11
 */
public class IocTest {

    @Test
    public void configurationTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Map<String, Person> personMap = context.getBeansOfType(Person.class);

        System.out.println(personMap);

//        printBeanDefinitionNames(context);

    }

    private void printBeanDefinitionNames(AnnotationConfigApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
