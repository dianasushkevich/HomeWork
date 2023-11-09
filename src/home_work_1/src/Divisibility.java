package src;

public class Divisibility {
    public static void main(String[] args) {
        int dividend = 15;
        int divisor = 3;

        if (isDivisible(dividend, divisor)) {
            System.out.println(dividend + " is divisible by " + divisor);
        } else {
            System.out.println(dividend + " is not divisible by " + divisor);
        }
    }

    public static boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}