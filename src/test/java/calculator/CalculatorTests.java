package calculator;

import calculator.mathExceptions.UnknownOperationException;
import calculator.mathExceptions.WrongOperandsException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


//Data provider
public class CalculatorTests {
    private Calculator calculator;

    @Before
    public void setUp(){
        System.out.println("Before each test");
        calculator = new Calculator();
    }

    @After
    public void tearDown(){
        System.out.println("After each test");
        calculator=null;
    }

    @Test
    public void shouldAddTwoPositiveNumbers() throws UnknownOperationException{
        double a = 4;
        double b = 10;
        String addition = "+";
        double result = calculator.calculate(a,b,addition);
        assertThat(result).isEqualTo(14);
    }

    @Test
    public void shouldThrowExceptionIfOperationIsWrong(){
        double a = 4;
        double b = 10;
        String operation = "asfd";
        assertThatThrownBy(()->calculator.calculate(a,b,operation)).isInstanceOf(UnknownOperationException.class);
    }

}
