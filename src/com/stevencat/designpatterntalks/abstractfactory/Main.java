package com.stevencat.designpatterntalks.abstractfactory;

import com.stevencat.designpatterntalks.abstractfactory.factory.MiFactory;
import com.stevencat.designpatterntalks.abstractfactory.factory.OneFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new MiFactory();
        Phone phone = factory.createPhone();
        phone.show();

        factory = new OneFactory();
        Bag bag = factory.createBag();
        bag.show();
    }
}
