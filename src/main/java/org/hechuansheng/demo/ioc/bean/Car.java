package org.hechuansheng.demo.ioc.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author : hechuansheng
 * @description :
 * @date : 2021/4/18  21:33
 */
public class Car implements InitializingBean, DisposableBean, BeanPostProcessor {

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void initMethod() {
        System.out.println("---------------------------------Car.initMethod......");
    }

    public void destroyMethod() {
        System.out.println("---------------------------------Car.destroyMethod......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("---------------------------------Car.afterPropertiesSet......");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("---------------------------------Car.destroy......");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("---------------------------------Car.preDestroy......");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("---------------------------------Car.postConstruct......");
    }

    @Override
    //todo
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("---------------------------------Car.postProcessBeforeInitialization......");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("---------------------------------Car.postProcessAfterInitialization......");
        return bean;
    }

    private String brand;

    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
