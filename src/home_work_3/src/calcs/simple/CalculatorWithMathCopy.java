package src.calcs.simple;

public class CalculatorWithMathCopy {
    public double divide(double a, double b) {
        return Math.copySign(a / b, 1);
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double power(double a, int b) {
        return Math.pow(a, b);
    }

    public double absolute(double a) {
        return Math.abs(a);
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}