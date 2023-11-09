package src.runners;

import src.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounter calculator = new CalculatorWithCounter(new CalculatorWithMathCopy(), new CalculatorWithOperator());

        double result1 = calculator.add(4.1, calculator.multiply(15, 7));
        double result2 = calculator.pow(calculator.divide(28, 5), 2);

        double finalResult = calculator.add(result1, result2);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + finalResult);
        System.out.println("Number of operations: " + calculator.getCountOperation());
    }
}

class CalculatorWithCounter {
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
        return this.calculator.pow(a, b);
    }

    public double sqrt(double a) {
        this.countOperation++;
        return this.calculator.sqrt(a);
    }

    public int getCountOperation() {
        return this.countOperation;
    }
}

class CalculatorWithMathCopy {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double pow(double a, int b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}