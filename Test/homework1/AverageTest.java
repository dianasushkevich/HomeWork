package homework1;
import org.junit.jupiter.api.Test;
import src.Average;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageTest {

    @Test
    public void testCalculateAverage() {
        // Arrange
        int num1 = 5;
        int num2 = 9;
        int num3 = 12;

        // Act
        double average = Average.calculateAverage(num1, num2, num3);

        // Assert
        assertEquals(8.666666666666666, average, 0.00001);
    }
}