package homework3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutCalculatorMainTest {

    @Test
    public void testMain() {
        double expected = 140.459;
        double result = 4.1 + (15 * 7) + Math.pow((28.0 / 5), 2);
        assertEquals(expected, result, 0.001);
    }
}