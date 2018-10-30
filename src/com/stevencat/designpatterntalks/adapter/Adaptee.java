package com.stevencat.designpatterntalks.adapter;

public class Adaptee {

    /**
     * 原始方法
     *
     * @param one
     * @param two
     * @param three
     */
    public void oldMethod(String one, long two, double three) {
        System.out.println("old method process, params: " + one + ", " + two + ", " + three);
    }

}
