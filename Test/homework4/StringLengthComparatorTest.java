package homework4;


import org.junit.jupiter.api.Test;
import src.comparators.StringLengthComparator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringLengthComparatorTest {
    @Test
    public void testCompare_FirstStringLonger_ReturnsPositiveValue() {
        StringLengthComparator comparator = new StringLengthComparator();

        int result = comparator.compare("abcdef", "abc");

        assertEquals(1, result);
    }
    @Test
    public void testCompare_BothStringsSameLength_ReturnsZero() {
        StringLengthComparator comparator = new StringLengthComparator();

        int result = comparator.compare("abcd", "efgh");

        assertEquals(0, result);
    }
    @Test
    public void testCompare_FirstStringShorter_ReturnsNegativeValue() {
        StringLengthComparator comparator = new StringLengthComparator();

        int result = comparator.compare("abc", "abcd");

        assertEquals(-1, result);
    }
}