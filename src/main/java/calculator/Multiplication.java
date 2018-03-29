package calculator;

public class Multiplication implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return left * right;
    }
}
