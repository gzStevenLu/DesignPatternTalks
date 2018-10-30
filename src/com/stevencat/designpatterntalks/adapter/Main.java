package com.stevencat.designpatterntalks.adapter;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> params = new LinkedList<>();
        params.add("One");
        params.add("2");
        params.add("3.3");

        Target target = new Adapter();
        target.newMethod(params);
    }
}
