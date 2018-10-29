package com.stevencat.designpatterntalks.abstractfactory.product;

import com.stevencat.designpatterntalks.abstractfactory.Phone;

public class OnePhone implements Phone {
    @Override
    public void show() {
        System.out.println("This is OnePlus Phone");
    }
}
