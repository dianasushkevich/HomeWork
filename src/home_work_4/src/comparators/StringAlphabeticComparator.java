package src.comparators;

import java.util.Comparator;

public class StringAlphabeticComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}