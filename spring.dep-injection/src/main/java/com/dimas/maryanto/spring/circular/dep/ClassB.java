package com.dimas.maryanto.spring.circular.dep;

public class ClassB {

    private ClassC c;

    public ClassC getC() {
        return c;
    }

    public void setC(ClassC c) {
        this.c = c;
    }
}
