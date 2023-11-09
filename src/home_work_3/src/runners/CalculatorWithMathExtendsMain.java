package src.runners;
import src.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
        public static void main(String[] args) {
            CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
            double result = calculator.add(4.1, calculator.add(calculator.multiply(15, 7), calculator.power(calculator.divide(28, 5), 2)));
            System.out.println("Результат выражения: " + result); //140.459
        }
    }