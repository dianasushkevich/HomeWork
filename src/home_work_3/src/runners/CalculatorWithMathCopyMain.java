package src.runners;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

        double result = calculator.add(
                calculator.add(4.1, calculator.multiply(15, 7)),
                calculator.multiply(calculator.divide(28, 5), 2)
        );

        System.out.println("Результат выражения: " + result); //120.3
    }
}