package src.runners;

import src.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();

        double result = calculator.add(4.1, calculator.add(calculator.multiply(15, 7),
                calculator.multiply(calculator.divide(28, 5), 2)));

        calculator.incrementCountOperation();
        calculator.incrementCountOperation();
        calculator.incrementCountOperation();
        calculator.incrementCountOperation();
        calculator.incrementCountOperation();
        calculator.incrementCountOperation();

        System.out.println("Результат выражения: " + result); //120.3
        System.out.println("Количество операций: " + calculator.getCountOperation()); //11
    }
}