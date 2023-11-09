package src.loops;

public class Task1_4 {
    public static void main(String[] args) {
        long a = 1;
        long beforeOverflow = a;
        long afterOverflow;
        long[] multipliers = {3, 188, -19};
        for (long multiplier : multipliers) {
            while (true) {
                long previousA = a;
                a *= multiplier;

                // Проверяем на переполнение
                if (a / multiplier != previousA) {
                    afterOverflow = a;
                        break;
                    }
                }

                System.out.println("До переполнения: " + beforeOverflow);
                System.out.println("После переполнения: " + afterOverflow);

                beforeOverflow = afterOverflow;
            }
        }
    }
