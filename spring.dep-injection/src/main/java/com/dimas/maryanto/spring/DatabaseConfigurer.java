package com.dimas.maryanto.spring;

import com.dimas.maryanto.spring.circular.dep.ClassA;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DatabaseConfigurer implements ApplicationContextAware {

    private ApplicationContext springContext;

    //    construktor injection
    public DatabaseConfigurer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    //    settter injection
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showOtherBean() {
        ClassA bean = springContext.getBean(ClassA.class);
        System.out.println(new StringBuilder("adakah intances object dari classA : ").append(bean != null));
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.springContext = applicationContext;
    }
}
