package src.calcs.additional;
import src.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperation;

    public void incrementCountOperation() {
        countOperation++;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public double add(double a, double b) {
        incrementCountOperation();
        return super.add(a, b);
    }

    public double subtract(double a, double b) {
        incrementCountOperation();
        return super.subtract(a, b);
    }

    public double multiply(double a, double b) {
        incrementCountOperation();
        return super.multiply(a, b);
    }

    public double divide(double a, double b) {
        incrementCountOperation();
        return super.divide(a, b);
    }

    public double power(double a, int b) {
        incrementCountOperation();
        return super.power(a, b);
    }
}