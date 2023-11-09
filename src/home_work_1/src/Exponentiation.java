package src;

import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double number = scanner.nextDouble();
        System.out.print("Введите степень: ");
        double power = scanner.nextDouble();
        double result = Math.pow(number, power);
        System.out.println(number + " в степени " + power + " = " + result);
        scanner.close();
    }
}