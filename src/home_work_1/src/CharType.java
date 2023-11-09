package src;

public class CharType {
    public static void main(String[] args) {
        char ch = '5';

        if (isLetter(ch)) {
            System.out.println(ch + " is a letter.");
        } else {
            System.out.println(ch + " is not a letter.");
        }
    }

    public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }
}