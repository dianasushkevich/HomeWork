package homework2;
import org.junit.jupiter.api.Test;
import src.arrays.ArraysUtils;

import java.io.ByteArrayInputStream;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testArrayFromConsole() {
        String input = "5\n1\n2\n3\n4\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        int[] expectedArray = {1, 2, 3, 4, 5};
        int[] actualArray = ArraysUtils.arrayFromConsole();

        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testArrayRandom() {
        int size = 10;
        int lowerBound = 0;
        int upperBound = 100;

        int[] array = ArraysUtils.arrayRandom(size, upperBound);

        assertEquals(size, array.length);
        for (int i = 0; i < size; i++) {
            assertTrue(array[i] >= lowerBound && array[i] <= upperBound);
        }
    }
}