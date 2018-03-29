package calculator;

public class Addition implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return left + right;
    }
}
