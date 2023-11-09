package src.runners;


import src.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        // Создание экземпляра калькулятора
        CalculatorWithCounter calculator = new CalculatorWithCounter(new CalculatorWithMathCopy(),
                new CalculatorWithOperator());

        // Вычисление выражения
        double result = calculator.add(
                calculator.add(4.1, calculator.multiply(15, 7)),
                calculator.pow(calculator.divide(28, 5), 2)
        );

        // Вывод результата
        System.out.println("Результат выражения: " + result);

        // Вывод количества выполненных операций
        System.out.println("Количество выполненных операций: " + calculator.getCountOperation());
    }
}