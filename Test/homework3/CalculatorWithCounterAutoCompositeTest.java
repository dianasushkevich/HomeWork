package homework3;

import org.junit.jupiter.api.Test;
import src.calcs.additional.CalculatorWithCounterAutoComposite;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterAutoCompositeTest {
    @Test
    public void testDivide() {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        double result = calculator.divide(10.0, 5.0);
        assertEquals(2.0, result, 0);
        assertEquals(1, calculator.getCountOperation());
    }

    @Test
    public void testSubtract() {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        double result = calculator.subtract(8.0, 4.0);
        assertEquals(4.0, result, 0);
        assertEquals(1, calculator.getCountOperation());
    }


    @Test
    public void testAbsolute() {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        double result = calculator.absolute(-5.0);
        assertEquals(5.0, result, 0);
        assertEquals(1, calculator.getCountOperation());
    }
}
