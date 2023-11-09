package homework1;
import org.junit.jupiter.api.Test;
import src.LeapYear;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    public void testIsLeapYear() {
        // Test for a leap year
        int leapYear = 2020;
        assertTrue(LeapYear.isLeapYear(leapYear));

        // Test for a non-leap year
        int nonLeapYear = 2021;
        assertFalse(LeapYear.isLeapYear(nonLeapYear));

        // Test for a year divisible by 100 but not by 400
        int yearDivisibleBy100 = 1900;
        assertFalse(LeapYear.isLeapYear(yearDivisibleBy100));

        // Test for a year divisible by 400
        int yearDivisibleBy400 = 2000;
        assertTrue(LeapYear.isLeapYear(yearDivisibleBy400));
    }
}