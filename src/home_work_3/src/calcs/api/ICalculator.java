package src.calcs.api;

public interface ICalculator {
    double divide(double a, double b); // метод деления
    double multiply(double a, double b); // метод умножения
    double subtract(double a, double b); // метод вычитания
    double add(double a, double b); // метод сложения

    double power(double base, int exponent); // метод возведения в целую степень
    double absolute(double number); // метод вычисления модуля числа
    double squareRoot(double number); // метод вычисления корня из числа
}

class Calculator implements ICalculator {
    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double absolute(double number) {
        return Math.abs(number);
    }

    @Override
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }
}

