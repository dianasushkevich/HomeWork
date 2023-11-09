package src.loops;

import java.util.Scanner;
public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);

            if (number <= 0) {
                System.out.println("Число должно быть больше нуля");
            } else {
                int result = multiplyDigits(number);
                System.out.println("Результат: " + result);
            }

        } catch (NumberFormatException e) {
            if (isWord(input)) {
                System.out.println("Введено не число");
            } else {
                System.out.println("Ввели не целое число");
            }
        }
    }

    private static int multiplyDigits(int number) {
        int result = 1;
        System.out.print("Ход вычисления: ");

        while (number > 0) {
            int digit = number % 10;
            result *= digit;
            System.out.print(digit);

            if (number >= 10) {
                System.out.print(" * ");
            }

            number /= 10;
        }

        System.out.println();
        return result;
    }

    private static boolean isWord(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}