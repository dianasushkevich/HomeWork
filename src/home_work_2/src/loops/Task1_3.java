package src.loops;

import java.util.Scanner;
public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double base = scanner.nextDouble();

        System.out.print("Введите степень: ");
        int power = scanner.nextInt();

        double result = power(base, power);

        System.out.println(base + " в степени " + power + " = " + result);
    }

    public static double power(double base, int power) {
        double result = 1;

        if (power >= 0) {
            for (int i = 0; i < power; i++) {
                result *= base;
            }
        } else {
            for (int i = 0; i > power; i--) {
                result /= base;
            }
        }

        return result;
    }
}

