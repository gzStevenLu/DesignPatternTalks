package com.stevencat.designpatterntalks.factory;

public class ChinesePrefixLogger implements Logger {
    @Override
    public void info(String msg) {
        System.out.println("中文前缀：" + msg);
    }
}
