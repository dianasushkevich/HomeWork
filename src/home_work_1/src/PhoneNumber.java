package src;

public class PhoneNumber {
    public static String createPhoneNumber(int[] digits) {
        String phoneNumber = "";

        // Проверка длины массива
        if (digits.length != 10) {
            return phoneNumber;
        }

        // Формирование строки телефонного номера
        phoneNumber = "(";
        for (int i = 0; i < 3; i++) {
            phoneNumber += digits[i];
        }
        phoneNumber += ") ";
        for (int i = 3; i < 6; i++) {
            phoneNumber += digits[i];
        }
        phoneNumber += "-";
        for (int i = 6; i < 10; i++) {
            phoneNumber += digits[i];
        }

        return phoneNumber;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String phoneNumber = createPhoneNumber(digits);

        System.out.println(phoneNumber);
    }
}