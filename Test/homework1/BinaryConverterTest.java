package homework1;
import org.junit.jupiter.api.Test;
import src.BinaryConverter;
import static org.junit.jupiter.api.Assertions.*;

class BinaryConverterTest {
    @Test
    public void testPositiveNumber() {
        byte number = 42;
        String binaryString = BinaryConverter.toBinaryString(number);
        assertEquals("101010", binaryString);
    }
}