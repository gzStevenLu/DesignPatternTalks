package com.stevencat.designpatterntalks.factory;

public class ChineseLoggerFactory implements LogFactory {
    @Override
    public Logger createLogger() {
        return new ChinesePrefixLogger();
    }
}
