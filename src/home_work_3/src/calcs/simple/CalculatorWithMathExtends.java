package src.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double absolute(double number) {
        return Math.abs(number);
    }

    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}

