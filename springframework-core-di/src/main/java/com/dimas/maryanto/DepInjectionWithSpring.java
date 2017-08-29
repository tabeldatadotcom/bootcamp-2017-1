package com.dimas.maryanto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepInjectionWithSpring {

    private String url;
    private String password;
    private String username;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return this.url + " " + this.password + " " + this.username;
    }

    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("spring-di.xml");
//        DepInjectionWithSpring obj = springContext.getBean(DepInjectionWithSpring.class);
//        System.out.println(obj.toString());

        OtherBean obj2 = springContext.getBean("otherBean", OtherBean.class);
        System.out.println(obj2.getId() + ", " + obj2.getSpringDi().toString());
    }
}
