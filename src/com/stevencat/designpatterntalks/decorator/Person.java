package com.stevencat.designpatterntalks.decorator;

public class Person extends Clothing {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    protected void currentClothing() {
        System.out.println("I'm " + name + " decorating by:");
    }
}
