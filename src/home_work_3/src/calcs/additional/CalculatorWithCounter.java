package src.calcs.additional;
import src.calcs.simple.CalculatorWithMathCopy;
import src.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounter {
    private CalculatorWithMathCopy calculator;
    private int countOperation;

    public CalculatorWithCounter(CalculatorWithMathCopy calculator, CalculatorWithOperator calculatorWithOperator) {
        this.calculator = calculator;
    }

    public double add(double a, double b) {
        this.countOperation++;
        return this.calculator.add(a, b);
    }

    public double subtract(double a, double b) {
        this.countOperation++;
        return this.calculator.subtract(a, b);
    }

    public double multiply(double a, double b) {
        this.countOperation++;
        return this.calculator.multiply(a, b);
    }

    public double divide(double a, double b) {
        this.countOperation++;
        return this.calculator.divide(a, b);
    }

    public double pow(double a, int b) {
        this.countOperation++;
        return this.calculator.power(a, b);
    }

    public double sqrt(double a) {
        this.countOperation++;
        return this.calculator.squareRoot(a);
    }

    public int getCountOperation() {
        return this.countOperation;
    }
}
