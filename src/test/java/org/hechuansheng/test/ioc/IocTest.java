package org.hechuansheng.test.ioc;

import org.hechuansheng.demo.ioc.MyApplication;
import org.hechuansheng.demo.ioc.MyApplication4TestImport;
import org.hechuansheng.demo.ioc.bean.Car;
import org.hechuansheng.demo.ioc.bean.Person;
import org.hechuansheng.demo.ioc.bean.User;
import org.hechuansheng.demo.ioc.config.*;
import org.hechuansheng.demo.ioc.controller.MyController;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Arrays;
import java.util.Map;

/**
 * @author : hechuansheng
 * @description : ioc 单元测试
 * @date : 2021/4/18  16:11
 */
public class IocTest {

    @Test
    public void testProfile() {
        //创建一个ApplicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //设置激活环境
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("dev", "test");

        //注册主配置类
        context.register(Config4Profile.class);
        //启动容器
        context.refresh();

        printBeanDefinitionNames(context);
    }

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
