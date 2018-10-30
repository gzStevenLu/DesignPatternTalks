package com.stevencat.designpatterntalks.state;

public class StateB implements State {
    @Override
    public void handle(Context context, boolean change) {
        System.out.println("It's state B");
        if (change) {
            System.out.println("Change to state A");
            context.setState(new StateB());
        }
    }
}
