package com.stevencat.designpatterntalks.factory;

public class Main {

    public static void main(String[] args) {
        // 中文工厂，中文前缀
        LogFactory factory = new ChineseLoggerFactory();
        Logger logger = factory.createLogger();
        logger.info("hello world");

        // 替换为英文工厂，英文前缀
        factory = new EnglishLoggerFactory();
        logger = factory.createLogger();
        logger.info("hello world");
    }
}
