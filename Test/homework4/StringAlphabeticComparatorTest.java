package homework4;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.comparators.StringAlphabeticComparator;

class StringAlphabeticComparatorTest {

    @Test
    void compareLessThan() {
        StringAlphabeticComparator comparator = new StringAlphabeticComparator();
        int result = comparator.compare("cat", "dog");
        assertTrue(result < 0);
    }

    @Test
    void compareGreaterThan() {
        StringAlphabeticComparator comparator = new StringAlphabeticComparator();
        int result = comparator.compare("dog", "cat");
        assertTrue(result > 0);
    }
}