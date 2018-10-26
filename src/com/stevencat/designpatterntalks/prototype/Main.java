package com.stevencat.designpatterntalks.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> writers = new ArrayList<>(3);
        writers.add("Allen");
        writers.add("Bob");
        writers.add("Clack");

        Article a = new Article("文章1", writers, "天气真好！", System.currentTimeMillis());
        Article b = a.clone();

        System.out.println("a == b ? " + (a == b));
        System.out.println("a.writers == b.writers ? " + (a.getWriters() == b.getWriters()));
    }

}
