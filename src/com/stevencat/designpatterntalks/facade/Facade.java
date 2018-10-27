package com.stevencat.designpatterntalks.facade;

public class Facade {

    private SubSystemA subSystemA;
    private SubSystemB subSystemB;

    public Facade() {
        subSystemA = new SubSystemA();
        subSystemB = new SubSystemB();
    }

    public void wrapMethod() {
        subSystemA.methodA();
        subSystemB.methodB();
        System.out.println("Facade is an encapsulation");
    }
}
