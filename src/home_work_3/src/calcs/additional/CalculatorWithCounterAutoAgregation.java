package src.calcs.additional;
import src.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    private final CalculatorWithMathCopy calculator;
    private long countOperation;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

    public double divide(double a, double b) {
        countOperation++;
        return calculator.divide(a, b);
    }

    public double multiply(double a, double b) {
        countOperation++;
        return calculator.multiply(a, b);
    }

    public double subtract(double a, double b) {
        countOperation++;
        return calculator.subtract(a, b);
    }

    public double add(double a, double b) {
        countOperation++;
        return calculator.add(a, b);
    }

    public double power(double base, int exponent) {
        countOperation++;
        return calculator.power(base, exponent);
    }

    public double absolute(double num) {
        countOperation++;
        return calculator.absolute(num);
    }

    public double squareRoot(double num) {
        countOperation++;
        return calculator.squareRoot(num);
    }

    public long getCountOperation() {
        return countOperation;
    }
}