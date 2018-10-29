package com.stevencat.designpatterntalks.abstractfactory.product;

import com.stevencat.designpatterntalks.abstractfactory.Phone;

public class MiPhone implements Phone {
    @Override
    public void show() {
        System.out.println("This is Mi Phone");
    }
}
