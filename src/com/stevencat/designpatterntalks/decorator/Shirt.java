package com.stevencat.designpatterntalks.decorator;

public class Shirt extends Clothing {

    @Override
    protected void currentClothing() {
        System.out.println(" T-shirt ");
    }
}
