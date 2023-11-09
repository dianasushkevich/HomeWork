package src.calcs.additional;
import src.calcs.api.ICalculator;

public class CalculatorWithMemory {
    private final ICalculator calculator;
    private double memory;

    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
        this.memory = 0;
    }

    public double add(double a, double b) {
        double result = calculator.add(a, b);
        save(result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = calculator.subtract(a, b);
        save(result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = calculator.multiply(a, b);
        save(result);
        return result;
    }

    public double divide(double a, double b) {
        double result = calculator.divide(a, b);
        save(result);
        return result;
    }

    public double power(double a, int b) {
        double result = calculator.power(a, b);
        save(result);
        return result;
    }

    public double absolute(double a) {
        double result = calculator.absolute(a);
        save(result);
        return result;
    }

    public double squareRoot(double a) {
        double result = calculator.squareRoot(a);
        save(result);
        return result;
    }

    public void save() {
        memory = getLastResult();
    }

    public double load() {
        double result = memory;
        memory = 0;
        return result;
    }

    private void save(double result) {
        memory = result;
    }

    private double getLastResult() {
        return memory;
    }
}