package com.stevencat.designpatterntalks.builder;

public class Product {

    private String partA;

    private long partB;

    private double partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public long getPartB() {
        return partB;
    }

    public void setPartB(long partB) {
        this.partB = partB;
    }

    public double getPartC() {
        return partC;
    }

    public void setPartC(double partC) {
        this.partC = partC;
    }

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB=" + partB +
                ", partC=" + partC +
                '}';
    }
}
