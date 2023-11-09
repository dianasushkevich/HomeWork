package homework2;


import org.junit.jupiter.api.Test;
import src.loops.Task1_1;

import static org.junit.jupiter.api.Assertions.*;

public class Task1_1Test {

    @Test
    public void testMultiplyNumbers() {
        long n = 5;
        long expected = 120;
        long result = Task1_1.multiplyNumbers(n);
        assertEquals(expected, result);
    }

    @Test
    public void testMultiplyNumbersWithZero() {
        long n = 0;
        long expected = 1;
        long result = Task1_1.multiplyNumbers(n);
        assertEquals(expected, result);
    }

    @Test
    public void testMultiplyNumbersWithNegative() {
        long n = -5;
        long expected = 1;
        long result = Task1_1.multiplyNumbers(n);
        assertEquals(expected, result);
    }
}