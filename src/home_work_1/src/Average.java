package src;

public class Average {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 9;
        int num3 = 12;

        double average = calculateAverage(num1, num2, num3);

        System.out.println("The average is: " + average);
    }

    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}