package src;

public class BinaryConverter {

    public static void main(String[] args) {
        byte number1 = 42;
        byte number2 = 15;
        byte number3 = -42;
        byte number4 = -15;

        System.out.println(toBinaryString(number1));
        System.out.println(toBinaryString(number2));
        System.out.println(toBinaryString(number3));
        System.out.println(toBinaryString(number4));
    }

    public static String toBinaryString(byte number) {
        StringBuilder binaryString = new StringBuilder();

        if (number >= 0) {
            while (number > 0) {
                binaryString.insert(0, number % 2);
                number /= 2;
            }
        } else {
            number = (byte) (Math.abs(number) - 1);
            while (number > 0) {
                binaryString.insert(0, number % 2 == 0 ? 1 : 0);
                number /= 2;
            }
            binaryString.insert(0, 1);
        }

        return binaryString.toString();
    }
}