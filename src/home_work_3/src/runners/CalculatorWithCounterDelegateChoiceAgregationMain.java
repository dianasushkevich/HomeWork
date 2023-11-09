package src.runners;

import src.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounter calculator = new CalculatorWithCounter(new CalculatorWithMathCopy(), new CalculatorWithOperator());

        double result1 = calculator.add(4.1, calculator.multiply(15, 7));
        double result2 = calculator.pow(calculator.divide(28, 5), 2);

        double finalResult = calculator.add(result1, result2);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + finalResult);
        System.out.println("Number of operations: " + calculator.getCountOperation());
    }
}