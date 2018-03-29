package calculator;

public class SquareRoot implements BinaryOperation{
    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left,1.0/right);
    }
}