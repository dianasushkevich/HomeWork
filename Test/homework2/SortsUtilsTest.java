package homework2;

import org.junit.jupiter.api.Test;
import src.sorts.SortsUtils;

import static org.junit.jupiter.api.Assertions.*;

public class SortsUtilsTest {

    @Test
    void testCocktailSort() {
        int[] arr = {5, 3, 8, 2, 1};
        SortsUtils.cocktailSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, arr);
    }

    @Test
    void testCocktailSortWithEmptyArray() {
        int[] arr = {};
        SortsUtils.cocktailSort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testCocktailSortWithAlreadySortedArray() {
        int[] arr = {1, 2, 3, 5, 8};
        SortsUtils.cocktailSort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 5, 8}, arr);
    }
}