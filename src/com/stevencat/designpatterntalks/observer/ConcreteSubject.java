package com.stevencat.designpatterntalks.observer;

public class ConcreteSubject extends Subject {

    public void updateState() {
        // 更新内容后，通知观察者
        System.out.println("concreteSubject has updated state");
        notifyObservers();
    }

}
