package src.calcs.additional;
import src.calcs.simple.CalculatorWithMathCopy;
import src.calcs.simple.CalculatorWithMathExtends;
import src.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;
    private long countOperation;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc) {
        this.calc1 = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc) {
        this.calc2 = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc) {
        this.calc3 = calc;
    }

    public double divide(double a, double b) {
        countOperation++;
        if (calc1 != null) {
            return calc1.divide(a, b);
        } else if (calc2 != null) {
            return calc2.divide(a, b);
        } else {
            return calc3.divide(a, b);
        }
    }

    public double multiply(double a, double b) {
        countOperation++;
        if (calc1 != null) {
            return calc1.multiply(a, b);
        } else if (calc2 != null) {
            return calc2.multiply(a, b);
        } else {
            return calc3.multiply(a, b);
        }
    }

    public double subtract(double a, double b) {
        countOperation++;
        if (calc1 != null) {
            return calc1.subtract(a, b);
        } else if (calc2 != null) {
            return calc2.subtract(a, b);
        } else {
            return calc3.subtract(a, b);
        }
    }

    public double add(double a, double b) {
        countOperation++;
        if (calc1 != null) {
            return calc1.add(a, b);
        } else if (calc2 != null) {
            return calc2.add(a, b);
        } else {
            return calc3.add(a, b);
        }
    }

    public double power(double a, int b) {
        countOperation++;
        if (calc1 != null) {
            return calc1.power(a, b);
        } else if (calc2 != null) {
            return calc2.power(a, b);
        } else {
            return calc3.power(a, b);
        }
    }

    public double absolute(double a) {
        countOperation++;
        if (calc1 != null) {
            return calc1.absolute(a);
        } else if (calc2 != null) {
            return calc2.absolute(a);
        } else {
            return calc3.absolute(a);
        }
    }

    public double squareRoot(double a) {
        countOperation++;
        if (calc1 != null) {
            return calc1.squareRoot(a);
        } else if (calc2 != null) {
            return calc2.squareRoot(a);
        } else {
            return calc3.squareRoot(a);
        }
    }

    public long getCountOperation() {
        return countOperation;
    }
}