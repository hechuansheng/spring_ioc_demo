package org.hechuansheng.test.ioc;

import org.hechuansheng.demo.ioc.MyApplication;
import org.hechuansheng.demo.ioc.MyApplication4TestImport;
import org.hechuansheng.demo.ioc.bean.Car;
import org.hechuansheng.demo.ioc.bean.Person;
import org.hechuansheng.demo.ioc.config.Config4LifeCycle;
import org.hechuansheng.demo.ioc.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author : hechuansheng
 * @description : ioc 单元测试
 * @date : 2021/4/18  16:11
 */
public class IocTest {

    @Test
    public void testBeanLifeCycle() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config4LifeCycle.class);

        printBeanDefinitionNames(context);
        context.close();
    }

    @Test
    public void testImport() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplication4TestImport.class);

        printBeanDefinitionNames(context);
    }

    @Test
    public void testComponentScan() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplication.class);

        printBeanDefinitionNames(context);
    }

    @Test
    public void testConfiguration() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Map<String, Person> personMap = context.getBeansOfType(Person.class);

        System.out.println(personMap);

        printBeanDefinitionNames(context);

    }

    private void printBeanDefinitionNames(AnnotationConfigApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
