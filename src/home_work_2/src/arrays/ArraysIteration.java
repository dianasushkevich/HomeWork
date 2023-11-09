package src.arrays;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] array;
        array = ArraysUtils.arrayFromConsole();

        printAllElements(array);
        printEverySecondElement(array);
        printReverseElements(array);
    }

    // Выводит все элементы массива в консоль
    public static void printAllElements(int[] array) {
        System.out.println("All elements:");

        System.out.println("Using do...while:");
        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        } while (i < array.length);

        System.out.println("Using while:");
        i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }

        System.out.println("Using for:");
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Using for each:");
        for (int num : array) {
            System.out.println(num);
        }
    }

    // Выводит каждый второй элемент массива в консоль
    public static void printEverySecondElement(int[] array) {
        System.out.println("Every second element:");

        System.out.println("Using do...while:");
        int i = 0;
        do {
            System.out.println(array[i]);
            i += 2;
        } while (i < array.length);

        System.out.println("Using while:");
        i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i += 2;
        }

        System.out.println("Using for:");
        for (i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }

        System.out.println("Using for each:");
        for (i = 1; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }

    // Выводит все элементы массива в консоль в обратном порядке
    public static void printReverseElements(int[] array) {
        System.out.println("Reverse elements:");

        System.out.println("Using do...while:");
        int i = array.length - 1;
        do {
            System.out.println(array[i]);
            i--;
        } while (i >= 0);

        System.out.println("Using while:");
        i = array.length - 1;
        while (i >= 0) {
            System.out.println(array[i]);
            i--;
        }

        System.out.println("Using for:");
        for (i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Using for each:");
        int[] reversedArray = new int[array.length];
        for (i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        for (int num : reversedArray) {
            System.out.println(num);
        }
    }
}