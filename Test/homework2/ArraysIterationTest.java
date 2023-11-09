package homework2;

import org.junit.jupiter.api.Test;
import src.arrays.ArraysIteration;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysIterationTest {

    @Test
    public void testPrintAllElements() {
        int[] array = {1, 2, 3, 4, 5};

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        ArraysIteration.printAllElements(array);

        String expected = "All elements:\n" +
                "Using do...while:\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "Using while:\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "Using for:\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "Using for each:\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n";

        assertEquals(expected, output.toString());
    }

    @Test
    public void testPrintEverySecondElement() {
        int[] array = {1, 2, 3, 4, 5};

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        ArraysIteration.printEverySecondElement(array);

        String expected = "Every second element:\n" +
                "Using do...while:\n" +
                "1\n" +
                "3\n" +
                "5\n" +
                "Using while:\n" +
                "1\n" +
                "3\n" +
                "5\n" +
                "Using for:\n" +
                "1\n" +
                "3\n" +
                "5\n" +
                "Using for each:\n" +
                "1\n" +
                "3\n" +
                "5\n";

        assertEquals(expected, output.toString());
    }

    @Test
    public void testPrintReverseElements() {
        int[] array = {1, 2, 3, 4, 5};

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        ArraysIteration.printReverseElements(array);

        String expected = "Reverse elements:\n" +
                "Using do...while:\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "Using while:\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "Using for:\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1\n" +
                "Using for each:\n" +
                "5\n" +
                "4\n" +
                "3\n" +
                "2\n" +
                "1\n";

        assertEquals(expected, output.toString());
    }
}