package src;

public class OddNumber {
    public static void main(String[] args) {
        int number = 7;
        if (isOdd(number)) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is not odd.");
        }
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}