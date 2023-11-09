package src;

public class Sleep {
    public static void main(String[] args) {
        // Пример использования метода sleepIn
        boolean weekday = true;
        boolean vacation = false;
        if (sleepIn(weekday, vacation)) {
            System.out.println("Можно спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}