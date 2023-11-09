package src.runners;

import src.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();

        double result = calculator.add(calculator.add(4.1, calculator.multiply(15, 7)),
                calculator.power(calculator.divide(28, 5), 2));

        System.out.println("Результат выражения: " + result); //140.459
        System.out.println("Количество операций: " + calculator.getCountOperation()); //5
    }
}