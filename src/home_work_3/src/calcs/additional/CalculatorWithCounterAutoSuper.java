package src.calcs.additional;
import src.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count;

    public double add(double a, double b) {
        count++;
        return super.add(a, b);
    }

    public double subtract(double a, double b) {
        count++;
        return super.subtract(a, b);
    }

    public double multiply(double a, double b) {
        count++;
        return super.multiply(a, b);
    }

    public double divide(double a, double b) {
        count++;
        return super.divide(a, b);
    }

    public double power(double a, int b) {
        count++;
        return super.power(a, b);
    }

    public double absolute(double a) {
        count++;
        return super.absolute(a);
    }

    public double squareRoot(double a) {
        count++;
        return super.squareRoot(a);
    }

    public long getCountOperation() {
        return count;
    }
}