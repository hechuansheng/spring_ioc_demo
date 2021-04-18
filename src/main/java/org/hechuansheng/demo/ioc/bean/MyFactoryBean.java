package org.hechuansheng.demo.ioc.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author : hechuansheng
 * @description : 实际注册的是Person， 和@Configuration+@Bean一起使用
 * @date : 2021/4/18  21:11
 */
public class MyFactoryBean implements FactoryBean<Person> {
    public Person getObject() {
        return new Person();
    }

    public Class<?> getObjectType() {
        return Person.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
