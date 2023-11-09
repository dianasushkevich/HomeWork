package homework3;
import org.junit.jupiter.api.Test;
import src.calcs.additional.CalculatorWithCounterClassic;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorWithCounterClassicMainTest {

    @Test
    public void testCalculatorWithCounterClassic() {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double result = calculator.add(4.1, calculator.add(calculator.multiply(15, 7),
                calculator.multiply(calculator.divide(28, 5), 2)));

        for (int i = 0; i < 6; i++) {
            calculator.incrementCountOperation();
        }

        assertEquals(120.3, result);
        assertEquals(11, calculator.getCountOperation());
    }
}