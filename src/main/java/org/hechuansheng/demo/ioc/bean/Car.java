package org.hechuansheng.demo.ioc.bean;

/**
 * @author : hechuansheng
 * @description :
 * @date : 2021/4/18  21:33
 */
public class Car {

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void init() {
        System.out.println("---------------------------------Car.init......");
    }

    public void destroy() {
        System.out.println("---------------------------------Car.destroy......");
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
