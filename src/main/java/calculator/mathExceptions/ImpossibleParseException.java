package calculator.mathExceptions;

public class ImpossibleParseException extends Exception {

    public ImpossibleParseException() {
        super("Невозможно обработать выражение. Неправильный ввод данных.");
    }
}
