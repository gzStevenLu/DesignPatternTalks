package com.stevencat.designpatterntalks.state;

public class StateA implements State {
    @Override
    public void handle(Context context, boolean change) {
        System.out.println("It's state A");
        if (change) {
            System.out.println("Change to state B");
            context.setState(new StateB());
        }
    }
}
