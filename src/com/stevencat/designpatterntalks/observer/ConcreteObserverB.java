package com.stevencat.designpatterntalks.observer;

public class ConcreteObserverB implements Observer {
    @Override
    public void update() {
        System.out.println("concreteObserverB was notified");
    }
}
