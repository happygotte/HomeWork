package home_work_3.tests;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathCopyTests {

    CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

    @Test
    public void sum() {
        Assertions.assertEquals(109.1, calc.sum(4.1, 105));
    }

    @Test
    public void subtract() {
        Assertions.assertEquals(-100.9, calc.subtract(4.1, 105));
    }

    @Test
    public void division() {
        Assertions.assertEquals(5.6, calc.division(28, 5));
    }

    @Test
    public void power() {
        Assertions.assertEquals(31.359999999999996, calc.power(5.6, 2));
    }

    @Test
    public void absoluteValue() {
        Assertions.assertEquals(8, calc.absoluteValue(-8));
    }

    @Test
    public void squareRoot() {
        Assertions.assertEquals(12, calc.squareRoot(144));
    }
}
