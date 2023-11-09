package src;

public class BitwiseOperations1 {
    public static void main(String[] args) {
        int a = 8;

        int result1 = 5 + 2 / a;
        int result2 = (5 + 2) / a;
        int result3 = (5 + 3) / a;
        int result4 = (5 + 3) / --a;
        int result5 = (5 * 2 >> 3) / --a;
        int result6 = (5 + 7 > 20 ? 68 : 22 * 2 >> 3) / --a;
       // int result7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 3) / --a;//
        boolean result8 = 6 - 2 > 3 && 12 * 12 <= 119;
        boolean result9 = true && false;

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
        System.out.println("Result 5: " + result5);
        System.out.println("Result 6: " + result6);
      //  System.out.println("Result 7: " + result7);//
        System.out.println("Result 8: " + result8);
        System.out.println("Result 9: " + result9);
    }
}