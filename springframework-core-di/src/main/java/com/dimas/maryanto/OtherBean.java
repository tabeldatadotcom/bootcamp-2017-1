package com.dimas.maryanto;

public class OtherBean {

    public OtherBean() {
    }

    public OtherBean(Integer id, DepInjectionWithSpring springDi) {
        this.id = id;
        this.springDi = springDi;
    }

    private Integer id;
    private DepInjectionWithSpring springDi;

    public DepInjectionWithSpring getSpringDi() {
        return springDi;
    }

    public void setSpringDi(DepInjectionWithSpring springDi) {
        this.springDi = springDi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
