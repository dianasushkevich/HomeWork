package homework1;

import org.junit.jupiter.api.Test;
import src.OddNumber;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddNumberTest {

    @Test
    public void testIsOdd() {
        // Test for an odd number
        int oddNumber = 7;
        assertTrue(OddNumber.isOdd(oddNumber));

        // Test for an even number
        int evenNumber = 12;
        assertFalse(OddNumber.isOdd(evenNumber));

        // Test for zero
        int zero = 0;
        assertFalse(OddNumber.isOdd(zero));

        // Test for negative odd number
        int negativeOddNumber = -11;
        assertTrue(OddNumber.isOdd(negativeOddNumber));

        // Test for negative even number
        int negativeEvenNumber = -16;
        assertFalse(OddNumber.isOdd(negativeEvenNumber));
    }
}