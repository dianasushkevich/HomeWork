package src.sorts;
import src.arrays.ArraysUtils;
import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        testSort(arr1);

        int[] arr2 = new int[]{1, 1, 1, 1};
        testSort(arr2);

        int[] arr3 = new int[]{9, 1, 5, 99, 9, 9};
        testSort(arr3);

        int[] arr4 = new int[]{};
        testSort(arr4);

        int[] arr5 = new int[]{6, 5, 4, 3, 2, 1};
        testSort(arr5);

        ArraysUtils ArraysUtils = new ArraysUtils();
        int[] arr = ArraysUtils.arrayRandom(50, 100);
        testSort(arr);

        int[] arr7 = ArraysUtils.arrayFromConsole();
        testSort(arr7);
    }

    public static void testSort(int[] arr) {
        System.out.println("Before sorting: " + Arrays.toString(arr));

        SortsUtils.cocktailSort(arr);

        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}