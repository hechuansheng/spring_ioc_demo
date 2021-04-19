package org.hechuansheng.demo.ioc.bean;

/**
 * @author : hechuansheng
 * @date : 2021/4/19 16:35
 * @description :
 */
public class DataSource {

    public DataSource(String profile) {
        this.profile = profile;
    }

    private String userName;

    private String host;

    private Integer port;

    private String profile;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
