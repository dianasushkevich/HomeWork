package src.calcs.additional;
import src.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator {

    private final ICalculator calculator;
    private double memory;

    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
        this.memory = 0;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public double add(double a, double b) {
        double result = calculator.add(a, b);
        memory = result;
        return result;
    }

    public double subtract(double a, double b) {
        double result = calculator.subtract(a, b);
        memory = result;
        return result;
    }

    public double multiply(double a, double b) {
        double result = calculator.multiply(a, b);
        memory = result;
        return result;
    }

    public double divide(double a, double b) {
        double result = calculator.divide(a, b);
        memory = result;
        return result;
    }

    public double getMemory() {
        return memory;
    }

    public void clearMemory() {
        memory = 0;
    }
}