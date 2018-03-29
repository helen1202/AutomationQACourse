package calculator;

public class Subtraction implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return left - right;
    }
}
