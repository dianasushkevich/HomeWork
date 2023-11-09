package src.calcs.simple;

public class CalculatorWithOperator {
    public double divide(double a, double b) {
        return a / b;
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
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public double absolute(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public double squareRoot(double a) {
        double guess = 1.0;
        double epsilon = 1e-15;
        while (Math.abs(guess - a / guess) > epsilon * guess) {
            guess = (a / guess + guess) / 2.0;
        }
        return guess;
    }
}