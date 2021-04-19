package org.hechuansheng.demo.ioc.config;

import org.hechuansheng.demo.ioc.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author : hechuansheng
 * @description : bean的生命周期
 * @date : 2021/4/18  21:32
 */
@Configuration
@ComponentScan("org.hechuansheng.demo.ioc.processor")
public class Config4LifeCycle {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    /* 单实例bean容器创建的时候执行初始化，容器关闭销毁bean
     * 多实例bean创建bean的时候执行初始化，容器不会销毁bean，需手动销毁
     */
//    @Scope("prototype")
    public Car car() {
        return new Car("VW", 11.2);
    }

}
