package com.stevencat.designpatterntalks.decorator;

public abstract class Clothing {

    private Clothing clothing;

    public void decorate(Clothing clothing) {
        this.clothing = clothing;
    }

    /**
     * 装饰方法，递归
     */
    public void show() {
        if (clothing != null) {
            clothing.show();
        }
        currentClothing();
    }

    protected abstract void currentClothing();

}
