package homework3;
import org.junit.jupiter.api.Test;
import src.calcs.simple.CalculatorWithOperator;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorWithOperatorMainTest {

    @Test
    public void testCalculatorWithOperator() {
        CalculatorWithOperator calculator = new CalculatorWithOperator();

        double result = calculator.add(4.1, calculator.add(calculator.multiply(15, 7), calculator.power(calculator.divide(28,5), 2)));

        assertEquals(140.45999999999998, result, 0.0001); // проверяем, что результат равен 140.45999999999998 с погрешностью 0.0001
    }
}
