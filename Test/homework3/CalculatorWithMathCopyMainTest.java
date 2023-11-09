package homework3;
import org.junit.jupiter.api.Test;
import src.calcs.simple.CalculatorWithMathCopy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithMathCopyMainTest {

    @Test
    public void testCalculatorWithMathCopy() {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        double expected = 120.3;
        double actual = calculator.add(
                calculator.add(4.1, calculator.multiply(15, 7)),
                calculator.multiply(calculator.divide(28, 5), 2)
        );

        assertEquals(expected, actual, 0.0001);
    }
}