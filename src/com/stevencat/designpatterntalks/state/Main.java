package com.stevencat.designpatterntalks.state;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new StateA());

        context.request(true);
        context.request(false);
        context.request(true);
    }
}
