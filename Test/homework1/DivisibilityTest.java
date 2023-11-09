package homework1;
import org.junit.jupiter.api.Test;
import src.Divisibility;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DivisibilityTest {

    @Test
    public void testIsDivisible() {
        // Arrange
        int dividend1 = 15;
        int divisor1 = 3;
        int dividend2 = 17;
        int divisor2 = 5;

        // Act
        boolean result1 = Divisibility.isDivisible(dividend1, divisor1);
        boolean result2 = Divisibility.isDivisible(dividend2, divisor2);

        // Assert
        assertTrue(result1);
        assertFalse(result2);
    }
}