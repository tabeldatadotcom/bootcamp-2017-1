package com.dimas.maryanto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//untuk di web @Controller
// untuk mengakes data @Repository
// untuk perhitungan @Service

// digunakan untuk configurasi2
@Component
public class AnnotationBean {

    private String id;
    private String name;
    private OtherBean otherBean;


    public String getId() {
        return id;
    }

    public void setId(@Value("DM") String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(@Value("Dimas") String name) {
        this.name = name;
    }

    public OtherBean getOtherBean() {
        return otherBean;
    }

    @Autowired
    @Qualifier("otherBean2")
    public void setOtherBean(OtherBean otherBean) {
        this.otherBean = otherBean;
    }

    public String getValue() {
        return "halo world" + otherBean.toString();
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.otherBean.toString();
    }
}
