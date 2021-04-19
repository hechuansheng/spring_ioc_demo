package org.hechuansheng.demo.ioc.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author: hechuansheng
 * @Date: 2021/4/19 14:16
 * @Description:
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("-------------MyBeanPostProcessor.postProcessBeforeInitialization......" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("-------------MyBeanPostProcessor.postProcessAfterInitialization......" + beanName);
        return bean;
    }
}

