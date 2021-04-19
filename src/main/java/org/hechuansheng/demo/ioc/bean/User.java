package org.hechuansheng.demo.ioc.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author : hechuansheng
 * @date : 2021/4/19 14:43
 * @description :
 */
public class User {
    @Value("王五")
    private String userName;

    @Value("${user.password}")
    private String password;

    @Value("#{1-1}")
    private Integer sex;

    private Address address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", address=" + address +
                '}';
    }
}
