package org.hechuansheng.demo.ioc.config;

import org.hechuansheng.demo.ioc.bean.Person;
import org.hechuansheng.demo.ioc.bean.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author : hechuansheng
 * @date : 2021/4/19 15:46
 * @description :
 */
@Configuration
@ComponentScan(value = "org.hechuansheng.demo.ioc", useDefaultFilters = false,
            includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {
                    Controller.class, Service.class, Repository.class
            }), @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
                    Person.class, User.class
            })})
public class Config4Autowired {

}
