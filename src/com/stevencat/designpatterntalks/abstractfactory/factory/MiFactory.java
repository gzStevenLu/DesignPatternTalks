package com.stevencat.designpatterntalks.abstractfactory.factory;

import com.stevencat.designpatterntalks.abstractfactory.AbstractFactory;
import com.stevencat.designpatterntalks.abstractfactory.Bag;
import com.stevencat.designpatterntalks.abstractfactory.Phone;
import com.stevencat.designpatterntalks.abstractfactory.product.MiBag;
import com.stevencat.designpatterntalks.abstractfactory.product.MiPhone;

public class MiFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    @Override
    public Bag createBag() {
        return new MiBag();
    }
}
