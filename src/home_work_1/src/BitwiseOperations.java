package src;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        // Ввод первого числа
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        // Ввод второго числа
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Применение побитовой операции И
        int resultAnd = num1 & num2;
        System.out.println("Результат побитовой операции И: " + resultAnd);

        // Применение побитовой операции ИЛИ
        int resultOr = num1 | num2;
        System.out.println("Результат побитовой операции ИЛИ: " + resultOr);

        scanner.close();
    }
}