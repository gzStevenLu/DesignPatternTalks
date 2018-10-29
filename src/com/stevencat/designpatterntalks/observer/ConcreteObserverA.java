package com.stevencat.designpatterntalks.observer;

public class ConcreteObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("concreteObserverA was notified");
    }
}
