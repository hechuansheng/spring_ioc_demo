package org.hechuansheng.test.ioc;

import org.hechuansheng.demo.ioc.MyApplication;
import org.hechuansheng.demo.ioc.MyApplication4TestImport;
import org.hechuansheng.demo.ioc.bean.Car;
import org.hechuansheng.demo.ioc.bean.Person;
import org.hechuansheng.demo.ioc.bean.User;
import org.hechuansheng.demo.ioc.config.Config4Autowired;
import org.hechuansheng.demo.ioc.config.Config4LifeCycle;
import org.hechuansheng.demo.ioc.config.Config4ValueBind;
import org.hechuansheng.demo.ioc.config.MyConfig;
import org.hechuansheng.demo.ioc.controller.MyController;
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
    public void testAutowired() {
        System.out.println("》》》》》》》》》》》》》testAutowired《《《《《《《《《《《《《《《");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config4Autowired.class);

        MyController controller = context.getBean(MyController.class);

        controller.printService();
    }

    @Test
    public void testValueBind() {
        System.out.println("》》》》》》》》》》》》》testValueBind《《《《《《《《《《《《《《《");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config4ValueBind.class);

        User user = context.getBean(User.class);

        System.out.println(user);
    }

    @Test
    public void testBeanLifeCycle() {
        System.out.println("》》》》》》》》》》》》》testBeanLifeCycle《《《《《《《《《《《《《《《");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config4LifeCycle.class);

        printBeanDefinitionNames(context);
        context.close();
    }

    @Test
    public void testImport() {
        System.out.println("》》》》》》》》》》》》》testImport《《《《《《《《《《《《《《《");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplication4TestImport.class);

        printBeanDefinitionNames(context);
    }

    @Test
    public void testComponentScan() {
        System.out.println("》》》》》》》》》》》》》testComponentScan《《《《《《《《《《《《《《《");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplication.class);

        printBeanDefinitionNames(context);
    }

    @Test
    public void testConfiguration() {
        System.out.println("》》》》》》》》》》》》》testConfiguration《《《《《《《《《《《《《《《");
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
