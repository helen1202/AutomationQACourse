package calculator;

public class BaseLogarithm implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.log(left) / Math.log(right);
    }
}