package com.stevencat.designpatterntalks.observer;

import java.util.LinkedList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new LinkedList<>();
    }

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
