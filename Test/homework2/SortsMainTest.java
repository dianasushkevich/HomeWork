package homework2;

import org.junit.jupiter.api.Test;
import src.sorts.SortsUtils;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class SortsMainTest {

    @Test
    public void testSort() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        testSort(arr1);
        int[] expectedArr1 = new int[]{1, 2, 3, 4, 5, 6};
        assertArrayEquals(expectedArr1, arr1);

        int[] arr2 = new int[]{1, 1, 1, 1};
        testSort(arr2);
        int[] expectedArr2 = new int[]{1, 1, 1, 1};
        assertArrayEquals(expectedArr2, arr2);

        int[] arr3 = new int[]{9, 1, 5, 99, 9, 9};
        testSort(arr3);
        int[] expectedArr3 = new int[]{1, 5, 9, 9, 9, 99};
        assertArrayEquals(expectedArr3, arr3);

        int[] arr4 = new int[]{};
        testSort(arr4);
        int[] expectedArr4 = new int[]{};
        assertArrayEquals(expectedArr4, arr4);

        int[] arr5 = new int[]{6, 5, 4, 3, 2, 1};
        testSort(arr5);
        int[] expectedArr5 = new int[]{1, 2, 3, 4, 5, 6};
        assertArrayEquals(expectedArr5, arr5);
    }

    public void testSort(int[] arr) {
        SortsUtils.cocktailSort(arr);
    }
}