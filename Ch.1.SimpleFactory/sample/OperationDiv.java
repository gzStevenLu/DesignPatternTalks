public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (Math.abs(b - 0) < 1E-9) {
            throw new RuntimeException("除数不能为0");
        }
        return a / b;
    }
}
