package com.stevencat.designpatterntalks.state;

public interface State {

    /**
     * 状态相关操作
     */
    void handle(Context context, boolean change);
}
