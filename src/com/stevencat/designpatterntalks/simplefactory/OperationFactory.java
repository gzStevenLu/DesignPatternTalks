package com.stevencat.designpatterntalks.simplefactory;

public class OperationFactory {

    public static Operation getOperation(String oper) {
        switch (oper) {
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
            default:
                return null;
        }
    }

}
