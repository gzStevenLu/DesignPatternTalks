package com.stevencat.designpatterntalks.factory;

public class EnglishPrefixLogger implements Logger {
    @Override
    public void info(String msg) {
        System.out.println("English prefix：" + msg);
    }
}
