package com.stevencat.designpatterntalks.template;

public abstract class AbstractLogic {

    /**
     * 主逻辑
     * 重复出现的逻辑，可抽象为模板
     */
    public void mainLogic() {
        System.out.println("mainLogic: do something template");
        subLogic();
    }

    /**
     * 子类逻辑
     */
    protected abstract void subLogic();

}
