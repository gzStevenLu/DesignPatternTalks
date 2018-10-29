package com.stevencat.designpatterntalks.observer;

public class Main {

    public static void main(String[] args) {
        ConcreteObserverA a = new ConcreteObserverA();
        ConcreteObserverB b = new ConcreteObserverB();

        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(a);
        subject.attach(b);

        subject.updateState();
    }

}
