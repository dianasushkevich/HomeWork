package src.calcs.additional;

import src.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    private ICalculator calculator;
    private long countOperation;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
        this.countOperation = 0;
    }

    public double divide(double a, double b) {
        incrementCountOperation();
        return calculator.divide(a, b);
    }

    public double multiply(double a, double b) {
        incrementCountOperation();
        return calculator.multiply(a, b);
    }

    public double subtract(double a, double b) {
        incrementCountOperation();
        return calculator.subtract(a, b);
    }

    public double add(double a, double b) {
        incrementCountOperation();
        return calculator.add(a, b);
    }

    public double power(double base, int exponent) {
        incrementCountOperation();
        return calculator.power(base, exponent);
    }

    public double absolute(double number) {
        incrementCountOperation();
        return calculator.absolute(number);
    }

    public double squareRoot(double number) {
        incrementCountOperation();
        return calculator.squareRoot(number);
    }

    public long getCountOperation() {
        return countOperation;
    }

    private void incrementCountOperation() {
        countOperation++;
    }
}