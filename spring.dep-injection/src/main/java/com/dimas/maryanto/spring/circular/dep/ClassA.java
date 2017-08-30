package com.dimas.maryanto.spring.circular.dep;

public class ClassA {

    private ClassB b;

    public ClassB getB() {
        return b;
    }

    public void setB(ClassB b) {
        this.b = b;
    }
}
