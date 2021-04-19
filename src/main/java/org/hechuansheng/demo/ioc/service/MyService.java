package org.hechuansheng.demo.ioc.service;

import org.hechuansheng.demo.ioc.bean.Person;
import org.hechuansheng.demo.ioc.bean.User;
import org.hechuansheng.demo.ioc.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * 1.@Autowired
 *      1） 默认根据类型查找
 *      2） 如果存在多个，根据属性名查找
 *      3） @Qualifier()，装配组件的ID，不使用属性名
 *      4） required=false，找不到则不装配
 *      5） @Primary注册主键时标识设定首选bean，装配是优先使用，和@Qualifier()都有时还是通过@Qualifier()指定
 * 2.@Resource
 *      1） 默认使用组件名进行装配
 *      2） 不支持@Primary，required=false
 * 3.@Inject
 *      1） 不支持required=false
 * @author : hechuansheng
 * @description 自动装配-依赖关系赋值
 * @date : 2021/4/18  16:11
 */
@Service
public class MyService {

    @Autowired(required=false)
    @Qualifier("myRepository")
    private MyRepository repository;

    @Resource
    private User user;

    @Inject
    private Person person;
}
