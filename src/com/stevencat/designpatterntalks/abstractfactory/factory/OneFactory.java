package com.stevencat.designpatterntalks.abstractfactory.factory;

import com.stevencat.designpatterntalks.abstractfactory.AbstractFactory;
import com.stevencat.designpatterntalks.abstractfactory.Bag;
import com.stevencat.designpatterntalks.abstractfactory.Phone;
import com.stevencat.designpatterntalks.abstractfactory.product.OneBag;
import com.stevencat.designpatterntalks.abstractfactory.product.OnePhone;

public class OneFactory implements AbstractFactory {

    @Override
    public Phone createPhone() {
        return new OnePhone();
    }

    @Override
    public Bag createBag() {
        return new OneBag();
    }
}
