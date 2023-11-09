package src.loops;

import java.util.Scanner;
public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное целое число: ");
        String input = scanner.nextLine();

        try {
            long number;
            number = Integer.parseInt(input);
            if (number < 1) {
                System.out.println("Введено некорректное число");
            } else {
                long result = multiplyNumbers(number);
                System.out.println("Результат: " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Введено не целое число");
        }
    }

    public static long multiplyNumbers(long n) {
        long result = 1;
        for (long i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}