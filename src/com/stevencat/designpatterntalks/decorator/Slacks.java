package com.stevencat.designpatterntalks.decorator;

public class Slacks extends Clothing {
    @Override
    protected void currentClothing() {
        System.out.println(" slacks ");
    }
}
