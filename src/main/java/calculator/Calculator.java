package calculator;


import calculator.mathExceptions.ImpossibleParseException;
import calculator.mathExceptions.UnknownOperationException;
import calculator.mathExceptions.WrongOperandsException;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Calculator {
    private Scanner sc = new Scanner(System.in);
    private BinaryOperation operation;
    private double leftOperand;
    private double rightOperand;
    private String operator;
    private final static String patternForOperands = "[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?";

    public void checkUserInput() throws WrongOperandsException, ImpossibleParseException {
        String inputString = sc.nextLine();
        String[] mas = inputString.split(" ");
        if (mas.length == 3) {
            if (mas[0].matches(patternForOperands) && mas[2].matches(patternForOperands)) {
                leftOperand = parseDouble(mas[0]);
                rightOperand = parseDouble(mas[2]);
            } else {
                throw new WrongOperandsException();
            }
            operator = mas[1];
        } else throw new ImpossibleParseException();
    }

    public void calculate() throws UnknownOperationException {
        operation = getOperationFor(operator);
        double result = operation.resultFor(leftOperand, rightOperand);
        System.out.println(leftOperand + " " + operator + " " + rightOperand + " = " + result);
    }


    private BinaryOperation getOperationFor(String operator) throws UnknownOperationException {
        if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("-".equals(operator)) {
            return new Subtraction();
        } else if ("+".equals(operator)) {
            return new Addition();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("log".equals(operator)) {
            return new BaseLogarithm();
        } else if ("sqrt".equals(operator)) {
            return new SquareRoot();
        } else if ("^".equals(operator)) {
            return new Exponentiation();
        }
        throw new UnknownOperationException();
    }


}
