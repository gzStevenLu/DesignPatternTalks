package com.stevencat.designpatterntalks.template;

public class CustomLogic extends AbstractLogic {

    /**
     * 子类只需实现私有逻辑
     */
    @Override
    protected void subLogic() {
        System.out.println("subLogic: do myself");
    }
}
