package org.hechuansheng.demo.ioc.config;

import org.hechuansheng.demo.ioc.bean.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author : hechuansheng
 * @date : 2021/4/19 16:31
 * @description :
 */
@Configuration
public class Config4Profile {

    @Bean
    @Profile("dev")
    public DataSource devDataSource() {
        return new DataSource("dev");
    }

    @Bean
    @Profile("test")
    public DataSource testDataSource() {
        return new DataSource("test");
    }

    @Bean
    @Profile("prod")
    public DataSource prodDataSource() {
        return new DataSource("prod");
    }

}
