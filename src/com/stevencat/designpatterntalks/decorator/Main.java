package com.stevencat.designpatterntalks.decorator;

public class Main {

    public static void main(String[] args) {
        // ConcreteComponent
        Person person = new Person("Jobs");

        // Decorators
        Shirt shirt = new Shirt();
        Slacks slacks = new Slacks();

        // Decorate component
        shirt.decorate(person);
        slacks.decorate(shirt);
        slacks.show();
    }
}
