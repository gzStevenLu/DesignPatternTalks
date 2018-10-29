package com.stevencat.designpatterntalks.abstractfactory.product;

import com.stevencat.designpatterntalks.abstractfactory.Bag;

public class MiBag implements Bag {
    @Override
    public void show() {
        System.out.println("Here is Mi Bag");
    }
}
