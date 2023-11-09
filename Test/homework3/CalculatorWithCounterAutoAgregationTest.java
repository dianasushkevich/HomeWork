package homework3;
import org.junit.jupiter.api.Test;
import src.calcs.additional.CalculatorWithCounterAutoAgregation;
import src.calcs.simple.CalculatorWithMathCopy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterAutoAgregationTest {
    @Test
    public void testPower_IncrementsCountOperation() {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation counter = new CalculatorWithCounterAutoAgregation(calculator);

        double result = counter.power(2, 3);

        assertEquals(1, counter.getCountOperation());
    }
    @Test
    public void testAdd_IncrementsCountOperation() {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation counter = new CalculatorWithCounterAutoAgregation(calculator);

        double result = counter.add(2, 2);

        assertEquals(1, counter.getCountOperation());
    }
    @Test
    public void testSubtract_IncrementsCountOperation() {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation counter = new CalculatorWithCounterAutoAgregation(calculator);

        double result = counter.subtract(10, 3);

        assertEquals(1, counter.getCountOperation());
    }
    @Test
    public void testMultiply_IncrementsCountOperation() {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation counter = new CalculatorWithCounterAutoAgregation(calculator);

        double result = counter.multiply(5, 5);

        assertEquals(1, counter.getCountOperation());
    }
    @Test
    public void testDivide_IncrementsCountOperation() {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregation counter = new CalculatorWithCounterAutoAgregation(calculator);

        double result = counter.divide(10, 2);

        assertEquals(1, counter.getCountOperation());
    }
}