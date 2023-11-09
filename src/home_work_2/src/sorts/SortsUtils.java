package src.sorts;

public class SortsUtils {

    public static void cocktailSort(int[] arr) {
        boolean swapped;
        do {
            swapped = false;
            // Проход слева направо
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Обмен элементов
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                // Если не было обменов, массив уже отсортирован
                break;
            }

            swapped = false;
            // Проход справа налево
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] > arr[i + 1]) {
                    // Обмен элементов
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
