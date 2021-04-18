package org.hechuansheng.demo.ioc.bean;

/**
 * @author : hechuansheng
 * @description : TODO
 * @date : 2021/4/18  16:21
 */

public class Address {

    private String country;

    private String city;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
