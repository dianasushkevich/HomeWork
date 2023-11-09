package homework1;
import org.junit.jupiter.api.Test;
import src.ByteConverter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ByteConverterTest {

    @Test
    public void testToKilobytes() {
        int bytes = 2048;
        int expectedKilobytes = 2;

        int actualKilobytes = ByteConverter.toKilobytes(bytes);

        assertEquals(expectedKilobytes, actualKilobytes);
    }

    @Test
    public void testToBytes() {
        int kilobytes = 2;
        int expectedBytes = 2048;

        int actualBytes = ByteConverter.toBytes(kilobytes);

        assertEquals(expectedBytes, actualBytes);
    }
}