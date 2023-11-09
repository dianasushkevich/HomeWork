package src.runners;

import src.calcs.additional.CalculatorWithCounter;
import src.calcs.simple.CalculatorWithMathCopy;
import src.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounter calculator = new CalculatorWithCounter(new CalculatorWithMathCopy(), new CalculatorWithOperator());

        double result = calculator.add(4.1, calculator.add(calculator.multiply(15, 7), calculator.pow(calculator.divide(28, 5), 2)));

        System.out.println("Результат выражения: " + result);
        System.out.println("Количество операций: " + calculator.getCountOperation());
    }
}
