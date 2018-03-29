package calculator.mathExceptions;

public class WrongOperandsException extends Exception{
    public WrongOperandsException() {
        super("Неверный ввод операнда математичиского выражения.");
    }
}
