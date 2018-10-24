package com.stevencat.designpatterntalks.simplefactory;

/**
 * 运算抽象类
 */
public abstract class Operation {

    protected double a;
    protected double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    /**
     * 运算结果
     * @return
     */
    public abstract double getResult();
}
