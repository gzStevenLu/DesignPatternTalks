package com.stevencat.designpatterntalks.adapter;

import java.util.List;

public interface Target {

    /**
     * 目标方法
     *
     * @param list
     */
    void newMethod(List<String> list);

}
