public class Calculator {

    public static void main(String[] args) {
        double a = 1.2, b = 3.4;
        String operator = "+";

        Operation operation = OperationFactory.getOperation(operator);
        if (null == operation) {
            System.out.println("Wrong operator!");
            return;
        }

        operation.setA(a);
        operation.setB(b);
        double result = operation.getResult();
        System.out.println("Result: " + result);
    }

}
