package com.stevencat.designpatterntalks.state;

public class Context {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 将业务逻辑与交给状态类进行处理
     *
     * @param change
     */
    public void request(boolean change) {
        state.handle(this, change);
    }
}
