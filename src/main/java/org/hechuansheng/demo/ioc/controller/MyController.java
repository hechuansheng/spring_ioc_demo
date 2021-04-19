package org.hechuansheng.demo.ioc.controller;

import org.hechuansheng.demo.ioc.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 1.标注在属性上
 * 2.标注在构造器/构造器方法参数上
 *      ·若有且只有一个有参构造器，可以省略
 * 3.标注在方法上
 * 4.标注在@Bean方法中的方法参数上
 *      ·可以省略
 * @author : hechuansheng
 * @description : @Autowired标在实现自动注入
 * @date : 2021/4/18  16:11
 */
@Controller
public class MyController {

//    @Autowired
    private MyService myService;

//    public MyController() {
//
//    }

    //标注在构造器上，若这个组件有且只有一个有参构造器，可以省略
//    @Autowired
    public MyController(
            //@Autowired
                    MyService myService) {
        this.myService = myService;
    }

//    @Autowired
//    public void setMyService(MyService myService) {
//        this.myService = myService;
//    }

    public void printService() {
        System.out.println(myService);
    }

}
