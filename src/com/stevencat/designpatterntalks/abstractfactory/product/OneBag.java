package com.stevencat.designpatterntalks.abstractfactory.product;

import com.stevencat.designpatterntalks.abstractfactory.Bag;

public class OneBag implements Bag {
    @Override
    public void show() {
        System.out.println("Here is OnePlus Bag");
    }
}
