package homework1;
import org.junit.jupiter.api.Test;
import src.PhoneNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberTest {

    @Test
    public void testCreatePhoneNumber() {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        String expectedPhoneNumber = "(123) 456-7890";
        String actualPhoneNumber = PhoneNumber.createPhoneNumber(digits);
        assertEquals(expectedPhoneNumber, actualPhoneNumber);
    }

    @Test
    public void testCreatePhoneNumberWithInvalidInput() {
        // Test with fewer than 10 digits
        int[] fewerDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expectedPhoneNumber = "";
        String actualPhoneNumber = PhoneNumber.createPhoneNumber(fewerDigits);
        assertEquals(expectedPhoneNumber, actualPhoneNumber);

        // Test with more than 10 digits
        int[] moreDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
        actualPhoneNumber = PhoneNumber.createPhoneNumber(moreDigits);
        assertEquals(expectedPhoneNumber, actualPhoneNumber);
    }
}