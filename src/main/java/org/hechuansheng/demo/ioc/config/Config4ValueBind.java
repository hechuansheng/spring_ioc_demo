package org.hechuansheng.demo.ioc.config;

import org.hechuansheng.demo.ioc.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : hechuansheng
 * @date : 2021/4/19 14:52
 * @description :
 */
@PropertySource("/user.properties")
@Configuration
public class Config4ValueBind {

    @Bean
    public User user() {
        return new User();
    }

}
