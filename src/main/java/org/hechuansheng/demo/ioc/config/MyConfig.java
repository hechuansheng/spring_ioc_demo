package org.hechuansheng.demo.ioc.config;

import org.hechuansheng.demo.ioc.bean.Address;
import org.hechuansheng.demo.ioc.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 使用@Configuration+@Bean注册组件
 *
 * @author : hechuansheng
 * @description : IOC容器组件注册
 * @date : 2021/4/18  16:11
 */

@Configuration
public class MyConfig {

    @Bean("zhangsan")
//    @Autowired //可省略
    public Person person(
            @Autowired //可省略
                     Address address) {
        Person zhangSan = new Person("张三", 22);
        zhangSan.setAddress(address);
        return zhangSan;
    }

    @Bean
    public Address guiyang() {
        Address address = new Address();
        address.setCity("guiyang");
        address.setCountry("China");
        return address;
    }
}
