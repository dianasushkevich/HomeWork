package src.calcs.additional;
import src.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator {

    private final ICalculator calculator;

    private int count;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public double add(double a, double b) {
        count++;
        return calculator.add(a, b);
    }

    public double subtract(double a, double b) {
        count++;
        return calculator.subtract(a, b);
    }

    public double multiply(double a, double b) {
        count++;
        return calculator.multiply(a, b);
    }

    public double divide(double a, double b) {
        count++;
        return calculator.divide(a, b);
    }

    public int getCountOperation() {
        return count;
    }
}