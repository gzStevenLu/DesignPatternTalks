package com.stevencat.designpatterntalks.factory;

public class EnglishLoggerFactory implements LogFactory {
    @Override
    public Logger createLogger() {
        return new EnglishPrefixLogger();
    }
}
