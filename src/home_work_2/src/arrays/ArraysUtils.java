package src.arrays;

import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] arrayRandom(int i, int i1) {

        return new int[0];
    }
}