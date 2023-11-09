package src.runners;
import src.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();

        double result = calculator.add(4.1, calculator.add(calculator.multiply(15, 7), calculator.power(calculator.divide(28, 5), 2)));

        System.out.println(result);
    }
}